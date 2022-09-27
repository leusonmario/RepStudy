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
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance55();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor64();
        com.github.javafaker.Options options10 = serializedObjectSupporter0.deserializeObjectOptions51();
        com.github.javafaker.Book book11 = serializedObjectSupporter0.deserializeObjectBook42();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet33();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime61();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber43();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook83();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode4();
        com.github.javafaker.Book book10 = serializedObjectSupporter0.deserializeObjectBook54();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook7();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale163();
        java.lang.Object obj8 = locale7.clone();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "en");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker49();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness23();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode53();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService14();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress48();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp45();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService82();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance55();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness11();
        com.github.javafaker.App app10 = serializedObjectSupporter0.deserializeObjectApp9();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale107();
        com.github.javafaker.Finance finance12 = serializedObjectSupporter0.deserializeObjectFinance62();
        com.github.javafaker.Options options13 = serializedObjectSupporter0.deserializeObjectOptions67();
        com.github.javafaker.Number number14 = serializedObjectSupporter0.deserializeObjectNumber4();
        com.github.javafaker.Name name15 = serializedObjectSupporter0.deserializeObjectName56();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNull(app10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNull(name15);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker71();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker10();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet5();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor45();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode57();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance8();
        com.github.javafaker.Name name11 = serializedObjectSupporter0.deserializeObjectName22();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNull(name11);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber4();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber68();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker19();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet33();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime61();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber43();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker159();
        com.github.javafaker.App app9 = serializedObjectSupporter0.deserializeObjectApp61();
        com.github.javafaker.Business business10 = serializedObjectSupporter0.deserializeObjectBusiness15();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(app9);
        org.junit.Assert.assertNotNull(business10);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp49();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName16();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness64();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook42();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions37();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook73();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions12();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime68();
        com.github.javafaker.Address address10 = serializedObjectSupporter0.deserializeObjectAddress63();
        com.github.javafaker.Hacker hacker11 = serializedObjectSupporter0.deserializeObjectHacker81();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(hacker11);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance8();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp66();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance62();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker102();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale120();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness35();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime47();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany34();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(company8);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.PhoneNumber phoneNumber1 = serializedObjectSupporter0.deserializeObjectPhoneNumber35();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions32();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker134();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber4();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance49();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness85();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp71();
        com.github.javafaker.Internet internet3 = serializedObjectSupporter0.deserializeObjectInternet15();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker53();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime76();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp18();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNull(internet3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNull(app6);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber8();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(number2);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService51();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress12();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp47();
        com.github.javafaker.Internet internet9 = serializedObjectSupporter0.deserializeObjectInternet75();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNull(internet9);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Business business2 = faker1.getbusiness();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker1.phoneNumber();
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(phoneNumber3);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale15();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber5();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions6();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode22();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance14();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor84();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem6();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet28();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker218();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode7();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber73();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp49();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName16();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp3();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker37();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime32();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(dateAndTime9);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor23();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService14();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker235();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany52();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp71();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber77();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(phoneNumber3);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.DateAndTime dateAndTime1 = serializedObjectSupporter0.deserializeObjectDateAndTime85();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode27();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber85();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp66();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(app4);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode16();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany84();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance17();
        com.github.javafaker.App app11 = serializedObjectSupporter0.deserializeObjectApp84();
        com.github.javafaker.App app12 = serializedObjectSupporter0.deserializeObjectApp3();
        com.github.javafaker.service.FakeValuesService fakeValuesService13 = serializedObjectSupporter0.deserializeObjectFakeValuesService1();
        com.github.javafaker.DateAndTime dateAndTime14 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNull(app11);
        org.junit.Assert.assertNull(app12);
        org.junit.Assert.assertNotNull(fakeValuesService13);
        org.junit.Assert.assertNotNull(dateAndTime14);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness35();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker11();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions58();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = null;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Locale locale12 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.Locale.FilteringMode filteringMode22 = null;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList20, filteringMode22);
        java.util.Locale locale27 = new java.util.Locale("hi!", "", "hi!");
        java.util.Locale[] localeArray28 = new java.util.Locale[] { locale27 };
        java.util.ArrayList<java.util.Locale> localeList29 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList29, localeArray28);
        java.util.Locale.FilteringMode filteringMode31 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList32 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.util.Locale>) localeList29, filteringMode31);
        java.util.Locale locale33 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet34 = locale33.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.util.Locale.FilteringMode filteringMode43 = null;
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.lang.String>) strList41, filteringMode43);
        java.util.Locale locale48 = new java.util.Locale("hi!", "", "hi!");
        java.util.Locale[] localeArray49 = new java.util.Locale[] { locale48 };
        java.util.ArrayList<java.util.Locale> localeList50 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList50, localeArray49);
        java.util.Locale.FilteringMode filteringMode52 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList53 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.util.Locale>) localeList50, filteringMode52);
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strSet34, filteringMode52);
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet13, filteringMode52);
        java.util.Locale.LanguageRange[] languageRangeArray56 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList57 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57, languageRangeArray56);
        java.util.Locale.LanguageRange[] languageRangeArray59 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList60 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList60, languageRangeArray59);
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        java.util.Locale.FilteringMode filteringMode67 = null;
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, (java.util.Collection<java.lang.String>) strList65, filteringMode67);
        java.util.Locale locale72 = new java.util.Locale("hi!", "", "hi!");
        java.util.Locale[] localeArray73 = new java.util.Locale[] { locale72 };
        java.util.ArrayList<java.util.Locale> localeList74 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList74, localeArray73);
        java.util.Locale.FilteringMode filteringMode76 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList77 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, (java.util.Collection<java.util.Locale>) localeList74, filteringMode76);
        java.util.Locale.LanguageRange[] languageRangeArray78 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList79 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList79, languageRangeArray78);
        java.lang.String[] strArray83 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList84 = new java.util.ArrayList<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList84, strArray83);
        java.util.Locale.FilteringMode filteringMode86 = null;
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList79, (java.util.Collection<java.lang.String>) strList84, filteringMode86);
        java.util.Locale locale91 = new java.util.Locale("hi!", "", "hi!");
        java.util.Locale[] localeArray92 = new java.util.Locale[] { locale91 };
        java.util.ArrayList<java.util.Locale> localeList93 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList93, localeArray92);
        java.util.Locale.FilteringMode filteringMode95 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList96 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList79, (java.util.Collection<java.util.Locale>) localeList93, filteringMode95);
        java.util.List<java.util.Locale> localeList97 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, (java.util.Collection<java.util.Locale>) localeList74, filteringMode95);
        java.util.List<java.util.Locale> localeList98 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList97);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals(locale27.toString(), "hi!__hi!");
        org.junit.Assert.assertNotNull(localeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + filteringMode31 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode31.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList32);
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "en");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertEquals(locale48.toString(), "hi!__hi!");
        org.junit.Assert.assertNotNull(localeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + filteringMode52 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode52.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList53);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(languageRangeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(languageRangeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertEquals(locale72.toString(), "hi!__hi!");
        org.junit.Assert.assertNotNull(localeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + filteringMode76 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode76.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList77);
        org.junit.Assert.assertNotNull(languageRangeArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertEquals(locale91.toString(), "hi!__hi!");
        org.junit.Assert.assertNotNull(localeArray92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + filteringMode95 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode95.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList96);
        org.junit.Assert.assertNotNull(localeList97);
        org.junit.Assert.assertNotNull(localeList98);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor80();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness58();
        java.util.Random random4 = serializedObjectSupporter0.deserializeObjectRandom9();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress55();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress22();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(random4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNull(address6);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness76();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet38();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber9();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp1();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber79();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Address address2 = serializedObjectSupporter0.deserializeObjectAddress12();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService64();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany12();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(address2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(company5);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker110();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService26();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp82();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(app6);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber35();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress44();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker237();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions36();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName15();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker17();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor82();
        com.github.javafaker.DateAndTime dateAndTime11 = serializedObjectSupporter0.deserializeObjectDateAndTime6();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(name8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(dateAndTime11);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.PhoneNumber phoneNumber1 = serializedObjectSupporter0.deserializeObjectPhoneNumber35();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber27();
        com.github.javafaker.Internet internet3 = serializedObjectSupporter0.deserializeObjectInternet44();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNull(internet3);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor80();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness58();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem41();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(lorem4);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker200();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService85();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp76();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor36();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance9();
        com.github.javafaker.Address address11 = serializedObjectSupporter0.deserializeObjectAddress79();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNull(address11);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor23();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService14();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker235();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook53();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance82();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet8();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(internet5);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber29();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker41();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode22();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress54();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook27();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale9();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem48();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale79();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale4.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance82();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker195();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName51();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime79();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem7();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale143();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions37();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker130();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale138();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber35();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook57();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService37();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber60();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions36();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName15();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker17();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor82();
        com.github.javafaker.Color color11 = serializedObjectSupporter0.deserializeObjectColor36();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(name8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress48();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp45();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale138();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions52();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker43();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale147();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker71();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker133();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp39();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(app8);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.DateAndTime dateAndTime1 = serializedObjectSupporter0.deserializeObjectDateAndTime85();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode27();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber85();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale110();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions37();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook73();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions12();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime68();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale125();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker147();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale65();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter9 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code10 = serializedObjectSupporter9.deserializeObjectCode41();
        com.github.javafaker.Internet internet11 = serializedObjectSupporter9.deserializeObjectInternet71();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter9.deserializeObjectFaker107();
        com.github.javafaker.Name name13 = serializedObjectSupporter9.deserializeObjectName66();
        com.github.javafaker.Number number14 = serializedObjectSupporter9.deserializeObjectNumber46();
        com.github.javafaker.Faker faker15 = serializedObjectSupporter9.deserializeObjectFaker229();
        java.util.Locale locale16 = serializedObjectSupporter9.deserializeObjectLocale109();
        java.lang.String str17 = locale8.getDisplayName(locale16);
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNull(internet11);
        org.junit.Assert.assertNull(faker12);
        org.junit.Assert.assertNull(name13);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNull(faker15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "English" + "'", str17, "English");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp71();
        com.github.javafaker.Internet internet3 = serializedObjectSupporter0.deserializeObjectInternet15();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker53();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker165();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNull(internet3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor40();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor64();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker227();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName12();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(name6);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp49();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName16();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook83();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale129();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale127();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress14();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale101();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress48();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode9();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook62();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode69();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance27();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName66();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber46();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions78();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp62();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(name4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(app7);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService51();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress12();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker11();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness27();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker26();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Name name3 = serializedObjectSupporter0.deserializeObjectName5();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale102();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker67();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(name3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService51();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress12();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp47();
        com.github.javafaker.Internet internet9 = serializedObjectSupporter0.deserializeObjectInternet53();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany64();
        com.github.javafaker.Address address11 = serializedObjectSupporter0.deserializeObjectAddress64();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNull(internet9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNull(address11);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet33();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany69();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime25();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber37();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker173();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor27();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker172();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp37();
        com.github.javafaker.App app9 = serializedObjectSupporter0.deserializeObjectApp12();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor81();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNull(app9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        java.util.Locale locale3 = new java.util.Locale("hi!", "English", "it");
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_ENGLISH_it");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress14();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness63();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor23();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService14();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany55();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance14();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness79();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService3();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker48();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany21();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNull(company9);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance8();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp66();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker162();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode70();
        com.github.javafaker.Name name10 = serializedObjectSupporter0.deserializeObjectName69();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNull(name10);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker147();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale122();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker105();
        com.github.javafaker.Book book10 = serializedObjectSupporter0.deserializeObjectBook27();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker71();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService33();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions26();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber64();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem68();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker228();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook14();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale15();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale136();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode16();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany84();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance17();
        com.github.javafaker.App app11 = serializedObjectSupporter0.deserializeObjectApp84();
        com.github.javafaker.Book book12 = serializedObjectSupporter0.deserializeObjectBook10();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNull(app11);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker200();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService15();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker205();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale129();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Business business2 = faker1.getbusiness();
        com.github.javafaker.Color color3 = faker1.getcolor();
        com.github.javafaker.Name name4 = faker1.name();
        com.github.javafaker.Internet internet5 = faker1.internet;
        com.github.javafaker.Name name6 = faker1.getname();
        com.github.javafaker.Internet internet7 = faker1.internet;
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(internet7);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode22();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance14();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor84();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem6();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker31();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance82();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany11();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook52();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker145();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress25();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(address7);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance8();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp66();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker162();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber13();
        com.github.javafaker.DateAndTime dateAndTime10 = serializedObjectSupporter0.deserializeObjectDateAndTime80();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook7();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker106();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime45();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions83();
        com.github.javafaker.Hacker hacker10 = serializedObjectSupporter0.deserializeObjectHacker72();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale7();
        com.github.javafaker.Business business12 = serializedObjectSupporter0.deserializeObjectBusiness16();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(hacker10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(business12);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale76();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany65();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany13();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker119();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale15();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber5();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime12();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService30();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber35();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem24();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker84();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(hacker6);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService51();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress12();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker75();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNotNull(hacker8);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress48();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode9();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime41();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker101();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor19();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions75();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany38();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions72();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker113();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook67();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet33();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions17();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale113();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance8();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp66();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker162();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker13();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale144();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness35();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet41();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber71();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress48();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode9();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook62();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance24();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale44();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName51();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker116();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance41();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker227();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker19();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber35();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions75();
        java.util.Random random4 = serializedObjectSupporter0.deserializeObjectRandom2();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(random4);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet85();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker110();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor80();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness58();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale141();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp79();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(app5);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Name name3 = serializedObjectSupporter0.deserializeObjectName5();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp19();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany35();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(name3);
        org.junit.Assert.assertNull(app4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp25();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService79();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet16();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNull(internet4);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet29();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber5();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany37();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance8();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp66();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService11();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance69();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker125();
        com.github.javafaker.Business business12 = serializedObjectSupporter0.deserializeObjectBusiness80();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNotNull(business12);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.Address address8 = serializedObjectSupporter0.deserializeObjectAddress13();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(address8);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook7();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness23();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany72();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService71();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions4();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService65();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions15();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet42();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor80();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor23();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService14();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany55();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp39();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker16();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker225();
        com.github.javafaker.Internet internet9 = serializedObjectSupporter0.deserializeObjectInternet38();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker26();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(internet9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker63();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(hacker7);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale2.getDisplayScript(locale3);
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("Italian");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder13 = builder9.setExtension('x', "English");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder9.removeUnicodeLocaleAttribute("it_IT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: it_IT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker71();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker133();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode33();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor34();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress48();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp45();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale138();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance28();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber63();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker71();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker243();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker144();
        com.github.javafaker.Hacker hacker10 = serializedObjectSupporter0.deserializeObjectHacker75();
        com.github.javafaker.App app11 = serializedObjectSupporter0.deserializeObjectApp80();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(hacker10);
        org.junit.Assert.assertNull(app11);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook69();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime62();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService4();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale31();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName75();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(name8);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance8();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp66();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance62();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Lorem lorem11 = serializedObjectSupporter0.deserializeObjectLorem64();
        com.github.javafaker.Options options12 = serializedObjectSupporter0.deserializeObjectOptions48();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(lorem11);
        org.junit.Assert.assertNotNull(options12);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness76();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany51();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNull(company4);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Internet internet3 = serializedObjectSupporter0.deserializeObjectInternet50();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness41();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService28();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(internet3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber29();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions29();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale153();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions75();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem84();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance8();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp66();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance62();
        com.github.javafaker.Hacker hacker10 = serializedObjectSupporter0.deserializeObjectHacker5();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(hacker10);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem39();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale67();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions57();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet33();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime61();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber43();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem66();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker192();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions63();
        com.github.javafaker.Book book10 = serializedObjectSupporter0.deserializeObjectBook2();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet14();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions37();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook73();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp48();
        com.github.javafaker.Address address9 = serializedObjectSupporter0.deserializeObjectAddress40();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale123();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker67();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber64();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode16();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany84();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance17();
        com.github.javafaker.App app11 = serializedObjectSupporter0.deserializeObjectApp84();
        java.util.Locale locale12 = serializedObjectSupporter0.deserializeObjectLocale10();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNull(app11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance8();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp66();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService11();
        com.github.javafaker.Number number10 = serializedObjectSupporter0.deserializeObjectNumber83();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(number10);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Name name3 = serializedObjectSupporter0.deserializeObjectName5();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale102();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker42();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness78();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService83();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker234();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(name3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook37();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(book4);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber35();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook57();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService37();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode67();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode42();
        com.github.javafaker.Internet internet9 = serializedObjectSupporter0.deserializeObjectInternet57();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany42();
        com.github.javafaker.DateAndTime dateAndTime11 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Internet internet12 = serializedObjectSupporter0.deserializeObjectInternet50();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(internet9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNull(internet12);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress14();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber52();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem35();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance30();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker192();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale135();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode81();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker82();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions37();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker15();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService75();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode30();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker71();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance65();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName72();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale10();
        com.github.javafaker.App app9 = serializedObjectSupporter0.deserializeObjectApp7();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor84();
        com.github.javafaker.Name name11 = serializedObjectSupporter0.deserializeObjectName59();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker81();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(name7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(app9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNull(name11);
        org.junit.Assert.assertNull(faker12);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        java.util.Random random1 = new java.util.Random((long) (short) -1);
        java.util.stream.IntStream intStream4 = random1.ints((int) (short) 0, (int) 'a');
        java.util.stream.IntStream intStream6 = random1.ints(100L);
        int int7 = random1.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream11 = random1.longs((long) (short) 0, (long) 'a', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1155099827 + "'", int7 == 1155099827);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress48();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode9();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime41();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker101();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber60();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions19();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService51();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(fakeValuesService10);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber4();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService33();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker84();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook69();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor35();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber77();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp35();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker27();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany28();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress17();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker50();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness45();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService66();
        com.github.javafaker.Address address11 = serializedObjectSupporter0.deserializeObjectAddress70();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(fakeValuesService10);
        org.junit.Assert.assertNull(address11);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker49();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor35();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor69();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet48();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(internet5);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber84();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(phoneNumber4);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker71();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker10();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet5();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor45();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions25();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker225();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem66();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions45();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor75();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber4();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany78();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker74();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(hacker6);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker215();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions45();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions24();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker71();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker243();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker144();
        com.github.javafaker.Hacker hacker10 = serializedObjectSupporter0.deserializeObjectHacker75();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker96();
        com.github.javafaker.Color color12 = serializedObjectSupporter0.deserializeObjectColor46();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(hacker10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany28();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService13();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions60();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem77();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber60();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook20();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNull(book3);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany55();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale129();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness29();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress20();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNull(address5);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance76();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime82();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness35();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale153();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName17();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker53();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker49();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness23();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode53();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker106();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany28();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress17();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber80();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber35();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook57();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker35();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(hacker7);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber71();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker194();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService18();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Address address3 = serializedObjectSupporter0.deserializeObjectAddress33();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNull(address3);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance8();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp66();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance62();
        com.github.javafaker.DateAndTime dateAndTime10 = serializedObjectSupporter0.deserializeObjectDateAndTime27();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = faker1.lorem;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Lorem lorem4 = faker1.getlorem();
        com.github.javafaker.Lorem lorem5 = faker1.lorem;
        com.github.javafaker.Address address6 = faker1.address();
        com.github.javafaker.Company company7 = faker1.company();
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(company7);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions75();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale152();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance82();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem22();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp66();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness22();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale39();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(app4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode22();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress54();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook27();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany53();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker5();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor42();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor80();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber70();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName41();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness74();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem39();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker46();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale92();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber35();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook57();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem53();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode37();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress14();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber11();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions36();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName15();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker17();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker232();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(name8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber4();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness80();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode38();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions6();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker33();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime13();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale6();
        com.github.javafaker.Lorem lorem11 = serializedObjectSupporter0.deserializeObjectLorem47();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(lorem11);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker49();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp34();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale90();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Address address3 = serializedObjectSupporter0.deserializeObjectAddress43();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook43();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet13();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor25();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(address3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance8();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp66();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance62();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker102();
        com.github.javafaker.DateAndTime dateAndTime11 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(dateAndTime11);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker182();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService23();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber74();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook37();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker176();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany76();
        com.github.javafaker.App app9 = serializedObjectSupporter0.deserializeObjectApp14();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNull(app9);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber4();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness80();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode38();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions6();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker33();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime13();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale6();
        com.github.javafaker.Code code11 = serializedObjectSupporter0.deserializeObjectCode14();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(code11);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook37();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber67();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness25();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor80();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber70();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale134();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook31();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode22();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress54();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook27();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany53();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker5();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber10();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale6();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale2.getDisplayScript(locale3);
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder9 = builder0.setLanguageTag("it-IT");
        java.util.Locale.Builder builder10 = builder0.clear();
        java.util.Locale locale11 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder0.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode16();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany84();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance17();
        com.github.javafaker.App app11 = serializedObjectSupporter0.deserializeObjectApp84();
        com.github.javafaker.service.FakeValuesService fakeValuesService12 = serializedObjectSupporter0.deserializeObjectFakeValuesService74();
        com.github.javafaker.Internet internet13 = serializedObjectSupporter0.deserializeObjectInternet12();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNull(app11);
        org.junit.Assert.assertNotNull(fakeValuesService12);
        org.junit.Assert.assertNull(internet13);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness30();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions73();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Name name3 = serializedObjectSupporter0.deserializeObjectName5();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale153();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale132();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale13();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker34();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(name3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet67();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService74();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime8();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance38();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber21();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker121();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker85();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor64();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName18();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness58();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem69();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale147();
        java.util.Locale locale11 = locale10.stripExtensions();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(name7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance82();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker195();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName51();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime79();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem7();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber60();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker223();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService30();
        com.github.javafaker.App app11 = serializedObjectSupporter0.deserializeObjectApp15();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(fakeValuesService10);
        org.junit.Assert.assertNull(app11);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber37();
        com.github.javafaker.Lorem lorem10 = serializedObjectSupporter0.deserializeObjectLorem12();
        com.github.javafaker.DateAndTime dateAndTime11 = serializedObjectSupporter0.deserializeObjectDateAndTime11();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNotNull(dateAndTime11);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker71();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker243();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor6();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker182();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService23();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber74();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook37();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker176();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions30();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker230();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode42();
        com.github.javafaker.Internet internet9 = serializedObjectSupporter0.deserializeObjectInternet57();
        com.github.javafaker.Internet internet10 = serializedObjectSupporter0.deserializeObjectInternet23();
        com.github.javafaker.Lorem lorem11 = serializedObjectSupporter0.deserializeObjectLorem47();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(internet9);
        org.junit.Assert.assertNull(internet10);
        org.junit.Assert.assertNotNull(lorem11);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress48();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode9();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber48();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber60();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale38();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp45();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(app4);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode16();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker175();
        com.github.javafaker.DateAndTime dateAndTime10 = serializedObjectSupporter0.deserializeObjectDateAndTime82();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker168();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook7();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker106();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime45();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions83();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance70();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale162();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber4();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness80();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode38();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions6();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness72();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem85();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness61();
        com.github.javafaker.Address address10 = serializedObjectSupporter0.deserializeObjectAddress84();
        com.github.javafaker.Book book11 = serializedObjectSupporter0.deserializeObjectBook5();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions37();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook73();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber75();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor23();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService14();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker235();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem75();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions37();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber1();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness16();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale134();
        com.github.javafaker.Address address10 = serializedObjectSupporter0.deserializeObjectAddress33();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(address10);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Business business2 = faker1.getbusiness();
        com.github.javafaker.Color color3 = faker1.getcolor();
        com.github.javafaker.Name name4 = faker1.name();
        com.github.javafaker.Internet internet5 = faker1.internet;
        com.github.javafaker.Number number6 = faker1.number();
        com.github.javafaker.Book book7 = faker1.getbook();
        com.github.javafaker.Internet internet8 = faker1.getinternet();
        com.github.javafaker.Options options9 = faker1.options();
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber35();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber2();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker226();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany8();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet29();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress2();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook59();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor40();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions25();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker13();
        com.github.javafaker.Address address9 = serializedObjectSupporter0.deserializeObjectAddress31();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNull(address9);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber80();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany74();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem65();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress48();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance33();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany68();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService55();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService43();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress48();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode9();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime41();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker219();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker13();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance82();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker195();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName51();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime79();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem56();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale47();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet29();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress2();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness77();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet57();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(internet5);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness35();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale45();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode22();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress54();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook27();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance41();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale48();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance80();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor40();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName44();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook4();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem47();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions7();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance82();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany11();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook52();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime35();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness35();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker11();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker223();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale143();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService25();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService51();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress12();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp47();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker3();
        com.github.javafaker.Address address10 = serializedObjectSupporter0.deserializeObjectAddress8();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(address10);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance41();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness71();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale9();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker71();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker10();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet5();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor45();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode57();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode58();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNotNull(code10);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker117();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime34();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance79();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber71();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker194();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale82();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Address address2 = serializedObjectSupporter0.deserializeObjectAddress12();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService64();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService36();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook9();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp5();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber23();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(address2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook7();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker106();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime45();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions83();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker104();
        com.github.javafaker.Internet internet11 = serializedObjectSupporter0.deserializeObjectInternet43();
        com.github.javafaker.Address address12 = serializedObjectSupporter0.deserializeObjectAddress60();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(internet11);
        org.junit.Assert.assertNull(address12);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany28();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService13();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions60();
        com.github.javafaker.Name name9 = serializedObjectSupporter0.deserializeObjectName59();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNull(name9);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService51();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress12();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker11();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber24();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp14();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance20();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet77();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions66();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(app4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        java.util.Random random1 = new java.util.Random((long) 'x');
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale79();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor26();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp22();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale153();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor45();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName53();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem16();
        com.github.javafaker.Address address8 = serializedObjectSupporter0.deserializeObjectAddress35();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNull(address8);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker1.fakeValuesService;
        com.github.javafaker.Name name3 = faker1.getname();
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(name3);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale76();
        com.github.javafaker.Options options2 = serializedObjectSupporter0.deserializeObjectOptions17();
        com.github.javafaker.Address address3 = serializedObjectSupporter0.deserializeObjectAddress31();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress55();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNull(address3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNull(address5);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService25();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker243();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Name name3 = serializedObjectSupporter0.deserializeObjectName5();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale102();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker42();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness78();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService83();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale31();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook54();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(name3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp78();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.PhoneNumber phoneNumber1 = serializedObjectSupporter0.deserializeObjectPhoneNumber35();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions32();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode75();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale21();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker182();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService23();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber74();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook37();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany80();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions65();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode71();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor65();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor31();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance33();
        com.github.javafaker.Book book10 = serializedObjectSupporter0.deserializeObjectBook52();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor45();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName53();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance32();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker44();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker201();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber5();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker151();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany39();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker71();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance65();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName72();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale10();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale157();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(name7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker200();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService85();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp76();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor36();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance9();
        com.github.javafaker.Company company11 = serializedObjectSupporter0.deserializeObjectCompany65();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNull(company11);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber35();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook57();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode55();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions37();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook73();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions12();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime68();
        com.github.javafaker.Address address10 = serializedObjectSupporter0.deserializeObjectAddress63();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale73();
        com.github.javafaker.Address address12 = serializedObjectSupporter0.deserializeObjectAddress39();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNull(address12);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress48();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode9();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook62();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale128();
        com.github.javafaker.service.RandomService randomService8 = serializedObjectSupporter0.deserializeObjectRandomService1();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(randomService8);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService65();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions15();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet42();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber18();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor80();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber70();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale134();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber13();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService68();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker200();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService85();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp76();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor36();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor66();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet33();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime61();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber43();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook83();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor78();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor68();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber4();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber68();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook24();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker110();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService26();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker240();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook69();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker114();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions32();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor23();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService14();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor31();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker211();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp62();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor4();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany28();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime22();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNotNull(dateAndTime9);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress14();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet46();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker127();
        com.github.javafaker.Hacker hacker9 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.Address address10 = serializedObjectSupporter0.deserializeObjectAddress64();
        com.github.javafaker.Color color11 = serializedObjectSupporter0.deserializeObjectColor6();
        com.github.javafaker.Color color12 = serializedObjectSupporter0.deserializeObjectColor37();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(hacker9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker147();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale65();
        com.github.javafaker.Hacker hacker9 = serializedObjectSupporter0.deserializeObjectHacker67();
        com.github.javafaker.Internet internet10 = serializedObjectSupporter0.deserializeObjectInternet35();
        com.github.javafaker.Business business11 = serializedObjectSupporter0.deserializeObjectBusiness63();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(hacker9);
        org.junit.Assert.assertNull(internet10);
        org.junit.Assert.assertNotNull(business11);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter1 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book2 = serializedObjectSupporter1.deserializeObjectBook54();
        com.github.javafaker.Color color3 = serializedObjectSupporter1.deserializeObjectColor55();
        com.github.javafaker.Color color4 = serializedObjectSupporter1.deserializeObjectColor60();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter1.deserializeObjectInternet78();
        java.util.Locale locale6 = serializedObjectSupporter1.deserializeObjectLocale25();
        java.util.Locale locale7 = serializedObjectSupporter1.deserializeObjectLocale105();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter1.deserializeObjectFakeValuesService37();
        boolean boolean9 = locale0.equals((java.lang.Object) fakeValuesService8);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions36();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker49();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker34();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale125();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker1.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber3 = faker1.getphoneNumber();
        com.github.javafaker.Internet internet4 = faker1.internet();
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(internet4);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness18();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(business4);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet67();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService74();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime8();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor27();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker209();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale31();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker102();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance6();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("anglais");
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem42();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService61();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName69();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber61();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet33();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions17();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp26();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem69();
        com.github.javafaker.Hacker hacker9 = serializedObjectSupporter0.deserializeObjectHacker76();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(hacker9);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance55();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness11();
        com.github.javafaker.App app10 = serializedObjectSupporter0.deserializeObjectApp9();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale107();
        com.github.javafaker.Business business12 = serializedObjectSupporter0.deserializeObjectBusiness27();
        com.github.javafaker.DateAndTime dateAndTime13 = serializedObjectSupporter0.deserializeObjectDateAndTime33();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNull(app10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertNotNull(dateAndTime13);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker200();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService85();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp76();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor36();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance9();
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = serializedObjectSupporter0.deserializeObjectFakeValuesService72();
        com.github.javafaker.Code code12 = serializedObjectSupporter0.deserializeObjectCode49();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(fakeValuesService11);
        org.junit.Assert.assertNotNull(code12);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress48();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp45();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale138();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName23();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(name7);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress54();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker74();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNotNull(hacker6);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions75();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp18();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(app4);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp71();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem68();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(lorem3);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Address address3 = serializedObjectSupporter0.deserializeObjectAddress43();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook43();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet13();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker30();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService22();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(address3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber4();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance49();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime79();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker238();
        com.github.javafaker.Internet internet8 = serializedObjectSupporter0.deserializeObjectInternet34();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(internet8);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook7();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode18();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale136();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber62();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor80();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness58();
        java.util.Random random4 = serializedObjectSupporter0.deserializeObjectRandom9();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress55();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker63();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale103();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(random4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook7();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale163();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook28();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance41();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness71();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker81();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime56();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode22();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress54();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook27();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness66();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime29();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber4();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness80();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode38();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions6();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker33();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime13();
        com.github.javafaker.Number number10 = serializedObjectSupporter0.deserializeObjectNumber20();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(number10);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode22();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress54();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook27();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany53();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker5();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions46();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode22();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance14();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor84();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber58();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = faker1.lorem;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Lorem lorem4 = faker1.getlorem();
        com.github.javafaker.Lorem lorem5 = faker1.lorem;
        com.github.javafaker.Address address6 = faker1.address();
        com.github.javafaker.Options options7 = faker1.options;
        com.github.javafaker.Company company8 = faker1.company();
        com.github.javafaker.Finance finance9 = faker1.finance();
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(company8);
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook69();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance50();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness36();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress48();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode9();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook62();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale128();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode7();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress48();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance33();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany68();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService55();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness78();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Address address3 = serializedObjectSupporter0.deserializeObjectAddress43();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook43();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet13();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName84();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress67();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance15();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(address3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker147();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale122();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker105();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor39();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions37();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber1();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness16();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.Lorem lorem10 = serializedObjectSupporter0.deserializeObjectLorem23();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook69();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime62();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany72();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor23();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService14();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker235();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime63();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp62();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor4();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService77();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker94();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress14();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber52();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker32();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber35();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode27();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode23();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName84();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(name4);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode7();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName38();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(name5);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor23();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService14();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany55();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp39();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp48();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale67();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions36();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName15();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness50();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker209();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale51();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(name8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker71();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance65();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName72();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale127();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(name7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress48();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp45();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale144();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance82();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem22();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp66();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness22();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService4();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber1();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(app4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Name name3 = serializedObjectSupporter0.deserializeObjectName5();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale102();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker42();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness78();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService83();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime77();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale59();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(name3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance8();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp66();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker162();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode70();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker244();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Address address3 = serializedObjectSupporter0.deserializeObjectAddress43();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook43();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet13();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName84();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress67();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker246();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(address3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker110();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions47();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale21();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode2();
        java.util.Random random4 = serializedObjectSupporter0.deserializeObjectRandom8();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(random4);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet33();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime61();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber43();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook83();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor78();
        com.github.javafaker.Address address10 = serializedObjectSupporter0.deserializeObjectAddress17();
        com.github.javafaker.Color color11 = serializedObjectSupporter0.deserializeObjectColor63();
        com.github.javafaker.App app12 = serializedObjectSupporter0.deserializeObjectApp5();
        com.github.javafaker.Color color13 = serializedObjectSupporter0.deserializeObjectColor38();
        com.github.javafaker.Number number14 = serializedObjectSupporter0.deserializeObjectNumber38();
        com.github.javafaker.Hacker hacker15 = serializedObjectSupporter0.deserializeObjectHacker48();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNull(app12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(hacker15);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber35();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber2();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber23();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime28();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber50();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp62();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime34();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker10();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime11();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(dateAndTime9);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode59();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker29();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(hacker6);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService51();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress12();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker11();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness27();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber84();
        com.github.javafaker.Hacker hacker11 = serializedObjectSupporter0.deserializeObjectHacker6();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(hacker11);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker182();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService23();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber74();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook37();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany80();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness8();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook74();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions24();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany65();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor80();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber70();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale134();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber13();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber1();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp18();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(app6);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode42();
        com.github.javafaker.Internet internet9 = serializedObjectSupporter0.deserializeObjectInternet57();
        com.github.javafaker.App app10 = serializedObjectSupporter0.deserializeObjectApp49();
        com.github.javafaker.Company company11 = serializedObjectSupporter0.deserializeObjectCompany36();
        java.util.Locale locale12 = serializedObjectSupporter0.deserializeObjectLocale76();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(internet9);
        org.junit.Assert.assertNull(app10);
        org.junit.Assert.assertNull(company11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany28();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress17();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime85();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet67();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService74();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime8();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService75();
        com.github.javafaker.PhoneNumber phoneNumber11 = serializedObjectSupporter0.deserializeObjectPhoneNumber40();
        java.util.Locale locale12 = serializedObjectSupporter0.deserializeObjectLocale144();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(fakeValuesService10);
        org.junit.Assert.assertNotNull(phoneNumber11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance82();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany11();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook52();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker145();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode79();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness46();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness68();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(business4);
    }
}
