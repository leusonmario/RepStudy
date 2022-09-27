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
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany55();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime6();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale106();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber45();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker58();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany16();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode4();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale71();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions40();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker41();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Finance finance1 = serializedObjectSupporter0.deserializeObjectFinance18();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor41();
        org.junit.Assert.assertNotNull(finance1);
        org.junit.Assert.assertNotNull(color2);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService53();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness23();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode28();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance51();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode31();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany31();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNull(company10);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker159();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Lorem lorem11 = serializedObjectSupporter0.deserializeObjectLorem44();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(lorem11);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany24();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNull(company8);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness22();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany30();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale19();
        com.github.javafaker.Lorem lorem10 = serializedObjectSupporter0.deserializeObjectLorem6();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker96();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions18();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook60();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService43();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor7();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor18();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker124();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker72();
        com.github.javafaker.Options options2 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook28();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNull(book3);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker144();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker49();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany26();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook58();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker144();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber11();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode44();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber23();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale35();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale31();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker21();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker170();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale20();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker83();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem34();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber27();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode7();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale93();
        com.github.javafaker.Number number10 = serializedObjectSupporter0.deserializeObjectNumber31();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale115();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode34();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions58();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(options4);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness12();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker176();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook28();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale14();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale119();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance28();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions60();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale67();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter7 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale8 = serializedObjectSupporter7.deserializeObjectLocale37();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter7.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem10 = serializedObjectSupporter7.deserializeObjectLorem60();
        com.github.javafaker.Number number11 = serializedObjectSupporter7.deserializeObjectNumber59();
        com.github.javafaker.Finance finance12 = serializedObjectSupporter7.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem13 = serializedObjectSupporter7.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem14 = serializedObjectSupporter7.deserializeObjectLorem60();
        java.util.Locale locale15 = serializedObjectSupporter7.deserializeObjectLocale17();
        com.github.javafaker.Faker faker16 = serializedObjectSupporter7.deserializeObjectFaker56();
        com.github.javafaker.Company company17 = serializedObjectSupporter7.deserializeObjectCompany51();
        com.github.javafaker.Options options18 = serializedObjectSupporter7.deserializeObjectOptions28();
        com.github.javafaker.Color color19 = serializedObjectSupporter7.deserializeObjectColor19();
        java.util.Locale locale20 = serializedObjectSupporter7.deserializeObjectLocale16();
        java.lang.String str21 = locale6.getDisplayVariant(locale20);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(lorem13);
        org.junit.Assert.assertNotNull(lorem14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertNull(faker16);
        org.junit.Assert.assertNull(company17);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Options options11 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.Color color12 = serializedObjectSupporter0.deserializeObjectColor19();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker17();
        java.util.Locale locale14 = serializedObjectSupporter0.deserializeObjectLocale55();
        com.github.javafaker.DateAndTime dateAndTime15 = serializedObjectSupporter0.deserializeObjectDateAndTime44();
        java.util.Locale locale16 = serializedObjectSupporter0.deserializeObjectLocale94();
        com.github.javafaker.Number number17 = serializedObjectSupporter0.deserializeObjectNumber10();
        com.github.javafaker.Faker faker18 = serializedObjectSupporter0.deserializeObjectFaker97();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNull(faker13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertNotNull(number17);
        org.junit.Assert.assertNull(faker18);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker142();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance6();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber37();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness52();
        com.github.javafaker.Options options10 = serializedObjectSupporter0.deserializeObjectOptions4();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(options10);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale35();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale31();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker72();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale58();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance29();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode50();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor49();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale72();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook51();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker104();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem52();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker46();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook12();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode50();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor49();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance7();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions40();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor41();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService53();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker64();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker61();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime58();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker173();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale87();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter8 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale9 = serializedObjectSupporter8.deserializeObjectLocale30();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter8.deserializeObjectFaker48();
        com.github.javafaker.Book book11 = serializedObjectSupporter8.deserializeObjectBook21();
        com.github.javafaker.Book book12 = serializedObjectSupporter8.deserializeObjectBook13();
        java.util.Locale locale13 = serializedObjectSupporter8.deserializeObjectLocale114();
        java.lang.String str14 = locale7.getDisplayCountry(locale13);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) 0.50835454f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany55();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions48();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem27();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker117();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker95();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany40();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance5();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor49();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale97();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber1();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker99();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions40();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber25();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook3();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness47();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode28();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale50();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker11();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode59();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale110();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker176();
        com.github.javafaker.Business business10 = serializedObjectSupporter0.deserializeObjectBusiness57();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(business10);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale27();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService36();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem4();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker65();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale26();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness60();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker104();
        com.github.javafaker.PhoneNumber phoneNumber11 = serializedObjectSupporter0.deserializeObjectPhoneNumber44();
        com.github.javafaker.PhoneNumber phoneNumber12 = serializedObjectSupporter0.deserializeObjectPhoneNumber26();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(phoneNumber11);
        org.junit.Assert.assertNotNull(phoneNumber12);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber27();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode7();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService20();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode51();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(code10);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Finance finance1 = serializedObjectSupporter0.deserializeObjectFinance18();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker158();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber7();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions47();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber5();
        org.junit.Assert.assertNotNull(finance1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness22();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany3();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness44();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker155();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker59();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter1 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale2 = serializedObjectSupporter1.deserializeObjectLocale37();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter1.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter1.deserializeObjectLorem60();
        com.github.javafaker.Number number5 = serializedObjectSupporter1.deserializeObjectNumber59();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter1.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter1.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter1.deserializeObjectLorem60();
        java.util.Locale locale9 = serializedObjectSupporter1.deserializeObjectLocale17();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter1.deserializeObjectFaker56();
        com.github.javafaker.Company company11 = serializedObjectSupporter1.deserializeObjectCompany51();
        com.github.javafaker.Options options12 = serializedObjectSupporter1.deserializeObjectOptions28();
        com.github.javafaker.Color color13 = serializedObjectSupporter1.deserializeObjectColor19();
        java.util.Locale locale14 = serializedObjectSupporter1.deserializeObjectLocale16();
        faker0.serializedObjectSupporter = serializedObjectSupporter1;
        com.github.javafaker.PhoneNumber phoneNumber16 = faker0.getphoneNumber();
        com.github.javafaker.Book book17 = faker0.book();
        com.github.javafaker.Finance finance18 = faker0.finance();
        com.github.javafaker.Business business19 = faker0.getbusiness();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(company11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber16);
        org.junit.Assert.assertNotNull(book17);
        org.junit.Assert.assertNotNull(finance18);
        org.junit.Assert.assertNotNull(business19);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale119();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook15();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime11();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(dateAndTime4);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker27();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook50();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor29();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber38();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService43();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions40();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber34();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker37();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale35();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance13();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance3();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter1 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random2 = serializedObjectSupporter1.deserializeObjectRandom2();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter1.deserializeObjectFaker27();
        java.util.Locale locale4 = serializedObjectSupporter1.deserializeObjectLocale17();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter1.deserializeObjectPhoneNumber9();
        java.util.Locale locale6 = serializedObjectSupporter1.deserializeObjectLocale74();
        java.util.Locale.setDefault(category0, locale6);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(random2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker7();
        java.util.Locale locale12 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Company company13 = serializedObjectSupporter0.deserializeObjectCompany60();
        com.github.javafaker.Lorem lorem14 = serializedObjectSupporter0.deserializeObjectLorem37();
        com.github.javafaker.Code code15 = serializedObjectSupporter0.deserializeObjectCode43();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNull(company13);
        org.junit.Assert.assertNotNull(lorem14);
        org.junit.Assert.assertNotNull(code15);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale35();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker43();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale52();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker59();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker118();
        java.util.Random random8 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker145();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(random8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook31();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker128();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook48();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker74();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale119();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook15();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker76();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale19();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor35();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale121();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime13();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker135();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber55();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions41();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime5();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("eng");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter2 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale3 = serializedObjectSupporter2.deserializeObjectLocale30();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter2.deserializeObjectFaker48();
        com.github.javafaker.Book book5 = serializedObjectSupporter2.deserializeObjectBook21();
        java.util.Locale locale6 = serializedObjectSupporter2.deserializeObjectLocale104();
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        java.lang.String str8 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet7);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker81();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale6();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem33();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker113();
        com.github.javafaker.Book book10 = serializedObjectSupporter0.deserializeObjectBook56();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker173();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor32();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem11();
        com.github.javafaker.DateAndTime dateAndTime10 = serializedObjectSupporter0.deserializeObjectDateAndTime15();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook31();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber26();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker124();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale72();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale85();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker173();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber52();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker129();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode21();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany34();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale14();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime27();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService49();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness4();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem43();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale71();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService45();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany19();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(company5);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance41();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker46();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime49();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness30();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker169();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor20();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor34();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode22();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale92();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker173();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor32();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Random random9 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Options options10 = serializedObjectSupporter0.deserializeObjectOptions15();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(random9);
        org.junit.Assert.assertNotNull(options10);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("English");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "english");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker142();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance6();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker179();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale62();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale25();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook31();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber26();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker171();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany13();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker152();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor20();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor34();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService12();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance18();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber57();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale86();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook15();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness22();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode20();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber46();
        com.github.javafaker.Number number10 = serializedObjectSupporter0.deserializeObjectNumber35();
        com.github.javafaker.Book book11 = serializedObjectSupporter0.deserializeObjectBook57();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService58();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker77();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook7();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale101();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber18();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale26();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("English", 0.0d);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness22();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale17();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale116();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker173();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale87();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode3();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode20();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker97();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance53();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor8();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale35();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance13();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker80();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.Options options10 = serializedObjectSupporter0.deserializeObjectOptions21();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(options10);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor43();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions42();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale95();
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = serializedObjectSupporter0.deserializeObjectFakeValuesService29();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService11);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale79();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber15();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale35();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale31();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker21();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker109();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker53();
        com.github.javafaker.Options options10 = serializedObjectSupporter0.deserializeObjectOptions53();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(options10);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale42();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale111();
        com.github.javafaker.Book book10 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Book book11 = serializedObjectSupporter0.deserializeObjectBook10();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Options options11 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.DateAndTime dateAndTime12 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Finance finance13 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Faker faker14 = serializedObjectSupporter0.deserializeObjectFaker145();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(dateAndTime12);
        org.junit.Assert.assertNotNull(finance13);
        org.junit.Assert.assertNull(faker14);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook28();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale14();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor51();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker46();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem47();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker171();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale12();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker144();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker49();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber56();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber59();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber31();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor10();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber1();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem3();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness43();
        com.github.javafaker.Lorem lorem10 = serializedObjectSupporter0.deserializeObjectLorem7();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness30();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem10();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime44();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber19();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode55();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale79();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook60();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker120();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany47();
        com.github.javafaker.Business business10 = serializedObjectSupporter0.deserializeObjectBusiness50();
        com.github.javafaker.Number number11 = serializedObjectSupporter0.deserializeObjectNumber31();
        com.github.javafaker.Book book12 = serializedObjectSupporter0.deserializeObjectBook54();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(business10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem48();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode28();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany5();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(company8);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale112();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany45();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook32();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness51();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale41();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker43();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber50();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime15();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService44();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker128();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker69();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance59();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale41();
        com.github.javafaker.Finance finance12 = serializedObjectSupporter0.deserializeObjectFinance22();
        java.util.Locale locale13 = serializedObjectSupporter0.deserializeObjectLocale21();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker43();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber43();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale89();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness45();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker59();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale113();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService28();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook58();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook60();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker173();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale87();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker151();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions52();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem46();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem18();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNotNull(lorem2);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness60();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker104();
        java.util.Random random11 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker10();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker90();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(random11);
        org.junit.Assert.assertNull(faker12);
        org.junit.Assert.assertNull(faker13);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eng" + "'", str1, "eng");
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale26();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor36();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor45();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook28();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance21();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker21();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode25();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en");
        double double2 = languageRange1.getWeight();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale4 = serializedObjectSupporter3.deserializeObjectLocale30();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter3.deserializeObjectFaker48();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter3.deserializeObjectPhoneNumber33();
        java.util.Locale locale7 = serializedObjectSupporter3.deserializeObjectLocale112();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter3.deserializeObjectFaker51();
        java.util.Locale locale9 = serializedObjectSupporter3.deserializeObjectLocale26();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter3.deserializeObjectFaker164();
        boolean boolean11 = languageRange1.equals((java.lang.Object) faker10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.dateAndTime;
        com.github.javafaker.Business business3 = faker0.business;
        com.github.javafaker.Name name4 = faker0.name();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(name4);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService6();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem42();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions48();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber34();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance14();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale54();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany23();
        com.github.javafaker.Number number11 = serializedObjectSupporter0.deserializeObjectNumber1();
        com.github.javafaker.DateAndTime dateAndTime12 = serializedObjectSupporter0.deserializeObjectDateAndTime8();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(dateAndTime12);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker144();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale58();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber4();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale18();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Finance finance1 = serializedObjectSupporter0.deserializeObjectFinance18();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker158();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber7();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook56();
        org.junit.Assert.assertNotNull(finance1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(book4);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale121();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode5();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany57();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode19();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService37();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany60();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(company10);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker43();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber43();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale89();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter7 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random8 = serializedObjectSupporter7.deserializeObjectRandom2();
        com.github.javafaker.Number number9 = serializedObjectSupporter7.deserializeObjectNumber16();
        com.github.javafaker.Number number10 = serializedObjectSupporter7.deserializeObjectNumber47();
        java.util.Locale locale11 = serializedObjectSupporter7.deserializeObjectLocale71();
        java.lang.String str12 = locale6.getDisplayLanguage(locale11);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(random8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English" + "'", str12, "English");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale77();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker164();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker15();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker129();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber5();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale16();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale110();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale89();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale59();
        java.util.Random random8 = serializedObjectSupporter0.deserializeObjectRandom1();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(random8);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("English", (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker173();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor32();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode24();
        com.github.javafaker.Number number10 = serializedObjectSupporter0.deserializeObjectNumber55();
        com.github.javafaker.Number number11 = serializedObjectSupporter0.deserializeObjectNumber10();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker161();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNull(faker12);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker27();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale100();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness60();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker104();
        com.github.javafaker.Business business11 = serializedObjectSupporter0.deserializeObjectBusiness31();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(business11);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker96();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker34();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook43();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker81();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions39();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale83();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany42();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(company9);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness12();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook20();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany12();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook37();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale95();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale119();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook15();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker76();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale19();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance41();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker159();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker2();
        com.github.javafaker.Lorem lorem11 = serializedObjectSupporter0.deserializeObjectLorem16();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(lorem11);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale54();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany23();
        com.github.javafaker.Lorem lorem11 = serializedObjectSupporter0.deserializeObjectLorem10();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(lorem11);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale109();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker15();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale20();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem13();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance2();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook31();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber26();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker171();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance46();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor57();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany55();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions48();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem27();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber35();
        com.github.javafaker.Business business10 = serializedObjectSupporter0.deserializeObjectBusiness39();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(business10);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setLocale(locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions29();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker111();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime11();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale73();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness22();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany30();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance16();
        com.github.javafaker.Number number10 = serializedObjectSupporter0.deserializeObjectNumber50();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(number10);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness22();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode20();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany17();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(company9);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor16();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions40();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber25();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook3();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness47();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale73();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor45();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.FakeValuesService fakeValuesService1 = faker0.fakeValuesService;
        com.github.javafaker.Business business2 = faker0.business();
        org.junit.Assert.assertNotNull(fakeValuesService1);
        org.junit.Assert.assertNotNull(business2);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor43();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions42();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale1();
        com.github.javafaker.Book book11 = serializedObjectSupporter0.deserializeObjectBook46();
        com.github.javafaker.DateAndTime dateAndTime12 = serializedObjectSupporter0.deserializeObjectDateAndTime60();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(dateAndTime12);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem21();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode8();
        com.github.javafaker.DateAndTime dateAndTime11 = serializedObjectSupporter0.deserializeObjectDateAndTime58();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNotNull(dateAndTime11);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor7();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor18();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker161();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale58();
        java.lang.String str8 = locale7.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en" + "'", str8, "en");
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale35();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance13();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker127();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions5();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime22();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(dateAndTime9);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter1 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale2 = serializedObjectSupporter1.deserializeObjectLocale37();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter1.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter1.deserializeObjectLorem60();
        com.github.javafaker.Number number5 = serializedObjectSupporter1.deserializeObjectNumber59();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter1.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter1.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter1.deserializeObjectLorem60();
        java.util.Locale locale9 = serializedObjectSupporter1.deserializeObjectLocale17();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter1.deserializeObjectFaker56();
        com.github.javafaker.Company company11 = serializedObjectSupporter1.deserializeObjectCompany51();
        com.github.javafaker.Options options12 = serializedObjectSupporter1.deserializeObjectOptions28();
        com.github.javafaker.Color color13 = serializedObjectSupporter1.deserializeObjectColor19();
        java.util.Locale locale14 = serializedObjectSupporter1.deserializeObjectLocale16();
        faker0.serializedObjectSupporter = serializedObjectSupporter1;
        com.github.javafaker.Lorem lorem16 = serializedObjectSupporter1.deserializeObjectLorem22();
        com.github.javafaker.Finance finance17 = serializedObjectSupporter1.deserializeObjectFinance10();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(company11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNotNull(lorem16);
        org.junit.Assert.assertNotNull(finance17);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook7();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale100();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness33();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker135();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor55();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode34();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker27();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem48();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker129();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem41();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber58();
        com.github.javafaker.Number number10 = serializedObjectSupporter0.deserializeObjectNumber45();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(number10);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale54();
        com.github.javafaker.DateAndTime dateAndTime10 = serializedObjectSupporter0.deserializeObjectDateAndTime25();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker24();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber31();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode25();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale77();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker164();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker122();
        com.github.javafaker.Code code11 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Code code12 = serializedObjectSupporter0.deserializeObjectCode50();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker121();
        com.github.javafaker.Company company14 = serializedObjectSupporter0.deserializeObjectCompany35();
        com.github.javafaker.Options options15 = serializedObjectSupporter0.deserializeObjectOptions34();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNull(faker13);
        org.junit.Assert.assertNull(company14);
        org.junit.Assert.assertNotNull(options15);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker144();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions59();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime58();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker17();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker35();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode4();
        org.junit.Assert.assertNotNull(code1);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions37();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale90();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker72();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem42();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber57();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany34();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker141();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany60();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(business3);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale35();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker40();
        java.util.Random random4 = serializedObjectSupporter0.deserializeObjectRandom1();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(random4);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale27();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker158();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions21();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance3();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor30();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany9();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        boolean boolean2 = random1.nextBoolean();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker144();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions59();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime58();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker9();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker65();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions45();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany8();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook36();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker27();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker121();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber17();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness30();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService32();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem19();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker109();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker83();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker7();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker136();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale34();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=32.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook31();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber26();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker109();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber6();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker49();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker159();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker2();
        com.github.javafaker.Company company11 = serializedObjectSupporter0.deserializeObjectCompany1();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker135();
        java.util.Locale locale13 = serializedObjectSupporter0.deserializeObjectLocale114();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(company11);
        org.junit.Assert.assertNull(faker12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker72();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker137();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions17();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(options3);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness22();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance49();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor33();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber24();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker33();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber36();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions18();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany24();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem41();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale91();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker97();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale74();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale119();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany47();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(company4);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor43();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions42();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale95();
        com.github.javafaker.Number number11 = serializedObjectSupporter0.deserializeObjectNumber9();
        com.github.javafaker.Company company12 = serializedObjectSupporter0.deserializeObjectCompany20();
        com.github.javafaker.PhoneNumber phoneNumber13 = serializedObjectSupporter0.deserializeObjectPhoneNumber21();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNull(company12);
        org.junit.Assert.assertNotNull(phoneNumber13);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker7();
        java.util.Locale locale12 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker177();
        com.github.javafaker.Finance finance14 = serializedObjectSupporter0.deserializeObjectFinance27();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNull(faker13);
        org.junit.Assert.assertNotNull(finance14);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService13();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber30();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber6();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions22();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance33();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime22();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker59();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale113();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService28();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber57();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale20();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker83();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime28();
        com.github.javafaker.Number number10 = serializedObjectSupporter0.deserializeObjectNumber55();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(number10);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale79();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook60();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker120();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany47();
        com.github.javafaker.Business business10 = serializedObjectSupporter0.deserializeObjectBusiness50();
        com.github.javafaker.Number number11 = serializedObjectSupporter0.deserializeObjectNumber3();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(business10);
        org.junit.Assert.assertNotNull(number11);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Company company11 = serializedObjectSupporter0.deserializeObjectCompany45();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNull(company11);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder5 = builder2.setExtension('a', "eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder2.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setScript("eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker72();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker137();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService52();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook7();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime37();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions11();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService56();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(fakeValuesService10);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker159();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker2();
        com.github.javafaker.Color color11 = serializedObjectSupporter0.deserializeObjectColor13();
        com.github.javafaker.Book book12 = serializedObjectSupporter0.deserializeObjectBook42();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale20();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker83();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale98();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance2();
        com.github.javafaker.Company company11 = serializedObjectSupporter0.deserializeObjectCompany36();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNull(company11);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook7();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker68();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber7();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance59();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale35();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale31();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker21();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker109();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService20();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale20();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker83();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime28();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber36();
        com.github.javafaker.DateAndTime dateAndTime11 = serializedObjectSupporter0.deserializeObjectDateAndTime17();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(dateAndTime11);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance28();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions18();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem9();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker59();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale113();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService28();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany1();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNull(company9);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker144();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber11();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale8();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker92();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions37();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale90();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker72();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook33();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber24();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker33();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance22();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime34();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness34();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker159();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany37();
        com.github.javafaker.Company company11 = serializedObjectSupporter0.deserializeObjectCompany25();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNull(company11);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker173();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale87();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker151();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker126();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService10();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(fakeValuesService10);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime15();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService44();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber11();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker144();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale58();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber4();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale70();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale10();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber17();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness30();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance3();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker95();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber59();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook7();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker82();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode51();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany34();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions39();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem24();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(lorem4);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService10();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber4();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance40();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance28();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions39();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness54();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook31();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber26();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker171();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany13();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany55();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(company8);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness22();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber50();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions18();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService10();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook19();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker71();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook19();
        java.util.Random random10 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Book book11 = serializedObjectSupporter0.deserializeObjectBook25();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker67();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(random10);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(faker12);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker11();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem45();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany49();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem33();
        com.github.javafaker.Lorem lorem10 = serializedObjectSupporter0.deserializeObjectLorem44();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber17();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        int int7 = random6.nextInt();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1155869325) + "'", int7 == (-1155869325));
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Options options11 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.Color color12 = serializedObjectSupporter0.deserializeObjectColor19();
        java.util.Locale locale13 = serializedObjectSupporter0.deserializeObjectLocale16();
        com.github.javafaker.Number number14 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Color color15 = serializedObjectSupporter0.deserializeObjectColor41();
        com.github.javafaker.Business business16 = serializedObjectSupporter0.deserializeObjectBusiness34();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(business16);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService17();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany29();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale43();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale74();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany45();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor58();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber46();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook39();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker32();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker133();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService10();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime45();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness9();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker111();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime11();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale85();
        java.lang.String str8 = locale7.getLanguage();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en" + "'", str8, "en");
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker142();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance6();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness52();
        java.util.Random random9 = serializedObjectSupporter0.deserializeObjectRandom1();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(random9);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale112();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime26();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime21();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker86();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale20();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance54();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService20();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker178();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale60();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany34();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode20();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem22();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom2();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(random6);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("English", (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany55();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions48();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker116();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness22();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber50();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany17();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNull(company8);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber17();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness30();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber48();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime5();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker36();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale121();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime13();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker135();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber55();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook59();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber11();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook22();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker116();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber7();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness37();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(business4);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness57();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale23();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale13();
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str9 = locale7.getDisplayLanguage(locale8);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "anglais" + "'", str9, "anglais");
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService35();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor7();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor18();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness8();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem16();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber17();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor8();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService10();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook19();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber10();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor37();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale77();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker70();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale100();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale20();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime54();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions23();
        com.github.javafaker.Book book10 = serializedObjectSupporter0.deserializeObjectBook1();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem3();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness43();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker50();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker112();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker11();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode59();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale110();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker176();
        com.github.javafaker.Options options10 = serializedObjectSupporter0.deserializeObjectOptions46();
        com.github.javafaker.Code code11 = serializedObjectSupporter0.deserializeObjectCode47();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(code11);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook31();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker128();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook48();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany21();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker81();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions39();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale83();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor18();
        com.github.javafaker.Company company11 = serializedObjectSupporter0.deserializeObjectCompany61();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNull(company11);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("English");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Options options11 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.Company company12 = serializedObjectSupporter0.deserializeObjectCompany20();
        com.github.javafaker.PhoneNumber phoneNumber13 = serializedObjectSupporter0.deserializeObjectPhoneNumber45();
        com.github.javafaker.DateAndTime dateAndTime14 = serializedObjectSupporter0.deserializeObjectDateAndTime2();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNull(company12);
        org.junit.Assert.assertNotNull(phoneNumber13);
        org.junit.Assert.assertNotNull(dateAndTime14);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions18();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor28();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness60();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker104();
        java.util.Random random11 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker10();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker123();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(random11);
        org.junit.Assert.assertNull(faker12);
        org.junit.Assert.assertNull(faker13);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale77();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker164();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker122();
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = serializedObjectSupporter0.deserializeObjectFakeValuesService41();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker112();
        com.github.javafaker.Finance finance13 = serializedObjectSupporter0.deserializeObjectFinance20();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(fakeValuesService11);
        org.junit.Assert.assertNull(faker12);
        org.junit.Assert.assertNotNull(finance13);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale26();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor36();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook52();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem53();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker168();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale26();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber39();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber5();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale24();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService44();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany25();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime28();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber24();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker33();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness37();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany1();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNull(company8);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Finance finance1 = serializedObjectSupporter0.deserializeObjectFinance18();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker158();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber7();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions47();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker50();
        org.junit.Assert.assertNotNull(finance1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber30();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem42();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker49();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance43();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService46();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber59();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(phoneNumber4);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker173();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale87();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode3();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale102();
        com.github.javafaker.Options options10 = serializedObjectSupporter0.deserializeObjectOptions36();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(options10);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker11();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker69();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale120();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale79();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook60();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker120();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany47();
        com.github.javafaker.Business business10 = serializedObjectSupporter0.deserializeObjectBusiness50();
        com.github.javafaker.Number number11 = serializedObjectSupporter0.deserializeObjectNumber31();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker164();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(business10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNull(faker12);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker11();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem45();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany49();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook56();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook31();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber26();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker171();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber35();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker48();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime4();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem54();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker100();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions48();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker65();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions45();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime15();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker132();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale112();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber50();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance27();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale26();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker116();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness46();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions50();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions18();
        java.util.Random random8 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.Random random9 = new java.util.Random();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random9.nextBytes(byteArray16);
        random8.nextBytes(byteArray16);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(random8);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[115, -43, 26, -69, -40, -100]");
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber37();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker163();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem16();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode52();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany15();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber23();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber45();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode26();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale121();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode5();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany57();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode19();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem26();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker2();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService49();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker14();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany37();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(company8);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance28();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber43();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness6();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany3();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany45();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor58();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance32();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor25();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService20();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber30();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime49();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook38();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNull(book4);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker72();
        com.github.javafaker.Options options2 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime35();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(dateAndTime3);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale86();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor57();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService17();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany29();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale43();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness60();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode49();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService28();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode58();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor43();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions42();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode38();
        java.util.Random random11 = serializedObjectSupporter0.deserializeObjectRandom2();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNotNull(random11);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance59();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker45();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance28();
        java.util.Random random4 = serializedObjectSupporter0.deserializeObjectRandom2();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(random4);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook31();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber26();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker109();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker176();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale35();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale15();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker165();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale33();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker81();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale6();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness6();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook16();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode55();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime50();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker95();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale20();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime54();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions23();
        java.util.Random random10 = serializedObjectSupporter0.deserializeObjectRandom1();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(random10);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness22();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany30();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance16();
        com.github.javafaker.Business business10 = serializedObjectSupporter0.deserializeObjectBusiness25();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(business10);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker173();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber52();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker73();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker140();
        com.github.javafaker.DateAndTime dateAndTime10 = serializedObjectSupporter0.deserializeObjectDateAndTime17();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService10();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook19();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale98();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker152();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber34();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.stream.LongStream longStream8 = random7.longs();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker144();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber11();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale8();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker146();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode29();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber37();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService61();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker112();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber17();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness30();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance3();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker164();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook23();
        com.github.javafaker.DateAndTime dateAndTime10 = serializedObjectSupporter0.deserializeObjectDateAndTime24();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale20();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker83();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber35();
        com.github.javafaker.Number number10 = serializedObjectSupporter0.deserializeObjectNumber7();
        com.github.javafaker.Options options11 = serializedObjectSupporter0.deserializeObjectOptions34();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(options11);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker133();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor24();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook15();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook31();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber26();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker171();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance46();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker101();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness30();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany35();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem29();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions6();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness57();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale23();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker155();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale40();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance7();
        com.github.javafaker.Number number11 = serializedObjectSupporter0.deserializeObjectNumber2();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(number11);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker72();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode4();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber56();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime12();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(dateAndTime4);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker176();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany9();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor1();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker170();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber12();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor40();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker144();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber11();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode44();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook46();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness60();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime11 = serializedObjectSupporter0.deserializeObjectDateAndTime36();
        com.github.javafaker.Color color12 = serializedObjectSupporter0.deserializeObjectColor15();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime49();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale29();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook4();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker94();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService23();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness22();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode20();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook18();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker43();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber43();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale89();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance12();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("eng", (double) 0.0f);
        double double3 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale121();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode5();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness17();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber20();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime49();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale29();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook4();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker25();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker162();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook31();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber20();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor44();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale27();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker158();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions21();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale112();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker104();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker142();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker82();
        java.util.Random random8 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor32();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(random8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode33();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker2();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook7();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime37();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook2();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance28();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber43();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker41();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale107();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime4();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale64();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker40();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode16();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode7();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNotNull(code10);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker109();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker23();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker142();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker95();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker144();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker49();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber56();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance7();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale71();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions40();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale18();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker119();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        java.util.Random random1 = new java.util.Random((long) 100);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random1.doubles((-0.4123569817688534d), (double) 'a');
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness60();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime11 = serializedObjectSupporter0.deserializeObjectDateAndTime36();
        com.github.javafaker.Company company12 = serializedObjectSupporter0.deserializeObjectCompany10();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNull(company12);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextDouble();
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[124, 74, 120, 42, -92, -97]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5286907270045752d + "'", double9 == 0.5286907270045752d);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker27();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker148();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode50();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime38();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(dateAndTime4);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness30();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker109();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber17();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness30();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance3();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker164();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber50();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale90();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale121();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale67();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale18();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode13();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem21();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode8();
        com.github.javafaker.PhoneNumber phoneNumber11 = serializedObjectSupporter0.deserializeObjectPhoneNumber56();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNotNull(phoneNumber11);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber17();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance33();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem48();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness32();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode9();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker96();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness33();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness33();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(business5);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker59();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale113();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker42();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness44();
        com.github.javafaker.DateAndTime dateAndTime10 = serializedObjectSupporter0.deserializeObjectDateAndTime5();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker124();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance28();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber43();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker59();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale42();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale111();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance32();
        com.github.javafaker.Color color11 = serializedObjectSupporter0.deserializeObjectColor37();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        java.util.Random random1 = new java.util.Random((long) 0);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker6();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale35();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale31();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany28();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale44();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale77();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker164();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker122();
        com.github.javafaker.Code code11 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Code code12 = serializedObjectSupporter0.deserializeObjectCode50();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker46();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNull(faker13);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService20();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale120();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale35();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale31();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker21();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness9();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale52();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale121();
        java.lang.String str4 = locale3.getScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale35();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness24();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor26();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness60();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker104();
        com.github.javafaker.Color color11 = serializedObjectSupporter0.deserializeObjectColor14();
        java.util.Locale locale12 = serializedObjectSupporter0.deserializeObjectLocale47();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany57();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(company9);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber17();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber34();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode40();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker67();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker29();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale35();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale15();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor36();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale103();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Options options11 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.PhoneNumber phoneNumber12 = serializedObjectSupporter0.deserializeObjectPhoneNumber29();
        com.github.javafaker.Company company13 = serializedObjectSupporter0.deserializeObjectCompany32();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNull(company13);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber1();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber39();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale5();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor61();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale20();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker83();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale98();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance2();
        com.github.javafaker.Options options11 = serializedObjectSupporter0.deserializeObjectOptions11();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(options11);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness47();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany17();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber27();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook61();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions50();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness8();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor35();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker138();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale121();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode5();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany57();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale75();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness22();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode20();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber46();
        com.github.javafaker.Number number10 = serializedObjectSupporter0.deserializeObjectNumber35();
        com.github.javafaker.Finance finance11 = serializedObjectSupporter0.deserializeObjectFinance13();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(finance11);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        java.lang.String str3 = faker0.bothify("eng");
        java.lang.String str5 = faker0.letterify("eng");
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eng" + "'", str5, "eng");
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker97();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance53();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions22();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance43();
        com.github.javafaker.Business business11 = serializedObjectSupporter0.deserializeObjectBusiness37();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(business11);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter1 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale2 = serializedObjectSupporter1.deserializeObjectLocale37();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter1.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter1.deserializeObjectLorem60();
        com.github.javafaker.Number number5 = serializedObjectSupporter1.deserializeObjectNumber59();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter1.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter1.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter1.deserializeObjectLorem60();
        java.util.Locale locale9 = serializedObjectSupporter1.deserializeObjectLocale17();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter1.deserializeObjectFaker56();
        com.github.javafaker.Company company11 = serializedObjectSupporter1.deserializeObjectCompany51();
        com.github.javafaker.Options options12 = serializedObjectSupporter1.deserializeObjectOptions28();
        com.github.javafaker.Color color13 = serializedObjectSupporter1.deserializeObjectColor19();
        java.util.Locale locale14 = serializedObjectSupporter1.deserializeObjectLocale16();
        faker0.serializedObjectSupporter = serializedObjectSupporter1;
        com.github.javafaker.Lorem lorem16 = serializedObjectSupporter1.deserializeObjectLorem22();
        com.github.javafaker.Faker faker17 = serializedObjectSupporter1.deserializeObjectFaker104();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(company11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNotNull(lorem16);
        org.junit.Assert.assertNull(faker17);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor25();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom1();
        double double8 = random7.nextDouble();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7308781907032909d + "'", double8 == 0.7308781907032909d);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.dateAndTime;
        com.github.javafaker.Business business3 = faker0.business;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.getphoneNumber();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(phoneNumber4);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale20();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime54();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance7();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem45();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService50();
        com.github.javafaker.Code code11 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker119();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker166();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(fakeValuesService10);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNull(faker12);
        org.junit.Assert.assertNull(faker13);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Options options11 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.Color color12 = serializedObjectSupporter0.deserializeObjectColor19();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker17();
        com.github.javafaker.Color color14 = serializedObjectSupporter0.deserializeObjectColor23();
        com.github.javafaker.Book book15 = serializedObjectSupporter0.deserializeObjectBook16();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNull(faker13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany54();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor38();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker85();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness22();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness19();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber52();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor29();
        com.github.javafaker.Book book10 = serializedObjectSupporter0.deserializeObjectBook23();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter1 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale2 = serializedObjectSupporter1.deserializeObjectLocale37();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter1.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter1.deserializeObjectLorem60();
        com.github.javafaker.Number number5 = serializedObjectSupporter1.deserializeObjectNumber59();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter1.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter1.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter1.deserializeObjectLorem60();
        java.util.Locale locale9 = serializedObjectSupporter1.deserializeObjectLocale17();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter1.deserializeObjectFaker56();
        com.github.javafaker.Company company11 = serializedObjectSupporter1.deserializeObjectCompany51();
        com.github.javafaker.Options options12 = serializedObjectSupporter1.deserializeObjectOptions28();
        com.github.javafaker.Color color13 = serializedObjectSupporter1.deserializeObjectColor19();
        java.util.Locale locale14 = serializedObjectSupporter1.deserializeObjectLocale16();
        faker0.serializedObjectSupporter = serializedObjectSupporter1;
        com.github.javafaker.Business business16 = faker0.business();
        com.github.javafaker.Name name17 = faker0.name;
        com.github.javafaker.Lorem lorem18 = faker0.lorem;
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(company11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertNotNull(name17);
        org.junit.Assert.assertNotNull(lorem18);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber30();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem42();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions3();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test882");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode40();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker67();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance24();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test883");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker142();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance6();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService12();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test884");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany45();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor58();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber46();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale87();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test885");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber45();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService22();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber26();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness4();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test886");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale86();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker32();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime24();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test887");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale77();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker17();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany59();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test888");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber5();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook23();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker24();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test889");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale20();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem13();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance33();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test890");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker144();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber11();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale8();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker146();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance35();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test891");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime8();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime22();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(dateAndTime9);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test892");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Finance finance1 = serializedObjectSupporter0.deserializeObjectFinance18();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker158();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode26();
        org.junit.Assert.assertNotNull(finance1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test893");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions18();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany24();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook7();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale5();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test894");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook7();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem31();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test895");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime4();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem54();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker100();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime33();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test896");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setExtension('#', "English");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test897");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker113();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode7();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test898");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber44();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale93();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime48();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber50();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test899");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker11();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode59();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale110();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness41();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test900");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Finance finance1 = serializedObjectSupporter0.deserializeObjectFinance18();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker158();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber7();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany48();
        org.junit.Assert.assertNotNull(finance1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(company4);
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test901");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker72();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode4();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor26();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber39();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance19();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test902");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker172();
        com.github.javafaker.Code code11 = serializedObjectSupporter0.deserializeObjectCode31();
        com.github.javafaker.Color color12 = serializedObjectSupporter0.deserializeObjectColor25();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test903");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem48();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker129();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem41();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber58();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale27();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test904");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale77();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker164();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker122();
        com.github.javafaker.Code code11 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker90();
        java.util.Locale locale13 = serializedObjectSupporter0.deserializeObjectLocale3();
        com.github.javafaker.Book book14 = serializedObjectSupporter0.deserializeObjectBook47();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNull(faker12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test905");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker72();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem7();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale71();
        java.util.Locale.setDefault(locale3);
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test906");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale119();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook15();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany57();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime28();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService49();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker103();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test907");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test908");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("anglais", (double) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=117.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test909");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions50();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions18();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker125();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test910");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService17();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany29();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale43();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness60();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale72();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test911");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService17();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany29();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale43();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale36();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test912");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker162();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor9();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance48();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test913");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale79();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker113();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime3();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test914");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Number number2 = faker0.getnumber();
        com.github.javafaker.Number number3 = faker0.getnumber();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.dateAndTime;
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(dateAndTime4);
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test915");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale104();
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        java.util.Locale locale6 = locale4.stripExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test916");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale107();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker37();
        com.github.javafaker.PhoneNumber phoneNumber12 = serializedObjectSupporter0.deserializeObjectPhoneNumber21();
        com.github.javafaker.Color color13 = serializedObjectSupporter0.deserializeObjectColor40();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test917");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale35();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance13();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker73();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem37();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test918");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance59();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime23();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem8();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test919");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Options options11 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.Color color12 = serializedObjectSupporter0.deserializeObjectColor19();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker17();
        java.util.Locale locale14 = serializedObjectSupporter0.deserializeObjectLocale55();
        com.github.javafaker.DateAndTime dateAndTime15 = serializedObjectSupporter0.deserializeObjectDateAndTime44();
        com.github.javafaker.Finance finance16 = serializedObjectSupporter0.deserializeObjectFinance5();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNull(faker13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime15);
        org.junit.Assert.assertNotNull(finance16);
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test920");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService6();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem42();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook26();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test921");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Number number2 = faker0.getnumber();
        com.github.javafaker.Address address3 = faker0.address();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(dateAndTime4);
    }

    @Test
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test922");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale12();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
    }

    @Test
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test923");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService10();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook19();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker71();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber7();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(phoneNumber10);
    }

    @Test
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test924");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker43();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber43();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale35();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor5();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test925");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness23();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor18();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test926");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness22();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance61();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem58();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test927");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService10();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime45();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook17();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test928");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem46();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale58();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker124();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode12();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode60();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker28();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test929");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber27();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode7();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService20();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode44();
        com.github.javafaker.Finance finance11 = serializedObjectSupporter0.deserializeObjectFinance7();
        com.github.javafaker.service.FakeValuesService fakeValuesService12 = serializedObjectSupporter0.deserializeObjectFakeValuesService6();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(fakeValuesService12);
    }
}
