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
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.Company company6 = faker1.company;
        com.github.javafaker.Number number7 = faker1.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker1.fakeValuesService;
        java.util.Random random9 = new java.util.Random();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.PhoneNumber phoneNumber12 = faker11.phoneNumber;
        java.util.Random random13 = new java.util.Random();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Lorem lorem15 = null;
        faker14.lorem = lorem15;
        java.lang.String str18 = faker14.numerify("");
        com.github.javafaker.Company company19 = faker14.company;
        com.github.javafaker.Number number20 = faker14.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService21 = faker14.fakeValuesService;
        faker11.fakeValuesService = fakeValuesService21;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface23 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService8, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService21);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface23.equals(fakeValuesServiceInterface23)", fakeValuesServiceInterface23.equals(fakeValuesServiceInterface23));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface0 = null;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem3 = null;
        faker2.lorem = lorem3;
        java.util.Random random5 = new java.util.Random();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Lorem lorem7 = null;
        faker6.lorem = lorem7;
        java.lang.String str10 = faker6.numerify("");
        com.github.javafaker.Company company11 = faker6.company;
        com.github.javafaker.Number number12 = faker6.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService13 = faker6.fakeValuesService;
        faker2.fakeValuesService = fakeValuesService13;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface15 = com.github.javafaker.Faker.createProxiedFakeValuesService(fakeValuesServiceInterface0, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService13);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface15.equals(fakeValuesServiceInterface15)", fakeValuesServiceInterface15.equals(fakeValuesServiceInterface15));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Color color4 = faker1.color;
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Address address6 = faker1.address;
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem9 = null;
        faker8.lorem = lorem9;
        java.lang.String str12 = faker8.numerify("");
        com.github.javafaker.Company company13 = faker8.company;
        com.github.javafaker.Number number14 = faker8.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService15 = faker8.fakeValuesService;
        faker1.fakeValuesService = fakeValuesService15;
        java.util.Random random17 = new java.util.Random();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Lorem lorem19 = null;
        faker18.lorem = lorem19;
        java.lang.String str22 = faker18.numerify("");
        com.github.javafaker.Company company23 = faker18.company;
        com.github.javafaker.Number number24 = faker18.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService25 = faker18.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface26 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService15, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService25);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface26.equals(fakeValuesServiceInterface26)", fakeValuesServiceInterface26.equals(fakeValuesServiceInterface26));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker0.fakeValuesService;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number7 = faker6.number;
        com.github.javafaker.Number number8 = faker6.number();
        java.lang.String str10 = faker6.bothify("en-GB");
        com.github.javafaker.Book book11 = faker6.book();
        com.github.javafaker.DateAndTime dateAndTime12 = faker6.dateAndTime;
        com.github.javafaker.service.FakeValuesService fakeValuesService13 = faker6.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface14 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService5, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService13);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface14.equals(fakeValuesServiceInterface14)", fakeValuesServiceInterface14.equals(fakeValuesServiceInterface14));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.PhoneNumber phoneNumber3 = faker2.phoneNumber;
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Lorem lorem6 = null;
        faker5.lorem = lorem6;
        java.lang.String str9 = faker5.numerify("");
        com.github.javafaker.Company company10 = faker5.company;
        com.github.javafaker.Number number11 = faker5.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService12 = faker5.fakeValuesService;
        faker2.fakeValuesService = fakeValuesService12;
        java.util.Random random14 = new java.util.Random();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Lorem lorem16 = null;
        faker15.lorem = lorem16;
        com.github.javafaker.Color color18 = faker15.color;
        com.github.javafaker.Finance finance19 = faker15.finance();
        com.github.javafaker.Address address20 = faker15.address;
        java.util.Random random21 = new java.util.Random();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Lorem lorem23 = null;
        faker22.lorem = lorem23;
        java.lang.String str26 = faker22.numerify("");
        com.github.javafaker.Company company27 = faker22.company;
        com.github.javafaker.Number number28 = faker22.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService29 = faker22.fakeValuesService;
        faker15.fakeValuesService = fakeValuesService29;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface31 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService12, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService29);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface31.equals(fakeValuesServiceInterface31)", fakeValuesServiceInterface31.equals(fakeValuesServiceInterface31));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.PhoneNumber phoneNumber3 = faker2.phoneNumber;
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Lorem lorem6 = null;
        faker5.lorem = lorem6;
        java.lang.String str9 = faker5.numerify("");
        com.github.javafaker.Company company10 = faker5.company;
        com.github.javafaker.Number number11 = faker5.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService12 = faker5.fakeValuesService;
        faker2.fakeValuesService = fakeValuesService12;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code15 = null;
        faker14.code = code15;
        com.github.javafaker.Lorem lorem17 = faker14.lorem();
        com.github.javafaker.service.RandomService randomService18 = faker14.randomService;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number20 = faker19.number;
        com.github.javafaker.Number number21 = faker19.number();
        java.lang.String str23 = faker19.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService24 = faker19.fakeValuesService;
        faker14.fakeValuesService = fakeValuesService24;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface26 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService12, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService24);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface26.equals(fakeValuesServiceInterface26)", fakeValuesServiceInterface26.equals(fakeValuesServiceInterface26));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker0.fakeValuesService;
        java.util.Locale locale7 = new java.util.Locale("hi!");
        java.lang.String str8 = locale7.getVariant();
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale7.getDisplayVariant(locale9);
        java.lang.String str11 = locale9.getCountry();
        java.lang.String str12 = locale9.getDisplayLanguage();
        java.util.Locale locale13 = java.util.Locale.JAPANESE;
        java.lang.String str14 = locale9.getDisplayScript(locale13);
        java.lang.String str15 = locale13.getDisplayLanguage();
        java.util.Random random17 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream20 = random17.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale13, random17);
        com.github.javafaker.Business business22 = faker21.business();
        com.github.javafaker.service.FakeValuesService fakeValuesService23 = faker21.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface24 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService5, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService23);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface24.equals(fakeValuesServiceInterface24)", fakeValuesServiceInterface24.equals(fakeValuesServiceInterface24));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Finance finance3 = faker2.finance;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker2.phoneNumber;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number6 = faker5.number;
        com.github.javafaker.Number number7 = faker5.number();
        java.lang.String str9 = faker5.bothify("en-GB");
        com.github.javafaker.Book book10 = faker5.book();
        com.github.javafaker.DateAndTime dateAndTime11 = faker5.dateAndTime;
        com.github.javafaker.Finance finance12 = faker5.finance();
        faker2.finance = finance12;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number15 = faker14.number;
        com.github.javafaker.Number number16 = faker14.number();
        java.lang.String str18 = faker14.bothify("en-GB");
        com.github.javafaker.Book book19 = faker14.book();
        com.github.javafaker.DateAndTime dateAndTime20 = faker14.dateAndTime;
        com.github.javafaker.service.FakeValuesService fakeValuesService21 = faker14.fakeValuesService;
        faker2.fakeValuesService = fakeValuesService21;
        java.util.Random random23 = new java.util.Random();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Lorem lorem25 = null;
        faker24.lorem = lorem25;
        java.lang.String str28 = faker24.numerify("");
        java.util.Random random29 = new java.util.Random();
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        com.github.javafaker.Lorem lorem31 = null;
        faker30.lorem = lorem31;
        com.github.javafaker.Color color33 = faker30.color;
        faker24.color = color33;
        com.github.javafaker.service.FakeValuesService fakeValuesService35 = faker24.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface36 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService21, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService35);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface36.equals(fakeValuesServiceInterface36)", fakeValuesServiceInterface36.equals(fakeValuesServiceInterface36));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker0.fakeValuesService;
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        java.util.stream.IntStream intStream10 = random6.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Code code12 = faker11.code();
        com.github.javafaker.service.FakeValuesService fakeValuesService13 = faker11.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface14 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService5, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService13);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface14.equals(fakeValuesServiceInterface14)", fakeValuesServiceInterface14.equals(fakeValuesServiceInterface14));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Lorem lorem6 = null;
        faker5.lorem = lorem6;
        java.lang.String str9 = faker5.numerify("");
        com.github.javafaker.Company company10 = faker5.company;
        com.github.javafaker.Number number11 = faker5.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService12 = faker5.fakeValuesService;
        faker1.fakeValuesService = fakeValuesService12;
        java.util.Random random14 = new java.util.Random();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Finance finance17 = faker16.finance;
        com.github.javafaker.PhoneNumber phoneNumber18 = faker16.phoneNumber;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number20 = faker19.number;
        com.github.javafaker.Number number21 = faker19.number();
        java.lang.String str23 = faker19.bothify("en-GB");
        com.github.javafaker.Book book24 = faker19.book();
        com.github.javafaker.DateAndTime dateAndTime25 = faker19.dateAndTime;
        com.github.javafaker.Finance finance26 = faker19.finance();
        faker16.finance = finance26;
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number29 = faker28.number;
        com.github.javafaker.Number number30 = faker28.number();
        java.lang.String str32 = faker28.bothify("en-GB");
        com.github.javafaker.Book book33 = faker28.book();
        com.github.javafaker.DateAndTime dateAndTime34 = faker28.dateAndTime;
        com.github.javafaker.service.FakeValuesService fakeValuesService35 = faker28.fakeValuesService;
        faker16.fakeValuesService = fakeValuesService35;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface37 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService12, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService35);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface37.equals(fakeValuesServiceInterface37)", fakeValuesServiceInterface37.equals(fakeValuesServiceInterface37));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code7 = null;
        faker6.code = code7;
        com.github.javafaker.Lorem lorem9 = faker6.lorem();
        faker0.lorem = lorem9;
        java.util.Random random11 = new java.util.Random();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Lorem lorem13 = null;
        faker12.lorem = lorem13;
        java.lang.String str16 = faker12.numerify("");
        java.util.Random random17 = new java.util.Random();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Lorem lorem19 = null;
        faker18.lorem = lorem19;
        com.github.javafaker.Color color21 = faker18.color;
        faker12.color = color21;
        com.github.javafaker.PhoneNumber phoneNumber23 = faker12.phoneNumber;
        faker0.phoneNumber = phoneNumber23;
        java.util.Locale locale26 = new java.util.Locale("hi!");
        java.lang.String str27 = locale26.getVariant();
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.lang.String str29 = locale26.getDisplayVariant(locale28);
        java.lang.String str30 = locale28.getCountry();
        java.util.Random random31 = new java.util.Random();
        double double32 = random31.nextDouble();
        int int34 = random31.nextInt(1);
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(locale28, random31);
        com.github.javafaker.Internet internet36 = faker35.internet();
        faker0.internet = internet36;
        com.github.javafaker.Company company38 = faker0.company;
        java.util.Random random39 = new java.util.Random();
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(random39);
        com.github.javafaker.Lorem lorem41 = null;
        faker40.lorem = lorem41;
        com.github.javafaker.Internet internet43 = null;
        faker40.internet = internet43;
        java.lang.String str46 = faker40.bothify("");
        com.github.javafaker.Name name47 = faker40.name;
        com.github.javafaker.Internet internet48 = faker40.internet();
        com.github.javafaker.Address address49 = faker40.address();
        faker0.address = address49;
        java.util.Locale locale52 = new java.util.Locale("hi!");
        java.lang.String str53 = locale52.getVariant();
        java.util.Locale locale54 = java.util.Locale.FRANCE;
        java.lang.String str55 = locale52.getDisplayVariant(locale54);
        java.lang.String str56 = locale54.getCountry();
        java.lang.String str57 = locale54.getDisplayLanguage();
        java.util.Locale locale58 = java.util.Locale.JAPANESE;
        java.lang.String str59 = locale54.getDisplayScript(locale58);
        java.lang.String str60 = locale58.getDisplayLanguage();
        java.util.Random random62 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream65 = random62.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker66 = new com.github.javafaker.Faker(locale58, random62);
        com.github.javafaker.Business business67 = faker66.business();
        com.github.javafaker.service.FakeValuesService fakeValuesService68 = faker66.fakeValuesService;
        faker0.fakeValuesService = fakeValuesService68;
        com.github.javafaker.Faker faker70 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code71 = null;
        faker70.code = code71;
        com.github.javafaker.Lorem lorem73 = faker70.lorem();
        com.github.javafaker.service.RandomService randomService74 = faker70.randomService;
        com.github.javafaker.Faker faker75 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number76 = faker75.number;
        com.github.javafaker.Number number77 = faker75.number();
        java.lang.String str79 = faker75.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService80 = faker75.fakeValuesService;
        faker70.fakeValuesService = fakeValuesService80;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface82 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService68, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService80);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface82.equals(fakeValuesServiceInterface82)", fakeValuesServiceInterface82.equals(fakeValuesServiceInterface82));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Lorem lorem6 = null;
        faker5.lorem = lorem6;
        java.lang.String str9 = faker5.numerify("");
        com.github.javafaker.Company company10 = faker5.company;
        com.github.javafaker.Number number11 = faker5.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService12 = faker5.fakeValuesService;
        faker1.fakeValuesService = fakeValuesService12;
        java.util.Random random14 = new java.util.Random();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Lorem lorem16 = null;
        faker15.lorem = lorem16;
        com.github.javafaker.Internet internet18 = null;
        faker15.internet = internet18;
        com.github.javafaker.Name name20 = faker15.name;
        com.github.javafaker.DateAndTime dateAndTime21 = faker15.dateAndTime;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number23 = faker22.number;
        com.github.javafaker.Number number24 = faker22.number();
        java.lang.String str26 = faker22.bothify("en-GB");
        com.github.javafaker.Name name27 = faker22.name();
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code29 = null;
        faker28.code = code29;
        com.github.javafaker.Lorem lorem31 = faker28.lorem();
        faker22.lorem = lorem31;
        java.util.Random random33 = new java.util.Random();
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(random33);
        com.github.javafaker.Lorem lorem35 = null;
        faker34.lorem = lorem35;
        java.lang.String str38 = faker34.numerify("");
        java.util.Random random39 = new java.util.Random();
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(random39);
        com.github.javafaker.Lorem lorem41 = null;
        faker40.lorem = lorem41;
        com.github.javafaker.Color color43 = faker40.color;
        faker34.color = color43;
        com.github.javafaker.PhoneNumber phoneNumber45 = faker34.phoneNumber;
        faker22.phoneNumber = phoneNumber45;
        java.util.Locale locale48 = new java.util.Locale("hi!");
        java.lang.String str49 = locale48.getVariant();
        java.util.Locale locale50 = java.util.Locale.FRANCE;
        java.lang.String str51 = locale48.getDisplayVariant(locale50);
        java.lang.String str52 = locale50.getCountry();
        java.util.Random random53 = new java.util.Random();
        double double54 = random53.nextDouble();
        int int56 = random53.nextInt(1);
        com.github.javafaker.Faker faker57 = new com.github.javafaker.Faker(locale50, random53);
        com.github.javafaker.Internet internet58 = faker57.internet();
        faker22.internet = internet58;
        com.github.javafaker.Company company60 = faker22.company;
        java.util.Random random61 = new java.util.Random();
        com.github.javafaker.Faker faker62 = new com.github.javafaker.Faker(random61);
        com.github.javafaker.Lorem lorem63 = null;
        faker62.lorem = lorem63;
        com.github.javafaker.Internet internet65 = null;
        faker62.internet = internet65;
        java.lang.String str68 = faker62.bothify("");
        com.github.javafaker.Name name69 = faker62.name;
        com.github.javafaker.Internet internet70 = faker62.internet();
        com.github.javafaker.Address address71 = faker62.address();
        faker22.address = address71;
        java.util.Locale locale74 = new java.util.Locale("hi!");
        java.lang.String str75 = locale74.getVariant();
        java.util.Locale locale76 = java.util.Locale.FRANCE;
        java.lang.String str77 = locale74.getDisplayVariant(locale76);
        java.lang.String str78 = locale76.getCountry();
        java.lang.String str79 = locale76.getDisplayLanguage();
        java.util.Locale locale80 = java.util.Locale.JAPANESE;
        java.lang.String str81 = locale76.getDisplayScript(locale80);
        java.lang.String str82 = locale80.getDisplayLanguage();
        java.util.Random random84 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream87 = random84.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker88 = new com.github.javafaker.Faker(locale80, random84);
        com.github.javafaker.Business business89 = faker88.business();
        com.github.javafaker.service.FakeValuesService fakeValuesService90 = faker88.fakeValuesService;
        faker22.fakeValuesService = fakeValuesService90;
        faker15.fakeValuesService = fakeValuesService90;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface93 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService12, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService90);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface93.equals(fakeValuesServiceInterface93)", fakeValuesServiceInterface93.equals(fakeValuesServiceInterface93));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Color color4 = faker1.color;
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Address address6 = faker1.address;
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem9 = null;
        faker8.lorem = lorem9;
        java.lang.String str12 = faker8.numerify("");
        com.github.javafaker.Company company13 = faker8.company;
        com.github.javafaker.Number number14 = faker8.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService15 = faker8.fakeValuesService;
        faker1.fakeValuesService = fakeValuesService15;
        java.util.Random random17 = new java.util.Random();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Lorem lorem19 = null;
        faker18.lorem = lorem19;
        com.github.javafaker.Color color21 = faker18.color;
        com.github.javafaker.Finance finance22 = faker18.finance();
        com.github.javafaker.Address address23 = faker18.address;
        com.github.javafaker.Code code24 = faker18.code;
        com.github.javafaker.Name name25 = faker18.name;
        com.github.javafaker.service.FakeValuesService fakeValuesService26 = faker18.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface27 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService15, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService26);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface27.equals(fakeValuesServiceInterface27)", fakeValuesServiceInterface27.equals(fakeValuesServiceInterface27));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.PhoneNumber phoneNumber3 = faker2.phoneNumber;
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Lorem lorem6 = null;
        faker5.lorem = lorem6;
        java.lang.String str9 = faker5.numerify("");
        com.github.javafaker.Company company10 = faker5.company;
        com.github.javafaker.Number number11 = faker5.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService12 = faker5.fakeValuesService;
        faker2.fakeValuesService = fakeValuesService12;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number15 = faker14.number;
        com.github.javafaker.Number number16 = faker14.number();
        java.lang.String str18 = faker14.bothify("en-GB");
        com.github.javafaker.Name name19 = faker14.name();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code21 = null;
        faker20.code = code21;
        com.github.javafaker.Lorem lorem23 = faker20.lorem();
        faker14.lorem = lorem23;
        java.util.Random random25 = new java.util.Random();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random25);
        com.github.javafaker.Lorem lorem27 = null;
        faker26.lorem = lorem27;
        java.lang.String str30 = faker26.numerify("");
        java.util.Random random31 = new java.util.Random();
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        com.github.javafaker.Lorem lorem33 = null;
        faker32.lorem = lorem33;
        com.github.javafaker.Color color35 = faker32.color;
        faker26.color = color35;
        com.github.javafaker.PhoneNumber phoneNumber37 = faker26.phoneNumber;
        faker14.phoneNumber = phoneNumber37;
        java.util.Locale locale40 = new java.util.Locale("hi!");
        java.lang.String str41 = locale40.getVariant();
        java.util.Locale locale42 = java.util.Locale.FRANCE;
        java.lang.String str43 = locale40.getDisplayVariant(locale42);
        java.lang.String str44 = locale42.getCountry();
        java.util.Random random45 = new java.util.Random();
        double double46 = random45.nextDouble();
        int int48 = random45.nextInt(1);
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker(locale42, random45);
        com.github.javafaker.Internet internet50 = faker49.internet();
        faker14.internet = internet50;
        com.github.javafaker.Company company52 = faker14.company;
        java.util.Random random53 = new java.util.Random();
        com.github.javafaker.Faker faker54 = new com.github.javafaker.Faker(random53);
        com.github.javafaker.Lorem lorem55 = null;
        faker54.lorem = lorem55;
        com.github.javafaker.Internet internet57 = null;
        faker54.internet = internet57;
        java.lang.String str60 = faker54.bothify("");
        com.github.javafaker.Name name61 = faker54.name;
        com.github.javafaker.Internet internet62 = faker54.internet();
        com.github.javafaker.Address address63 = faker54.address();
        faker14.address = address63;
        java.util.Locale locale66 = new java.util.Locale("hi!");
        java.lang.String str67 = locale66.getVariant();
        java.util.Locale locale68 = java.util.Locale.FRANCE;
        java.lang.String str69 = locale66.getDisplayVariant(locale68);
        java.lang.String str70 = locale68.getCountry();
        java.lang.String str71 = locale68.getDisplayLanguage();
        java.util.Locale locale72 = java.util.Locale.JAPANESE;
        java.lang.String str73 = locale68.getDisplayScript(locale72);
        java.lang.String str74 = locale72.getDisplayLanguage();
        java.util.Random random76 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream79 = random76.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker80 = new com.github.javafaker.Faker(locale72, random76);
        com.github.javafaker.Business business81 = faker80.business();
        com.github.javafaker.service.FakeValuesService fakeValuesService82 = faker80.fakeValuesService;
        faker14.fakeValuesService = fakeValuesService82;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface84 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService12, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService82);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface84.equals(fakeValuesServiceInterface84)", fakeValuesServiceInterface84.equals(fakeValuesServiceInterface84));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = null;
        faker0.code = code1;
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        com.github.javafaker.service.RandomService randomService4 = faker0.randomService;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number6 = faker5.number;
        com.github.javafaker.Number number7 = faker5.number();
        java.lang.String str9 = faker5.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = faker5.fakeValuesService;
        faker0.fakeValuesService = fakeValuesService10;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number13 = faker12.number;
        com.github.javafaker.Number number14 = faker12.number();
        java.lang.String str16 = faker12.bothify("en-GB");
        com.github.javafaker.Book book17 = faker12.book();
        com.github.javafaker.DateAndTime dateAndTime18 = faker12.dateAndTime;
        com.github.javafaker.Finance finance19 = faker12.finance();
        java.util.Random random20 = new java.util.Random();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Lorem lorem22 = null;
        faker21.lorem = lorem22;
        java.lang.String str25 = faker21.numerify("hi!");
        com.github.javafaker.Lorem lorem26 = faker21.lorem;
        java.util.Random random27 = new java.util.Random();
        double double28 = random27.nextDouble();
        int int30 = random27.nextInt(1);
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(random27);
        com.github.javafaker.service.RandomService randomService32 = faker31.randomService;
        faker21.randomService = randomService32;
        com.github.javafaker.Finance finance34 = faker21.finance();
        com.github.javafaker.Options options35 = faker21.options;
        faker12.options = options35;
        java.util.Random random37 = new java.util.Random();
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Lorem lorem39 = null;
        faker38.lorem = lorem39;
        com.github.javafaker.Internet internet41 = null;
        faker38.internet = internet41;
        java.lang.String str44 = faker38.bothify("");
        com.github.javafaker.Code code45 = null;
        faker38.code = code45;
        com.github.javafaker.Number number47 = faker38.number();
        com.github.javafaker.Finance finance48 = faker38.finance();
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code50 = null;
        faker49.code = code50;
        com.github.javafaker.Lorem lorem52 = faker49.lorem();
        com.github.javafaker.service.RandomService randomService53 = faker49.randomService;
        com.github.javafaker.Faker faker54 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number55 = faker54.number;
        com.github.javafaker.Number number56 = faker54.number();
        java.lang.String str58 = faker54.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService59 = faker54.fakeValuesService;
        faker49.fakeValuesService = fakeValuesService59;
        faker38.fakeValuesService = fakeValuesService59;
        faker12.fakeValuesService = fakeValuesService59;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface63 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService10, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService59);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface63.equals(fakeValuesServiceInterface63)", fakeValuesServiceInterface63.equals(fakeValuesServiceInterface63));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Book book5 = faker0.book();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.dateAndTime;
        com.github.javafaker.Finance finance7 = faker0.finance();
        com.github.javafaker.Finance finance8 = faker0.finance;
        com.github.javafaker.Options options9 = faker0.options;
        java.util.Random random10 = new java.util.Random();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Lorem lorem12 = null;
        faker11.lorem = lorem12;
        com.github.javafaker.Color color14 = faker11.color;
        com.github.javafaker.Finance finance15 = faker11.finance();
        com.github.javafaker.Address address16 = faker11.address;
        java.util.Random random17 = new java.util.Random();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Lorem lorem19 = null;
        faker18.lorem = lorem19;
        java.lang.String str22 = faker18.numerify("");
        com.github.javafaker.Company company23 = faker18.company;
        com.github.javafaker.Number number24 = faker18.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService25 = faker18.fakeValuesService;
        faker11.fakeValuesService = fakeValuesService25;
        faker0.fakeValuesService = fakeValuesService25;
        java.util.Random random28 = new java.util.Random();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Lorem lorem30 = null;
        faker29.lorem = lorem30;
        com.github.javafaker.Color color32 = faker29.color;
        com.github.javafaker.Finance finance33 = faker29.finance();
        com.github.javafaker.Address address34 = faker29.address;
        com.github.javafaker.Code code35 = faker29.code;
        com.github.javafaker.Name name36 = faker29.name;
        com.github.javafaker.service.FakeValuesService fakeValuesService37 = faker29.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface38 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService25, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService37);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface38.equals(fakeValuesServiceInterface38)", fakeValuesServiceInterface38.equals(fakeValuesServiceInterface38));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = faker5.fakeValuesService;
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        java.lang.String str13 = faker9.numerify("");
        com.github.javafaker.Business business14 = faker9.business;
        com.github.javafaker.service.FakeValuesService fakeValuesService15 = faker9.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface16 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService7, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService15);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface16.equals(fakeValuesServiceInterface16)", fakeValuesServiceInterface16.equals(fakeValuesServiceInterface16));
    }
}

