import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber63();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale64();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet58();
        java.util.Random random8 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService3();
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
        org.junit.Assert.assertNotNull(fakeValuesService9);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en", (double) (byte) 1);
        double double3 = languageRange2.getWeight();
        java.lang.String str4 = languageRange2.getRange();
        java.lang.String str5 = languageRange2.getRange();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker215();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook65();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook4();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet31();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(internet7);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime10();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(dateAndTime4);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany62();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker211();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker71();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("eng", (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
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
        java.util.Random random10 = serializedObjectSupporter0.deserializeObjectRandom8();
        com.github.javafaker.DateAndTime dateAndTime11 = serializedObjectSupporter0.deserializeObjectDateAndTime17();
        com.github.javafaker.Internet internet12 = serializedObjectSupporter0.deserializeObjectInternet73();
        java.util.Locale locale13 = serializedObjectSupporter0.deserializeObjectLocale18();
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
        org.junit.Assert.assertNotNull(random10);
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNull(internet12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor77();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker152();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale38();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService3();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook44();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker83();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName68();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem5();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale163();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(name4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet22();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor40();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance16();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker201();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker183();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber84();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker158();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp2();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale65();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker125();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook38();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem10();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Address address3 = serializedObjectSupporter0.deserializeObjectAddress40();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem79();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber79();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(address3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker112();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany23();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet65();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(internet5);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet10();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime78();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker16();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(hacker4);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor79();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker77();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker21();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertNotNull(hacker8);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber68();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress32();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet41();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker122();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp82();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom10();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber72();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker105();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker106();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale84();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter8 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random9 = serializedObjectSupporter8.deserializeObjectRandom7();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale7, random9);
        com.github.javafaker.Code code11 = faker10.code();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(random9);
        org.junit.Assert.assertNotNull(code11);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale83();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor8();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor27();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker108();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance11();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode14();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode81();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress46();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode37();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale18();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker80();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService6();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook42();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet10();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime78();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance47();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor67();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker240();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem28();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp33();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(app6);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions19();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode6();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(code4);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale105();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness46();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker209();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker81();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions77();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker206();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale8();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber45();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime9();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress9();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(address7);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale38();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet85();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker153();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker120();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor33();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness5();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker100();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor79();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber2();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale15();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany58();
        com.github.javafaker.Address address10 = serializedObjectSupporter0.deserializeObjectAddress44();
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
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNull(address10);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet8();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany18();
        com.github.javafaker.service.RandomService randomService7 = serializedObjectSupporter0.deserializeObjectRandomService2();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(randomService7);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker206();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp31();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(app5);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany72();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions42();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber42();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale38();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet85();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker153();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker120();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor33();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions68();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService54();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber1();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber45();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem22();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale155();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions36();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName33();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(name7);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp69();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService9();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook73();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress24();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(address6);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker189();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode33();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode24();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance62();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress18();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker59();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet8();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(internet6);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
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
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService2();
        com.github.javafaker.Hacker hacker11 = serializedObjectSupporter0.deserializeObjectHacker50();
        com.github.javafaker.Company company12 = serializedObjectSupporter0.deserializeObjectCompany59();
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
        org.junit.Assert.assertNotNull(fakeValuesService10);
        org.junit.Assert.assertNotNull(hacker11);
        org.junit.Assert.assertNull(company12);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Internet internet8 = serializedObjectSupporter0.deserializeObjectInternet39();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance45();
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
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook63();
        com.github.javafaker.Name name3 = serializedObjectSupporter0.deserializeObjectName79();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService44();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime32();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(name3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet22();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp79();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions16();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber75();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker88();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName29();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(name7);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor27();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker108();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker235();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode40();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp74();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(app8);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale112();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress16();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber77();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany64();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook78();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem15();
        java.util.Random random10 = serializedObjectSupporter0.deserializeObjectRandom8();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(random10);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook63();
        com.github.javafaker.Name name3 = serializedObjectSupporter0.deserializeObjectName79();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService44();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker31();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(name3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions74();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale23();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp64();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale16();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem27();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode77();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName25();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem9();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(name7);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker149();
        java.util.Random random4 = serializedObjectSupporter0.deserializeObjectRandom10();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom8();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker85();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber32();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(random4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker112();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany23();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale99();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker232();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale22();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber24();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber27();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName56();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(name5);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService29();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber22();
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
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker112();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber45();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany44();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(company4);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime9();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem17();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker108();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale50();
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
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet37();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber20();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker165();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress6();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook74();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness25();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom10();
        com.github.javafaker.Address address3 = serializedObjectSupporter0.deserializeObjectAddress31();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNull(address3);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Internet internet8 = serializedObjectSupporter0.deserializeObjectInternet21();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber43();
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
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker149();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale160();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale87();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem80();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker20();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
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
        java.util.Random random10 = serializedObjectSupporter0.deserializeObjectRandom8();
        com.github.javafaker.Business business11 = serializedObjectSupporter0.deserializeObjectBusiness41();
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
        org.junit.Assert.assertNotNull(random10);
        org.junit.Assert.assertNotNull(business11);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker149();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance85();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance84();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime35();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale20();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook35();
        com.github.javafaker.Address address9 = serializedObjectSupporter0.deserializeObjectAddress40();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(address9);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet37();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber20();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance76();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker200();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale100();
        com.github.javafaker.Name name2 = serializedObjectSupporter0.deserializeObjectName48();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker31();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(name2);
        org.junit.Assert.assertNotNull(hacker3);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
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
        com.github.javafaker.Lorem lorem10 = serializedObjectSupporter0.deserializeObjectLorem66();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker69();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(hacker9);
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
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
        com.github.javafaker.Hacker hacker12 = serializedObjectSupporter0.deserializeObjectHacker75();
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
        org.junit.Assert.assertNotNull(hacker12);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
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
        com.github.javafaker.Number number13 = serializedObjectSupporter0.deserializeObjectNumber26();
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
        org.junit.Assert.assertNotNull(number13);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker189();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany10();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker220();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook74();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker112();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber45();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker47();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Address address3 = serializedObjectSupporter0.deserializeObjectAddress40();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany30();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions13();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(address3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale105();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode25();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime79();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(dateAndTime4);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker51();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale130();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale63();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale38();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet85();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions61();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet80();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(internet7);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness39();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale18();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker80();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService6();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany21();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(company5);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp2();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker21();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode51();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode49();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress31();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions57();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode10();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime70();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime3);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
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
        com.github.javafaker.Finance finance11 = faker7.getfinance();
        com.github.javafaker.Code code12 = faker7.code();
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
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(code12);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Hacker hacker2 = serializedObjectSupporter0.deserializeObjectHacker1();
        com.github.javafaker.Internet internet3 = serializedObjectSupporter0.deserializeObjectInternet26();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker238();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(hacker2);
        org.junit.Assert.assertNull(internet3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor27();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker108();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale154();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber14();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet21();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(internet4);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress55();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness82();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale49();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance11();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp29();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale83();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService39();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(app4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService6);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService54();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker5();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale23();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress16();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber77();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress26();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber79();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale161();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker243();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker181();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook29();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany72();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker20();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale18();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress50();
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
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale105();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor44();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker59();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Hacker hacker2 = serializedObjectSupporter0.deserializeObjectHacker79();
        com.github.javafaker.Internet internet3 = serializedObjectSupporter0.deserializeObjectInternet54();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker82();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker194();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber4();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode34();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber34();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(hacker2);
        org.junit.Assert.assertNull(internet3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber63();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale64();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance41();
        com.github.javafaker.Address address8 = serializedObjectSupporter0.deserializeObjectAddress69();
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
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp2();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker21();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode51();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions23();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany42();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber33();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker81();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness78();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook1();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook59();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance45();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom8();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp70();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness5();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker134();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale43();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale164();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany64();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(company8);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale127();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness30();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany32();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime9();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker220();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale100();
        com.github.javafaker.Address address2 = serializedObjectSupporter0.deserializeObjectAddress85();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook38();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp78();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(address2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(app4);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress18();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook17();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
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
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker220();
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
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker215();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook65();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem6();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale67();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress16();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber77();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress26();
        java.util.Random random8 = serializedObjectSupporter0.deserializeObjectRandom2();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNotNull(random8);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet10();
        com.github.javafaker.App app3 = serializedObjectSupporter0.deserializeObjectApp52();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker170();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime60();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem5();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale102();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(app3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker215();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook65();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom9();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(random6);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale38();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet85();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions61();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness85();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions19();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker215();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook65();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem84();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker55();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(hacker7);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker149();
        java.util.Random random4 = serializedObjectSupporter0.deserializeObjectRandom10();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom8();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker49();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook31();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(random4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker206();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime74();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName50();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNull(name8);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker183();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany61();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale1();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber43();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker226();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor27();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker108();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance11();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService27();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp2();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook41();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook4();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions32();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale163();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker112();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem54();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker109();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale28();
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
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor51();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale155();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet2();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(internet7);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp63();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions60();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(options3);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp57();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness34();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor27();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker108();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance11();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale71();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor31();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker187();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber55();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker16();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(hacker5);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime46();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem23();
        com.github.javafaker.Internet internet8 = serializedObjectSupporter0.deserializeObjectInternet44();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany21();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService49();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNull(internet8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(fakeValuesService10);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor57();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress23();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService24();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom9();
        java.util.stream.DoubleStream doubleStream7 = random3.doubles((long) 'a', (double) (-1), (double) 10.0f);
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress55();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness22();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker2();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor47();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale100();
        com.github.javafaker.Address address2 = serializedObjectSupporter0.deserializeObjectAddress85();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook38();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions71();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress28();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(address2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNull(address5);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor27();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress14();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress55();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNull(address6);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem40();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber2();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook81();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany72();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions42();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor62();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker111();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem50();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName7();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale155();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber76();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker149();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale160();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale87();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale32();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName71();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(name7);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker81();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness78();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions49();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook30();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode77();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp34();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime18();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale127();
        com.github.javafaker.Internet internet10 = serializedObjectSupporter0.deserializeObjectInternet4();
        com.github.javafaker.Company company11 = serializedObjectSupporter0.deserializeObjectCompany60();
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
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(internet10);
        org.junit.Assert.assertNull(company11);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale14();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor3();
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
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance5();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress71();
        com.github.javafaker.Internet internet8 = serializedObjectSupporter0.deserializeObjectInternet45();
        com.github.javafaker.App app9 = serializedObjectSupporter0.deserializeObjectApp56();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(internet8);
        org.junit.Assert.assertNull(app9);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp2();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker21();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode51();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem66();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker134();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp85();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress24();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNull(address7);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
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
        com.github.javafaker.Name name10 = faker7.name;
        com.github.javafaker.Lorem lorem11 = faker7.getlorem();
        com.github.javafaker.DateAndTime dateAndTime12 = faker7.getdateAndTime();
        com.github.javafaker.Lorem lorem13 = faker7.getlorem();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(lorem11);
        org.junit.Assert.assertNotNull(dateAndTime12);
        org.junit.Assert.assertNotNull(lorem13);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker239();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber75();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet22();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor40();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance14();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp64();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp80();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode11();
        com.github.javafaker.Hacker hacker9 = serializedObjectSupporter0.deserializeObjectHacker44();
        com.github.javafaker.Lorem lorem10 = serializedObjectSupporter0.deserializeObjectLorem5();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(hacker9);
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker149();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance85();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance84();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode78();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker111();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker83();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet10();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime78();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode82();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(code4);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp2();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook41();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions84();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem22();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime46();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem23();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Internet internet9 = serializedObjectSupporter0.deserializeObjectInternet60();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(internet9);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService21();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem10();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode47();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName68();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness58();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness76();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp66();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(name4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNull(app7);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions78();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance49();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp83();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService60();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale9();
        com.github.javafaker.Lorem lorem10 = serializedObjectSupporter0.deserializeObjectLorem73();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale100();
        com.github.javafaker.Address address2 = serializedObjectSupporter0.deserializeObjectAddress85();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook38();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions71();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker204();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(address2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale33();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale78();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom4();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(random5);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet37();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber20();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance76();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker156();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber62();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale35();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor79();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker26();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber2();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance12();
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
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber77();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp12();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(app6);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Hacker hacker2 = serializedObjectSupporter0.deserializeObjectHacker1();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker12();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale153();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(hacker2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker81();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness78();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions31();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime1();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet24();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName62();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber16();
        com.github.javafaker.DateAndTime dateAndTime10 = serializedObjectSupporter0.deserializeObjectDateAndTime50();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNull(name8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale161();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker243();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker30();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale107();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime29();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem47();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook63();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions27();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker55();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber40();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker139();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor6();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker43();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(hacker5);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName25();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker231();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode72();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions17();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNull(name4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany72();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale82();
        java.lang.String str7 = locale5.getUnicodeLocaleType("en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Hacker hacker2 = serializedObjectSupporter0.deserializeObjectHacker1();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker12();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale57();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(hacker2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
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
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale139();
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
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet22();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber9();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook60();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale46();
        java.util.Random random8 = serializedObjectSupporter0.deserializeObjectRandom10();
        com.github.javafaker.Internet internet9 = serializedObjectSupporter0.deserializeObjectInternet72();
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
        org.junit.Assert.assertNull(internet9);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem61();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime81();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale83();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService56();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem27();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Hacker hacker2 = serializedObjectSupporter0.deserializeObjectHacker79();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode19();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName32();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker126();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber36();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp22();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(hacker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(name4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(app7);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Hacker hacker2 = serializedObjectSupporter0.deserializeObjectHacker79();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode19();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName32();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker126();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber36();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker75();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(hacker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(name4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker49();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime74();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem3();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem48();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom5();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime41();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor1();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany62();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet42();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet51();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNull(internet5);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        java.util.Locale locale1 = new java.util.Locale("English");
        org.junit.Assert.assertEquals(locale1.toString(), "english");
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany72();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale82();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode26();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem79();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale83();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress58();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions85();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime84();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale54();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber67();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
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
        com.github.javafaker.App app11 = serializedObjectSupporter0.deserializeObjectApp46();
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
        org.junit.Assert.assertNull(app11);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
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
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter11 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter11.deserializeObjectFaker75();
        java.util.Random random13 = serializedObjectSupporter11.deserializeObjectRandom2();
        com.github.javafaker.Number number14 = serializedObjectSupporter11.deserializeObjectNumber24();
        java.util.Random random15 = serializedObjectSupporter11.deserializeObjectRandom6();
        com.github.javafaker.Hacker hacker16 = serializedObjectSupporter11.deserializeObjectHacker15();
        com.github.javafaker.Internet internet17 = serializedObjectSupporter11.deserializeObjectInternet19();
        faker7.serializedObjectSupporter = serializedObjectSupporter11;
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
        org.junit.Assert.assertNull(faker12);
        org.junit.Assert.assertNotNull(random13);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(random15);
        org.junit.Assert.assertNotNull(hacker16);
        org.junit.Assert.assertNull(internet17);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook63();
        com.github.javafaker.Name name3 = serializedObjectSupporter0.deserializeObjectName79();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker33();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness54();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(name3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(business5);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
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
        com.github.javafaker.Address address12 = serializedObjectSupporter0.deserializeObjectAddress50();
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
        org.junit.Assert.assertNull(address12);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet22();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp79();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom4();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp3();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker32();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(hacker8);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker183();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook67();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker8();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany17();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale161();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker243();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker30();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime29();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber35();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName25();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber81();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor19();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNull(name4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress31();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker15();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode8();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp34();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker34();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker187();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber55();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp2();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale65();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker125();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber67();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale76();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime46();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor70();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Hacker hacker2 = serializedObjectSupporter0.deserializeObjectHacker1();
        com.github.javafaker.Internet internet3 = serializedObjectSupporter0.deserializeObjectInternet26();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker196();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker33();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor74();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(hacker2);
        org.junit.Assert.assertNull(internet3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime63();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName60();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker5();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNotNull(hacker7);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet10();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor58();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode77();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker116();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime16();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp2();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker21();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber75();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker146();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor57();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress23();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress16();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber55();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet22();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions7();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService55();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness84();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName35();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber68();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode77();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker70();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode5();
        com.github.javafaker.Hacker hacker9 = serializedObjectSupporter0.deserializeObjectHacker16();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(hacker9);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress31();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions57();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom8();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(random6);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker183();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany61();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale1();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker2();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor6();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName63();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale53();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Hacker hacker2 = serializedObjectSupporter0.deserializeObjectHacker79();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode19();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName32();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom7();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(hacker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(name4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(random6);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress64();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker120();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor79();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber2();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale156();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale157();
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
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness53();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker86();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale38();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet85();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker153();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker120();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName85();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(name8);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
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
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Finance finance11 = serializedObjectSupporter0.deserializeObjectFinance73();
        com.github.javafaker.DateAndTime dateAndTime12 = serializedObjectSupporter0.deserializeObjectDateAndTime28();
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
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(dateAndTime12);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor79();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale84();
        com.github.javafaker.Address address8 = serializedObjectSupporter0.deserializeObjectAddress46();
        com.github.javafaker.Hacker hacker9 = serializedObjectSupporter0.deserializeObjectHacker81();
        com.github.javafaker.Name name10 = serializedObjectSupporter0.deserializeObjectName11();
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
        org.junit.Assert.assertNull(address8);
        org.junit.Assert.assertNotNull(hacker9);
        org.junit.Assert.assertNull(name10);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker81();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness78();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions49();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker78();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode59();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
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
        com.github.javafaker.Company company12 = serializedObjectSupporter0.deserializeObjectCompany68();
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
        org.junit.Assert.assertNull(company12);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp64();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp80();
        com.github.javafaker.Internet internet8 = serializedObjectSupporter0.deserializeObjectInternet26();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(internet8);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance60();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale47();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions65();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet10();
        com.github.javafaker.App app3 = serializedObjectSupporter0.deserializeObjectApp52();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker170();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime60();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions46();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(app3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor27();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker108();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance11();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale71();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale161();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime44();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook63();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale127();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker3();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode33();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker120();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime82();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale100();
        com.github.javafaker.Name name2 = serializedObjectSupporter0.deserializeObjectName48();
        com.github.javafaker.Name name3 = serializedObjectSupporter0.deserializeObjectName6();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(name2);
        org.junit.Assert.assertNull(name3);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode77();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker70();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode5();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber57();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale38();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale7();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker35();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService34();
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
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook63();
        com.github.javafaker.Name name3 = serializedObjectSupporter0.deserializeObjectName79();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker33();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale96();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem36();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp1();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(name3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNull(app7);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode77();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker70();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem50();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale105();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode25();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet22();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp79();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode30();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName45();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(name7);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker112();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany23();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker194();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness26();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance5();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress71();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime43();
        com.github.javafaker.App app9 = serializedObjectSupporter0.deserializeObjectApp6();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNull(app9);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance60();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale47();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService7();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale126();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber75();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker88();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale116();
        com.github.javafaker.Internet internet8 = serializedObjectSupporter0.deserializeObjectInternet75();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(internet8);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Address address2 = serializedObjectSupporter0.deserializeObjectAddress53();
        com.github.javafaker.Address address3 = serializedObjectSupporter0.deserializeObjectAddress21();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime23();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNull(address2);
        org.junit.Assert.assertNull(address3);
        org.junit.Assert.assertNotNull(dateAndTime4);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany62();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker211();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions58();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService29();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress5();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNull(address7);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker206();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime74();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions54();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker134();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet24();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName62();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber16();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance45();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNull(name8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale127();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness30();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker78();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp58();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(app8);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber24();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor56();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName57();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance19();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions83();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale45();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService8();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime77();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor79();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions17();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime29();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale103();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eng");
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("en", (double) (short) 1);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange4 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(languageRangeList9);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor79();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale84();
        com.github.javafaker.Address address8 = serializedObjectSupporter0.deserializeObjectAddress46();
        com.github.javafaker.Hacker hacker9 = serializedObjectSupporter0.deserializeObjectHacker81();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor3();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker122();
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
        org.junit.Assert.assertNull(address8);
        org.junit.Assert.assertNotNull(hacker9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
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
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService50();
        com.github.javafaker.service.RandomService randomService11 = serializedObjectSupporter0.deserializeObjectRandomService5();
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
        org.junit.Assert.assertNotNull(fakeValuesService10);
        org.junit.Assert.assertNotNull(randomService11);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale60();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName35();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(name6);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet10();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime78();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker237();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale38();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook7();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker149();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale160();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale87();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker70();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress68();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNull(address7);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
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
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker50();
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
        org.junit.Assert.assertNull(faker12);
        org.junit.Assert.assertNull(faker13);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet37();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber20();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker165();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions83();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook9();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode77();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker70();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime16();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker245();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet52();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber49();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet30();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(internet7);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime9();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany28();
        com.github.javafaker.Internet internet8 = serializedObjectSupporter0.deserializeObjectInternet66();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService73();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(internet8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet22();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber9();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook60();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale46();
        java.util.Random random8 = serializedObjectSupporter0.deserializeObjectRandom10();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService23();
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
        org.junit.Assert.assertNotNull(fakeValuesService9);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor79();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp8();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(app7);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress9();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance39();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp29();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale102();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService40();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker4();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(app4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale33();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random4 = serializedObjectSupporter3.deserializeObjectRandom7();
        com.github.javafaker.Book book5 = serializedObjectSupporter3.deserializeObjectBook24();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter3.deserializeObjectFaker91();
        com.github.javafaker.Number number7 = serializedObjectSupporter3.deserializeObjectNumber19();
        com.github.javafaker.Color color8 = serializedObjectSupporter3.deserializeObjectColor51();
        java.util.Locale locale9 = serializedObjectSupporter3.deserializeObjectLocale155();
        java.lang.String str10 = locale2.getDisplayLanguage(locale9);
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(random4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "English" + "'", str10, "English");
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale105();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor33();
        java.util.Random random4 = serializedObjectSupporter0.deserializeObjectRandom5();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(random4);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Hacker hacker1 = serializedObjectSupporter0.deserializeObjectHacker75();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker162();
        org.junit.Assert.assertNotNull(hacker1);
        org.junit.Assert.assertNull(faker2);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale94();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker183();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber84();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode77();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem8();
        java.util.Random random8 = serializedObjectSupporter0.deserializeObjectRandom6();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(random8);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker206();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime74();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions54();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance57();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker157();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress19();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale39();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance48();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale164();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
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
        com.github.javafaker.Name name10 = faker7.name;
        com.github.javafaker.Lorem lorem11 = faker7.getlorem();
        com.github.javafaker.Options options12 = faker7.getoptions();
        com.github.javafaker.Options options13 = faker7.getoptions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(lorem11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(options13);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker149();
        java.util.Random random4 = serializedObjectSupporter0.deserializeObjectRandom10();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom8();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem12();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness31();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker9();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale33();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(random4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany62();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker211();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode77();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName25();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName53();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker122();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber11();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(name7);
        org.junit.Assert.assertNull(name8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(phoneNumber10);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName50();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService37();
        com.github.javafaker.Name name9 = serializedObjectSupporter0.deserializeObjectName34();
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
        org.junit.Assert.assertNull(name9);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber63();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale64();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet58();
        java.util.Random random8 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode45();
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
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker32();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook28();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp24();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(app6);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor79();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale84();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance54();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor68();
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
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem50();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName7();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime21();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet43();
        com.github.javafaker.Internet internet8 = serializedObjectSupporter0.deserializeObjectInternet48();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNull(internet8);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale161();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime44();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale22();
        java.lang.String str6 = locale5.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale5.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance5();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress71();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime43();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness53();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale84();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale38();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet85();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions61();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness85();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker58();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
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
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker81();
        com.github.javafaker.PhoneNumber phoneNumber12 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        com.github.javafaker.Business business13 = serializedObjectSupporter0.deserializeObjectBusiness48();
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
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(business13);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress31();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker15();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode8();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker188();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker126();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness26();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany5();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem80();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber39();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber14();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany62();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker211();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions58();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService29();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook41();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem40();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber2();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker18();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(hacker6);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Hacker hacker2 = serializedObjectSupporter0.deserializeObjectHacker79();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber6();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(hacker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(phoneNumber4);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker110();
        com.github.javafaker.Internet internet8 = serializedObjectSupporter0.deserializeObjectInternet40();
        com.github.javafaker.App app9 = serializedObjectSupporter0.deserializeObjectApp82();
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
        org.junit.Assert.assertNull(app9);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance9();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker73();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker159();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem34();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness25();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
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
        com.github.javafaker.Hacker hacker10 = faker7.hacker();
        com.github.javafaker.Address address11 = faker7.address;
        com.github.javafaker.Company company12 = faker7.company;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(hacker10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(company12);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem50();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber77();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime76();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance5();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress71();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime43();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness53();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale152();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker112();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany23();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker194();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime78();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale18();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker80();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService6();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet63();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(internet5);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp63();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions79();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker17();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress46();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(address5);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber63();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale64();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance41();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName61();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness57();
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
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName50();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale127();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker72();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(name7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime9();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany28();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime83();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker17();
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
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime29();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress66();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker6();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber23();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker206();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem11();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale95();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp57();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress62();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNull(address6);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale38();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService3();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook44();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom9();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker135();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime29();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker112();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker205();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook77();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance28();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
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
        com.github.javafaker.Code code11 = serializedObjectSupporter0.deserializeObjectCode60();
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
        org.junit.Assert.assertNotNull(code11);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom8();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker178();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem50();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker136();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker232();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber31();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker112();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber45();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker241();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber35();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor27();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker108();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker235();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber35();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime46();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem23();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber20();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp64();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale16();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale10();
        com.github.javafaker.Name name9 = serializedObjectSupporter0.deserializeObjectName85();
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
        org.junit.Assert.assertNull(name9);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp69();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker106();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker188();
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
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem5();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(lorem3);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker183();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany61();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale1();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker116();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName69();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(name8);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale33();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale78();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale35();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook75();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode65();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet10();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime78();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance47();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale94();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress7();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet47();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(internet7);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker112();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService22();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale47();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker189();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany10();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker220();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance80();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode26();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime17();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale76();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Hacker hacker2 = serializedObjectSupporter0.deserializeObjectHacker1();
        com.github.javafaker.Internet internet3 = serializedObjectSupporter0.deserializeObjectInternet26();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker196();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook49();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(hacker2);
        org.junit.Assert.assertNull(internet3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale83();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService56();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName69();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(name6);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("eng", (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber77();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName17();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale87();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker63();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker245();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet52();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker25();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode83();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName51();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale99();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(name8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp29();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem13();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom8();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(random7);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp62();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker106();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(app4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale100();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService27();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance5();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode3();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale1();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor77();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany81();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(company4);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor6();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker31();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook5();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook41();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber63();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService79();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker134();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp85();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName34();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(name8);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
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
        com.github.javafaker.PhoneNumber phoneNumber11 = serializedObjectSupporter0.deserializeObjectPhoneNumber20();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker167();
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
        org.junit.Assert.assertNotNull(phoneNumber11);
        org.junit.Assert.assertNull(faker12);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker245();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet50();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor5();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet37();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber20();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker165();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress6();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook74();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime50();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber13();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker81();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber71();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker118();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName60();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(name7);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem51();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker206();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime74();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime10();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker81();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness78();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime84();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet82();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(internet7);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet37();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber20();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance76();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook62();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode63();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook63();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions27();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker55();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber40();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet51();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress31();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker15();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode8();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp34();
        com.github.javafaker.Address address8 = serializedObjectSupporter0.deserializeObjectAddress42();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness48();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(address8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker81();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness78();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions49();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions51();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale38();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet85();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker153();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker120();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor33();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber56();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor6();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker31();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions77();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker149();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance85();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance84();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker31();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp85();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertNull(app8);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime29();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker112();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker205();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker35();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet8();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker129();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber42();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode77();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp34();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber84();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber73();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime84();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale54();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker127();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor81();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp69();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance71();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime2();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker149();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale160();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code6 = serializedObjectSupporter5.deserializeObjectCode63();
        java.util.Locale locale7 = serializedObjectSupporter5.deserializeObjectLocale18();
        java.util.Locale locale8 = serializedObjectSupporter5.deserializeObjectLocale161();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter5.deserializeObjectDateAndTime44();
        java.util.Locale locale10 = serializedObjectSupporter5.deserializeObjectLocale22();
        java.lang.String str11 = locale10.toLanguageTag();
        java.lang.String str12 = locale4.getDisplayScript(locale10);
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en" + "'", str11, "en");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
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
        com.github.javafaker.Options options10 = faker7.getoptions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(options10);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber24();
        java.util.Random random4 = serializedObjectSupporter0.deserializeObjectRandom6();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber7();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker60();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook41();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(random4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
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
        com.github.javafaker.Number number10 = serializedObjectSupporter0.deserializeObjectNumber77();
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
        org.junit.Assert.assertNotNull(number10);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale100();
        com.github.javafaker.Name name2 = serializedObjectSupporter0.deserializeObjectName48();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber75();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress23();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp26();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(name2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(app5);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker245();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet52();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode35();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance55();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker7();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook65();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService50();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale10();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook81();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet22();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber9();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook60();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale46();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName30();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(name8);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale38();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale7();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker35();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale64();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness50();
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
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber62();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet34();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime69();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale38();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet85();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker153();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker120();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor33();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness5();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode31();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(code10);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp63();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions79();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook48();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions3();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom10();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber72();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker105();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker106();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale84();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions50();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem41();
        com.github.javafaker.Book book10 = serializedObjectSupporter0.deserializeObjectBook50();
        com.github.javafaker.Internet internet11 = serializedObjectSupporter0.deserializeObjectInternet85();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(internet11);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber62();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode17();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet37();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker12();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp35();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNull(app4);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp62();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker94();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime15();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Address address8 = serializedObjectSupporter0.deserializeObjectAddress66();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions1();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(app4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNull(address8);
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Hacker hacker1 = serializedObjectSupporter0.deserializeObjectHacker75();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany72();
        org.junit.Assert.assertNotNull(hacker1);
        org.junit.Assert.assertNull(company2);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber19();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom8();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp70();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem16();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook6();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem77();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions78();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance49();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions78();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker77();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem8();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor79();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale84();
        java.util.Locale.setDefault(locale7);
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
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
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
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker246();
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
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker183();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany61();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale141();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance47();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale38();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet85();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker153();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance75();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem11();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress16();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker48();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker78();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime34();
        com.github.javafaker.Hacker hacker9 = serializedObjectSupporter0.deserializeObjectHacker74();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(hacker9);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Address address2 = serializedObjectSupporter0.deserializeObjectAddress51();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance2();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(address2);
        org.junit.Assert.assertNotNull(finance3);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker183();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany61();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem13();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions71();
        com.github.javafaker.service.RandomService randomService8 = serializedObjectSupporter0.deserializeObjectRandomService6();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(randomService8);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker134();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale43();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook14();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany12();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker108();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany5();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem80();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber39();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale84();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom7();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker183();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany61();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale141();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber66();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService33();
        com.github.javafaker.App app9 = serializedObjectSupporter0.deserializeObjectApp4();
        com.github.javafaker.Internet internet10 = serializedObjectSupporter0.deserializeObjectInternet82();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNull(app9);
        org.junit.Assert.assertNull(internet10);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        java.util.Random random2 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom10();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber72();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker145();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker177();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker230();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem14();
        java.util.Random random9 = serializedObjectSupporter0.deserializeObjectRandom8();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(random9);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress45();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance5();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress71();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany49();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker172();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker103();
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
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode79();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale38();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale7();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker35();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance54();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker203();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook8();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale85();
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
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }
}

