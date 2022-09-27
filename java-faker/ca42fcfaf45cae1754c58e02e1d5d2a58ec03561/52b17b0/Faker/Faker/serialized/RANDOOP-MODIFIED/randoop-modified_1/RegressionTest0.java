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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor27();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker108();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions27();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet65();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(internet6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem15();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(lorem4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter3.deserializeObjectFaker75();
        java.util.Random random5 = serializedObjectSupporter3.deserializeObjectRandom2();
        java.util.Random random6 = serializedObjectSupporter3.deserializeObjectRandom10();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        java.util.stream.DoubleStream doubleStream9 = random6.doubles((long) 'a');
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime69();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom10();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale41();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor79();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber2();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale15();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor85();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet10();
        com.github.javafaker.Address address3 = serializedObjectSupporter0.deserializeObjectAddress17();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(address3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.util.Random random0 = new java.util.Random();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        java.lang.String str3 = locale2.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en" + "'", str3, "en");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem74();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber79();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress2();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness59();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale114();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom10();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber72();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor72();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp62();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale118();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(app4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom10();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker92();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp64();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber36();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale10();
        java.lang.Object obj6 = locale5.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "en");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker49();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker49();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(hacker7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale10();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker75();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Address address2 = serializedObjectSupporter0.deserializeObjectAddress51();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem20();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(address2);
        org.junit.Assert.assertNotNull(lorem3);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet22();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber9();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook60();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions74();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions74();
        com.github.javafaker.service.RandomService randomService5 = serializedObjectSupporter0.deserializeObjectRandomService7();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(randomService5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker112();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService22();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress18();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker215();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions83();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook56();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName44();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions14();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet39();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker237();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker112();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp60();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(app4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom8();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker178();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor51();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor79();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker26();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem47();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker164();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter3.deserializeObjectFaker75();
        java.util.Random random5 = serializedObjectSupporter3.deserializeObjectRandom2();
        java.util.Random random6 = serializedObjectSupporter3.deserializeObjectRandom10();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.Color color8 = faker7.color;
        com.github.javafaker.Book book9 = faker7.book();
        com.github.javafaker.Lorem lorem10 = faker7.lorem;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker112();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber45();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(number4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker112();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress6();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(address4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime9();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany28();
        com.github.javafaker.Address address8 = serializedObjectSupporter0.deserializeObjectAddress57();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(address8);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom10();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber72();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor9();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress7();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(address6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale161();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime44();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale22();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber5();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale14();
        java.util.Locale.setDefault(locale8);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions83();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook56();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem47();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom8();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp70();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness39();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.Locale.Category category0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = java.util.Locale.getDefault(category0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber24();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber27();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService20();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker149();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance85();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime34();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale10();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber17();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker159();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName2();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(name6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor79();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker26();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem47();
        com.github.javafaker.Number number10 = serializedObjectSupporter0.deserializeObjectNumber76();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(number10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp69();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker106();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker183();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber63();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale64();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet58();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber13();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker206();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem61();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale109();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber74();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet12();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService29();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany37();
        com.github.javafaker.App app10 = serializedObjectSupporter0.deserializeObjectApp3();
        com.github.javafaker.Address address11 = serializedObjectSupporter0.deserializeObjectAddress85();
        com.github.javafaker.Finance finance12 = serializedObjectSupporter0.deserializeObjectFinance56();
        com.github.javafaker.Lorem lorem13 = serializedObjectSupporter0.deserializeObjectLorem5();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNull(app10);
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(lorem13);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en", (double) (short) 1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.Random random1 = new java.util.Random((long) 100);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en", (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress18();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale20();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker134();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance28();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem50();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName7();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale155();
        java.lang.String str7 = locale6.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English" + "'", str7, "English");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService29();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany37();
        com.github.javafaker.App app10 = serializedObjectSupporter0.deserializeObjectApp3();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Number number12 = serializedObjectSupporter0.deserializeObjectNumber64();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNull(app10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(number12);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale100();
        com.github.javafaker.Name name2 = serializedObjectSupporter0.deserializeObjectName48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook57();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(name2);
        org.junit.Assert.assertNull(book3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker245();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet52();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker25();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale66();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor27();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker103();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber63();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale64();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet58();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance74();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker47();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress49();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(address4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany5();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker214();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker112();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet46();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(internet4);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem50();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName7();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime18();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker45();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService64();
        java.util.Random random8 = serializedObjectSupporter0.deserializeObjectRandom7();
        java.util.Random random9 = serializedObjectSupporter0.deserializeObjectRandom6();
        long long10 = random9.nextLong();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(random8);
        org.junit.Assert.assertNotNull(random9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2101724260689984972L) + "'", long10 == (-2101724260689984972L));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem28();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem45();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setExtension('#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker187();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker205();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress11();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany39();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber24();
        java.util.Random random4 = serializedObjectSupporter0.deserializeObjectRandom6();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale30();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(random4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.Locale locale3 = new java.util.Locale("", "English", "");
        org.junit.Assert.assertEquals(locale3.toString(), "_ENGLISH");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker187();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker205();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber54();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress55();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness82();
        com.github.javafaker.Address address8 = serializedObjectSupporter0.deserializeObjectAddress60();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNull(address8);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Hacker hacker2 = serializedObjectSupporter0.deserializeObjectHacker79();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode19();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp30();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(hacker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(app4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker110();
        com.github.javafaker.Internet internet8 = serializedObjectSupporter0.deserializeObjectInternet40();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance25();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(internet8);
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        java.util.Locale.setDefault(locale2);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService29();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany37();
        com.github.javafaker.App app10 = serializedObjectSupporter0.deserializeObjectApp3();
        com.github.javafaker.DateAndTime dateAndTime11 = serializedObjectSupporter0.deserializeObjectDateAndTime11();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNull(app10);
        org.junit.Assert.assertNotNull(dateAndTime11);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet24();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode46();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker245();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet52();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime19();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany62();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker211();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService37();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime63();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName60();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode85();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.util.Locale.Category category0 = null;
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter1 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random2 = serializedObjectSupporter1.deserializeObjectRandom7();
        com.github.javafaker.Book book3 = serializedObjectSupporter1.deserializeObjectBook24();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter1.deserializeObjectFaker91();
        java.util.Locale locale5 = serializedObjectSupporter1.deserializeObjectLocale127();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber39();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter3.deserializeObjectFaker75();
        java.util.Random random5 = serializedObjectSupporter3.deserializeObjectRandom2();
        java.util.Random random6 = serializedObjectSupporter3.deserializeObjectRandom10();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.Color color8 = faker7.color;
        com.github.javafaker.PhoneNumber phoneNumber9 = faker7.phoneNumber();
        com.github.javafaker.Company company10 = faker7.company();
        com.github.javafaker.Code code11 = faker7.getcode();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(code11);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Internet internet8 = serializedObjectSupporter0.deserializeObjectInternet21();
        com.github.javafaker.Address address9 = serializedObjectSupporter0.deserializeObjectAddress37();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany3();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNull(internet8);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(company10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp62();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress77();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany10();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(app4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("English", (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker189();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode33();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness19();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(business5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker206();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany81();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter3.deserializeObjectFaker75();
        java.util.Random random5 = serializedObjectSupporter3.deserializeObjectRandom2();
        java.util.Random random6 = serializedObjectSupporter3.deserializeObjectRandom10();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.Color color8 = faker7.color;
        com.github.javafaker.Book book9 = faker7.book();
        com.github.javafaker.Name name10 = faker7.name();
        com.github.javafaker.Internet internet11 = faker7.internet;
        com.github.javafaker.Color color12 = faker7.color();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp85();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNull(app8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet8();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet19();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(internet6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale18();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker80();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber8();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor51();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale18();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber20();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber3);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom10();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber72();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker105();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker106();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale84();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker88();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.util.Locale locale1 = new java.util.Locale("en");
        org.junit.Assert.assertEquals(locale1.toString(), "en");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem74();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance48();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode57();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet10();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime78();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker80();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(hacker4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions83();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale45();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber76();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet37();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber20();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime59();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker35();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(hacker5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale18();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker58();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber80();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService29();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany37();
        com.github.javafaker.App app10 = serializedObjectSupporter0.deserializeObjectApp3();
        com.github.javafaker.Address address11 = serializedObjectSupporter0.deserializeObjectAddress85();
        com.github.javafaker.Finance finance12 = serializedObjectSupporter0.deserializeObjectFinance56();
        com.github.javafaker.Code code13 = serializedObjectSupporter0.deserializeObjectCode11();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNull(app10);
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(code13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime9();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService7();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet37();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber20();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor42();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions55();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService30();
        com.github.javafaker.Options options10 = serializedObjectSupporter0.deserializeObjectOptions73();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(options10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom10();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness26();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(business3);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress16();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions80();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom10();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber72();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor41();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness10();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Address address3 = serializedObjectSupporter0.deserializeObjectAddress40();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp10();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker132();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(address3);
        org.junit.Assert.assertNull(app4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor6();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber72();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet22();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber9();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook60();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale46();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker241();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp69();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale7();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker245();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet52();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale10();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor79();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber2();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale15();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker23();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor21();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker81();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness78();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook1();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness54();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber12();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance59();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber63();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale64();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet58();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp39();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNull(app8);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber63();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale64();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet58();
        java.util.Random random8 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime68();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(random8);
        org.junit.Assert.assertNotNull(dateAndTime9);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker149();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime2();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber77();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker112();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom3();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream7 = random3.doubles((long) (byte) -1, (double) (-1), (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(random3);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker183();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany61();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber40();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions83();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook56();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName44();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions14();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService25();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale105();
        java.lang.String str7 = locale6.getISO3Language();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eng" + "'", str7, "eng");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany72();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale82();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem36();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en", 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode77();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp34();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance7();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker178();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom8();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp70();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem16();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook6();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale160();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker149();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime2();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker11();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany72();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet19();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(internet5);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker81();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness78();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook1();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker9();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Hacker hacker9 = serializedObjectSupporter0.deserializeObjectHacker35();
        com.github.javafaker.Book book10 = serializedObjectSupporter0.deserializeObjectBook21();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(hacker9);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance55();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker7();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber62();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance65();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber68();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress32();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale48();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor79();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale84();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance54();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale18();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook63();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom9();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(random3);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker134();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale18();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet37();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber20();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker165();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress6();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker100();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker81();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness78();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook1();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness54();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber12();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale159();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime29();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress66();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName12();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNull(name6);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale33();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker132();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany72();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale82();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet84();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(internet7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker45();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService64();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance79();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale16();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter3.deserializeObjectFaker75();
        java.util.Random random5 = serializedObjectSupporter3.deserializeObjectRandom2();
        java.util.Random random6 = serializedObjectSupporter3.deserializeObjectRandom10();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.Color color8 = faker7.color;
        com.github.javafaker.Book book9 = faker7.book();
        com.github.javafaker.Name name10 = faker7.name();
        com.github.javafaker.Internet internet11 = faker7.internet;
        com.github.javafaker.Number number12 = faker7.number;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(number12);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress31();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker15();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook12();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker242();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress18();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker59();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber5();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode77();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp34();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime18();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance66();
        com.github.javafaker.Address address10 = serializedObjectSupporter0.deserializeObjectAddress27();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNull(address10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor6();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker31();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress54();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(address6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany72();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale82();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale101();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor49();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter3.deserializeObjectFaker75();
        java.util.Random random5 = serializedObjectSupporter3.deserializeObjectRandom2();
        java.util.Random random6 = serializedObjectSupporter3.deserializeObjectRandom10();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.Color color8 = faker7.color;
        com.github.javafaker.PhoneNumber phoneNumber9 = faker7.phoneNumber();
        com.github.javafaker.Company company10 = faker7.company;
        com.github.javafaker.Lorem lorem11 = faker7.lorem;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(lorem11);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime29();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress66();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem78();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance26();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker189();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany10();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor84();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber60();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook63();
        com.github.javafaker.App app3 = serializedObjectSupporter0.deserializeObjectApp58();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(app3);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker45();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService64();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance79();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker12();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker183();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany61();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale1();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom3();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(random7);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eng");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker81();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness78();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook1();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker9();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker39();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker136();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom10();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber72();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker105();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker106();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale84();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany21();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(company8);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress31();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker118();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService29();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany37();
        com.github.javafaker.App app10 = serializedObjectSupporter0.deserializeObjectApp3();
        com.github.javafaker.Address address11 = serializedObjectSupporter0.deserializeObjectAddress85();
        com.github.javafaker.Finance finance12 = serializedObjectSupporter0.deserializeObjectFinance56();
        com.github.javafaker.Name name13 = serializedObjectSupporter0.deserializeObjectName44();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNull(app10);
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNull(name13);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker187();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber55();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker53();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(hacker5);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker149();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime2();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker231();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions29();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker28();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale141();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "en_US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "en_US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "en_US");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp63();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber36();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(number3);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker10();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber53();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale11();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker149();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale160();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress49();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode8();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.util.Locale locale0 = java.util.Locale.UK;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber63();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale64();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet58();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness54();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet37();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber20();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker165();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale27();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter3.deserializeObjectFaker75();
        java.util.Random random5 = serializedObjectSupporter3.deserializeObjectRandom2();
        java.util.Random random6 = serializedObjectSupporter3.deserializeObjectRandom10();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.Color color8 = faker7.color;
        com.github.javafaker.PhoneNumber phoneNumber9 = faker7.phoneNumber();
        com.github.javafaker.Company company10 = faker7.company;
        com.github.javafaker.Finance finance11 = faker7.getfinance();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(finance11);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker81();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber71();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService16();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter2 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale3 = serializedObjectSupporter2.deserializeObjectLocale106();
        java.util.Locale locale4 = serializedObjectSupporter2.deserializeObjectLocale57();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter2.deserializeObjectPhoneNumber68();
        boolean boolean6 = languageRange1.equals((java.lang.Object) phoneNumber5);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Address address2 = serializedObjectSupporter0.deserializeObjectAddress51();
        com.github.javafaker.App app3 = serializedObjectSupporter0.deserializeObjectApp41();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(address2);
        org.junit.Assert.assertNull(app3);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker183();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany61();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale1();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom8();
        java.util.stream.IntStream intStream8 = random7.ints();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance10();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp7();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(app5);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp2();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker21();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber31();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet84();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(internet5);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker45();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService64();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance79();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem22();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress19();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName4();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor38();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker44();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(name7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber33();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness69();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor6();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker31();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor7();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en", (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance5();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress71();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany49();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker41();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService54();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale159();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem40();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress52();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(address5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance60();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale47();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService7();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany62();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker245();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress16();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber77();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress26();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook34();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale124();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor6();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker31();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress43();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber29();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker45();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService64();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor33();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber75();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker106();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker42();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber85();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker45();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService64();
        java.util.Random random8 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker108();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService47();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(random8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(fakeValuesService10);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem50();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber77();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker226();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber68();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress32();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet41();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp65();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(app6);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet22();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber9();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook60();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale46();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker142();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet37();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber20();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker165();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale67();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem22();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker244();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Hacker hacker2 = serializedObjectSupporter0.deserializeObjectHacker79();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode19();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem68();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(hacker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(lorem4);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker189();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode33();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode24();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness66();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor47();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem34();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker219();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale45();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber69();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber10);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance55();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber77();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale105();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode25();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions3();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(options4);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService29();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook35();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber63();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom2();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = random6.nextInt((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(random6);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress18();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker59();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom8();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode4();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany72();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions42();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions75();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.util.Random random1 = new java.util.Random(0L);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("eng", (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=97.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.util.Random random1 = new java.util.Random((long) (byte) 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime9();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany28();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance46();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode12();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService54();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker5();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress30();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(address7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor47();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem34();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker219();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale45();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker52();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker81();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness78();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook1();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker9();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Hacker hacker9 = serializedObjectSupporter0.deserializeObjectHacker35();
        com.github.javafaker.Internet internet10 = serializedObjectSupporter0.deserializeObjectInternet59();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale47();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(hacker9);
        org.junit.Assert.assertNull(internet10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress18();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker59();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom8();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp34();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNull(app7);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale38();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet85();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp40();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook15();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService29();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany41();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNull(company9);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter3.deserializeObjectFaker75();
        java.util.Random random5 = serializedObjectSupporter3.deserializeObjectRandom2();
        java.util.Random random6 = serializedObjectSupporter3.deserializeObjectRandom10();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.Color color8 = faker7.color;
        com.github.javafaker.Internet internet9 = faker7.getinternet();
        com.github.javafaker.Color color10 = faker7.color;
        java.lang.String str12 = faker7.regexify("");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker209();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker245();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet50();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp22();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(app6);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions83();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook56();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName44();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions14();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor47();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance14();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet25();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(internet5);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Hacker hacker2 = serializedObjectSupporter0.deserializeObjectHacker1();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker12();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker69();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(hacker2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(hacker4);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime9();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany28();
        java.util.Random random8 = serializedObjectSupporter0.deserializeObjectRandom5();
        java.util.Random random9 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker153();
        com.github.javafaker.Number number11 = serializedObjectSupporter0.deserializeObjectNumber85();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(random8);
        org.junit.Assert.assertNotNull(random9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(number11);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber68();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress32();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet41();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp50();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(app6);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber77();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService81();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime63();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance37();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom8();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker178();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem50();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook3();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber75();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany77();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions84();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp26();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(app8);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany62();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook1();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor53();
        com.github.javafaker.service.RandomService randomService6 = serializedObjectSupporter0.deserializeObjectRandomService2();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(randomService6);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet37();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber20();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker227();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker61();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber63();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale64();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet58();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName31();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNull(name8);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress55();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness82();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker81();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en", (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker189();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany10();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor84();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker107();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor27();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker108();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker235();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions16();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale3();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet37();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker12();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet38();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem13();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker183();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany61();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale1();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName81();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(name7);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions78();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance49();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions78();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany62();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale147();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp55();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(app6);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor79();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale84();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale13();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions79();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter3.deserializeObjectFaker75();
        java.util.Random random5 = serializedObjectSupporter3.deserializeObjectRandom2();
        java.util.Random random6 = serializedObjectSupporter3.deserializeObjectRandom10();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.Color color8 = faker7.color;
        com.github.javafaker.Book book9 = faker7.book();
        com.github.javafaker.Name name10 = faker7.name();
        com.github.javafaker.Internet internet11 = faker7.internet;
        com.github.javafaker.Color color12 = faker7.color;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber24();
        java.util.Random random4 = serializedObjectSupporter0.deserializeObjectRandom6();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker15();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor36();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(random4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom5();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime41();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions82();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany48();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNull(company5);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions83();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook56();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName44();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions14();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet39();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness42();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness67();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService29();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany37();
        com.github.javafaker.App app10 = serializedObjectSupporter0.deserializeObjectApp3();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale12 = null;
        java.lang.String str13 = null; // flaky: locale11.getDisplayScript(locale12);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNull(app10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale105();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness46();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor49();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale100();
        com.github.javafaker.Name name2 = serializedObjectSupporter0.deserializeObjectName48();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber75();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress23();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker221();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(name2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter3.deserializeObjectFaker75();
        java.util.Random random5 = serializedObjectSupporter3.deserializeObjectRandom2();
        java.util.Random random6 = serializedObjectSupporter3.deserializeObjectRandom10();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.Color color8 = faker7.color;
        com.github.javafaker.Internet internet9 = faker7.getinternet();
        com.github.javafaker.Color color10 = faker7.color;
        com.github.javafaker.Address address11 = faker7.address;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(address11);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress16();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale23();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime65();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany50();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNull(company8);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter3.deserializeObjectFaker75();
        java.util.Random random5 = serializedObjectSupporter3.deserializeObjectRandom2();
        java.util.Random random6 = serializedObjectSupporter3.deserializeObjectRandom10();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.Color color8 = faker7.color;
        com.github.javafaker.service.RandomService randomService9 = faker7.randomService;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(randomService9);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor6();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker31();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook5();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker138();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber68();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress32();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker233();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp64();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale16();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale10();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker87();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber65();
        com.github.javafaker.Address address11 = serializedObjectSupporter0.deserializeObjectAddress57();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNull(address11);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem40();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook84();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker44();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(hacker6);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor47();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem34();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker219();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor39();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook63();
        com.github.javafaker.Name name3 = serializedObjectSupporter0.deserializeObjectName79();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker33();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet54();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker146();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(name3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom7();
        double double3 = random2.nextGaussian();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.008840489002700645d + "'", double3 == 0.008840489002700645d);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime9();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany28();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber14();
        com.github.javafaker.Hacker hacker10 = serializedObjectSupporter0.deserializeObjectHacker13();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(hacker10);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale105();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness46();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress61();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNull(address4);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet8();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService21();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet7();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNull(internet7);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet10();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker117();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook63();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions27();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker55();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber40();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService30();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName25();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor71();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNull(name4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime9();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem17();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker108();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness20();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale100();
        com.github.javafaker.Name name2 = serializedObjectSupporter0.deserializeObjectName48();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber75();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName36();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(name2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(name4);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker112();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker195();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Hacker hacker2 = serializedObjectSupporter0.deserializeObjectHacker1();
        com.github.javafaker.Internet internet3 = serializedObjectSupporter0.deserializeObjectInternet26();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker196();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor45();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(hacker2);
        org.junit.Assert.assertNull(internet3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker149();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance85();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance84();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker31();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor67();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem28();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany52();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime48();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale161();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker243();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker139();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet61();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(internet6);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp63();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions79();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook48();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode21();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom10();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = random3.nextInt((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(random3);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale123();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness20();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(business4);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany72();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress47();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(address5);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker81();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness78();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook1();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker9();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService40();
        java.util.Random random10 = serializedObjectSupporter0.deserializeObjectRandom9();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(random10);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom9();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber68();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp41();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(app5);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName68();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker147();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(name4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet10();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime78();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance47();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker241();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness12();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor47();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem34();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness26();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker149();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale160();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber38();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook84();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet10();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker65();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor79();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker77();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance78();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker112();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker113();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.util.Locale locale0 = java.util.Locale.PRC;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.util.Locale locale3 = new java.util.Locale("eng", "", "eng");
        org.junit.Assert.assertEquals(locale3.toString(), "eng__eng");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany6();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(company4);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom9();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions25();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress41();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNull(address5);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet37();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber20();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime59();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook84();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale100();
        com.github.javafaker.Name name2 = serializedObjectSupporter0.deserializeObjectName48();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker157();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(name2);
        org.junit.Assert.assertNull(faker3);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor79();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale12();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance55();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker7();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale91();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker46();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(hacker7);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker45();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService64();
        java.util.Random random8 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker108();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker125();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(random8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode77();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp34();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime18();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook16();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance64();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime46();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem23();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber55();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom5();
        com.github.javafaker.Address address3 = serializedObjectSupporter0.deserializeObjectAddress26();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem71();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber48();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNull(address3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber63();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale64();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance41();
        com.github.javafaker.Address address8 = serializedObjectSupporter0.deserializeObjectAddress66();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode83();
        com.github.javafaker.Internet internet10 = serializedObjectSupporter0.deserializeObjectInternet29();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNull(address8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNull(internet10);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter3.deserializeObjectFaker75();
        java.util.Random random5 = serializedObjectSupporter3.deserializeObjectRandom2();
        java.util.Random random6 = serializedObjectSupporter3.deserializeObjectRandom10();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.PhoneNumber phoneNumber8 = faker7.phoneNumber();
        com.github.javafaker.Options options9 = faker7.options();
        com.github.javafaker.Code code10 = faker7.getcode();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(code10);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions19();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber85();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(phoneNumber4);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime9();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany28();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness55();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber24();
        java.util.Random random4 = serializedObjectSupporter0.deserializeObjectRandom6();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber7();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance30();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(random4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("eng");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor57();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet16();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook47();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor6();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker215();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp29();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(app6);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem40();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber2();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress62();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(address6);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem74();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance55();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale165();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook46();
        com.github.javafaker.Internet internet10 = serializedObjectSupporter0.deserializeObjectInternet34();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(internet10);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions19();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance7();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(finance4);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany34();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(company4);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker215();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook65();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook4();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker182();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode77();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp34();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance7();
        com.github.javafaker.Name name9 = serializedObjectSupporter0.deserializeObjectName30();
        com.github.javafaker.Business business10 = serializedObjectSupporter0.deserializeObjectBusiness17();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNull(name9);
        org.junit.Assert.assertNotNull(business10);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime46();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem23();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker24();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions83();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook56();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName44();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions14();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet39();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness42();
        com.github.javafaker.Address address9 = serializedObjectSupporter0.deserializeObjectAddress74();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNull(address9);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions19();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale163();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp2();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale65();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker125();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook38();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker141();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance5();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress71();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale95();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor47();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem34();
        java.util.Random random8 = serializedObjectSupporter0.deserializeObjectRandom8();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(random8);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem50();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker16();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom6();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(random2);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber77();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet49();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(internet6);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter3.deserializeObjectFaker75();
        java.util.Random random5 = serializedObjectSupporter3.deserializeObjectRandom2();
        java.util.Random random6 = serializedObjectSupporter3.deserializeObjectRandom10();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.PhoneNumber phoneNumber8 = faker7.phoneNumber();
        com.github.javafaker.Business business9 = faker7.business;
        com.github.javafaker.Number number10 = faker7.number;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(number10);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime9();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany28();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime83();
        com.github.javafaker.Internet internet9 = serializedObjectSupporter0.deserializeObjectInternet84();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker66();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNull(internet9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook63();
        com.github.javafaker.Name name3 = serializedObjectSupporter0.deserializeObjectName79();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService44();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany48();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance38();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(name3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter3.deserializeObjectFaker75();
        java.util.Random random5 = serializedObjectSupporter3.deserializeObjectRandom2();
        java.util.Random random6 = serializedObjectSupporter3.deserializeObjectRandom10();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.Options options8 = faker7.options;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor79();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale84();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale13();
        java.lang.String str9 = locale8.getISO3Country();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode0.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress16();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker231();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber63();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale64();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance41();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName61();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode38();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNull(name8);
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany72();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet8();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(internet6);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker81();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness78();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale138();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem74();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode23();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet10();
        com.github.javafaker.App app3 = serializedObjectSupporter0.deserializeObjectApp52();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker170();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime60();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem5();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions53();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(app3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName25();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber34();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale34();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNull(name4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter3.deserializeObjectFaker75();
        java.util.Random random5 = serializedObjectSupporter3.deserializeObjectRandom2();
        java.util.Random random6 = serializedObjectSupporter3.deserializeObjectRandom10();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.PhoneNumber phoneNumber8 = faker7.phoneNumber();
        com.github.javafaker.Business business9 = faker7.business;
        com.github.javafaker.Options options10 = faker7.options;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(options10);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime9();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale72();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName50();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService37();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker175();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(name7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker149();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance85();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance84();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker31();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness3();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber75();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany77();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName81();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker76();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNull(name7);
        org.junit.Assert.assertNotNull(hacker8);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService29();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany37();
        com.github.javafaker.App app10 = serializedObjectSupporter0.deserializeObjectApp3();
        com.github.javafaker.Address address11 = serializedObjectSupporter0.deserializeObjectAddress85();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker242();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNull(app10);
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertNull(faker12);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime29();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker112();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker205();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance48();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber84();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress19();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor54();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker112();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem54();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName26();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(name5);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker149();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime2();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale89();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet16();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(internet6);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet22();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor40();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions68();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode77();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker70();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance12();
        com.github.javafaker.Internet internet9 = serializedObjectSupporter0.deserializeObjectInternet75();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNull(internet9);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber24();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor56();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress30();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker3();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Hacker hacker2 = serializedObjectSupporter0.deserializeObjectHacker1();
        com.github.javafaker.Name name3 = serializedObjectSupporter0.deserializeObjectName48();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress16();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor48();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(hacker2);
        org.junit.Assert.assertNull(name3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter3.deserializeObjectFaker75();
        java.util.Random random5 = serializedObjectSupporter3.deserializeObjectRandom2();
        java.util.Random random6 = serializedObjectSupporter3.deserializeObjectRandom10();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.Color color8 = faker7.color;
        com.github.javafaker.Internet internet9 = faker7.getinternet();
        com.github.javafaker.Color color10 = faker7.color;
        com.github.javafaker.Internet internet11 = faker7.internet();
        com.github.javafaker.Address address12 = faker7.address;
        java.lang.String str14 = faker7.bothify("English");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(address12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "English" + "'", str14, "English");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker189();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp32();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(app4);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker149();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany5();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker40();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(hacker5);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom8();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker32();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(hacker6);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime29();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker112();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker205();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany56();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale147();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker49();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime74();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime76();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance85();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress18();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker59();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom8();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale82();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions83();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook56();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName44();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions14();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet39();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp16();
        java.util.Random random9 = serializedObjectSupporter0.deserializeObjectRandom4();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNotNull(random9);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress2();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness59();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance48();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker45();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService64();
        java.util.Random random8 = serializedObjectSupporter0.deserializeObjectRandom7();
        java.util.Random random9 = serializedObjectSupporter0.deserializeObjectRandom6();
        com.github.javafaker.Business business10 = serializedObjectSupporter0.deserializeObjectBusiness70();
        com.github.javafaker.Lorem lorem11 = serializedObjectSupporter0.deserializeObjectLorem53();
        com.github.javafaker.Lorem lorem12 = serializedObjectSupporter0.deserializeObjectLorem67();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(random8);
        org.junit.Assert.assertNotNull(random9);
        org.junit.Assert.assertNotNull(business10);
        org.junit.Assert.assertNotNull(lorem11);
        org.junit.Assert.assertNotNull(lorem12);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker245();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet52();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress19();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(address7);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet22();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber9();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook60();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale46();
        java.util.Random random8 = serializedObjectSupporter0.deserializeObjectRandom10();
        java.util.stream.IntStream intStream9 = random8.ints();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(random8);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress16();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale23();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale6);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime9();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany28();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime83();
        com.github.javafaker.Internet internet9 = serializedObjectSupporter0.deserializeObjectInternet84();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker66();
        com.github.javafaker.Business business11 = serializedObjectSupporter0.deserializeObjectBusiness3();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNull(internet9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(business11);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale38();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService3();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber46();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Hacker hacker2 = serializedObjectSupporter0.deserializeObjectHacker79();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode19();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber21();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker212();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(hacker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter3.deserializeObjectFaker75();
        java.util.Random random5 = serializedObjectSupporter3.deserializeObjectRandom2();
        java.util.Random random6 = serializedObjectSupporter3.deserializeObjectRandom10();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.Color color8 = faker7.color;
        com.github.javafaker.Book book9 = faker7.book();
        com.github.javafaker.Name name10 = faker7.name();
        com.github.javafaker.Internet internet11 = faker7.internet;
        com.github.javafaker.Internet internet12 = faker7.internet();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(internet12);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany72();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker20();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale18();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress61();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(address7);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale38();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale7();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker35();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance54();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker179();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet22();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions7();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance37();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale5();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions83();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker4();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance80();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions83();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale45();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService8();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor81();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker167();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker149();
        java.util.Random random4 = serializedObjectSupporter0.deserializeObjectRandom10();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom8();
        java.util.stream.IntStream intStream7 = random5.ints((long) (short) 1);
        java.util.stream.IntStream intStream9 = random5.ints(1L);
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(random4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker81();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness78();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions31();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance37();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber63();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale64();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet58();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker14();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(hacker8);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode26();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService85();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions7();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber75();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany77();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName81();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber8();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNull(name7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber24();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor56();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName57();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance52();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale18();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker58();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance33();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale33();
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(charSet3);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance9();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker73();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker159();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker220();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet37();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber20();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker227();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp9();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(app5);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem74();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Internet internet8 = serializedObjectSupporter0.deserializeObjectInternet48();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime26();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(internet8);
        org.junit.Assert.assertNotNull(dateAndTime9);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor79();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale84();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale13();
        com.github.javafaker.App app9 = serializedObjectSupporter0.deserializeObjectApp32();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(app9);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode77();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp34();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime18();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook16();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker187();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor79();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale84();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale13();
        java.lang.String str9 = locale8.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber24();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress28();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber64();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker47();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker183();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany61();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale141();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber66();
        com.github.javafaker.Address address8 = serializedObjectSupporter0.deserializeObjectAddress34();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNull(address8);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime9();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness47();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime11();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp64();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime65();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker183();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet26();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(internet5);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions78();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance49();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp83();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions49();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker206();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom3();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker59();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker134();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale43();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem83();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany62();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker211();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions58();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor73();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName23();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(name7);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress2();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness59();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale163();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker112();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem54();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker109();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale53();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        java.util.Random random1 = new java.util.Random((long) (short) 10);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("eng", (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker203();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker210();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor51();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale65();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        java.util.Random random1 = new java.util.Random(1L);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp2();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook41();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness7();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(business4);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany85();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber38();
        com.github.javafaker.Address address9 = serializedObjectSupporter0.deserializeObjectAddress45();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNull(address9);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale161();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime44();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale22();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness56();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress18();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker59();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany23();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService54();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook60();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress35();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(address7);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker28();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker197();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker187();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness23();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName19();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor80();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.Address address3 = serializedObjectSupporter0.deserializeObjectAddress39();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(address3);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress2();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions41();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor79();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions17();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(options4);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker245();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp64();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(app5);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress55();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker188();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor42();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor32();
        com.github.javafaker.Name name10 = serializedObjectSupporter0.deserializeObjectName17();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNull(name10);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber58();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions19();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode51();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale140();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance9();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker73();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp21();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime84();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance60();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale47();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker239();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp40();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker134();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem51();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany62();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook1();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName10();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName81();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber36();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp2();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem68();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(lorem3);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem50();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber77();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance59();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem50();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress34();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber84();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress36();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(address7);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService29();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany37();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService16();
        com.github.javafaker.Business business11 = serializedObjectSupporter0.deserializeObjectBusiness45();
        com.github.javafaker.Internet internet12 = serializedObjectSupporter0.deserializeObjectInternet47();
        com.github.javafaker.Color color13 = serializedObjectSupporter0.deserializeObjectColor16();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(fakeValuesService10);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertNull(internet12);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale127();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor47();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance60();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale47();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker120();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress16();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber77();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany64();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness56();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany13();
        com.github.javafaker.Internet internet10 = serializedObjectSupporter0.deserializeObjectInternet77();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNull(internet10);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor47();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem34();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker219();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem31();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setLanguageTag("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor79();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale84();
        java.util.Locale locale8 = locale7.stripExtensions();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter9 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale10 = serializedObjectSupporter9.deserializeObjectLocale106();
        java.util.Locale locale11 = serializedObjectSupporter9.deserializeObjectLocale132();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter9.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber13 = serializedObjectSupporter9.deserializeObjectPhoneNumber3();
        com.github.javafaker.Address address14 = serializedObjectSupporter9.deserializeObjectAddress16();
        java.util.Locale locale15 = serializedObjectSupporter9.deserializeObjectLocale23();
        java.lang.String str16 = locale8.getDisplayName(locale15);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNull(faker12);
        org.junit.Assert.assertNotNull(phoneNumber13);
        org.junit.Assert.assertNull(address14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "English" + "'", str16, "English");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook63();
        com.github.javafaker.Name name3 = serializedObjectSupporter0.deserializeObjectName79();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService44();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany48();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom2();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(name3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(random6);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions83();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook56();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName44();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions14();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet39();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness42();
        com.github.javafaker.Internet internet9 = serializedObjectSupporter0.deserializeObjectInternet10();
        com.github.javafaker.Hacker hacker10 = serializedObjectSupporter0.deserializeObjectHacker12();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNull(internet9);
        org.junit.Assert.assertNotNull(hacker10);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime9();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany28();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime83();
        com.github.javafaker.Internet internet9 = serializedObjectSupporter0.deserializeObjectInternet84();
        com.github.javafaker.DateAndTime dateAndTime10 = serializedObjectSupporter0.deserializeObjectDateAndTime25();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNull(internet9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet8();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService21();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker241();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService2();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker45();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService64();
        java.util.Random random8 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker241();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(random8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale4 = serializedObjectSupporter3.deserializeObjectLocale106();
        java.util.Locale locale5 = serializedObjectSupporter3.deserializeObjectLocale132();
        com.github.javafaker.Options options6 = serializedObjectSupporter3.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter3.deserializeObjectHacker65();
        com.github.javafaker.Code code8 = serializedObjectSupporter3.deserializeObjectCode62();
        com.github.javafaker.Color color9 = serializedObjectSupporter3.deserializeObjectColor79();
        java.util.Locale locale10 = serializedObjectSupporter3.deserializeObjectLocale84();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter11 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale12 = serializedObjectSupporter11.deserializeObjectLocale100();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter13 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale14 = serializedObjectSupporter13.deserializeObjectLocale106();
        java.util.Locale locale15 = serializedObjectSupporter13.deserializeObjectLocale132();
        java.util.Locale[] localeArray16 = new java.util.Locale[] { locale10, locale12, locale15 };
        java.util.ArrayList<java.util.Locale> localeList17 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList17, localeArray16);
        java.util.Locale.FilteringMode filteringMode19 = null;
        java.util.List<java.util.Locale> localeList20 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList17, filteringMode19);
        java.util.Locale.LanguageRange languageRange23 = new java.util.Locale.LanguageRange("en", (double) (byte) 1);
        double double24 = languageRange23.getWeight();
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] { languageRange23 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.lang.String[] strArray30 = new java.lang.String[] { "eng", "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList31);
        java.lang.String str34 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList31);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertNotNull(localeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(localeList20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter3.deserializeObjectFaker75();
        java.util.Random random5 = serializedObjectSupporter3.deserializeObjectRandom2();
        java.util.Random random6 = serializedObjectSupporter3.deserializeObjectRandom10();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.Color color8 = faker7.color;
        com.github.javafaker.Internet internet9 = faker7.getinternet();
        com.github.javafaker.Color color10 = faker7.color;
        com.github.javafaker.Book book11 = faker7.book;
        com.github.javafaker.App app12 = faker7.app;
        com.github.javafaker.App app13 = faker7.getapp();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(app12);
        org.junit.Assert.assertNotNull(app13);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Address address3 = serializedObjectSupporter0.deserializeObjectAddress25();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(address3);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom9();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker44();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale162();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor37();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet22();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor40();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance16();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem41();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions83();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale45();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService8();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker23();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale109();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber74();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress45();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale114();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker149();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance85();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance84();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode78();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker72();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime9();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany28();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance46();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale8();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale53();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet37();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker12();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode43();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom6();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(random5);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance55();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker7();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode10();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale124();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook73();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem32();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker85();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions65();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker21();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime18();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker49();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker116();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance78();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance10();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker62();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany18();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions83();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale45();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber40();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime9();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany28();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness21();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber24();
        java.util.Random random4 = serializedObjectSupporter0.deserializeObjectRandom6();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor72();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale56();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(random4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom5();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime41();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName74();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress77();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany63();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNull(name4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale127();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness30();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany32();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor40();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale105();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor44();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook60();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(book4);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Hacker hacker2 = serializedObjectSupporter0.deserializeObjectHacker1();
        com.github.javafaker.Internet internet3 = serializedObjectSupporter0.deserializeObjectInternet26();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook43();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(hacker2);
        org.junit.Assert.assertNull(internet3);
        org.junit.Assert.assertNull(book4);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress31();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker15();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode8();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp34();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions52();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom9();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker44();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime18();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker59();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(hacker6);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker81();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness78();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook1();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker9();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker227();
        com.github.javafaker.Number number10 = serializedObjectSupporter0.deserializeObjectNumber60();
        com.github.javafaker.Company company11 = serializedObjectSupporter0.deserializeObjectCompany33();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNull(company11);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker16();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker213();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook10();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor27();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress14();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale23();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp2();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker21();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber31();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions57();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet82();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet73();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook44();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom9();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker44();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale162();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor6();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp62();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker94();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber40();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(app4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Hacker hacker2 = serializedObjectSupporter0.deserializeObjectHacker1();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem13();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(hacker2);
        org.junit.Assert.assertNotNull(lorem3);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService29();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany37();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService16();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker2();
        com.github.javafaker.App app12 = serializedObjectSupporter0.deserializeObjectApp66();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(fakeValuesService10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNull(app12);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany5();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness84();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp69();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker106();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet58();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(internet7);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor47();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale51();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale139();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter3.deserializeObjectFaker75();
        java.util.Random random5 = serializedObjectSupporter3.deserializeObjectRandom2();
        java.util.Random random6 = serializedObjectSupporter3.deserializeObjectRandom10();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.Color color8 = faker7.color;
        java.lang.String str10 = faker7.numerify("English");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "English" + "'", str10, "English");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale105();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber26();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker81();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness78();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook1();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness54();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber12();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions34();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress31();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker45();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker147();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter3.deserializeObjectFaker75();
        java.util.Random random5 = serializedObjectSupporter3.deserializeObjectRandom2();
        java.util.Random random6 = serializedObjectSupporter3.deserializeObjectRandom10();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.Color color8 = faker7.color;
        com.github.javafaker.Internet internet9 = faker7.getinternet();
        com.github.javafaker.Color color10 = faker7.getcolor();
        java.lang.String str12 = faker7.letterify("en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en" + "'", str12, "en");
    }
}
