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
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Finance finance5 = faker0.finance();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService7 = faker6.randomService;
        java.lang.String str9 = faker6.bothify("");
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService11 = faker10.randomService;
        java.lang.String str13 = faker10.bothify("");
        com.github.javafaker.Book book14 = faker10.book();
        faker6.book = book14;
        com.github.javafaker.Options options16 = faker6.options();
        faker0.options = options16;
        com.github.javafaker.service.RandomService randomService18 = faker0.randomService;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService20 = faker19.randomService;
        com.github.javafaker.Book book21 = faker19.book();
        com.github.javafaker.Finance finance22 = faker19.finance();
        com.github.javafaker.Book book23 = faker19.book();
        com.github.javafaker.Options options24 = faker19.options();
        com.github.javafaker.PhoneNumber phoneNumber25 = faker19.phoneNumber();
        com.github.javafaker.service.FakeValuesService fakeValuesService26 = faker19.fakeValuesService;
        faker0.fakeValuesService = fakeValuesService26;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface28 = null;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface29 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService26, fakeValuesServiceInterface28);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface29.equals(fakeValuesServiceInterface29)", fakeValuesServiceInterface29.equals(fakeValuesServiceInterface29));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker0.phoneNumber();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = faker0.fakeValuesService;
        java.util.Locale locale9 = new java.util.Locale("\uc601\uc5b4\uce90\ub098\ub2e4)");
        java.util.Locale locale10 = locale9.stripExtensions();
        java.util.Locale locale11 = locale10.stripExtensions();
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        java.lang.String str14 = locale12.getDisplayName(locale13);
        java.lang.String str15 = locale12.getCountry();
        java.lang.String str16 = locale12.getScript();
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.lang.String str19 = locale17.getDisplayName(locale18);
        java.lang.String str20 = locale17.getISO3Language();
        java.util.Locale locale21 = locale17.stripExtensions();
        java.lang.String str22 = locale12.getDisplayScript(locale21);
        java.lang.String str23 = locale11.getDisplayScript(locale12);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale12);
        com.github.javafaker.Color color25 = faker24.color;
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService27 = faker26.randomService;
        java.lang.String str29 = faker26.bothify("");
        com.github.javafaker.DateAndTime dateAndTime30 = faker26.dateAndTime;
        java.lang.String str32 = faker26.letterify("en-CA");
        com.github.javafaker.Code code33 = null;
        faker26.code = code33;
        com.github.javafaker.service.FakeValuesService fakeValuesService35 = faker26.fakeValuesService;
        faker24.fakeValuesService = fakeValuesService35;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface37 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService7, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService35);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface37.equals(fakeValuesServiceInterface37)", fakeValuesServiceInterface37.equals(fakeValuesServiceInterface37));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        java.util.Locale locale1 = new java.util.Locale("\uc601\uc5b4\uce90\ub098\ub2e4)");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        java.lang.String str7 = locale4.getCountry();
        java.lang.String str8 = locale4.getScript();
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale9.getDisplayName(locale10);
        java.lang.String str12 = locale9.getISO3Language();
        java.util.Locale locale13 = locale9.stripExtensions();
        java.lang.String str14 = locale4.getDisplayScript(locale13);
        java.lang.String str15 = locale3.getDisplayScript(locale4);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale4);
        com.github.javafaker.Color color17 = faker16.color;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService19 = faker18.randomService;
        java.lang.String str21 = faker18.bothify("");
        com.github.javafaker.DateAndTime dateAndTime22 = faker18.dateAndTime;
        java.lang.String str24 = faker18.letterify("en-CA");
        com.github.javafaker.Code code25 = null;
        faker18.code = code25;
        com.github.javafaker.service.FakeValuesService fakeValuesService27 = faker18.fakeValuesService;
        faker16.fakeValuesService = fakeValuesService27;
        java.util.Locale locale30 = new java.util.Locale("\uc601\uc5b4\uce90\ub098\ub2e4)");
        java.util.Locale locale31 = locale30.stripExtensions();
        java.util.Locale locale32 = locale31.stripExtensions();
        java.util.Locale locale33 = java.util.Locale.CANADA;
        java.util.Locale locale34 = java.util.Locale.KOREAN;
        java.lang.String str35 = locale33.getDisplayName(locale34);
        java.lang.String str36 = locale33.getCountry();
        java.lang.String str37 = locale33.getScript();
        java.util.Locale locale38 = java.util.Locale.CANADA;
        java.util.Locale locale39 = java.util.Locale.KOREAN;
        java.lang.String str40 = locale38.getDisplayName(locale39);
        java.lang.String str41 = locale38.getISO3Language();
        java.util.Locale locale42 = locale38.stripExtensions();
        java.lang.String str43 = locale33.getDisplayScript(locale42);
        java.lang.String str44 = locale32.getDisplayScript(locale33);
        com.github.javafaker.Faker faker45 = new com.github.javafaker.Faker(locale33);
        com.github.javafaker.Color color46 = faker45.color;
        com.github.javafaker.Faker faker47 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService48 = faker47.randomService;
        java.lang.String str50 = faker47.bothify("");
        com.github.javafaker.DateAndTime dateAndTime51 = faker47.dateAndTime;
        java.lang.String str53 = faker47.letterify("en-CA");
        com.github.javafaker.Code code54 = null;
        faker47.code = code54;
        com.github.javafaker.service.FakeValuesService fakeValuesService56 = faker47.fakeValuesService;
        faker45.fakeValuesService = fakeValuesService56;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface58 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService27, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService56);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface58.equals(fakeValuesServiceInterface58)", fakeValuesServiceInterface58.equals(fakeValuesServiceInterface58));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService2 = faker1.randomService;
        java.lang.String str4 = faker1.bothify("");
        com.github.javafaker.Book book5 = faker1.book();
        com.github.javafaker.Book book6 = faker1.book;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService8 = faker7.randomService;
        com.github.javafaker.Book book9 = faker7.book();
        com.github.javafaker.Finance finance10 = faker7.finance();
        com.github.javafaker.Book book11 = faker7.book();
        com.github.javafaker.Options options12 = faker7.options();
        com.github.javafaker.PhoneNumber phoneNumber13 = faker7.phoneNumber();
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = faker7.fakeValuesService;
        faker1.fakeValuesService = fakeValuesService14;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface16 = com.github.javafaker.Faker.createProxiedFakeValuesService(fakeValuesServiceInterface0, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService14);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface16.equals(fakeValuesServiceInterface16)", fakeValuesServiceInterface16.equals(fakeValuesServiceInterface16));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Book book5 = faker0.book;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService7 = faker6.randomService;
        com.github.javafaker.Book book8 = faker6.book();
        com.github.javafaker.Finance finance9 = faker6.finance();
        com.github.javafaker.Book book10 = faker6.book();
        com.github.javafaker.Options options11 = faker6.options();
        com.github.javafaker.PhoneNumber phoneNumber12 = faker6.phoneNumber();
        com.github.javafaker.service.FakeValuesService fakeValuesService13 = faker6.fakeValuesService;
        faker0.fakeValuesService = fakeValuesService13;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService16 = faker15.randomService;
        com.github.javafaker.Book book17 = faker15.book();
        com.github.javafaker.Finance finance18 = faker15.finance();
        com.github.javafaker.Book book19 = faker15.book();
        com.github.javafaker.Address address20 = faker15.address;
        com.github.javafaker.service.FakeValuesService fakeValuesService21 = faker15.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface22 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService13, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService21);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface22.equals(fakeValuesServiceInterface22)", fakeValuesServiceInterface22.equals(fakeValuesServiceInterface22));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService5 = faker4.randomService;
        java.lang.String str7 = faker4.bothify("");
        com.github.javafaker.Book book8 = faker4.book();
        faker0.book = book8;
        com.github.javafaker.DateAndTime dateAndTime10 = faker0.dateAndTime;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService12 = faker11.randomService;
        java.lang.String str14 = faker11.bothify("");
        com.github.javafaker.Book book15 = faker11.book();
        com.github.javafaker.Finance finance16 = faker11.finance();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService18 = faker17.randomService;
        java.lang.String str20 = faker17.bothify("");
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService22 = faker21.randomService;
        java.lang.String str24 = faker21.bothify("");
        com.github.javafaker.Book book25 = faker21.book();
        faker17.book = book25;
        com.github.javafaker.Options options27 = faker17.options();
        faker11.options = options27;
        com.github.javafaker.service.RandomService randomService29 = faker11.randomService;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService31 = faker30.randomService;
        com.github.javafaker.Book book32 = faker30.book();
        com.github.javafaker.Finance finance33 = faker30.finance();
        com.github.javafaker.Book book34 = faker30.book();
        com.github.javafaker.Options options35 = faker30.options();
        com.github.javafaker.PhoneNumber phoneNumber36 = faker30.phoneNumber();
        com.github.javafaker.service.FakeValuesService fakeValuesService37 = faker30.fakeValuesService;
        faker11.fakeValuesService = fakeValuesService37;
        faker0.fakeValuesService = fakeValuesService37;
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService41 = faker40.randomService;
        com.github.javafaker.Book book42 = faker40.book();
        com.github.javafaker.Finance finance43 = faker40.finance();
        com.github.javafaker.Book book44 = faker40.book();
        com.github.javafaker.Address address45 = faker40.address;
        com.github.javafaker.service.FakeValuesService fakeValuesService46 = faker40.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface47 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService37, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService46);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface47.equals(fakeValuesServiceInterface47)", fakeValuesServiceInterface47.equals(fakeValuesServiceInterface47));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.dateAndTime;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService6 = faker5.randomService;
        java.lang.String str8 = faker5.bothify("");
        com.github.javafaker.DateAndTime dateAndTime9 = faker5.dateAndTime;
        faker0.dateAndTime = dateAndTime9;
        com.github.javafaker.Code code11 = null;
        faker0.code = code11;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService14 = faker13.randomService;
        java.lang.String str16 = faker13.bothify("");
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService18 = faker17.randomService;
        com.github.javafaker.Book book19 = faker17.book();
        com.github.javafaker.Finance finance20 = faker17.finance();
        com.github.javafaker.Book book21 = faker17.book();
        com.github.javafaker.Options options22 = faker17.options();
        com.github.javafaker.PhoneNumber phoneNumber23 = faker17.phoneNumber();
        faker13.phoneNumber = phoneNumber23;
        com.github.javafaker.Name name25 = faker13.name();
        faker0.name = name25;
        com.github.javafaker.Finance finance27 = faker0.finance();
        com.github.javafaker.Number number28 = faker0.number;
        com.github.javafaker.service.FakeValuesService fakeValuesService29 = faker0.fakeValuesService;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService31 = faker30.randomService;
        java.lang.String str33 = faker30.bothify("");
        com.github.javafaker.Book book34 = faker30.book();
        com.github.javafaker.Finance finance35 = faker30.finance();
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService37 = faker36.randomService;
        java.lang.String str39 = faker36.bothify("");
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService41 = faker40.randomService;
        java.lang.String str43 = faker40.bothify("");
        com.github.javafaker.Book book44 = faker40.book();
        faker36.book = book44;
        com.github.javafaker.Options options46 = faker36.options();
        faker30.options = options46;
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService49 = faker48.randomService;
        java.lang.String str51 = faker48.bothify("");
        com.github.javafaker.DateAndTime dateAndTime52 = faker48.dateAndTime;
        java.lang.String str54 = faker48.letterify("en-CA");
        com.github.javafaker.Code code55 = null;
        faker48.code = code55;
        com.github.javafaker.service.FakeValuesService fakeValuesService57 = faker48.fakeValuesService;
        faker30.fakeValuesService = fakeValuesService57;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface59 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService29, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService57);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface59.equals(fakeValuesServiceInterface59)", fakeValuesServiceInterface59.equals(fakeValuesServiceInterface59));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Finance finance5 = faker0.finance();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService7 = faker6.randomService;
        java.lang.String str9 = faker6.bothify("");
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService11 = faker10.randomService;
        java.lang.String str13 = faker10.bothify("");
        com.github.javafaker.Book book14 = faker10.book();
        faker6.book = book14;
        com.github.javafaker.Options options16 = faker6.options();
        faker0.options = options16;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService19 = faker18.randomService;
        java.lang.String str21 = faker18.bothify("");
        com.github.javafaker.DateAndTime dateAndTime22 = faker18.dateAndTime;
        java.lang.String str24 = faker18.letterify("en-CA");
        com.github.javafaker.Code code25 = null;
        faker18.code = code25;
        com.github.javafaker.service.FakeValuesService fakeValuesService27 = faker18.fakeValuesService;
        faker0.fakeValuesService = fakeValuesService27;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker();
        com.github.javafaker.Options options30 = faker29.options;
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.lang.String str32 = locale31.getDisplayVariant();
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale31);
        com.github.javafaker.Finance finance34 = faker33.finance();
        com.github.javafaker.Code code35 = faker33.code;
        faker29.code = code35;
        com.github.javafaker.service.FakeValuesService fakeValuesService37 = faker29.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface38 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService27, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService37);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface38.equals(fakeValuesServiceInterface38)", fakeValuesServiceInterface38.equals(fakeValuesServiceInterface38));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Finance finance5 = faker0.finance();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService7 = faker6.randomService;
        java.lang.String str9 = faker6.bothify("");
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService11 = faker10.randomService;
        java.lang.String str13 = faker10.bothify("");
        com.github.javafaker.Book book14 = faker10.book();
        faker6.book = book14;
        com.github.javafaker.Options options16 = faker6.options();
        faker0.options = options16;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService19 = faker18.randomService;
        java.lang.String str21 = faker18.bothify("");
        com.github.javafaker.DateAndTime dateAndTime22 = faker18.dateAndTime;
        java.lang.String str24 = faker18.letterify("en-CA");
        com.github.javafaker.Code code25 = null;
        faker18.code = code25;
        com.github.javafaker.service.FakeValuesService fakeValuesService27 = faker18.fakeValuesService;
        faker0.fakeValuesService = fakeValuesService27;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService30 = faker29.randomService;
        com.github.javafaker.Book book31 = faker29.book();
        com.github.javafaker.Finance finance32 = faker29.finance();
        com.github.javafaker.Book book33 = faker29.book();
        com.github.javafaker.Address address34 = faker29.address;
        com.github.javafaker.service.FakeValuesService fakeValuesService35 = faker29.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface36 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService27, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService35);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface36.equals(fakeValuesServiceInterface36)", fakeValuesServiceInterface36.equals(fakeValuesServiceInterface36));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.dateAndTime;
        java.lang.String str6 = faker0.letterify("en-CA");
        com.github.javafaker.Code code7 = null;
        faker0.code = code7;
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = faker0.fakeValuesService;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business11 = null;
        faker10.business = business11;
        com.github.javafaker.Color color13 = null;
        faker10.color = color13;
        com.github.javafaker.App app15 = faker10.app;
        com.github.javafaker.Address address16 = faker10.address();
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.util.Locale locale18 = java.util.Locale.CANADA;
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.lang.String str20 = locale18.getDisplayName(locale19);
        java.lang.String str21 = locale18.getISO3Language();
        java.util.Locale locale22 = locale18.stripExtensions();
        java.lang.String str23 = locale22.toLanguageTag();
        java.lang.String str24 = locale17.getDisplayLanguage(locale22);
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale17);
        com.github.javafaker.Address address26 = faker25.address();
        com.github.javafaker.Address address27 = faker25.address();
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService29 = faker28.randomService;
        com.github.javafaker.Book book30 = faker28.book();
        com.github.javafaker.Finance finance31 = faker28.finance();
        com.github.javafaker.Book book32 = faker28.book();
        com.github.javafaker.Name name33 = faker28.name;
        faker25.name = name33;
        com.github.javafaker.Company company35 = faker25.company;
        faker10.company = company35;
        com.github.javafaker.service.FakeValuesService fakeValuesService37 = faker10.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface38 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService9, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService37);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface38.equals(fakeValuesServiceInterface38)", fakeValuesServiceInterface38.equals(fakeValuesServiceInterface38));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name3 = faker2.name();
        faker0.name = name3;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService6 = faker5.randomService;
        com.github.javafaker.Book book7 = faker5.book();
        com.github.javafaker.Finance finance8 = faker5.finance();
        com.github.javafaker.Book book9 = faker5.book();
        com.github.javafaker.Options options10 = faker5.options();
        com.github.javafaker.PhoneNumber phoneNumber11 = faker5.phoneNumber();
        com.github.javafaker.service.FakeValuesService fakeValuesService12 = faker5.fakeValuesService;
        faker0.fakeValuesService = fakeValuesService12;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business15 = null;
        faker14.business = business15;
        com.github.javafaker.Color color17 = null;
        faker14.color = color17;
        com.github.javafaker.App app19 = faker14.app;
        com.github.javafaker.Address address20 = faker14.address();
        java.util.Locale locale21 = java.util.Locale.ITALIAN;
        java.util.Locale locale22 = java.util.Locale.CANADA;
        java.util.Locale locale23 = java.util.Locale.KOREAN;
        java.lang.String str24 = locale22.getDisplayName(locale23);
        java.lang.String str25 = locale22.getISO3Language();
        java.util.Locale locale26 = locale22.stripExtensions();
        java.lang.String str27 = locale26.toLanguageTag();
        java.lang.String str28 = locale21.getDisplayLanguage(locale26);
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(locale21);
        com.github.javafaker.Address address30 = faker29.address();
        com.github.javafaker.Address address31 = faker29.address();
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService33 = faker32.randomService;
        com.github.javafaker.Book book34 = faker32.book();
        com.github.javafaker.Finance finance35 = faker32.finance();
        com.github.javafaker.Book book36 = faker32.book();
        com.github.javafaker.Name name37 = faker32.name;
        faker29.name = name37;
        com.github.javafaker.Company company39 = faker29.company;
        faker14.company = company39;
        com.github.javafaker.service.FakeValuesService fakeValuesService41 = faker14.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface42 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService12, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService41);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface42.equals(fakeValuesServiceInterface42)", fakeValuesServiceInterface42.equals(fakeValuesServiceInterface42));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.dateAndTime;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService6 = faker5.randomService;
        java.lang.String str8 = faker5.bothify("");
        com.github.javafaker.DateAndTime dateAndTime9 = faker5.dateAndTime;
        faker0.dateAndTime = dateAndTime9;
        com.github.javafaker.Code code11 = null;
        faker0.code = code11;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService14 = faker13.randomService;
        java.lang.String str16 = faker13.bothify("");
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService18 = faker17.randomService;
        com.github.javafaker.Book book19 = faker17.book();
        com.github.javafaker.Finance finance20 = faker17.finance();
        com.github.javafaker.Book book21 = faker17.book();
        com.github.javafaker.Options options22 = faker17.options();
        com.github.javafaker.PhoneNumber phoneNumber23 = faker17.phoneNumber();
        faker13.phoneNumber = phoneNumber23;
        com.github.javafaker.Name name25 = faker13.name();
        faker0.name = name25;
        com.github.javafaker.Finance finance27 = faker0.finance();
        com.github.javafaker.Number number28 = faker0.number;
        com.github.javafaker.service.FakeValuesService fakeValuesService29 = faker0.fakeValuesService;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business31 = null;
        faker30.business = business31;
        com.github.javafaker.Color color33 = null;
        faker30.color = color33;
        com.github.javafaker.App app35 = faker30.app;
        com.github.javafaker.Address address36 = faker30.address();
        java.util.Locale locale37 = java.util.Locale.ITALIAN;
        java.util.Locale locale38 = java.util.Locale.CANADA;
        java.util.Locale locale39 = java.util.Locale.KOREAN;
        java.lang.String str40 = locale38.getDisplayName(locale39);
        java.lang.String str41 = locale38.getISO3Language();
        java.util.Locale locale42 = locale38.stripExtensions();
        java.lang.String str43 = locale42.toLanguageTag();
        java.lang.String str44 = locale37.getDisplayLanguage(locale42);
        com.github.javafaker.Faker faker45 = new com.github.javafaker.Faker(locale37);
        com.github.javafaker.Address address46 = faker45.address();
        com.github.javafaker.Address address47 = faker45.address();
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService49 = faker48.randomService;
        com.github.javafaker.Book book50 = faker48.book();
        com.github.javafaker.Finance finance51 = faker48.finance();
        com.github.javafaker.Book book52 = faker48.book();
        com.github.javafaker.Name name53 = faker48.name;
        faker45.name = name53;
        com.github.javafaker.Company company55 = faker45.company;
        faker30.company = company55;
        com.github.javafaker.service.FakeValuesService fakeValuesService57 = faker30.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface58 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService29, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService57);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface58.equals(fakeValuesServiceInterface58)", fakeValuesServiceInterface58.equals(fakeValuesServiceInterface58));
    }
}

