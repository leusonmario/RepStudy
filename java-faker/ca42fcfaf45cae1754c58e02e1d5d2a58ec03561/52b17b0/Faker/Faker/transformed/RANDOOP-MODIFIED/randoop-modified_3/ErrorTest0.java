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
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker0.fakeValuesService;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name7 = faker6.name;
        com.github.javafaker.Options options8 = faker6.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = faker6.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface10 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService5, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService9);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface10.equals(fakeValuesServiceInterface10)", fakeValuesServiceInterface10.equals(fakeValuesServiceInterface10));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name5 = faker4.name;
        com.github.javafaker.Options options6 = faker4.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = faker4.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface8 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService3, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService7);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface8.equals(fakeValuesServiceInterface8)", fakeValuesServiceInterface8.equals(fakeValuesServiceInterface8));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber4 = null;
        faker0.phoneNumber = phoneNumber4;
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Options options7 = faker0.options();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker0.fakeValuesService;
        java.util.Locale locale9 = java.util.Locale.UK;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale9);
        com.github.javafaker.Code code11 = faker10.code;
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.lang.String str14 = locale12.getDisplayName(locale13);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale12);
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Random random17 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream20 = random17.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale16, random17);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name24 = faker23.name;
        com.github.javafaker.Options options25 = faker23.options;
        com.github.javafaker.Company company26 = faker23.company();
        faker22.company = company26;
        com.github.javafaker.Hacker hacker28 = faker22.hacker;
        com.github.javafaker.Company company29 = faker22.company;
        com.github.javafaker.Hacker hacker30 = faker22.hacker;
        faker15.hacker = hacker30;
        java.util.Locale locale32 = java.util.Locale.FRANCE;
        java.util.Random random33 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream36 = random33.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker(locale32, random33);
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random33);
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name40 = faker39.name;
        com.github.javafaker.Options options41 = faker39.options;
        com.github.javafaker.Company company42 = faker39.company();
        faker38.company = company42;
        com.github.javafaker.Hacker hacker44 = faker38.hacker;
        com.github.javafaker.Company company45 = faker38.company;
        com.github.javafaker.Hacker hacker46 = faker38.hacker;
        faker15.hacker = hacker46;
        faker10.hacker = hacker46;
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name50 = faker49.name;
        com.github.javafaker.Options options51 = faker49.options;
        com.github.javafaker.Name name52 = faker49.name();
        com.github.javafaker.Hacker hacker53 = faker49.hacker();
        com.github.javafaker.service.FakeValuesService fakeValuesService54 = faker49.fakeValuesService;
        com.github.javafaker.Book book55 = faker49.book();
        com.github.javafaker.Faker faker56 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name57 = faker56.name;
        com.github.javafaker.Options options58 = faker56.options;
        com.github.javafaker.Name name59 = faker56.name();
        com.github.javafaker.Hacker hacker60 = faker56.hacker();
        com.github.javafaker.service.FakeValuesService fakeValuesService61 = faker56.fakeValuesService;
        faker49.fakeValuesService = fakeValuesService61;
        faker10.fakeValuesService = fakeValuesService61;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface64 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService8, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService61);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface64.equals(fakeValuesServiceInterface64)", fakeValuesServiceInterface64.equals(fakeValuesServiceInterface64));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        boolean boolean2 = locale1.hasExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1);
        java.lang.String str5 = faker3.regexify("");
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name7 = faker6.name;
        com.github.javafaker.Options options8 = faker6.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = faker6.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber10 = null;
        faker6.phoneNumber = phoneNumber10;
        com.github.javafaker.Name name12 = faker6.name();
        com.github.javafaker.Options options13 = faker6.options();
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = faker6.fakeValuesService;
        faker3.fakeValuesService = fakeValuesService14;
        java.util.Locale locale16 = java.util.Locale.UK;
        java.util.Locale locale17 = locale16.stripExtensions();
        boolean boolean18 = locale17.hasExtensions();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale17);
        java.lang.String str21 = faker19.regexify("");
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name23 = faker22.name;
        com.github.javafaker.Options options24 = faker22.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService25 = faker22.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber26 = null;
        faker22.phoneNumber = phoneNumber26;
        com.github.javafaker.Name name28 = faker22.name();
        com.github.javafaker.Options options29 = faker22.options();
        com.github.javafaker.service.FakeValuesService fakeValuesService30 = faker22.fakeValuesService;
        faker19.fakeValuesService = fakeValuesService30;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface32 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService14, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService30);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface32.equals(fakeValuesServiceInterface32)", fakeValuesServiceInterface32.equals(fakeValuesServiceInterface32));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Number number2 = faker1.number;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker1.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface4 = null;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface5 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService3, fakeValuesServiceInterface4);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface5.equals(fakeValuesServiceInterface5)", fakeValuesServiceInterface5.equals(fakeValuesServiceInterface5));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Number number2 = faker1.number;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker1.fakeValuesService;
        java.util.Random random4 = new java.util.Random();
        double double5 = random4.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = faker7.fakeValuesService;
        com.github.javafaker.service.RandomService randomService11 = null;
        faker7.randomService = randomService11;
        com.github.javafaker.DateAndTime dateAndTime13 = faker7.date();
        faker6.dateAndTime = dateAndTime13;
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.util.Random random16 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream19 = random16.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale15, random16);
        com.github.javafaker.Business business21 = null;
        faker20.business = business21;
        com.github.javafaker.Book book23 = faker20.book;
        com.github.javafaker.Company company24 = faker20.company;
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name26 = faker25.name;
        com.github.javafaker.Options options27 = faker25.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService28 = faker25.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber29 = null;
        faker25.phoneNumber = phoneNumber29;
        com.github.javafaker.Name name31 = faker25.name();
        com.github.javafaker.Options options32 = faker25.options();
        com.github.javafaker.service.FakeValuesService fakeValuesService33 = faker25.fakeValuesService;
        faker20.fakeValuesService = fakeValuesService33;
        faker6.fakeValuesService = fakeValuesService33;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface36 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService3, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService33);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface36.equals(fakeValuesServiceInterface36)", fakeValuesServiceInterface36.equals(fakeValuesServiceInterface36));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface4 = null;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface5 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService3, fakeValuesServiceInterface4);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface5.equals(fakeValuesServiceInterface5)", fakeValuesServiceInterface5.equals(fakeValuesServiceInterface5));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        com.github.javafaker.Book book8 = faker5.book;
        com.github.javafaker.Company company9 = faker5.company;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name11 = faker10.name;
        com.github.javafaker.Options options12 = faker10.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService13 = faker10.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber14 = null;
        faker10.phoneNumber = phoneNumber14;
        com.github.javafaker.Name name16 = faker10.name();
        com.github.javafaker.Options options17 = faker10.options();
        com.github.javafaker.service.FakeValuesService fakeValuesService18 = faker10.fakeValuesService;
        faker5.fakeValuesService = fakeValuesService18;
        java.util.Locale locale20 = java.util.Locale.UK;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale20);
        com.github.javafaker.Code code22 = faker21.code;
        java.util.Locale locale23 = java.util.Locale.ENGLISH;
        java.util.Locale locale24 = java.util.Locale.FRANCE;
        java.lang.String str25 = locale23.getDisplayName(locale24);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale23);
        java.util.Locale locale27 = java.util.Locale.FRANCE;
        java.util.Random random28 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream31 = random28.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(locale27, random28);
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name35 = faker34.name;
        com.github.javafaker.Options options36 = faker34.options;
        com.github.javafaker.Company company37 = faker34.company();
        faker33.company = company37;
        com.github.javafaker.Hacker hacker39 = faker33.hacker;
        com.github.javafaker.Company company40 = faker33.company;
        com.github.javafaker.Hacker hacker41 = faker33.hacker;
        faker26.hacker = hacker41;
        java.util.Locale locale43 = java.util.Locale.FRANCE;
        java.util.Random random44 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream47 = random44.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(locale43, random44);
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker(random44);
        com.github.javafaker.Faker faker50 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name51 = faker50.name;
        com.github.javafaker.Options options52 = faker50.options;
        com.github.javafaker.Company company53 = faker50.company();
        faker49.company = company53;
        com.github.javafaker.Hacker hacker55 = faker49.hacker;
        com.github.javafaker.Company company56 = faker49.company;
        com.github.javafaker.Hacker hacker57 = faker49.hacker;
        faker26.hacker = hacker57;
        faker21.hacker = hacker57;
        com.github.javafaker.Faker faker60 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name61 = faker60.name;
        com.github.javafaker.Options options62 = faker60.options;
        com.github.javafaker.Name name63 = faker60.name();
        com.github.javafaker.Hacker hacker64 = faker60.hacker();
        com.github.javafaker.service.FakeValuesService fakeValuesService65 = faker60.fakeValuesService;
        com.github.javafaker.Book book66 = faker60.book();
        com.github.javafaker.Faker faker67 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name68 = faker67.name;
        com.github.javafaker.Options options69 = faker67.options;
        com.github.javafaker.Name name70 = faker67.name();
        com.github.javafaker.Hacker hacker71 = faker67.hacker();
        com.github.javafaker.service.FakeValuesService fakeValuesService72 = faker67.fakeValuesService;
        faker60.fakeValuesService = fakeValuesService72;
        faker21.fakeValuesService = fakeValuesService72;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface75 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService18, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService72);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface75.equals(fakeValuesServiceInterface75)", fakeValuesServiceInterface75.equals(fakeValuesServiceInterface75));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Code code6 = faker0.code;
        com.github.javafaker.Internet internet7 = faker0.internet;
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker0.fakeValuesService;
        java.util.Random random10 = new java.util.Random((-1L));
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Random random13 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream16 = random13.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale12, random13);
        com.github.javafaker.Business business18 = null;
        faker17.business = business18;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book21 = null;
        faker20.book = book21;
        com.github.javafaker.Code code23 = faker20.code();
        faker17.code = code23;
        java.lang.String str26 = faker17.bothify("Japan");
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name28 = faker27.name;
        com.github.javafaker.Options options29 = faker27.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService30 = faker27.fakeValuesService;
        com.github.javafaker.service.RandomService randomService31 = null;
        faker27.randomService = randomService31;
        com.github.javafaker.Options options33 = faker27.options;
        java.util.Random random34 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream37 = random34.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream39 = random34.doubles((long) (short) 1);
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(random34);
        com.github.javafaker.service.RandomService randomService41 = faker40.randomService;
        faker27.randomService = randomService41;
        com.github.javafaker.Address address43 = faker27.address;
        com.github.javafaker.Lorem lorem44 = faker27.lorem();
        faker17.lorem = lorem44;
        com.github.javafaker.Options options46 = faker17.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService47 = faker17.fakeValuesService;
        faker11.fakeValuesService = fakeValuesService47;
        faker0.fakeValuesService = fakeValuesService47;
        java.util.Locale locale50 = java.util.Locale.TAIWAN;
        java.util.Locale locale51 = locale50.stripExtensions();
        com.github.javafaker.Faker faker52 = new com.github.javafaker.Faker(locale51);
        com.github.javafaker.Address address53 = faker52.address();
        com.github.javafaker.Faker faker54 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name55 = faker54.name;
        com.github.javafaker.Options options56 = faker54.options;
        com.github.javafaker.Name name57 = faker54.name();
        com.github.javafaker.Hacker hacker58 = faker54.hacker();
        com.github.javafaker.service.FakeValuesService fakeValuesService59 = faker54.fakeValuesService;
        com.github.javafaker.Book book60 = faker54.book();
        com.github.javafaker.Faker faker61 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name62 = faker61.name;
        com.github.javafaker.Options options63 = faker61.options;
        com.github.javafaker.Name name64 = faker61.name();
        com.github.javafaker.Hacker hacker65 = faker61.hacker();
        com.github.javafaker.service.FakeValuesService fakeValuesService66 = faker61.fakeValuesService;
        faker54.fakeValuesService = fakeValuesService66;
        faker52.fakeValuesService = fakeValuesService66;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface69 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService47, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService66);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface69.equals(fakeValuesServiceInterface69)", fakeValuesServiceInterface69.equals(fakeValuesServiceInterface69));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name2 = faker1.name;
        com.github.javafaker.Options options3 = faker1.options;
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.Options options5 = faker1.options;
        com.github.javafaker.Options options6 = faker1.options();
        com.github.javafaker.Code code7 = faker1.code;
        com.github.javafaker.Internet internet8 = faker1.internet;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Random random10 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream13 = random10.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale9, random10);
        com.github.javafaker.Business business15 = null;
        faker14.business = business15;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book18 = null;
        faker17.book = book18;
        com.github.javafaker.Code code20 = faker17.code();
        faker14.code = code20;
        java.lang.String str23 = faker14.bothify("Japan");
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name25 = faker24.name;
        com.github.javafaker.Options options26 = faker24.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService27 = faker24.fakeValuesService;
        com.github.javafaker.service.RandomService randomService28 = null;
        faker24.randomService = randomService28;
        com.github.javafaker.Options options30 = faker24.options;
        java.util.Random random31 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream34 = random31.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream36 = random31.doubles((long) (short) 1);
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker(random31);
        com.github.javafaker.service.RandomService randomService38 = faker37.randomService;
        faker24.randomService = randomService38;
        com.github.javafaker.Address address40 = faker24.address;
        com.github.javafaker.Lorem lorem41 = faker24.lorem();
        faker14.lorem = lorem41;
        com.github.javafaker.Options options43 = faker14.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService44 = faker14.fakeValuesService;
        faker1.fakeValuesService = fakeValuesService44;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface46 = com.github.javafaker.Faker.createProxiedFakeValuesService(fakeValuesServiceInterface0, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService44);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface46.equals(fakeValuesServiceInterface46)", fakeValuesServiceInterface46.equals(fakeValuesServiceInterface46));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Company company7 = faker0.company;
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker0.fakeValuesService;
        java.util.Locale locale9 = java.util.Locale.TAIWAN;
        java.util.Locale locale10 = locale9.stripExtensions();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale10);
        com.github.javafaker.Address address12 = faker11.address();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name14 = faker13.name;
        com.github.javafaker.Options options15 = faker13.options;
        com.github.javafaker.Name name16 = faker13.name();
        com.github.javafaker.Hacker hacker17 = faker13.hacker();
        com.github.javafaker.service.FakeValuesService fakeValuesService18 = faker13.fakeValuesService;
        com.github.javafaker.Book book19 = faker13.book();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name21 = faker20.name;
        com.github.javafaker.Options options22 = faker20.options;
        com.github.javafaker.Name name23 = faker20.name();
        com.github.javafaker.Hacker hacker24 = faker20.hacker();
        com.github.javafaker.service.FakeValuesService fakeValuesService25 = faker20.fakeValuesService;
        faker13.fakeValuesService = fakeValuesService25;
        faker11.fakeValuesService = fakeValuesService25;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface28 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService8, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService25);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface28.equals(fakeValuesServiceInterface28)", fakeValuesServiceInterface28.equals(fakeValuesServiceInterface28));
    }
}

