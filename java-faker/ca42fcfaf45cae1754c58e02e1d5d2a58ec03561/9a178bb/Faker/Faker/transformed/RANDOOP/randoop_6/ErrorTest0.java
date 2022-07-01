import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Options options3 = faker1.options();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.DateAndTime dateAndTime6 = null;
        faker5.dateAndTime = dateAndTime6;
        com.github.javafaker.Lorem lorem8 = faker5.lorem;
        faker1.lorem = lorem8;
        com.github.javafaker.Internet internet10 = faker1.internet();
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Color color13 = faker12.color;
        com.github.javafaker.Lorem lorem14 = faker12.lorem();
        com.github.javafaker.Finance finance15 = faker12.finance;
        com.github.javafaker.Number number16 = faker12.number();
        com.github.javafaker.PhoneNumber phoneNumber17 = null;
        faker12.phoneNumber = phoneNumber17;
        com.github.javafaker.service.FakeValuesService fakeValuesService19 = faker12.fakeValuesService;
        faker1.fakeValuesService = fakeValuesService19;
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Color color23 = faker22.color;
        com.github.javafaker.Lorem lorem24 = faker22.lorem();
        com.github.javafaker.Finance finance25 = faker22.finance;
        com.github.javafaker.Number number26 = faker22.number();
        com.github.javafaker.PhoneNumber phoneNumber27 = null;
        faker22.phoneNumber = phoneNumber27;
        com.github.javafaker.service.FakeValuesService fakeValuesService29 = faker22.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface30 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService19, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService29);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface30.equals(fakeValuesServiceInterface30)", fakeValuesServiceInterface30.equals(fakeValuesServiceInterface30));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = faker1.fakeValuesService;
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        java.lang.String str8 = faker6.numerify("");
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        com.github.javafaker.Address address12 = faker10.address;
        faker6.address = address12;
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = faker6.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface15 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService4, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService14);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface15.equals(fakeValuesServiceInterface15)", fakeValuesServiceInterface15.equals(fakeValuesServiceInterface15));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Options options4 = faker1.options;
        com.github.javafaker.Business business5 = faker1.business();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale8 = java.util.Locale.TAIWAN;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.lang.String str10 = locale8.toLanguageTag();
        java.lang.String str11 = locale8.getDisplayLanguage();
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale8, random12);
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Color color16 = faker15.color;
        com.github.javafaker.Lorem lorem17 = faker15.lorem();
        com.github.javafaker.Finance finance18 = faker15.finance;
        com.github.javafaker.Number number19 = faker15.number();
        com.github.javafaker.PhoneNumber phoneNumber20 = null;
        faker15.phoneNumber = phoneNumber20;
        com.github.javafaker.service.FakeValuesService fakeValuesService22 = faker15.fakeValuesService;
        faker13.fakeValuesService = fakeValuesService22;
        faker1.fakeValuesService = fakeValuesService22;
        java.util.Random random25 = null;
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random25);
        com.github.javafaker.Color color27 = faker26.color;
        com.github.javafaker.Options options28 = faker26.options();
        java.util.Random random29 = null;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        com.github.javafaker.DateAndTime dateAndTime31 = null;
        faker30.dateAndTime = dateAndTime31;
        com.github.javafaker.Lorem lorem33 = faker30.lorem;
        faker26.lorem = lorem33;
        com.github.javafaker.Internet internet35 = faker26.internet();
        java.util.Random random36 = null;
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker(random36);
        com.github.javafaker.Color color38 = faker37.color;
        com.github.javafaker.Lorem lorem39 = faker37.lorem();
        com.github.javafaker.Finance finance40 = faker37.finance;
        com.github.javafaker.Number number41 = faker37.number();
        com.github.javafaker.PhoneNumber phoneNumber42 = null;
        faker37.phoneNumber = phoneNumber42;
        com.github.javafaker.service.FakeValuesService fakeValuesService44 = faker37.fakeValuesService;
        faker26.fakeValuesService = fakeValuesService44;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface46 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService22, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService44);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface46.equals(fakeValuesServiceInterface46)", fakeValuesServiceInterface46.equals(fakeValuesServiceInterface46));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = faker1.fakeValuesService;
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Color color7 = faker6.color;
        com.github.javafaker.Address address8 = faker6.address;
        com.github.javafaker.Code code9 = faker6.code();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = faker6.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface11 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService4, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService10);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface11.equals(fakeValuesServiceInterface11)", fakeValuesServiceInterface11.equals(fakeValuesServiceInterface11));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.PhoneNumber phoneNumber6 = null;
        faker1.phoneNumber = phoneNumber6;
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker1.fakeValuesService;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        com.github.javafaker.Lorem lorem12 = faker10.lorem();
        com.github.javafaker.Finance finance13 = faker10.finance;
        com.github.javafaker.Number number14 = faker10.number();
        com.github.javafaker.PhoneNumber phoneNumber15 = null;
        faker10.phoneNumber = phoneNumber15;
        com.github.javafaker.service.FakeValuesService fakeValuesService17 = faker10.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface18 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService8, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService17);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface18.equals(fakeValuesServiceInterface18)", fakeValuesServiceInterface18.equals(fakeValuesServiceInterface18));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Options options3 = faker1.options();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.DateAndTime dateAndTime6 = null;
        faker5.dateAndTime = dateAndTime6;
        com.github.javafaker.Lorem lorem8 = faker5.lorem;
        faker1.lorem = lorem8;
        com.github.javafaker.Internet internet10 = faker1.internet();
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Color color13 = faker12.color;
        com.github.javafaker.Lorem lorem14 = faker12.lorem();
        com.github.javafaker.Finance finance15 = faker12.finance;
        com.github.javafaker.Number number16 = faker12.number();
        com.github.javafaker.PhoneNumber phoneNumber17 = null;
        faker12.phoneNumber = phoneNumber17;
        com.github.javafaker.service.FakeValuesService fakeValuesService19 = faker12.fakeValuesService;
        faker1.fakeValuesService = fakeValuesService19;
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        java.lang.String str24 = faker22.numerify("");
        com.github.javafaker.service.FakeValuesService fakeValuesService25 = faker22.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface26 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService19, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService25);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface26.equals(fakeValuesServiceInterface26)", fakeValuesServiceInterface26.equals(fakeValuesServiceInterface26));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = faker1.fakeValuesService;
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.DateAndTime dateAndTime7 = null;
        faker6.dateAndTime = dateAndTime7;
        com.github.javafaker.Lorem lorem9 = faker6.lorem;
        com.github.javafaker.Address address10 = faker6.address;
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Color color13 = faker12.color;
        com.github.javafaker.DateAndTime dateAndTime14 = faker12.dateAndTime;
        com.github.javafaker.service.RandomService randomService15 = faker12.randomService;
        faker6.randomService = randomService15;
        java.util.Random random17 = null;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Color color19 = faker18.color;
        java.util.Random random20 = null;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        java.lang.String str23 = faker21.numerify("");
        com.github.javafaker.Number number24 = faker21.number();
        faker18.number = number24;
        faker6.number = number24;
        com.github.javafaker.service.FakeValuesService fakeValuesService27 = faker6.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface28 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService4, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService27);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface28.equals(fakeValuesServiceInterface28)", fakeValuesServiceInterface28.equals(fakeValuesServiceInterface28));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Options options4 = faker1.options;
        com.github.javafaker.Business business5 = faker1.business();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale8 = java.util.Locale.TAIWAN;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.lang.String str10 = locale8.toLanguageTag();
        java.lang.String str11 = locale8.getDisplayLanguage();
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale8, random12);
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Color color16 = faker15.color;
        com.github.javafaker.Lorem lorem17 = faker15.lorem();
        com.github.javafaker.Finance finance18 = faker15.finance;
        com.github.javafaker.Number number19 = faker15.number();
        com.github.javafaker.PhoneNumber phoneNumber20 = null;
        faker15.phoneNumber = phoneNumber20;
        com.github.javafaker.service.FakeValuesService fakeValuesService22 = faker15.fakeValuesService;
        faker13.fakeValuesService = fakeValuesService22;
        faker1.fakeValuesService = fakeValuesService22;
        java.util.Random random25 = null;
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random25);
        com.github.javafaker.Color color27 = faker26.color;
        com.github.javafaker.Lorem lorem28 = faker26.lorem();
        com.github.javafaker.Finance finance29 = faker26.finance;
        com.github.javafaker.Number number30 = faker26.number();
        com.github.javafaker.PhoneNumber phoneNumber31 = null;
        faker26.phoneNumber = phoneNumber31;
        com.github.javafaker.service.FakeValuesService fakeValuesService33 = faker26.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface34 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService22, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService33);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface34.equals(fakeValuesServiceInterface34)", fakeValuesServiceInterface34.equals(fakeValuesServiceInterface34));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Code code4 = faker1.code;
        com.github.javafaker.Number number5 = faker1.number;
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = faker1.fakeValuesService;
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Color color9 = faker8.color;
        com.github.javafaker.Lorem lorem10 = faker8.lorem();
        com.github.javafaker.Finance finance11 = faker8.finance;
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Color color14 = faker13.color;
        com.github.javafaker.Lorem lorem15 = faker13.lorem();
        com.github.javafaker.Finance finance16 = faker13.finance;
        com.github.javafaker.Number number17 = faker13.number();
        com.github.javafaker.PhoneNumber phoneNumber18 = null;
        faker13.phoneNumber = phoneNumber18;
        com.github.javafaker.service.FakeValuesService fakeValuesService20 = faker13.fakeValuesService;
        faker8.fakeValuesService = fakeValuesService20;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface22 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService6, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService20);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface22.equals(fakeValuesServiceInterface22)", fakeValuesServiceInterface22.equals(fakeValuesServiceInterface22));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Options options3 = faker1.options();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.DateAndTime dateAndTime6 = null;
        faker5.dateAndTime = dateAndTime6;
        com.github.javafaker.Lorem lorem8 = faker5.lorem;
        faker1.lorem = lorem8;
        com.github.javafaker.Internet internet10 = faker1.internet();
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Color color13 = faker12.color;
        com.github.javafaker.Lorem lorem14 = faker12.lorem();
        com.github.javafaker.Finance finance15 = faker12.finance;
        com.github.javafaker.Number number16 = faker12.number();
        com.github.javafaker.PhoneNumber phoneNumber17 = null;
        faker12.phoneNumber = phoneNumber17;
        com.github.javafaker.service.FakeValuesService fakeValuesService19 = faker12.fakeValuesService;
        faker1.fakeValuesService = fakeValuesService19;
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Color color23 = faker22.color;
        com.github.javafaker.Lorem lorem24 = faker22.lorem();
        com.github.javafaker.Finance finance25 = faker22.finance;
        java.util.Random random26 = null;
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.Color color28 = faker27.color;
        com.github.javafaker.Lorem lorem29 = faker27.lorem();
        com.github.javafaker.Finance finance30 = faker27.finance;
        com.github.javafaker.Number number31 = faker27.number();
        com.github.javafaker.PhoneNumber phoneNumber32 = null;
        faker27.phoneNumber = phoneNumber32;
        com.github.javafaker.service.FakeValuesService fakeValuesService34 = faker27.fakeValuesService;
        faker22.fakeValuesService = fakeValuesService34;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface36 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService19, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService34);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface36.equals(fakeValuesServiceInterface36)", fakeValuesServiceInterface36.equals(fakeValuesServiceInterface36));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale13, random17);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale2, random17);
        com.github.javafaker.Lorem lorem23 = faker22.lorem();
        java.lang.String str25 = faker22.numerify("TWN");
        com.github.javafaker.DateAndTime dateAndTime26 = faker22.date();
        com.github.javafaker.service.FakeValuesService fakeValuesService27 = faker22.fakeValuesService;
        java.util.Random random28 = null;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Color color30 = faker29.color;
        com.github.javafaker.Address address31 = faker29.address;
        com.github.javafaker.Options options32 = faker29.options;
        com.github.javafaker.Business business33 = faker29.business();
        java.util.Locale locale35 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale36 = java.util.Locale.TAIWAN;
        java.lang.String str37 = locale35.getDisplayScript(locale36);
        java.lang.String str38 = locale36.toLanguageTag();
        java.lang.String str39 = locale36.getDisplayLanguage();
        java.util.Random random40 = null;
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(locale36, random40);
        java.util.Random random42 = null;
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker(random42);
        com.github.javafaker.Color color44 = faker43.color;
        com.github.javafaker.Lorem lorem45 = faker43.lorem();
        com.github.javafaker.Finance finance46 = faker43.finance;
        com.github.javafaker.Number number47 = faker43.number();
        com.github.javafaker.PhoneNumber phoneNumber48 = null;
        faker43.phoneNumber = phoneNumber48;
        com.github.javafaker.service.FakeValuesService fakeValuesService50 = faker43.fakeValuesService;
        faker41.fakeValuesService = fakeValuesService50;
        faker29.fakeValuesService = fakeValuesService50;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface53 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService27, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService50);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface53.equals(fakeValuesServiceInterface53)", fakeValuesServiceInterface53.equals(fakeValuesServiceInterface53));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Code code8 = faker1.code;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        com.github.javafaker.Lorem lorem12 = faker10.lorem();
        com.github.javafaker.Finance finance13 = faker10.finance;
        com.github.javafaker.Number number14 = faker10.number();
        faker1.number = number14;
        java.util.Random random16 = null;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.DateAndTime dateAndTime18 = null;
        faker17.dateAndTime = dateAndTime18;
        com.github.javafaker.Lorem lorem20 = faker17.lorem;
        com.github.javafaker.Address address21 = faker17.address;
        faker1.address = address21;
        java.util.Random random23 = null;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Color color25 = faker24.color;
        com.github.javafaker.Address address26 = faker24.address;
        com.github.javafaker.Options options27 = faker24.options;
        com.github.javafaker.Business business28 = faker24.business();
        java.util.Locale locale30 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale31 = java.util.Locale.TAIWAN;
        java.lang.String str32 = locale30.getDisplayScript(locale31);
        java.lang.String str33 = locale31.toLanguageTag();
        java.lang.String str34 = locale31.getDisplayLanguage();
        java.util.Random random35 = null;
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(locale31, random35);
        java.util.Random random37 = null;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Color color39 = faker38.color;
        com.github.javafaker.Lorem lorem40 = faker38.lorem();
        com.github.javafaker.Finance finance41 = faker38.finance;
        com.github.javafaker.Number number42 = faker38.number();
        com.github.javafaker.PhoneNumber phoneNumber43 = null;
        faker38.phoneNumber = phoneNumber43;
        com.github.javafaker.service.FakeValuesService fakeValuesService45 = faker38.fakeValuesService;
        faker36.fakeValuesService = fakeValuesService45;
        faker24.fakeValuesService = fakeValuesService45;
        faker1.fakeValuesService = fakeValuesService45;
        java.util.Random random49 = null;
        com.github.javafaker.Faker faker50 = new com.github.javafaker.Faker(random49);
        com.github.javafaker.Color color51 = faker50.color;
        com.github.javafaker.Lorem lorem52 = faker50.lorem();
        com.github.javafaker.Finance finance53 = faker50.finance;
        com.github.javafaker.Number number54 = faker50.number();
        com.github.javafaker.Address address55 = faker50.address();
        java.util.Random random56 = null;
        com.github.javafaker.Faker faker57 = new com.github.javafaker.Faker(random56);
        java.lang.String str59 = faker57.numerify("");
        com.github.javafaker.Book book60 = null;
        faker57.book = book60;
        com.github.javafaker.Internet internet62 = faker57.internet();
        com.github.javafaker.service.FakeValuesService fakeValuesService63 = faker57.fakeValuesService;
        faker50.fakeValuesService = fakeValuesService63;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface65 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService45, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService63);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface65.equals(fakeValuesServiceInterface65)", fakeValuesServiceInterface65.equals(fakeValuesServiceInterface65));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Code code8 = faker1.code;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        com.github.javafaker.Lorem lorem12 = faker10.lorem();
        com.github.javafaker.Finance finance13 = faker10.finance;
        com.github.javafaker.Number number14 = faker10.number();
        faker1.number = number14;
        java.util.Random random16 = null;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.DateAndTime dateAndTime18 = null;
        faker17.dateAndTime = dateAndTime18;
        com.github.javafaker.Lorem lorem20 = faker17.lorem;
        com.github.javafaker.Address address21 = faker17.address;
        faker1.address = address21;
        java.util.Random random23 = null;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Color color25 = faker24.color;
        com.github.javafaker.Address address26 = faker24.address;
        com.github.javafaker.Options options27 = faker24.options;
        com.github.javafaker.Business business28 = faker24.business();
        java.util.Locale locale30 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale31 = java.util.Locale.TAIWAN;
        java.lang.String str32 = locale30.getDisplayScript(locale31);
        java.lang.String str33 = locale31.toLanguageTag();
        java.lang.String str34 = locale31.getDisplayLanguage();
        java.util.Random random35 = null;
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(locale31, random35);
        java.util.Random random37 = null;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Color color39 = faker38.color;
        com.github.javafaker.Lorem lorem40 = faker38.lorem();
        com.github.javafaker.Finance finance41 = faker38.finance;
        com.github.javafaker.Number number42 = faker38.number();
        com.github.javafaker.PhoneNumber phoneNumber43 = null;
        faker38.phoneNumber = phoneNumber43;
        com.github.javafaker.service.FakeValuesService fakeValuesService45 = faker38.fakeValuesService;
        faker36.fakeValuesService = fakeValuesService45;
        faker24.fakeValuesService = fakeValuesService45;
        faker1.fakeValuesService = fakeValuesService45;
        java.util.Locale locale50 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale51 = java.util.Locale.TAIWAN;
        java.lang.String str52 = locale50.getDisplayScript(locale51);
        java.lang.String str53 = locale51.toLanguageTag();
        java.lang.String str54 = locale51.getDisplayLanguage();
        java.util.Random random55 = null;
        com.github.javafaker.Faker faker56 = new com.github.javafaker.Faker(locale51, random55);
        java.util.Random random57 = null;
        com.github.javafaker.Faker faker58 = new com.github.javafaker.Faker(random57);
        com.github.javafaker.Color color59 = faker58.color;
        com.github.javafaker.Lorem lorem60 = faker58.lorem();
        com.github.javafaker.Finance finance61 = faker58.finance;
        com.github.javafaker.Number number62 = faker58.number();
        com.github.javafaker.PhoneNumber phoneNumber63 = null;
        faker58.phoneNumber = phoneNumber63;
        com.github.javafaker.service.FakeValuesService fakeValuesService65 = faker58.fakeValuesService;
        faker56.fakeValuesService = fakeValuesService65;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface67 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService45, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService65);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface67.equals(fakeValuesServiceInterface67)", fakeValuesServiceInterface67.equals(fakeValuesServiceInterface67));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface0 = null;
        java.util.Random random1 = null;
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.numerify("");
        com.github.javafaker.Book book5 = null;
        faker2.book = book5;
        com.github.javafaker.Internet internet7 = faker2.internet;
        com.github.javafaker.DateAndTime dateAndTime8 = faker2.date();
        com.github.javafaker.Internet internet9 = faker2.internet;
        java.util.Random random10 = null;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        java.lang.String str13 = faker11.numerify("");
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Color color16 = faker15.color;
        com.github.javafaker.Address address17 = faker15.address;
        faker11.address = address17;
        com.github.javafaker.service.FakeValuesService fakeValuesService19 = faker11.fakeValuesService;
        faker2.fakeValuesService = fakeValuesService19;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface21 = com.github.javafaker.Faker.createProxiedFakeValuesService(fakeValuesServiceInterface0, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService19);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface21.equals(fakeValuesServiceInterface21)", fakeValuesServiceInterface21.equals(fakeValuesServiceInterface21));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Color color6 = faker5.color;
        com.github.javafaker.Address address7 = faker5.address;
        faker1.address = address7;
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = faker1.fakeValuesService;
        java.util.Random random10 = null;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.DateAndTime dateAndTime12 = null;
        faker11.dateAndTime = dateAndTime12;
        com.github.javafaker.Lorem lorem14 = faker11.lorem;
        com.github.javafaker.Address address15 = faker11.address;
        com.github.javafaker.Finance finance16 = faker11.finance();
        com.github.javafaker.Number number17 = faker11.number();
        java.util.Random random18 = null;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.Color color20 = faker19.color;
        com.github.javafaker.Address address21 = faker19.address;
        com.github.javafaker.Code code22 = faker19.code();
        com.github.javafaker.service.FakeValuesService fakeValuesService23 = faker19.fakeValuesService;
        faker11.fakeValuesService = fakeValuesService23;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface25 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService9, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService23);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface25.equals(fakeValuesServiceInterface25)", fakeValuesServiceInterface25.equals(fakeValuesServiceInterface25));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale13, random17);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale2, random17);
        com.github.javafaker.Lorem lorem23 = faker22.lorem();
        java.lang.String str25 = faker22.numerify("TWN");
        com.github.javafaker.DateAndTime dateAndTime26 = faker22.date();
        com.github.javafaker.service.FakeValuesService fakeValuesService27 = faker22.fakeValuesService;
        java.util.Random random28 = null;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Color color30 = faker29.color;
        com.github.javafaker.Options options31 = faker29.options();
        com.github.javafaker.Color color32 = faker29.color();
        java.util.Random random33 = null;
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(random33);
        java.lang.String str36 = faker34.numerify("");
        com.github.javafaker.Book book37 = null;
        faker34.book = book37;
        com.github.javafaker.Internet internet39 = faker34.internet;
        com.github.javafaker.DateAndTime dateAndTime40 = faker34.date();
        faker29.dateAndTime = dateAndTime40;
        java.util.Locale locale42 = java.util.Locale.US;
        java.util.Locale.setDefault(locale42);
        java.lang.String str44 = locale42.getVariant();
        com.github.javafaker.Faker faker45 = new com.github.javafaker.Faker(locale42);
        com.github.javafaker.Options options46 = faker45.options();
        faker29.options = options46;
        com.github.javafaker.Options options48 = faker29.options();
        java.util.Random random49 = null;
        com.github.javafaker.Faker faker50 = new com.github.javafaker.Faker(random49);
        java.lang.String str52 = faker50.numerify("");
        com.github.javafaker.service.FakeValuesService fakeValuesService53 = faker50.fakeValuesService;
        faker29.fakeValuesService = fakeValuesService53;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface55 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService27, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService53);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface55.equals(fakeValuesServiceInterface55)", fakeValuesServiceInterface55.equals(fakeValuesServiceInterface55));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Options options6 = faker1.options;
        com.github.javafaker.Finance finance7 = faker1.finance;
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.DateAndTime dateAndTime10 = null;
        faker9.dateAndTime = dateAndTime10;
        com.github.javafaker.Lorem lorem12 = faker9.lorem;
        com.github.javafaker.Address address13 = faker9.address;
        com.github.javafaker.Code code14 = faker9.code();
        faker1.code = code14;
        com.github.javafaker.service.FakeValuesService fakeValuesService16 = faker1.fakeValuesService;
        java.util.Random random17 = null;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        java.lang.String str20 = faker18.numerify("");
        com.github.javafaker.Code code21 = faker18.code;
        com.github.javafaker.Number number22 = faker18.number;
        com.github.javafaker.service.FakeValuesService fakeValuesService23 = faker18.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface24 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService16, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService23);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface24.equals(fakeValuesServiceInterface24)", fakeValuesServiceInterface24.equals(fakeValuesServiceInterface24));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.FakeValuesService fakeValuesService1 = faker0.fakeValuesService;
        java.util.Random random2 = null;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Color color4 = faker3.color;
        com.github.javafaker.Lorem lorem5 = faker3.lorem();
        com.github.javafaker.Finance finance6 = faker3.finance;
        com.github.javafaker.Number number7 = faker3.number();
        com.github.javafaker.PhoneNumber phoneNumber8 = null;
        faker3.phoneNumber = phoneNumber8;
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = faker3.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface11 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService1, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService10);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface11.equals(fakeValuesServiceInterface11)", fakeValuesServiceInterface11.equals(fakeValuesServiceInterface11));
    }
}

