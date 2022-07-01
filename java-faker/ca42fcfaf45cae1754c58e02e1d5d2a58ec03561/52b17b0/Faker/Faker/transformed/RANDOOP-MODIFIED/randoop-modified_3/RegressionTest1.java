import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.Color color8 = faker5.color();
        faker0.color = color8;
        com.github.javafaker.Business business10 = null;
        faker0.business = business10;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name13 = faker12.name;
        com.github.javafaker.Options options14 = faker12.options;
        com.github.javafaker.Name name15 = faker12.name();
        com.github.javafaker.Hacker hacker16 = faker12.hacker();
        java.lang.String str18 = faker12.numerify("");
        java.lang.String str20 = faker12.letterify("french");
        com.github.javafaker.Internet internet21 = faker12.internet;
        faker0.internet = internet21;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(name13);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(hacker16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "french" + "'", str20, "french");
        org.junit.Assert.assertNotNull(internet21);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Business business2 = null;
        faker0.business = business2;
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Business business5 = faker0.business;
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale6, random7);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name14 = faker13.name;
        com.github.javafaker.Options options15 = faker13.options;
        com.github.javafaker.Company company16 = faker13.company();
        faker12.company = company16;
        com.github.javafaker.Hacker hacker18 = faker12.hacker;
        com.github.javafaker.Company company19 = faker12.company;
        com.github.javafaker.Hacker hacker20 = faker12.hacker;
        com.github.javafaker.Options options21 = faker12.options();
        faker0.options = options21;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(business5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(name14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(company16);
        org.junit.Assert.assertNotNull(hacker18);
        org.junit.Assert.assertNotNull(company19);
        org.junit.Assert.assertNotNull(hacker20);
        org.junit.Assert.assertNotNull(options21);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream12 = random7.doubles((long) (short) 1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService14 = faker13.randomService;
        faker0.randomService = randomService14;
        com.github.javafaker.Address address16 = faker0.address;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name18 = faker17.name;
        com.github.javafaker.Options options19 = faker17.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService20 = faker17.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber21 = null;
        faker17.phoneNumber = phoneNumber21;
        com.github.javafaker.Name name23 = faker17.name();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name25 = faker24.name;
        com.github.javafaker.Options options26 = faker24.options;
        com.github.javafaker.Name name27 = faker24.name();
        com.github.javafaker.Hacker hacker28 = faker24.hacker();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book30 = null;
        faker29.book = book30;
        com.github.javafaker.Code code32 = faker29.code();
        faker24.code = code32;
        com.github.javafaker.Address address34 = faker24.address;
        faker17.address = address34;
        faker0.address = address34;
        java.lang.String str38 = faker0.regexify("DE");
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(randomService14);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(fakeValuesService20);
        org.junit.Assert.assertNotNull(name23);
        org.junit.Assert.assertNotNull(name25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(name27);
        org.junit.Assert.assertNotNull(hacker28);
        org.junit.Assert.assertNotNull(code32);
        org.junit.Assert.assertNotNull(address34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "DE" + "'", str38, "DE");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.App app4 = faker0.app;
        com.github.javafaker.Lorem lorem5 = null;
        faker0.lorem = lorem5;
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(app4);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Internet internet7 = faker6.internet;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name9 = faker8.name;
        com.github.javafaker.Options options10 = faker8.options;
        com.github.javafaker.Name name11 = faker8.name();
        com.github.javafaker.Code code12 = faker8.code;
        faker6.code = code12;
        com.github.javafaker.Number number14 = faker6.number;
        java.lang.String str16 = faker6.numerify("");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.addUnicodeLocaleAttribute("German");
        java.util.Locale.Builder builder5 = builder3.setLanguage("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setLanguage("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? ????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.util.Locale locale4 = locale0.stripExtensions();
        java.util.Locale locale7 = new java.util.Locale("French", "");
        java.lang.String str8 = locale4.getDisplayName(locale7);
        java.util.Random random9 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream12 = random9.doubles((double) (byte) 10, (double) '#');
        java.util.stream.LongStream longStream15 = random9.longs((long) 1, (long) (short) 100);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale4, random9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = locale4.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Japan" + "'", str2, "Japan");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
        org.junit.Assert.assertEquals(locale7.toString(), "french");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Japanese (Japan)" + "'", str8, "Japanese (Japan)");
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(longStream15);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.util.Locale locale2 = new java.util.Locale("en_US", "en_GB");
        java.lang.String str3 = locale2.getDisplayScript();
        org.junit.Assert.assertEquals(locale2.toString(), "en_us_EN_GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.service.RandomService randomService7 = faker6.randomService;
        com.github.javafaker.Code code8 = faker6.code();
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Random random10 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream13 = random10.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale9, random10);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name17 = faker16.name;
        com.github.javafaker.Options options18 = faker16.options;
        com.github.javafaker.Company company19 = faker16.company();
        faker15.company = company19;
        com.github.javafaker.Hacker hacker21 = faker15.hacker;
        com.github.javafaker.Company company22 = faker15.company;
        com.github.javafaker.Hacker hacker23 = faker15.hacker;
        java.util.Locale locale24 = java.util.Locale.FRANCE;
        java.util.Random random25 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream28 = random25.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(locale24, random25);
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random25);
        com.github.javafaker.service.RandomService randomService31 = faker30.randomService;
        faker15.randomService = randomService31;
        com.github.javafaker.Name name33 = faker15.name;
        faker6.name = name33;
        com.github.javafaker.Color color35 = faker6.color;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(randomService7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(name17);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(company19);
        org.junit.Assert.assertNotNull(hacker21);
        org.junit.Assert.assertNotNull(company22);
        org.junit.Assert.assertNotNull(hacker23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream28);
        org.junit.Assert.assertNotNull(randomService31);
        org.junit.Assert.assertNotNull(name33);
        org.junit.Assert.assertNotNull(color35);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("Germany");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setUnicodeLocaleKeyword("United Kingdom", "japonais");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: United Kingdom [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Internet internet7 = faker6.internet;
        com.github.javafaker.Name name8 = faker6.name();
        com.github.javafaker.Color color9 = faker6.color();
        com.github.javafaker.Name name10 = faker6.name;
        com.github.javafaker.Book book11 = faker6.book();
        com.github.javafaker.Number number12 = faker6.number;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(number12);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Internet internet2 = faker0.internet;
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Random random4 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream7 = random4.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale3, random4);
        com.github.javafaker.Business business9 = null;
        faker8.business = business9;
        com.github.javafaker.Book book11 = faker8.book;
        com.github.javafaker.Color color12 = faker8.color;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name14 = faker13.name;
        com.github.javafaker.Book book15 = faker13.book;
        com.github.javafaker.Company company16 = faker13.company();
        com.github.javafaker.Book book17 = faker13.book();
        com.github.javafaker.Code code18 = faker13.code();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.App app22 = faker19.app();
        com.github.javafaker.Options options23 = faker19.options;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name25 = faker24.name;
        com.github.javafaker.Options options26 = faker24.options;
        com.github.javafaker.Color color27 = faker24.color();
        faker19.color = color27;
        com.github.javafaker.Finance finance29 = faker19.finance;
        faker13.finance = finance29;
        faker8.finance = finance29;
        faker0.finance = finance29;
        com.github.javafaker.PhoneNumber phoneNumber33 = faker0.phoneNumber;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(name14);
        org.junit.Assert.assertNotNull(book15);
        org.junit.Assert.assertNotNull(company16);
        org.junit.Assert.assertNotNull(book17);
        org.junit.Assert.assertNotNull(code18);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(app22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(name25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(finance29);
        org.junit.Assert.assertNotNull(phoneNumber33);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name7 = faker6.name;
        com.github.javafaker.Options options8 = faker6.options;
        com.github.javafaker.App app9 = faker6.app();
        com.github.javafaker.Options options10 = faker6.options;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name12 = faker11.name;
        com.github.javafaker.Options options13 = faker11.options;
        com.github.javafaker.Color color14 = faker11.color();
        faker6.color = color14;
        com.github.javafaker.Finance finance16 = faker6.finance;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book18 = null;
        faker17.book = book18;
        java.util.Random random20 = null;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Number number22 = faker21.number;
        faker17.number = number22;
        faker6.number = number22;
        faker0.number = number22;
        com.github.javafaker.Finance finance26 = faker0.finance;
        com.github.javafaker.Address address27 = faker0.address();
        com.github.javafaker.PhoneNumber phoneNumber28 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(app9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(finance16);
        org.junit.Assert.assertNotNull(number22);
        org.junit.Assert.assertNotNull(finance26);
        org.junit.Assert.assertNotNull(address27);
        org.junit.Assert.assertNotNull(phoneNumber28);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Internet internet2 = faker0.internet;
        com.github.javafaker.Options options3 = null;
        faker0.options = options3;
        com.github.javafaker.Options options5 = faker0.options;
        com.github.javafaker.Business business6 = faker0.business;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        java.util.stream.LongStream longStream8 = random0.longs((long) 'u', (long) 'x');
        int int9 = random0.nextInt();
        int int10 = random0.nextInt();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 549125265 + "'", int9 == 549125265);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 732730024 + "'", int10 == 732730024);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        java.util.Locale locale9 = new java.util.Locale("", "");
        java.lang.String str10 = locale5.getDisplayVariant(locale9);
        java.util.Set<java.lang.Character> charSet11 = locale5.getExtensionKeys();
        java.util.Set<java.lang.String> strSet12 = locale5.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale14 = java.util.Locale.getDefault(category0);
        java.util.Locale locale15 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        double double2 = random1.nextDouble();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0, random1);
        boolean boolean5 = random1.nextBoolean();
        double double6 = random1.nextDouble();
        java.util.stream.LongStream longStream10 = random1.longs((long) (short) 100, (long) (-1150482841), (long) 22);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5828238667181209d + "'", double2 == 0.5828238667181209d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8202558817512906d + "'", double6 == 0.8202558817512906d);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber4 = null;
        faker0.phoneNumber = phoneNumber4;
        com.github.javafaker.Address address6 = faker0.address;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(address6);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        java.util.Locale.Builder builder9 = builder5.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder11 = builder5.setLanguageTag("CAN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder5.setVariant("\u30c9\u30a4\u30c4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = locale1.getDisplayCountry(locale2);
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2, random4);
        com.github.javafaker.App app6 = faker5.app;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = faker7.fakeValuesService;
        com.github.javafaker.service.RandomService randomService11 = null;
        faker7.randomService = randomService11;
        com.github.javafaker.Options options13 = faker7.options;
        com.github.javafaker.App app14 = faker7.app();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name16 = faker15.name;
        com.github.javafaker.Options options17 = faker15.options;
        com.github.javafaker.Color color18 = faker15.color();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService22 = faker19.fakeValuesService;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name24 = faker23.name;
        com.github.javafaker.Options options25 = faker23.options;
        com.github.javafaker.DateAndTime dateAndTime26 = faker23.date();
        faker19.dateAndTime = dateAndTime26;
        faker15.dateAndTime = dateAndTime26;
        faker7.dateAndTime = dateAndTime26;
        faker5.dateAndTime = dateAndTime26;
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(app6);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(fakeValuesService10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(app14);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(fakeValuesService22);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(dateAndTime26);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Japanisch", 0.22639477023394194d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=japanisch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.util.Locale locale2 = new java.util.Locale("fra", "allemand");
        org.junit.Assert.assertEquals(locale2.toString(), "fra_ALLEMAND");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.util.Random random1 = new java.util.Random(3590193204838811164L);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ALLEMAND");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str4 = locale3.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder4 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setLanguageTag("English (United Kingdom)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: English (United Kingdom) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        java.util.stream.IntStream intStream7 = random0.ints((long) '4');
        java.util.stream.LongStream longStream9 = random0.longs((long) '4');
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale1.getDisplayName(locale2);
        boolean boolean5 = locale1.hasExtensions();
        java.util.Set<java.lang.Character> charSet6 = locale1.getExtensionKeys();
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale1.getDisplayLanguage(locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)" + "'", str4, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charSet6);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        boolean boolean2 = locale1.hasExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1);
        java.lang.String str4 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English" + "'", str4, "English");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fra");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList9);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList20, filteringMode22);
        java.util.Locale locale26 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet27 = locale26.getExtensionKeys();
        java.util.Locale locale30 = new java.util.Locale("", "");
        java.lang.String str31 = locale26.getDisplayVariant(locale30);
        java.util.Set<java.lang.String> strSet32 = locale26.getUnicodeLocaleKeys();
        java.lang.String str33 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strSet32);
        java.util.Locale locale36 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet37 = locale36.getExtensionKeys();
        java.util.Locale locale40 = new java.util.Locale("", "");
        java.lang.String str41 = locale36.getDisplayVariant(locale40);
        java.util.Set<java.lang.String> strSet42 = locale36.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strSet42);
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        java.util.Locale.FilteringMode filteringMode52 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strList50, filteringMode52);
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList50);
        java.lang.String str55 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList50);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + filteringMode11 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode11.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode22.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(charSet27);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNotNull(charSet37);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + filteringMode52 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode52.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Business business2 = null;
        faker0.business = business2;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber;
        com.github.javafaker.App app5 = faker0.app();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale6, random7);
        com.github.javafaker.Business business12 = null;
        faker11.business = business12;
        java.lang.String str15 = faker11.bothify("\u4e2d\u56fd\u8a9e");
        com.github.javafaker.DateAndTime dateAndTime16 = faker11.date();
        faker0.dateAndTime = dateAndTime16;
        com.github.javafaker.Number number18 = faker0.number();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str15, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(dateAndTime16);
        org.junit.Assert.assertNotNull(number18);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleKeys();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.lang.String str6 = faker4.letterify("Japanisch");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Germany" + "'", str1, "Germany");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "German" + "'", str2, "German");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Japanisch" + "'", str6, "Japanisch");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber4 = null;
        faker0.phoneNumber = phoneNumber4;
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Number number7 = faker0.number;
        com.github.javafaker.Business business8 = faker0.business();
        com.github.javafaker.Name name9 = faker0.name();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(name9);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        java.util.Random random1 = new java.util.Random((long) '#');
        java.util.stream.LongStream longStream3 = random1.longs((long) 'a');
        boolean boolean4 = random1.nextBoolean();
        java.util.stream.IntStream intStream6 = random1.ints((long) 'u');
        java.util.stream.LongStream longStream9 = random1.longs((-4964420948893066024L), (long) (short) 1);
        boolean boolean10 = random1.nextBoolean();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        boolean boolean4 = locale1.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale1.getDisplayLanguage(locale5);
        java.util.Locale locale8 = new java.util.Locale("Germany");
        java.lang.String str9 = locale1.getDisplayScript(locale8);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals(locale8.toString(), "germany");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale6 = new java.util.Locale("");
        java.util.Locale.Builder builder7 = builder4.setLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.addUnicodeLocaleAttribute("germany_ANGLAIS_de");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: germany_ANGLAIS_de [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream4 = random0.longs((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16773659298889976d + "'", double1 == 0.16773659298889976d);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        java.util.Locale.Builder builder11 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder14 = builder7.setExtension('x', "anglais");
        java.util.Locale.Builder builder15 = builder14.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "anglais" + "'", str10, "anglais");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setLanguage("Japanese (Japan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: Japanese (Japan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        java.lang.String str13 = faker6.numerify("\u4e2d\u56fd\u8a9e");
        com.github.javafaker.App app14 = faker6.app;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str13, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(app14);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.util.Random random1 = new java.util.Random((long) 1);
        long long2 = random1.nextLong();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (short) 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream8 = random1.longs((long) (short) 1, (long) 732730024);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4964420948893066024L) + "'", long2 == (-4964420948893066024L));
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Locale locale12 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.util.Locale locale16 = new java.util.Locale("", "");
        java.lang.String str17 = locale12.getDisplayVariant(locale16);
        java.util.Set<java.lang.String> strSet18 = locale12.getUnicodeLocaleKeys();
        java.lang.String str19 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet18);
        java.util.Collection<java.lang.String> strCollection20 = null;
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.Locale.FilteringMode filteringMode29 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList27, filteringMode29);
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection20, filteringMode29);
        java.util.Locale locale32 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet33 = locale32.getExtensionKeys();
        java.lang.String str34 = locale32.getDisplayCountry();
        java.util.Locale locale35 = locale32.stripExtensions();
        java.util.Locale locale36 = locale32.stripExtensions();
        java.util.Locale locale39 = new java.util.Locale("French", "");
        java.lang.String str40 = locale36.getDisplayName(locale39);
        java.util.Set<java.lang.String> strSet41 = locale39.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet41);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + filteringMode29 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode29.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Japan" + "'", str34, "Japan");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ja_JP");
        org.junit.Assert.assertEquals(locale39.toString(), "french");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Japanese (Japan)" + "'", str40, "Japanese (Japan)");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.util.Random random1 = new java.util.Random((long) 'u');
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        java.util.stream.IntStream intStream5 = random1.ints(1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream9 = random1.ints((long) 1996627648, (int) (short) 0, (-1150482841));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Random random4 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream7 = random4.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale3, random4);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random4);
        random4.setSeed(100L);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Germany" + "'", str1, "Germany");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) 1, (long) (short) 100);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random0);
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale8);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Random random13 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream16 = random13.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale12, random13);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.Company company22 = faker19.company();
        faker18.company = company22;
        com.github.javafaker.Hacker hacker24 = faker18.hacker;
        com.github.javafaker.Company company25 = faker18.company;
        com.github.javafaker.Hacker hacker26 = faker18.hacker;
        faker11.hacker = hacker26;
        faker7.hacker = hacker26;
        com.github.javafaker.Options options29 = faker7.options;
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "anglais" + "'", str10, "anglais");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(company22);
        org.junit.Assert.assertNotNull(hacker24);
        org.junit.Assert.assertNotNull(company25);
        org.junit.Assert.assertNotNull(hacker26);
        org.junit.Assert.assertNotNull(options29);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Code code5 = faker0.code();
        com.github.javafaker.Hacker hacker6 = faker0.hacker();
        com.github.javafaker.Lorem lorem7 = faker0.lorem;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(book4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.util.Locale locale4 = locale0.stripExtensions();
        java.util.Locale locale5 = java.util.Locale.UK;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale5);
        java.lang.String str7 = locale0.getDisplayCountry(locale5);
        java.lang.String str8 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Japan" + "'", str2, "Japan");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Japan" + "'", str7, "Japan");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.Color color8 = faker5.color();
        faker0.color = color8;
        com.github.javafaker.Finance finance10 = faker0.finance;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book12 = null;
        faker11.book = book12;
        com.github.javafaker.Code code14 = faker11.code();
        com.github.javafaker.Lorem lorem15 = faker11.lorem;
        java.lang.String str17 = faker11.numerify("Chinese (China)");
        com.github.javafaker.Color color18 = faker11.color;
        faker0.color = color18;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(code14);
        org.junit.Assert.assertNotNull(lorem15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Chinese (China)" + "'", str17, "Chinese (China)");
        org.junit.Assert.assertNotNull(color18);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Business business2 = null;
        faker0.business = business2;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber;
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.Book book6 = faker0.book;
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Random random8 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream11 = random8.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale7, random8);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random8);
        java.util.Random random14 = new java.util.Random();
        double double15 = random14.nextDouble();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name18 = faker17.name;
        com.github.javafaker.Options options19 = faker17.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService20 = faker17.fakeValuesService;
        com.github.javafaker.service.RandomService randomService21 = null;
        faker17.randomService = randomService21;
        com.github.javafaker.DateAndTime dateAndTime23 = faker17.date();
        faker16.dateAndTime = dateAndTime23;
        faker13.dateAndTime = dateAndTime23;
        faker0.dateAndTime = dateAndTime23;
        com.github.javafaker.App app27 = faker0.app();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream11);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.4505805409522561d + "'", double15 == 0.4505805409522561d);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(fakeValuesService20);
        org.junit.Assert.assertNotNull(dateAndTime23);
        org.junit.Assert.assertNotNull(app27);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name4 = faker3.name;
        com.github.javafaker.Business business5 = null;
        faker3.business = business5;
        com.github.javafaker.Company company7 = faker3.company;
        faker0.company = company7;
        com.github.javafaker.Code code9 = faker0.code;
        com.github.javafaker.App app10 = faker0.app;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNotNull(app10);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        com.github.javafaker.Book book8 = faker5.book;
        com.github.javafaker.Color color9 = faker5.color;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name11 = faker10.name;
        com.github.javafaker.Book book12 = faker10.book;
        com.github.javafaker.Company company13 = faker10.company();
        com.github.javafaker.Book book14 = faker10.book();
        com.github.javafaker.Code code15 = faker10.code();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name17 = faker16.name;
        com.github.javafaker.Options options18 = faker16.options;
        com.github.javafaker.App app19 = faker16.app();
        com.github.javafaker.Options options20 = faker16.options;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name22 = faker21.name;
        com.github.javafaker.Options options23 = faker21.options;
        com.github.javafaker.Color color24 = faker21.color();
        faker16.color = color24;
        com.github.javafaker.Finance finance26 = faker16.finance;
        faker10.finance = finance26;
        faker5.finance = finance26;
        com.github.javafaker.Number number29 = faker5.number;
        com.github.javafaker.DateAndTime dateAndTime30 = faker5.date();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(book12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertNotNull(name17);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(app19);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(finance26);
        org.junit.Assert.assertNotNull(number29);
        org.junit.Assert.assertNotNull(dateAndTime30);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) '4', (long) (short) 100);
        java.util.stream.LongStream longStream10 = random0.longs((long) 431529176, (long) (-1188188233), (long) 8);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.util.Locale locale2 = new java.util.Locale("Chinese (China)", "United Kingdom");
        org.junit.Assert.assertEquals(locale2.toString(), "chinese (china)_UNITED KINGDOM");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        java.util.Locale locale1 = new java.util.Locale("en");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en" + "'", str2, "en");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap14);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.Locale.FilteringMode filteringMode24 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList22, filteringMode24);
        java.util.Locale locale28 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet29 = locale28.getExtensionKeys();
        java.util.Locale locale32 = new java.util.Locale("", "");
        java.lang.String str33 = locale28.getDisplayVariant(locale32);
        java.util.Set<java.lang.String> strSet34 = locale28.getUnicodeLocaleKeys();
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strSet34);
        java.lang.String str36 = java.util.Locale.lookupTag(languageRangeList15, (java.util.Collection<java.lang.String>) strSet34);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.util.Locale.FilteringMode filteringMode45 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.lang.String>) strList43, filteringMode45);
        java.util.Locale locale49 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet50 = locale49.getExtensionKeys();
        java.util.Locale locale53 = new java.util.Locale("", "");
        java.lang.String str54 = locale49.getDisplayVariant(locale53);
        java.util.Set<java.lang.String> strSet55 = locale49.getUnicodeLocaleKeys();
        java.lang.String str56 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.lang.String>) strSet55);
        java.util.Locale locale59 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet60 = locale59.getExtensionKeys();
        java.util.Locale locale63 = new java.util.Locale("", "");
        java.lang.String str64 = locale59.getDisplayVariant(locale63);
        java.util.Set<java.lang.String> strSet65 = locale59.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.lang.String>) strSet65);
        java.util.Locale.LanguageRange[] languageRangeArray67 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList68 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList68, languageRangeArray67);
        java.lang.String[] strArray72 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        java.util.Locale.FilteringMode filteringMode75 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, (java.util.Collection<java.lang.String>) strList73, filteringMode75);
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.lang.String>) strList73);
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags(languageRangeList15, (java.util.Collection<java.lang.String>) strList73);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + filteringMode11 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode11.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + filteringMode24 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode24.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(charSet29);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + filteringMode45 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode45.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertNotNull(charSet50);
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertNotNull(charSet60);
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(languageRangeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + filteringMode75 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode75.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strList78);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)", 0.5344331531856584d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?? (?????)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleKeys();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Set<java.lang.Character> charSet5 = locale0.getExtensionKeys();
        java.util.Set<java.lang.String> strSet6 = locale0.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Germany" + "'", str1, "Germany");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "German" + "'", str2, "German");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Name name5 = faker0.name;
        com.github.javafaker.App app6 = faker0.app;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Book book9 = faker7.book;
        com.github.javafaker.Company company10 = faker7.company();
        com.github.javafaker.Book book11 = faker7.book();
        com.github.javafaker.Code code12 = faker7.code();
        com.github.javafaker.Hacker hacker13 = faker7.hacker();
        faker0.hacker = hacker13;
        com.github.javafaker.App app15 = faker0.app;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(app6);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(hacker13);
        org.junit.Assert.assertNotNull(app15);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("French", 0.7281907524383029d);
        double double3 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7281907524383029d + "'", double3 == 0.7281907524383029d);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("french", 0.20659165162610316d);
        double double3 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.20659165162610316d + "'", double3 == 0.20659165162610316d);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.IntStream intStream5 = random1.ints((long) (byte) 100, (int) (byte) 1, (int) ' ');
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.DateAndTime dateAndTime7 = faker6.date();
        com.github.javafaker.DateAndTime dateAndTime8 = faker6.date();
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.util.Random random1 = new java.util.Random((long) 1996627648);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Code code5 = faker0.code();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name7 = faker6.name;
        com.github.javafaker.Options options8 = faker6.options;
        com.github.javafaker.Name name9 = faker6.name();
        com.github.javafaker.Hacker hacker10 = faker6.hacker();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book12 = null;
        faker11.book = book12;
        com.github.javafaker.Code code14 = faker11.code();
        faker6.code = code14;
        com.github.javafaker.App app16 = faker6.app();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name18 = faker17.name;
        com.github.javafaker.Options options19 = faker17.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService20 = faker17.fakeValuesService;
        com.github.javafaker.service.RandomService randomService21 = null;
        faker17.randomService = randomService21;
        com.github.javafaker.Options options23 = faker17.options;
        com.github.javafaker.App app24 = faker17.app();
        faker6.app = app24;
        com.github.javafaker.Lorem lorem26 = faker6.lorem();
        faker0.lorem = lorem26;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(book4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(hacker10);
        org.junit.Assert.assertNotNull(code14);
        org.junit.Assert.assertNotNull(app16);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(fakeValuesService20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(app24);
        org.junit.Assert.assertNotNull(lorem26);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Options options3 = faker0.options;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(options3);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder7 = builder0.addUnicodeLocaleAttribute("und");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setExtension(' ', "China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguage("China");
        java.util.Locale.Builder builder5 = builder3.setVariant("allemand");
        java.util.Locale locale6 = builder3.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "china__allemand");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.util.Locale locale3 = new java.util.Locale("Japanese", "de-DE", "und");
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.util.Locale locale6 = java.util.Locale.getDefault(category4);
        java.util.Locale locale9 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.util.Locale locale13 = new java.util.Locale("", "");
        java.lang.String str14 = locale9.getDisplayVariant(locale13);
        java.util.Set<java.lang.Character> charSet15 = locale9.getExtensionKeys();
        java.util.Set<java.lang.String> strSet16 = locale9.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category4, locale9);
        java.util.Locale locale18 = java.util.Locale.getDefault(category4);
        java.lang.String str19 = locale3.getDisplayScript(locale18);
        org.junit.Assert.assertEquals(locale3.toString(), "japanese_DE-DE_und");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.util.Random random1 = new java.util.Random((long) 'u');
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        double double5 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.2981846735357514d + "'", double5 == 1.2981846735357514d);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name4 = faker3.name;
        com.github.javafaker.Business business5 = null;
        faker3.business = business5;
        com.github.javafaker.Company company7 = faker3.company;
        faker0.company = company7;
        java.lang.String str10 = faker0.regexify("FR");
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FR" + "'", str10, "FR");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        random0.setSeed((long) '#');
        double double6 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles();
        java.util.stream.LongStream longStream11 = random0.longs((long) 3, (-8113469208120271707L), (long) (-1193959466));
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7281907524383029d + "'", double6 == 0.7281907524383029d);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.util.Locale locale6 = new java.util.Locale("", "");
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        java.util.Set<java.lang.Character> charSet8 = locale2.getExtensionKeys();
        java.lang.String str9 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale1.getDisplayName(locale2);
        java.lang.String str5 = locale1.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)" + "'", str4, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GBR" + "'", str5, "GBR");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        boolean boolean2 = locale1.hasExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber;
        com.github.javafaker.Address address5 = faker3.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(address5);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        java.util.Random random1 = new java.util.Random((-1L));
        double double2 = random1.nextGaussian();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7853314409882288d + "'", double2 == 1.7853314409882288d);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        java.lang.String str9 = faker5.bothify("\u4e2d\u56fd\u8a9e");
        com.github.javafaker.App app10 = faker5.app();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str9, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(app10);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguage("China");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("\u82f1\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        java.lang.String str3 = faker0.letterify("hi!");
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Number number6 = faker5.number;
        faker0.number = number6;
        com.github.javafaker.Name name8 = faker0.name;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(name8);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale locale4 = new java.util.Locale("Japan");
        java.util.Locale.Builder builder5 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder5.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setLanguageTag("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ?? ????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "japan");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("Germany");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.removeUnicodeLocaleAttribute("en_US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en_US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        java.util.Random random1 = new java.util.Random((long) (byte) 1);
        boolean boolean2 = random1.nextBoolean();
        float float3 = random1.nextFloat();
        random1.setSeed((long) 6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.100473166f + "'", float3 == 0.100473166f);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        java.util.Locale locale3 = new java.util.Locale("Chinese", "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))", "English (Canada)");
        java.lang.String str4 = locale3.getVariant();
        java.util.Random random6 = new java.util.Random((long) '#');
        java.util.stream.LongStream longStream8 = random6.longs((long) 'a');
        boolean boolean9 = random6.nextBoolean();
        java.util.stream.IntStream intStream11 = random6.ints((long) 'u');
        random6.setSeed((-8113469208120271707L));
        random6.setSeed(3162505054923319084L);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale3, random6);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: chinese_JAPAN (DE-DE,?? (?????))_English (Canada) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))_English (Canada)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English (Canada)" + "'", str4, "English (Canada)");
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str4 = locale3.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        java.util.Random random1 = new java.util.Random((-1L));
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Name name3 = faker2.name;
        org.junit.Assert.assertNotNull(name3);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name3 = faker2.name;
        com.github.javafaker.Business business4 = null;
        faker2.business = business4;
        com.github.javafaker.PhoneNumber phoneNumber6 = faker2.phoneNumber;
        com.github.javafaker.App app7 = faker2.app();
        com.github.javafaker.Book book8 = faker2.book;
        faker1.book = book8;
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale10);
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.util.Random random15 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream18 = random15.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale14, random15);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name22 = faker21.name;
        com.github.javafaker.Options options23 = faker21.options;
        com.github.javafaker.Company company24 = faker21.company();
        faker20.company = company24;
        com.github.javafaker.Hacker hacker26 = faker20.hacker;
        com.github.javafaker.Company company27 = faker20.company;
        com.github.javafaker.Hacker hacker28 = faker20.hacker;
        faker13.hacker = hacker28;
        com.github.javafaker.Finance finance30 = faker13.finance;
        faker1.finance = finance30;
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.util.Locale locale33 = java.util.Locale.FRANCE;
        java.lang.String str34 = locale32.getDisplayName(locale33);
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(locale32);
        java.util.Locale locale36 = java.util.Locale.FRANCE;
        java.util.Random random37 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream40 = random37.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(locale36, random37);
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name44 = faker43.name;
        com.github.javafaker.Options options45 = faker43.options;
        com.github.javafaker.Company company46 = faker43.company();
        faker42.company = company46;
        com.github.javafaker.Hacker hacker48 = faker42.hacker;
        com.github.javafaker.Company company49 = faker42.company;
        com.github.javafaker.Hacker hacker50 = faker42.hacker;
        faker35.hacker = hacker50;
        com.github.javafaker.Internet internet52 = faker35.internet;
        faker1.internet = internet52;
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "anglais" + "'", str12, "anglais");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(company24);
        org.junit.Assert.assertNotNull(hacker26);
        org.junit.Assert.assertNotNull(company27);
        org.junit.Assert.assertNotNull(hacker28);
        org.junit.Assert.assertNotNull(finance30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "anglais" + "'", str34, "anglais");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream40);
        org.junit.Assert.assertNotNull(name44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(company46);
        org.junit.Assert.assertNotNull(hacker48);
        org.junit.Assert.assertNotNull(company49);
        org.junit.Assert.assertNotNull(hacker50);
        org.junit.Assert.assertNotNull(internet52);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.Company company13 = faker6.company;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name15 = faker14.name;
        com.github.javafaker.Options options16 = faker14.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService17 = faker14.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber18 = null;
        faker14.phoneNumber = phoneNumber18;
        com.github.javafaker.Name name20 = faker14.name();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name22 = faker21.name;
        com.github.javafaker.Options options23 = faker21.options;
        com.github.javafaker.Name name24 = faker21.name();
        com.github.javafaker.Hacker hacker25 = faker21.hacker();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book27 = null;
        faker26.book = book27;
        com.github.javafaker.Code code29 = faker26.code();
        faker21.code = code29;
        com.github.javafaker.Address address31 = faker21.address;
        faker14.address = address31;
        faker6.address = address31;
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book35 = null;
        faker34.book = book35;
        java.util.Random random37 = null;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Number number39 = faker38.number;
        faker34.number = number39;
        faker6.number = number39;
        com.github.javafaker.Lorem lorem42 = faker6.lorem();
        java.lang.String str44 = faker6.letterify("DE");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(fakeValuesService17);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(hacker25);
        org.junit.Assert.assertNotNull(code29);
        org.junit.Assert.assertNotNull(address31);
        org.junit.Assert.assertNotNull(number39);
        org.junit.Assert.assertNotNull(lorem42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "DE" + "'", str44, "DE");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("French", 0.7281907524383029d);
        boolean boolean4 = languageRange2.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        com.github.javafaker.App app7 = faker0.app();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name9 = faker8.name;
        com.github.javafaker.Options options10 = faker8.options;
        com.github.javafaker.Color color11 = faker8.color();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name13 = faker12.name;
        com.github.javafaker.Options options14 = faker12.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService15 = faker12.fakeValuesService;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name17 = faker16.name;
        com.github.javafaker.Options options18 = faker16.options;
        com.github.javafaker.DateAndTime dateAndTime19 = faker16.date();
        faker12.dateAndTime = dateAndTime19;
        faker8.dateAndTime = dateAndTime19;
        faker0.dateAndTime = dateAndTime19;
        com.github.javafaker.PhoneNumber phoneNumber23 = faker0.phoneNumber;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(name13);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(fakeValuesService15);
        org.junit.Assert.assertNotNull(name17);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(dateAndTime19);
        org.junit.Assert.assertNotNull(phoneNumber23);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        java.util.Locale locale1 = new java.util.Locale("ja");
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale1.getDisplayCountry(locale3);
        java.lang.String str5 = locale3.getCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        java.util.Locale locale2 = new java.util.Locale("CAN", "Chinesisch");
        org.junit.Assert.assertEquals(locale2.toString(), "can_CHINESISCH");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.util.Random random1 = new java.util.Random((long) '#');
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) (short) 10, (double) (-1188188233), (double) (byte) 1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.DateAndTime dateAndTime3 = faker2.dateAndTime;
        com.github.javafaker.Business business4 = faker2.business();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(business4);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber4 = null;
        faker0.phoneNumber = phoneNumber4;
        com.github.javafaker.Name name6 = faker0.name();
        java.lang.String str8 = faker0.bothify("\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str8, "\u4e2d\u56fd\u8a9e");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        java.util.Locale locale0 = java.util.Locale.UK;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Code code2 = faker1.code;
        com.github.javafaker.Hacker hacker3 = faker1.hacker;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(hacker3);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.IntStream intStream5 = random1.ints((long) (byte) 100, (int) (byte) 1, (int) ' ');
        java.util.stream.LongStream longStream6 = random1.longs();
        java.util.stream.DoubleStream doubleStream7 = random1.doubles();
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Locale locale12 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.util.Locale locale16 = new java.util.Locale("", "");
        java.lang.String str17 = locale12.getDisplayVariant(locale16);
        java.util.Set<java.lang.String> strSet18 = locale12.getUnicodeLocaleKeys();
        java.lang.String str19 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet18);
        java.util.Locale locale22 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet23 = locale22.getExtensionKeys();
        java.util.Locale locale26 = new java.util.Locale("", "");
        java.lang.String str27 = locale22.getDisplayVariant(locale26);
        java.util.Set<java.lang.String> strSet28 = locale22.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet28);
        java.util.Locale locale30 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode32 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet31, filteringMode32);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList40, filteringMode42);
        java.util.Locale locale46 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet47 = locale46.getExtensionKeys();
        java.util.Locale locale50 = new java.util.Locale("", "");
        java.lang.String str51 = locale46.getDisplayVariant(locale50);
        java.util.Set<java.lang.String> strSet52 = locale46.getUnicodeLocaleKeys();
        java.lang.String str53 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strSet52);
        java.util.Locale locale56 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet57 = locale56.getExtensionKeys();
        java.util.Locale locale60 = new java.util.Locale("", "");
        java.lang.String str61 = locale56.getDisplayVariant(locale60);
        java.util.Set<java.lang.String> strSet62 = locale56.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strSet62);
        java.util.Locale locale64 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet65 = locale64.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode66 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strSet65, filteringMode66);
        java.util.Locale.FilteringMode filteringMode68 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList69 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet65, filteringMode68);
        java.util.Locale locale72 = new java.util.Locale("", "");
        java.util.Set<java.lang.String> strSet73 = locale72.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet73);
        java.util.Locale.LanguageRange[] languageRangeArray75 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList76 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList76, languageRangeArray75);
        java.lang.String[] strArray80 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        java.util.Locale.FilteringMode filteringMode83 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList76, (java.util.Collection<java.lang.String>) strList81, filteringMode83);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap85 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList86 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList76, strMap85);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap87 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList88 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList86, strMap87);
        java.util.Locale locale90 = new java.util.Locale("hi!");
        java.util.Locale locale91 = java.util.Locale.GERMANY;
        java.lang.String str92 = locale90.getDisplayVariant(locale91);
        java.util.Set<java.lang.Character> charSet93 = locale90.getExtensionKeys();
        java.util.Set<java.lang.String> strSet94 = locale90.getUnicodeLocaleAttributes();
        java.lang.String str95 = java.util.Locale.lookupTag(languageRangeList86, (java.util.Collection<java.lang.String>) strSet94);
        java.util.Locale.FilteringMode filteringMode96 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList97 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet94, filteringMode96);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(charSet23);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + filteringMode32 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode32.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode42.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertNotNull(charSet47);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertNotNull(charSet57);
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertTrue("'" + filteringMode66 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode66.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertTrue("'" + filteringMode68 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode68.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertEquals(locale72.toString(), "");
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(languageRangeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + filteringMode83 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode83.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(languageRangeList86);
        org.junit.Assert.assertNotNull(languageRangeList88);
        org.junit.Assert.assertEquals(locale90.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertNotNull(charSet93);
        org.junit.Assert.assertNotNull(strSet94);
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertTrue("'" + filteringMode96 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode96.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList97);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.lang.String str6 = locale3.getLanguage();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Set<java.lang.String> strSet8 = locale3.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "anglais" + "'", str5, "anglais");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Options options4 = faker3.options;
        com.github.javafaker.Business business5 = faker3.business;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais" + "'", str2, "anglais");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.Company company13 = faker6.company;
        com.github.javafaker.Hacker hacker14 = faker6.hacker;
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.util.Random random16 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream19 = random16.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale15, random16);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.service.RandomService randomService22 = faker21.randomService;
        faker6.randomService = randomService22;
        com.github.javafaker.Hacker hacker24 = faker6.hacker;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(hacker14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertNotNull(randomService22);
        org.junit.Assert.assertNotNull(hacker24);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.Company company13 = faker6.company;
        com.github.javafaker.Book book14 = faker6.book();
        java.lang.String str16 = faker6.numerify("");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        java.lang.String str9 = faker5.bothify("\u4e2d\u56fd\u8a9e");
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name11 = faker10.name;
        com.github.javafaker.Options options12 = faker10.options;
        com.github.javafaker.App app13 = faker10.app();
        com.github.javafaker.Options options14 = faker10.options;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name16 = faker15.name;
        com.github.javafaker.Options options17 = faker15.options;
        com.github.javafaker.Color color18 = faker15.color();
        faker10.color = color18;
        com.github.javafaker.Finance finance20 = faker10.finance;
        com.github.javafaker.App app21 = faker10.app;
        com.github.javafaker.Options options22 = faker10.options;
        faker5.options = options22;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str9, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(app13);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(finance20);
        org.junit.Assert.assertNotNull(app21);
        org.junit.Assert.assertNotNull(options22);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder5.setExtension(' ', "\u4e2d\u56fd\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book8 = null;
        faker7.book = book8;
        java.lang.String str11 = faker7.bothify("Germany");
        com.github.javafaker.Business business12 = faker7.business;
        faker0.business = business12;
        java.lang.String str15 = faker0.regexify("German");
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name17 = faker16.name;
        com.github.javafaker.Options options18 = faker16.options;
        com.github.javafaker.App app19 = faker16.app();
        com.github.javafaker.Options options20 = faker16.options;
        com.github.javafaker.Options options21 = faker16.options();
        com.github.javafaker.Name name22 = faker16.name();
        com.github.javafaker.Finance finance23 = faker16.finance();
        faker0.finance = finance23;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Germany" + "'", str11, "Germany");
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "German" + "'", str15, "German");
        org.junit.Assert.assertNotNull(name17);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(app19);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(finance23);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Internet internet2 = faker0.internet;
        com.github.javafaker.Code code3 = faker0.code();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(code3);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.Company company13 = faker6.company;
        com.github.javafaker.Hacker hacker14 = faker6.hacker;
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.util.Random random16 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream19 = random16.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale15, random16);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.service.RandomService randomService22 = faker21.randomService;
        faker6.randomService = randomService22;
        com.github.javafaker.Code code24 = faker6.code;
        com.github.javafaker.App app25 = faker6.app;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(hacker14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertNotNull(randomService22);
        org.junit.Assert.assertNotNull(code24);
        org.junit.Assert.assertNotNull(app25);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.Code code4 = faker0.code;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(code4);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream12 = random7.doubles((long) (short) 1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService14 = faker13.randomService;
        faker0.randomService = randomService14;
        com.github.javafaker.Business business16 = faker0.business();
        com.github.javafaker.App app17 = faker0.app;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name19 = faker18.name;
        java.lang.String str21 = faker18.letterify("hi!");
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name23 = faker22.name;
        com.github.javafaker.Options options24 = faker22.options;
        com.github.javafaker.App app25 = faker22.app();
        faker18.app = app25;
        faker0.app = app25;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(randomService14);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertNotNull(app17);
        org.junit.Assert.assertNotNull(name19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(name23);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertNotNull(app25);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.Company company13 = faker6.company;
        com.github.javafaker.Hacker hacker14 = faker6.hacker;
        java.lang.String str16 = faker6.numerify("German (Germany)");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(hacker14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "German (Germany)" + "'", str16, "German (Germany)");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale2);
        java.lang.String str5 = faker3.numerify("China");
        java.lang.String str7 = faker3.bothify("ANGLAIS");
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "China" + "'", str5, "China");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ANGLAIS" + "'", str7, "ANGLAIS");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles(0.7281907524383029d, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream8 = random1.longs((long) 549125265, (long) 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ANGLAIS");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = null;
        java.lang.String str2 = locale0.getDisplayVariant(locale1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream12 = random7.doubles((long) (short) 1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService14 = faker13.randomService;
        faker0.randomService = randomService14;
        com.github.javafaker.Business business16 = faker0.business();
        com.github.javafaker.service.FakeValuesService fakeValuesService17 = null;
        faker0.fakeValuesService = fakeValuesService17;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(randomService14);
        org.junit.Assert.assertNotNull(business16);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        java.util.Locale locale3 = new java.util.Locale("japan", "de-DE", "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.lang.String str8 = locale4.getDisplayName(locale6);
        java.lang.String str9 = locale4.toLanguageTag();
        java.lang.String str10 = locale3.getDisplayName(locale4);
        java.lang.String str11 = locale4.getDisplayCountry();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "anglais" + "'", str7, "anglais");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "allemand" + "'", str8, "allemand");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "de" + "'", str9, "de");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))" + "'", str10, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("Japan");
        java.util.Locale.Builder builder9 = builder7.setLanguage("allemand");
        java.util.Locale.Builder builder10 = builder7.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.dateAndTime;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book8 = null;
        faker7.book = book8;
        com.github.javafaker.Company company10 = faker7.company();
        faker0.company = company10;
        com.github.javafaker.Internet internet12 = faker0.internet();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(book4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(internet12);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("german (germany)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=german (germany)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Number number2 = faker1.number;
        com.github.javafaker.App app3 = faker1.app;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker1.phoneNumber;
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(phoneNumber4);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        com.github.javafaker.Finance finance8 = faker5.finance();
        com.github.javafaker.Number number9 = faker5.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale5 = locale3.stripExtensions();
        java.util.Locale.setDefault(category0, locale5);
        java.util.Random random8 = new java.util.Random((long) (byte) 1);
        boolean boolean9 = random8.nextBoolean();
        float float10 = random8.nextFloat();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random8);
        int int13 = random8.nextInt(25);
        int int15 = random8.nextInt((int) (byte) 10);
        boolean boolean16 = random8.nextBoolean();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale5, random8);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.100473166f + "'", float10 == 0.100473166f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 22 + "'", int13 == 22);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("allemand");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "allemand" + "'", str3, "allemand");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        java.lang.String str4 = faker0.bothify("French");
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Business business7 = null;
        faker5.business = business7;
        com.github.javafaker.Number number9 = faker5.number();
        faker0.number = number9;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "French" + "'", str4, "French");
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) 1, (long) (short) 100);
        boolean boolean7 = random0.nextBoolean();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.service.RandomService randomService7 = faker6.randomService;
        com.github.javafaker.Name name8 = faker6.name();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book10 = null;
        faker9.book = book10;
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Number number14 = faker13.number;
        faker9.number = number14;
        com.github.javafaker.App app16 = faker9.app;
        faker6.app = app16;
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(randomService7);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(app16);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Deutsch (Deutschland)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=deutsch (deutschland)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.util.Locale locale2 = new java.util.Locale("de-DE", "\u82f1\u8a9e");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u82f1\u8a9e");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        java.util.Random random1 = new java.util.Random((long) (-1193959466));
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.util.Locale locale2 = new java.util.Locale("ANGLAIS", "\u4e2d\u56fd\u8a9e");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u56fd\u8a9e");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Business business9 = null;
        faker7.business = business9;
        com.github.javafaker.PhoneNumber phoneNumber11 = faker7.phoneNumber;
        com.github.javafaker.App app12 = faker7.app();
        com.github.javafaker.Book book13 = faker7.book;
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.util.Random random15 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream18 = random15.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale14, random15);
        com.github.javafaker.Business business20 = null;
        faker19.business = business20;
        com.github.javafaker.Book book22 = faker19.book;
        com.github.javafaker.Company company23 = faker19.company;
        faker7.company = company23;
        faker6.company = company23;
        com.github.javafaker.Finance finance26 = faker6.finance;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(phoneNumber11);
        org.junit.Assert.assertNotNull(app12);
        org.junit.Assert.assertNotNull(book13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(book22);
        org.junit.Assert.assertNotNull(company23);
        org.junit.Assert.assertNotNull(finance26);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        double double7 = random1.nextDouble();
        long long8 = random1.nextLong();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6676739265218724d + "'", double7 == 0.6676739265218724d);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-8845213925386835238L) + "'", long8 == (-8845213925386835238L));
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.IntStream intStream3 = random1.ints();
        java.util.stream.LongStream longStream4 = random1.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = random1.doubles((-4964420948893066024L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Lorem lorem3 = faker0.lorem;
        com.github.javafaker.Business business4 = faker0.business();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(business4);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.addUnicodeLocaleAttribute("German");
        java.util.Locale locale4 = builder0.build();
        java.util.Locale locale5 = builder0.build();
        java.lang.String str6 = locale5.getDisplayCountry();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Chinese");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.Locale.FilteringMode filteringMode13 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList11, filteringMode13);
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList11);
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap17);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + filteringMode13 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode13.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(languageRangeList18);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        java.util.Locale locale2 = new java.util.Locale("English (United Kingdom)", "CAN");
        org.junit.Assert.assertEquals(locale2.toString(), "english (united kingdom)_CAN");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.lang.String str5 = locale2.getExtension('a');
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        java.util.Random random1 = new java.util.Random((long) 'u');
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        random1.setSeed(0L);
        long long5 = random1.nextLong();
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-4962768465676381896L) + "'", long5 == (-4962768465676381896L));
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Business business2 = null;
        faker0.business = business2;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber;
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.Code code6 = faker0.code();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book8 = null;
        faker7.book = book8;
        java.lang.String str11 = faker7.bothify("Germany");
        com.github.javafaker.Business business12 = faker7.business;
        faker0.business = business12;
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.util.Random random15 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream18 = random15.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale14, random15);
        com.github.javafaker.Business business20 = null;
        faker19.business = business20;
        com.github.javafaker.Book book22 = faker19.book;
        faker0.book = book22;
        com.github.javafaker.Company company24 = faker0.company();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Germany" + "'", str11, "Germany");
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(book22);
        org.junit.Assert.assertNotNull(company24);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Germany");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setVariant("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale2);
        java.util.Locale locale6 = new java.util.Locale("hi!");
        java.lang.String str7 = locale6.getISO3Language();
        java.util.Set<java.lang.Character> charSet8 = locale6.getExtensionKeys();
        boolean boolean9 = locale6.hasExtensions();
        java.lang.String str10 = locale6.getScript();
        java.lang.String str11 = locale2.getDisplayVariant(locale6);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.DateAndTime dateAndTime3 = faker2.dateAndTime;
        com.github.javafaker.service.RandomService randomService4 = faker2.randomService;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(randomService4);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.util.Random random1 = new java.util.Random((long) 'x');
        java.util.stream.LongStream longStream2 = random1.longs();
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        java.util.Locale.Builder builder11 = builder7.setLocale(locale8);
        java.util.Locale locale12 = builder11.build();
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        boolean boolean15 = locale13.hasExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "anglais" + "'", str10, "anglais");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book9 = null;
        faker8.book = book9;
        com.github.javafaker.Code code11 = faker8.code();
        faker5.code = code11;
        com.github.javafaker.Finance finance13 = faker5.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(finance13);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale2.getDisplayLanguage(locale4);
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        java.lang.String str7 = locale2.getDisplayScript();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.util.Locale locale3 = new java.util.Locale("Japanese", "German (Germany)", "ALLEMAND");
        java.lang.String str4 = locale3.getScript();
        org.junit.Assert.assertEquals(locale3.toString(), "japanese_GERMAN (GERMANY)_ALLEMAND");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Company company4 = faker0.company;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(company4);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        java.util.Random random1 = new java.util.Random((-1L));
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream5 = random1.ints(22, (-1150482841));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream12 = random7.doubles((long) (short) 1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService14 = faker13.randomService;
        faker0.randomService = randomService14;
        com.github.javafaker.Business business16 = faker0.business();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name18 = faker17.name;
        com.github.javafaker.Internet internet19 = faker17.internet;
        com.github.javafaker.service.RandomService randomService20 = faker17.randomService;
        faker0.randomService = randomService20;
        com.github.javafaker.Color color22 = faker0.color;
        com.github.javafaker.Internet internet23 = faker0.internet();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(randomService14);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(internet19);
        org.junit.Assert.assertNotNull(randomService20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(internet23);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        java.util.Locale locale3 = new java.util.Locale("japan", "de-DE", "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.lang.String str8 = locale4.getDisplayName(locale6);
        java.lang.String str9 = locale4.toLanguageTag();
        java.lang.String str10 = locale3.getDisplayName(locale4);
        java.lang.String str11 = locale3.getDisplayName();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "anglais" + "'", str7, "anglais");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "allemand" + "'", str8, "allemand");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "de" + "'", str9, "de");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))" + "'", str10, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))" + "'", str11, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        com.github.javafaker.App app7 = faker0.app();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name9 = faker8.name;
        com.github.javafaker.Options options10 = faker8.options;
        com.github.javafaker.Color color11 = faker8.color();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name13 = faker12.name;
        com.github.javafaker.Options options14 = faker12.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService15 = faker12.fakeValuesService;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name17 = faker16.name;
        com.github.javafaker.Options options18 = faker16.options;
        com.github.javafaker.DateAndTime dateAndTime19 = faker16.date();
        faker12.dateAndTime = dateAndTime19;
        faker8.dateAndTime = dateAndTime19;
        faker0.dateAndTime = dateAndTime19;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name24 = faker23.name;
        java.lang.String str26 = faker23.letterify("hi!");
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name28 = faker27.name;
        com.github.javafaker.Options options29 = faker27.options;
        com.github.javafaker.App app30 = faker27.app();
        faker23.app = app30;
        faker0.app = app30;
        com.github.javafaker.Business business33 = faker0.business();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(name13);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(fakeValuesService15);
        org.junit.Assert.assertNotNull(name17);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(dateAndTime19);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(name28);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(app30);
        org.junit.Assert.assertNotNull(business33);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(hacker5);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.util.Locale locale0 = java.util.Locale.UK;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name4 = faker3.name;
        com.github.javafaker.Options options5 = faker3.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = faker3.fakeValuesService;
        com.github.javafaker.service.RandomService randomService7 = null;
        faker3.randomService = randomService7;
        com.github.javafaker.Options options9 = faker3.options;
        java.util.Random random10 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream13 = random10.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream15 = random10.doubles((long) (short) 1);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.service.RandomService randomService17 = faker16.randomService;
        faker3.randomService = randomService17;
        com.github.javafaker.Address address19 = faker3.address;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name21 = faker20.name;
        com.github.javafaker.Options options22 = faker20.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService23 = faker20.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber24 = null;
        faker20.phoneNumber = phoneNumber24;
        com.github.javafaker.Name name26 = faker20.name();
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name28 = faker27.name;
        com.github.javafaker.Options options29 = faker27.options;
        com.github.javafaker.Name name30 = faker27.name();
        com.github.javafaker.Hacker hacker31 = faker27.hacker();
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book33 = null;
        faker32.book = book33;
        com.github.javafaker.Code code35 = faker32.code();
        faker27.code = code35;
        com.github.javafaker.Address address37 = faker27.address;
        faker20.address = address37;
        faker3.address = address37;
        faker1.address = address37;
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name42 = faker41.name;
        com.github.javafaker.Options options43 = faker41.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService44 = faker41.fakeValuesService;
        com.github.javafaker.service.RandomService randomService45 = null;
        faker41.randomService = randomService45;
        com.github.javafaker.Options options47 = faker41.options;
        java.util.Random random48 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream51 = random48.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream53 = random48.doubles((long) (short) 1);
        com.github.javafaker.Faker faker54 = new com.github.javafaker.Faker(random48);
        com.github.javafaker.service.RandomService randomService55 = faker54.randomService;
        faker41.randomService = randomService55;
        com.github.javafaker.Business business57 = faker41.business();
        com.github.javafaker.Faker faker58 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name59 = faker58.name;
        com.github.javafaker.Internet internet60 = faker58.internet;
        com.github.javafaker.service.RandomService randomService61 = faker58.randomService;
        faker41.randomService = randomService61;
        com.github.javafaker.Color color63 = faker41.color;
        faker1.color = color63;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(randomService17);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertNotNull(name21);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(fakeValuesService23);
        org.junit.Assert.assertNotNull(name26);
        org.junit.Assert.assertNotNull(name28);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(name30);
        org.junit.Assert.assertNotNull(hacker31);
        org.junit.Assert.assertNotNull(code35);
        org.junit.Assert.assertNotNull(address37);
        org.junit.Assert.assertNotNull(name42);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNotNull(fakeValuesService44);
        org.junit.Assert.assertNotNull(options47);
        org.junit.Assert.assertNotNull(doubleStream51);
        org.junit.Assert.assertNotNull(doubleStream53);
        org.junit.Assert.assertNotNull(randomService55);
        org.junit.Assert.assertNotNull(business57);
        org.junit.Assert.assertNotNull(name59);
        org.junit.Assert.assertNotNull(internet60);
        org.junit.Assert.assertNotNull(randomService61);
        org.junit.Assert.assertNotNull(color63);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Number number2 = faker1.number;
        com.github.javafaker.App app3 = faker1.app;
        com.github.javafaker.Code code4 = faker1.code();
        com.github.javafaker.Business business5 = faker1.business;
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(business5);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.Company company13 = faker6.company;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name15 = faker14.name;
        com.github.javafaker.Options options16 = faker14.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService17 = faker14.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber18 = null;
        faker14.phoneNumber = phoneNumber18;
        com.github.javafaker.Name name20 = faker14.name();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name22 = faker21.name;
        com.github.javafaker.Options options23 = faker21.options;
        com.github.javafaker.Name name24 = faker21.name();
        com.github.javafaker.Hacker hacker25 = faker21.hacker();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book27 = null;
        faker26.book = book27;
        com.github.javafaker.Code code29 = faker26.code();
        faker21.code = code29;
        com.github.javafaker.Address address31 = faker21.address;
        faker14.address = address31;
        faker6.address = address31;
        com.github.javafaker.DateAndTime dateAndTime34 = faker6.dateAndTime;
        java.util.Locale locale35 = java.util.Locale.FRANCE;
        java.util.Random random36 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream39 = random36.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(locale35, random36);
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(random36);
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name43 = faker42.name;
        com.github.javafaker.Options options44 = faker42.options;
        com.github.javafaker.Company company45 = faker42.company();
        faker41.company = company45;
        com.github.javafaker.Hacker hacker47 = faker41.hacker;
        com.github.javafaker.Company company48 = faker41.company;
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name50 = faker49.name;
        com.github.javafaker.Options options51 = faker49.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService52 = faker49.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber53 = null;
        faker49.phoneNumber = phoneNumber53;
        com.github.javafaker.Name name55 = faker49.name();
        com.github.javafaker.Faker faker56 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name57 = faker56.name;
        com.github.javafaker.Options options58 = faker56.options;
        com.github.javafaker.Name name59 = faker56.name();
        com.github.javafaker.Hacker hacker60 = faker56.hacker();
        com.github.javafaker.Faker faker61 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book62 = null;
        faker61.book = book62;
        com.github.javafaker.Code code64 = faker61.code();
        faker56.code = code64;
        com.github.javafaker.Address address66 = faker56.address;
        faker49.address = address66;
        faker41.address = address66;
        com.github.javafaker.Faker faker69 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book70 = null;
        faker69.book = book70;
        java.util.Random random72 = null;
        com.github.javafaker.Faker faker73 = new com.github.javafaker.Faker(random72);
        com.github.javafaker.Number number74 = faker73.number;
        faker69.number = number74;
        faker41.number = number74;
        faker6.number = number74;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(fakeValuesService17);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(hacker25);
        org.junit.Assert.assertNotNull(code29);
        org.junit.Assert.assertNotNull(address31);
        org.junit.Assert.assertNotNull(dateAndTime34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream39);
        org.junit.Assert.assertNotNull(name43);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNotNull(company45);
        org.junit.Assert.assertNotNull(hacker47);
        org.junit.Assert.assertNotNull(company48);
        org.junit.Assert.assertNotNull(name50);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertNotNull(fakeValuesService52);
        org.junit.Assert.assertNotNull(name55);
        org.junit.Assert.assertNotNull(name57);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNotNull(name59);
        org.junit.Assert.assertNotNull(hacker60);
        org.junit.Assert.assertNotNull(code64);
        org.junit.Assert.assertNotNull(address66);
        org.junit.Assert.assertNotNull(number74);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Business business2 = null;
        faker0.business = business2;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber;
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name7 = faker6.name;
        com.github.javafaker.Options options8 = faker6.options;
        com.github.javafaker.App app9 = faker6.app();
        com.github.javafaker.Options options10 = faker6.options;
        com.github.javafaker.Options options11 = faker6.options();
        faker0.options = options11;
        com.github.javafaker.Business business13 = faker0.business();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(app9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNull(business13);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder7 = builder0.addUnicodeLocaleAttribute("und");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setLanguage("English (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: English (Canada) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????? (????)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi! could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u82f1\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        java.util.Locale locale2 = new java.util.Locale("en_GB", "japan");
        org.junit.Assert.assertEquals(locale2.toString(), "en_gb_JAPAN");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        java.util.Random random1 = new java.util.Random((long) 16);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Locale locale12 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.util.Locale locale16 = new java.util.Locale("", "");
        java.lang.String str17 = locale12.getDisplayVariant(locale16);
        java.util.Set<java.lang.String> strSet18 = locale12.getUnicodeLocaleKeys();
        java.lang.String str19 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet18);
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.Locale.FilteringMode filteringMode28 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList26, filteringMode28);
        java.util.Locale locale32 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet33 = locale32.getExtensionKeys();
        java.util.Locale locale36 = new java.util.Locale("", "");
        java.lang.String str37 = locale32.getDisplayVariant(locale36);
        java.util.Set<java.lang.String> strSet38 = locale32.getUnicodeLocaleKeys();
        java.lang.String str39 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strSet38);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.Locale.FilteringMode filteringMode48 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList46, filteringMode48);
        java.util.Locale locale52 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet53 = locale52.getExtensionKeys();
        java.util.Locale locale56 = new java.util.Locale("", "");
        java.lang.String str57 = locale52.getDisplayVariant(locale56);
        java.util.Set<java.lang.String> strSet58 = locale52.getUnicodeLocaleKeys();
        java.lang.String str59 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strSet58);
        java.util.Locale locale62 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet63 = locale62.getExtensionKeys();
        java.util.Locale locale66 = new java.util.Locale("", "");
        java.lang.String str67 = locale62.getDisplayVariant(locale66);
        java.util.Set<java.lang.String> strSet68 = locale62.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList69 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strSet68);
        java.util.List<java.lang.String> strList70 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strSet68);
        java.lang.String str71 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList70);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + filteringMode28 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode28.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(charSet33);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + filteringMode48 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode48.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertNotNull(charSet53);
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(strSet58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertNotNull(charSet63);
        org.junit.Assert.assertEquals(locale66.toString(), "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNull(str71);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = locale1.getDisplayCountry(locale2);
        java.util.Random random5 = new java.util.Random((long) (byte) 10);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale2, random5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream10 = random5.ints(688822307316714936L, 16, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = new java.util.Locale("hi!", "", "");
        java.lang.String str5 = locale0.getDisplayScript(locale4);
        boolean boolean6 = locale4.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Internet internet7 = faker6.internet;
        com.github.javafaker.Name name8 = faker6.name();
        com.github.javafaker.Color color9 = faker6.color();
        com.github.javafaker.Name name10 = faker6.name;
        com.github.javafaker.Book book11 = faker6.book();
        com.github.javafaker.Company company12 = faker6.company;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(company12);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.IntStream intStream7 = random1.ints((long) 1);
        java.util.stream.IntStream intStream8 = random1.ints();
        java.util.stream.IntStream intStream12 = random1.ints(0L, 25, 431529176);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(intStream12);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("German");
        java.util.Locale locale7 = builder3.build();
        java.lang.String str8 = locale2.getDisplayLanguage(locale7);
        java.util.Random random10 = new java.util.Random((-1L));
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale7, random10);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("Japan");
        java.util.Locale.Builder builder9 = builder5.setRegion("zh");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.util.Locale locale3 = new java.util.Locale("Germany", "anglais", "de");
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale3.getScript();
        java.util.Locale locale8 = new java.util.Locale("allemand", "french");
        java.lang.String str9 = locale3.getDisplayScript(locale8);
        java.lang.String str10 = locale8.getCountry();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name12 = faker11.name;
        com.github.javafaker.Options options13 = faker11.options;
        com.github.javafaker.App app14 = faker11.app();
        com.github.javafaker.Options options15 = faker11.options;
        com.github.javafaker.Options options16 = faker11.options();
        com.github.javafaker.Name name17 = faker11.name();
        com.github.javafaker.Company company18 = faker11.company;
        com.github.javafaker.service.FakeValuesService fakeValuesService19 = faker11.fakeValuesService;
        boolean boolean20 = locale8.equals((java.lang.Object) faker11);
        org.junit.Assert.assertEquals(locale3.toString(), "germany_ANGLAIS_de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ANGLAIS" + "'", str4, "ANGLAIS");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale8.toString(), "allemand_FRENCH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FRENCH" + "'", str10, "FRENCH");
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(app14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(name17);
        org.junit.Assert.assertNotNull(company18);
        org.junit.Assert.assertNotNull(fakeValuesService19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        java.util.Random random1 = new java.util.Random((long) 23);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Random random4 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream7 = random4.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale3, random4);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Book book10 = faker9.book();
        com.github.javafaker.Finance finance11 = faker9.finance;
        com.github.javafaker.Name name12 = faker9.name;
        com.github.javafaker.Finance finance13 = faker9.finance();
        faker2.finance = finance13;
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(finance13);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        java.util.Locale locale2 = new java.util.Locale("en_US", "en_GB");
        java.lang.String str3 = locale2.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "en_us_EN_GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EN_GB" + "'", str3, "EN_GB");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.util.Locale locale1 = new java.util.Locale("English (Canada)");
        java.lang.String str2 = locale1.getDisplayVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "english (canada)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        java.util.stream.LongStream longStream8 = random0.longs((long) 'u', (long) 'x');
        int int9 = random0.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream13 = random0.doubles((long) 549125265, 0.2578027905957804d, (double) (-1851610133));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 683676988 + "'", int9 == 683676988);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        com.github.javafaker.service.RandomService randomService14 = null;
        faker10.randomService = randomService14;
        com.github.javafaker.Options options16 = faker10.options;
        java.util.Random random17 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream20 = random17.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream22 = random17.doubles((long) (short) 1);
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.service.RandomService randomService24 = faker23.randomService;
        faker10.randomService = randomService24;
        com.github.javafaker.Business business26 = faker10.business();
        faker5.business = business26;
        com.github.javafaker.PhoneNumber phoneNumber28 = faker5.phoneNumber;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name30 = faker29.name;
        java.lang.String str32 = faker29.letterify("hi!");
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name34 = faker33.name;
        com.github.javafaker.Options options35 = faker33.options;
        com.github.javafaker.App app36 = faker33.app();
        faker29.app = app36;
        com.github.javafaker.PhoneNumber phoneNumber38 = faker29.phoneNumber;
        faker5.phoneNumber = phoneNumber38;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(company9);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(fakeValuesService13);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertNotNull(randomService24);
        org.junit.Assert.assertNotNull(business26);
        org.junit.Assert.assertNotNull(phoneNumber28);
        org.junit.Assert.assertNotNull(name30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(name34);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNotNull(app36);
        org.junit.Assert.assertNotNull(phoneNumber38);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book9 = null;
        faker8.book = book9;
        com.github.javafaker.Code code11 = faker8.code();
        faker5.code = code11;
        java.lang.String str14 = faker5.bothify("Japan");
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name16 = faker15.name;
        com.github.javafaker.Options options17 = faker15.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService18 = faker15.fakeValuesService;
        com.github.javafaker.service.RandomService randomService19 = null;
        faker15.randomService = randomService19;
        com.github.javafaker.Options options21 = faker15.options;
        java.util.Random random22 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream25 = random22.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream27 = random22.doubles((long) (short) 1);
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.service.RandomService randomService29 = faker28.randomService;
        faker15.randomService = randomService29;
        com.github.javafaker.Address address31 = faker15.address;
        com.github.javafaker.Lorem lorem32 = faker15.lorem();
        faker5.lorem = lorem32;
        java.util.Locale locale34 = java.util.Locale.FRANCE;
        java.util.Random random35 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream38 = random35.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(locale34, random35);
        com.github.javafaker.Business business40 = null;
        faker39.business = business40;
        com.github.javafaker.Book book42 = faker39.book;
        faker5.book = book42;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Japan" + "'", str14, "Japan");
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(fakeValuesService18);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(doubleStream25);
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(randomService29);
        org.junit.Assert.assertNotNull(address31);
        org.junit.Assert.assertNotNull(lorem32);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream38);
        org.junit.Assert.assertNotNull(book42);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Lorem lorem5 = faker0.lorem;
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(book4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream6 = random1.ints((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber4 = null;
        faker0.phoneNumber = phoneNumber4;
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Options options7 = faker0.options();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker0.fakeValuesService;
        java.lang.String str10 = faker0.numerify("United Kingdom");
        com.github.javafaker.App app11 = faker0.app;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "United Kingdom" + "'", str10, "United Kingdom");
        org.junit.Assert.assertNotNull(app11);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Code code6 = faker0.code;
        com.github.javafaker.Internet internet7 = faker0.internet;
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Random random9 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream12 = random9.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale8, random9);
        com.github.javafaker.Business business14 = null;
        faker13.business = business14;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book17 = null;
        faker16.book = book17;
        com.github.javafaker.Code code19 = faker16.code();
        faker13.code = code19;
        java.lang.String str22 = faker13.bothify("Japan");
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name24 = faker23.name;
        com.github.javafaker.Options options25 = faker23.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService26 = faker23.fakeValuesService;
        com.github.javafaker.service.RandomService randomService27 = null;
        faker23.randomService = randomService27;
        com.github.javafaker.Options options29 = faker23.options;
        java.util.Random random30 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream33 = random30.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream35 = random30.doubles((long) (short) 1);
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(random30);
        com.github.javafaker.service.RandomService randomService37 = faker36.randomService;
        faker23.randomService = randomService37;
        com.github.javafaker.Address address39 = faker23.address;
        com.github.javafaker.Lorem lorem40 = faker23.lorem();
        faker13.lorem = lorem40;
        com.github.javafaker.Options options42 = faker13.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService43 = faker13.fakeValuesService;
        faker0.fakeValuesService = fakeValuesService43;
        com.github.javafaker.Finance finance45 = faker0.finance();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(code19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Japan" + "'", str22, "Japan");
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(fakeValuesService26);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(doubleStream33);
        org.junit.Assert.assertNotNull(doubleStream35);
        org.junit.Assert.assertNotNull(randomService37);
        org.junit.Assert.assertNotNull(address39);
        org.junit.Assert.assertNotNull(lorem40);
        org.junit.Assert.assertNotNull(options42);
        org.junit.Assert.assertNotNull(fakeValuesService43);
        org.junit.Assert.assertNotNull(finance45);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        java.util.Locale.Builder builder11 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder14 = builder7.setExtension('x', "anglais");
        java.util.Locale locale15 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder7.removeUnicodeLocaleAttribute("en");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "anglais" + "'", str10, "anglais");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en__#x-anglais");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        boolean boolean2 = locale1.hasExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1);
        java.lang.String str4 = locale1.getVariant();
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.lang.String str8 = locale5.getDisplayScript();
        java.util.Set<java.lang.Character> charSet9 = locale5.getExtensionKeys();
        java.lang.String str10 = locale1.getDisplayCountry(locale5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "anglais" + "'", str7, "anglais");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "United Kingdom" + "'", str10, "United Kingdom");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book8 = null;
        faker7.book = book8;
        java.lang.String str11 = faker7.bothify("Germany");
        com.github.javafaker.Business business12 = faker7.business;
        faker0.business = business12;
        java.lang.String str15 = faker0.regexify("German");
        java.lang.String str17 = faker0.regexify("\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Germany" + "'", str11, "Germany");
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "German" + "'", str15, "German");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str17, "\u4e2d\u56fd\u8a9e");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.Color color8 = faker5.color();
        faker0.color = color8;
        com.github.javafaker.Finance finance10 = faker0.finance;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book12 = null;
        faker11.book = book12;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Number number16 = faker15.number;
        faker11.number = number16;
        faker0.number = number16;
        com.github.javafaker.Company company19 = faker0.company();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(number16);
        org.junit.Assert.assertNotNull(company19);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.Color color13 = faker6.color;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        java.util.Locale locale3 = new java.util.Locale("japan", "de-DE", "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.lang.String str8 = locale4.getDisplayName(locale6);
        java.lang.String str9 = locale4.toLanguageTag();
        java.lang.String str10 = locale3.getDisplayName(locale4);
        java.lang.String str11 = locale4.getDisplayVariant();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "anglais" + "'", str7, "anglais");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "allemand" + "'", str8, "allemand");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "de" + "'", str9, "de");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))" + "'", str10, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber4 = null;
        faker0.phoneNumber = phoneNumber4;
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Name name10 = faker7.name();
        com.github.javafaker.Hacker hacker11 = faker7.hacker();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book13 = null;
        faker12.book = book13;
        com.github.javafaker.Code code15 = faker12.code();
        faker7.code = code15;
        com.github.javafaker.Address address17 = faker7.address;
        faker0.address = address17;
        com.github.javafaker.DateAndTime dateAndTime19 = faker0.dateAndTime;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(hacker11);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertNotNull(address17);
        org.junit.Assert.assertNotNull(dateAndTime19);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) 1, (long) (short) 100);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Finance finance8 = faker7.finance;
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.Company company13 = faker6.company;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name15 = faker14.name;
        com.github.javafaker.Options options16 = faker14.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService17 = faker14.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber18 = null;
        faker14.phoneNumber = phoneNumber18;
        com.github.javafaker.Name name20 = faker14.name();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name22 = faker21.name;
        com.github.javafaker.Options options23 = faker21.options;
        com.github.javafaker.Name name24 = faker21.name();
        com.github.javafaker.Hacker hacker25 = faker21.hacker();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book27 = null;
        faker26.book = book27;
        com.github.javafaker.Code code29 = faker26.code();
        faker21.code = code29;
        com.github.javafaker.Address address31 = faker21.address;
        faker14.address = address31;
        faker6.address = address31;
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name35 = faker34.name;
        com.github.javafaker.Options options36 = faker34.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService37 = faker34.fakeValuesService;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name39 = faker38.name;
        com.github.javafaker.Options options40 = faker38.options;
        com.github.javafaker.DateAndTime dateAndTime41 = faker38.date();
        faker34.dateAndTime = dateAndTime41;
        com.github.javafaker.Address address43 = faker34.address();
        faker6.address = address43;
        com.github.javafaker.Business business45 = faker6.business;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(fakeValuesService17);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(hacker25);
        org.junit.Assert.assertNotNull(code29);
        org.junit.Assert.assertNotNull(address31);
        org.junit.Assert.assertNotNull(name35);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertNotNull(fakeValuesService37);
        org.junit.Assert.assertNotNull(name39);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(dateAndTime41);
        org.junit.Assert.assertNotNull(address43);
        org.junit.Assert.assertNotNull(business45);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.util.Locale locale1 = new java.util.Locale("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        boolean boolean7 = random0.nextBoolean();
        float float8 = random0.nextFloat();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.3475651f + "'", float8 == 0.3475651f);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Random random2 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream5 = random2.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream7 = random2.doubles((long) (short) 1);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random2);
        java.util.stream.DoubleStream doubleStream9 = random2.doubles();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random2);
        int int11 = random2.nextInt();
        long long12 = random2.nextLong();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587" + "'", str1, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1949283820) + "'", int11 == (-1949283820));
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-8942412734154293847L) + "'", long12 == (-8942412734154293847L));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        java.util.Random random1 = new java.util.Random((long) '#');
        java.util.stream.LongStream longStream2 = random1.longs();
        long long3 = random1.nextLong();
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-5013995466868426345L) + "'", long3 == (-5013995466868426345L));
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Deutschland");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=deutschland");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        java.util.Random random1 = new java.util.Random((-8845213925386835238L));
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.util.Random random1 = new java.util.Random((long) 'u');
        int int2 = random1.nextInt();
        float float3 = random1.nextFloat();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1188188233) + "'", int2 == (-1188188233));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.6991795f + "'", float3 == 0.6991795f);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.util.Locale locale2 = new java.util.Locale("JPN", "CN");
        org.junit.Assert.assertEquals(locale2.toString(), "jpn_CN");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        java.util.Random random1 = new java.util.Random(946239036256691512L);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setRegion("JPN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: JPN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ja_JP");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Japanese");
        java.util.Locale.setDefault(locale1);
        java.lang.String str3 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "japanese");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "japanese" + "'", str3, "japanese");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        java.util.Locale.Builder builder9 = builder5.addUnicodeLocaleAttribute("Germany");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("Japanisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Japanisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream12 = random7.doubles((long) (short) 1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService14 = faker13.randomService;
        faker0.randomService = randomService14;
        com.github.javafaker.Address address16 = faker0.address;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book18 = null;
        faker17.book = book18;
        java.util.Random random20 = null;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Number number22 = faker21.number;
        faker17.number = number22;
        com.github.javafaker.App app24 = faker17.app;
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.util.Random random26 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream29 = random26.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale25, random26);
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.Internet internet32 = faker31.internet;
        faker17.internet = internet32;
        com.github.javafaker.Lorem lorem34 = faker17.lorem();
        faker0.lorem = lorem34;
        com.github.javafaker.service.FakeValuesService fakeValuesService36 = faker0.fakeValuesService;
        com.github.javafaker.service.FakeValuesService fakeValuesService37 = faker0.fakeValuesService;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(randomService14);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(number22);
        org.junit.Assert.assertNotNull(app24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(internet32);
        org.junit.Assert.assertNotNull(lorem34);
        org.junit.Assert.assertNotNull(fakeValuesService36);
        org.junit.Assert.assertNotNull(fakeValuesService37);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getDisplayVariant();
        boolean boolean3 = locale0.equals((java.lang.Object) "Japanese (Japan)");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleKeys();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream10 = random5.doubles((long) (short) 1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.service.RandomService randomService12 = faker11.randomService;
        faker4.randomService = randomService12;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Germany" + "'", str1, "Germany");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "German" + "'", str2, "German");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(randomService12);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ja");
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("de", 0.6991794951529816d);
        java.util.Locale.LanguageRange languageRange6 = new java.util.Locale.LanguageRange("french");
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("de", (double) 0L);
        java.util.Locale.LanguageRange languageRange12 = new java.util.Locale.LanguageRange("french", 0.20659165162610316d);
        java.util.Locale.LanguageRange languageRange15 = new java.util.Locale.LanguageRange("CAN", 0.7281907524383029d);
        java.util.Locale.LanguageRange languageRange17 = new java.util.Locale.LanguageRange("French");
        java.lang.String str18 = languageRange17.getRange();
        java.util.Locale.LanguageRange languageRange21 = new java.util.Locale.LanguageRange("de", 0.6991794951529816d);
        java.lang.String str22 = languageRange21.getRange();
        java.util.Locale.LanguageRange languageRange24 = new java.util.Locale.LanguageRange("anglais");
        java.util.Locale.LanguageRange languageRange26 = new java.util.Locale.LanguageRange("French");
        java.lang.String str27 = languageRange26.getRange();
        java.util.Locale.LanguageRange languageRange29 = new java.util.Locale.LanguageRange("fra");
        java.util.Locale.LanguageRange languageRange31 = new java.util.Locale.LanguageRange("allemand");
        java.lang.String str32 = languageRange31.getRange();
        java.util.Locale.LanguageRange languageRange34 = new java.util.Locale.LanguageRange("allemand");
        double double35 = languageRange34.getWeight();
        java.util.Locale.LanguageRange languageRange37 = new java.util.Locale.LanguageRange("French");
        java.util.Locale.LanguageRange languageRange39 = new java.util.Locale.LanguageRange("Chinese");
        java.util.Locale.LanguageRange languageRange42 = new java.util.Locale.LanguageRange("Chinese", 0.5996864898745049d);
        java.util.Locale.LanguageRange languageRange44 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange46 = new java.util.Locale.LanguageRange("French");
        java.util.Locale.LanguageRange languageRange48 = new java.util.Locale.LanguageRange("french");
        java.util.Locale.LanguageRange languageRange50 = new java.util.Locale.LanguageRange("China");
        java.util.Locale.LanguageRange languageRange52 = new java.util.Locale.LanguageRange("China");
        java.util.Locale.LanguageRange languageRange54 = new java.util.Locale.LanguageRange("French");
        java.util.Locale.LanguageRange languageRange56 = new java.util.Locale.LanguageRange("und");
        java.util.Locale.LanguageRange languageRange58 = new java.util.Locale.LanguageRange("allemand");
        java.util.Locale.LanguageRange languageRange61 = new java.util.Locale.LanguageRange("de", 0.6991794951529816d);
        double double62 = languageRange61.getWeight();
        java.util.Locale.LanguageRange[] languageRangeArray63 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange4, languageRange6, languageRange9, languageRange12, languageRange15, languageRange17, languageRange21, languageRange24, languageRange26, languageRange29, languageRange31, languageRange34, languageRange37, languageRange39, languageRange42, languageRange44, languageRange46, languageRange48, languageRange50, languageRange52, languageRange54, languageRange56, languageRange58, languageRange61 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList64 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64, languageRangeArray63);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap66 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList67 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, strMap66);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "french" + "'", str18, "french");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "de" + "'", str22, "de");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "french" + "'", str27, "french");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "allemand" + "'", str32, "allemand");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.6991794951529816d + "'", double62 == 0.6991794951529816d);
        org.junit.Assert.assertNotNull(languageRangeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(languageRangeList67);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name5 = faker4.name;
        com.github.javafaker.Options options6 = faker4.options;
        com.github.javafaker.DateAndTime dateAndTime7 = faker4.date();
        faker0.dateAndTime = dateAndTime7;
        com.github.javafaker.Address address9 = faker0.address();
        com.github.javafaker.App app10 = faker0.app;
        com.github.javafaker.Address address11 = faker0.address();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(app10);
        org.junit.Assert.assertNotNull(address11);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "French (Canada)" + "'", str1, "French (Canada)");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        boolean boolean2 = locale1.hasExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1);
        java.lang.String str5 = faker3.regexify("");
        com.github.javafaker.Internet internet6 = faker3.internet;
        com.github.javafaker.Lorem lorem7 = faker3.lorem;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Name name5 = faker0.name;
        com.github.javafaker.App app6 = faker0.app;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Book book9 = faker7.book;
        com.github.javafaker.Company company10 = faker7.company();
        com.github.javafaker.Book book11 = faker7.book();
        com.github.javafaker.Code code12 = faker7.code();
        com.github.javafaker.Hacker hacker13 = faker7.hacker();
        faker0.hacker = hacker13;
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.util.Random random16 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream19 = random16.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale15, random16);
        com.github.javafaker.Business business21 = null;
        faker20.business = business21;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book24 = null;
        faker23.book = book24;
        com.github.javafaker.Code code26 = faker23.code();
        faker20.code = code26;
        com.github.javafaker.Company company28 = faker20.company;
        com.github.javafaker.PhoneNumber phoneNumber29 = faker20.phoneNumber;
        com.github.javafaker.Code code30 = faker20.code;
        faker0.code = code30;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(app6);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(hacker13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertNotNull(code26);
        org.junit.Assert.assertNotNull(company28);
        org.junit.Assert.assertNotNull(phoneNumber29);
        org.junit.Assert.assertNotNull(code30);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Number number4 = faker2.number();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker5.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber9 = null;
        faker5.phoneNumber = phoneNumber9;
        com.github.javafaker.Name name11 = faker5.name();
        com.github.javafaker.Options options12 = faker5.options();
        com.github.javafaker.service.FakeValuesService fakeValuesService13 = faker5.fakeValuesService;
        java.lang.String str15 = faker5.numerify("fra");
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name17 = faker16.name;
        com.github.javafaker.Book book18 = faker16.book;
        com.github.javafaker.Company company19 = faker16.company();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name21 = faker20.name;
        com.github.javafaker.Options options22 = faker20.options;
        com.github.javafaker.Name name23 = faker20.name();
        faker16.name = name23;
        faker5.name = name23;
        faker2.name = name23;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(fakeValuesService13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fra" + "'", str15, "fra");
        org.junit.Assert.assertNotNull(name17);
        org.junit.Assert.assertNotNull(book18);
        org.junit.Assert.assertNotNull(company19);
        org.junit.Assert.assertNotNull(name21);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(name23);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name4 = faker3.name;
        com.github.javafaker.Business business5 = null;
        faker3.business = business5;
        com.github.javafaker.Company company7 = faker3.company;
        faker0.company = company7;
        com.github.javafaker.Code code9 = faker0.code;
        com.github.javafaker.Address address10 = faker0.address();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name12 = faker11.name;
        com.github.javafaker.Options options13 = faker11.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = faker11.fakeValuesService;
        com.github.javafaker.service.RandomService randomService15 = null;
        faker11.randomService = randomService15;
        com.github.javafaker.Options options17 = faker11.options;
        com.github.javafaker.App app18 = faker11.app();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.Color color22 = faker19.color();
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name24 = faker23.name;
        com.github.javafaker.Options options25 = faker23.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService26 = faker23.fakeValuesService;
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name28 = faker27.name;
        com.github.javafaker.Options options29 = faker27.options;
        com.github.javafaker.DateAndTime dateAndTime30 = faker27.date();
        faker23.dateAndTime = dateAndTime30;
        faker19.dateAndTime = dateAndTime30;
        faker11.dateAndTime = dateAndTime30;
        com.github.javafaker.DateAndTime dateAndTime34 = faker11.dateAndTime;
        faker0.dateAndTime = dateAndTime34;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(fakeValuesService14);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(app18);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(fakeValuesService26);
        org.junit.Assert.assertNotNull(name28);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(dateAndTime30);
        org.junit.Assert.assertNotNull(dateAndTime34);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.Color color8 = faker5.color();
        faker0.color = color8;
        com.github.javafaker.Internet internet10 = faker0.internet();
        com.github.javafaker.Color color11 = faker0.color;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        com.github.javafaker.Address address3 = faker0.address();
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Code code6 = faker0.code();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Random random8 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream11 = random8.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale7, random8);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Internet internet14 = faker13.internet;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name16 = faker15.name;
        com.github.javafaker.Options options17 = faker15.options;
        com.github.javafaker.Name name18 = faker15.name();
        com.github.javafaker.Code code19 = faker15.code;
        faker13.code = code19;
        com.github.javafaker.Number number21 = faker13.number;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name23 = faker22.name;
        com.github.javafaker.Options options24 = faker22.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService25 = faker22.fakeValuesService;
        com.github.javafaker.service.RandomService randomService26 = null;
        faker22.randomService = randomService26;
        com.github.javafaker.Options options28 = faker22.options;
        faker13.options = options28;
        faker0.options = options28;
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(internet14);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(code19);
        org.junit.Assert.assertNotNull(number21);
        org.junit.Assert.assertNotNull(name23);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertNotNull(fakeValuesService25);
        org.junit.Assert.assertNotNull(options28);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Options options5 = faker0.options();
        java.lang.String str7 = faker0.letterify("Chinese");
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinese" + "'", str7, "Chinese");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) 1, (long) (short) 100);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random0);
        java.util.stream.LongStream longStream8 = random0.longs();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book9 = null;
        faker8.book = book9;
        com.github.javafaker.Code code11 = faker8.code();
        faker5.code = code11;
        java.lang.String str14 = faker5.bothify("Japan");
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name16 = faker15.name;
        com.github.javafaker.Options options17 = faker15.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService18 = faker15.fakeValuesService;
        com.github.javafaker.service.RandomService randomService19 = null;
        faker15.randomService = randomService19;
        com.github.javafaker.Options options21 = faker15.options;
        java.util.Random random22 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream25 = random22.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream27 = random22.doubles((long) (short) 1);
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.service.RandomService randomService29 = faker28.randomService;
        faker15.randomService = randomService29;
        com.github.javafaker.Address address31 = faker15.address;
        com.github.javafaker.Lorem lorem32 = faker15.lorem();
        faker5.lorem = lorem32;
        com.github.javafaker.Options options34 = faker5.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService35 = faker5.fakeValuesService;
        com.github.javafaker.Finance finance36 = faker5.finance;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Japan" + "'", str14, "Japan");
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(fakeValuesService18);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(doubleStream25);
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(randomService29);
        org.junit.Assert.assertNotNull(address31);
        org.junit.Assert.assertNotNull(lorem32);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(fakeValuesService35);
        org.junit.Assert.assertNotNull(finance36);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.util.Locale locale6 = new java.util.Locale("", "");
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        java.lang.String str8 = locale6.getISO3Country();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Company company5 = faker0.company;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(company5);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream12 = random7.doubles((long) (short) 1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService14 = faker13.randomService;
        faker0.randomService = randomService14;
        com.github.javafaker.Address address16 = faker0.address;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name18 = faker17.name;
        com.github.javafaker.Options options19 = faker17.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService20 = faker17.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber21 = null;
        faker17.phoneNumber = phoneNumber21;
        com.github.javafaker.Name name23 = faker17.name();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name25 = faker24.name;
        com.github.javafaker.Options options26 = faker24.options;
        com.github.javafaker.Name name27 = faker24.name();
        com.github.javafaker.Hacker hacker28 = faker24.hacker();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book30 = null;
        faker29.book = book30;
        com.github.javafaker.Code code32 = faker29.code();
        faker24.code = code32;
        com.github.javafaker.Address address34 = faker24.address;
        faker17.address = address34;
        faker0.address = address34;
        com.github.javafaker.Options options37 = faker0.options();
        com.github.javafaker.Company company38 = faker0.company;
        com.github.javafaker.Number number39 = faker0.number();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(randomService14);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(fakeValuesService20);
        org.junit.Assert.assertNotNull(name23);
        org.junit.Assert.assertNotNull(name25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(name27);
        org.junit.Assert.assertNotNull(hacker28);
        org.junit.Assert.assertNotNull(code32);
        org.junit.Assert.assertNotNull(address34);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(company38);
        org.junit.Assert.assertNotNull(number39);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream12 = random7.doubles((long) (short) 1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService14 = faker13.randomService;
        faker0.randomService = randomService14;
        com.github.javafaker.Address address16 = faker0.address;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book18 = null;
        faker17.book = book18;
        java.util.Random random20 = null;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Number number22 = faker21.number;
        faker17.number = number22;
        com.github.javafaker.App app24 = faker17.app;
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.util.Random random26 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream29 = random26.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale25, random26);
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.Internet internet32 = faker31.internet;
        faker17.internet = internet32;
        com.github.javafaker.Lorem lorem34 = faker17.lorem();
        faker0.lorem = lorem34;
        com.github.javafaker.service.FakeValuesService fakeValuesService36 = faker0.fakeValuesService;
        com.github.javafaker.Name name37 = faker0.name();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(randomService14);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(number22);
        org.junit.Assert.assertNotNull(app24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(internet32);
        org.junit.Assert.assertNotNull(lorem34);
        org.junit.Assert.assertNotNull(fakeValuesService36);
        org.junit.Assert.assertNotNull(name37);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        com.github.javafaker.Company company3 = faker0.company();
        java.lang.String str5 = faker0.letterify("ja");
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name7 = faker6.name;
        com.github.javafaker.Options options8 = faker6.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = faker6.fakeValuesService;
        com.github.javafaker.service.RandomService randomService10 = null;
        faker6.randomService = randomService10;
        com.github.javafaker.Options options12 = faker6.options;
        faker0.options = options12;
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ja" + "'", str5, "ja");
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(options12);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = locale0.stripExtensions();
        boolean boolean3 = locale0.hasExtensions();
        java.lang.Object obj4 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "en_GB");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "en_GB");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "en_GB");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        java.lang.String str6 = faker0.numerify("");
        java.lang.String str8 = faker0.letterify("french");
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name10 = faker9.name;
        com.github.javafaker.Options options11 = faker9.options;
        com.github.javafaker.Name name12 = faker9.name();
        com.github.javafaker.Hacker hacker13 = faker9.hacker();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book15 = null;
        faker14.book = book15;
        com.github.javafaker.Code code17 = faker14.code();
        faker9.code = code17;
        com.github.javafaker.Address address19 = faker9.address;
        faker0.address = address19;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book22 = null;
        faker21.book = book22;
        com.github.javafaker.Code code24 = faker21.code();
        com.github.javafaker.Book book25 = faker21.book;
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name27 = faker26.name;
        com.github.javafaker.Options options28 = faker26.options;
        com.github.javafaker.Name name29 = faker26.name();
        com.github.javafaker.Hacker hacker30 = faker26.hacker();
        com.github.javafaker.Internet internet31 = faker26.internet();
        com.github.javafaker.Lorem lorem32 = faker26.lorem;
        faker21.lorem = lorem32;
        com.github.javafaker.App app34 = faker21.app();
        faker0.app = app34;
        com.github.javafaker.Options options36 = faker0.options();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "french" + "'", str8, "french");
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(hacker13);
        org.junit.Assert.assertNotNull(code17);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertNotNull(code24);
        org.junit.Assert.assertNull(book25);
        org.junit.Assert.assertNotNull(name27);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(name29);
        org.junit.Assert.assertNotNull(hacker30);
        org.junit.Assert.assertNotNull(internet31);
        org.junit.Assert.assertNotNull(lorem32);
        org.junit.Assert.assertNotNull(app34);
        org.junit.Assert.assertNotNull(options36);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) '4', (long) (short) 100);
        int int7 = random0.nextInt();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1949095416 + "'", int7 == 1949095416);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Code code6 = faker0.code;
        com.github.javafaker.Book book7 = faker0.book();
        com.github.javafaker.DateAndTime dateAndTime8 = faker0.date();
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name12 = faker11.name;
        com.github.javafaker.Business business13 = null;
        faker11.business = business13;
        com.github.javafaker.PhoneNumber phoneNumber15 = faker11.phoneNumber;
        com.github.javafaker.App app16 = faker11.app();
        com.github.javafaker.Book book17 = faker11.book;
        faker10.book = book17;
        faker0.book = book17;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(phoneNumber15);
        org.junit.Assert.assertNotNull(app16);
        org.junit.Assert.assertNotNull(book17);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("de", (double) 0.24377757f);
        java.lang.String str3 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "de" + "'", str3, "de");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale locale4 = new java.util.Locale("Japan");
        java.util.Locale.Builder builder5 = builder0.setLocale(locale4);
        java.lang.String str6 = locale4.getDisplayLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "japan");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "japan" + "'", str6, "japan");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        java.util.Locale locale3 = new java.util.Locale("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))", "en", "zh");
        org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))_EN_zh");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        java.util.stream.IntStream intStream7 = random0.ints((long) '4');
        java.lang.Class<?> wildcardClass8 = random0.getClass();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        java.util.Locale locale3 = new java.util.Locale("\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)", "\u4e2d\u56fd\u8a9e", "en_US");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4\u4e2d\u56fd\u8a9e_en_US");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.addUnicodeLocaleAttribute("German");
        java.util.Locale.Builder builder5 = builder3.setLanguage("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setVariant("\u30c9\u30a4\u30c4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Number number5 = faker4.number;
        faker0.number = number5;
        com.github.javafaker.App app7 = faker0.app;
        com.github.javafaker.Address address8 = faker0.address();
        java.util.Locale locale9 = java.util.Locale.UK;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale9);
        com.github.javafaker.Internet internet11 = faker10.internet();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name13 = faker12.name;
        com.github.javafaker.Options options14 = faker12.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService15 = faker12.fakeValuesService;
        com.github.javafaker.service.RandomService randomService16 = null;
        faker12.randomService = randomService16;
        com.github.javafaker.Options options18 = faker12.options;
        java.util.Random random19 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream22 = random19.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream24 = random19.doubles((long) (short) 1);
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.service.RandomService randomService26 = faker25.randomService;
        faker12.randomService = randomService26;
        com.github.javafaker.Address address28 = faker12.address;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name30 = faker29.name;
        com.github.javafaker.Options options31 = faker29.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService32 = faker29.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber33 = null;
        faker29.phoneNumber = phoneNumber33;
        com.github.javafaker.Name name35 = faker29.name();
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name37 = faker36.name;
        com.github.javafaker.Options options38 = faker36.options;
        com.github.javafaker.Name name39 = faker36.name();
        com.github.javafaker.Hacker hacker40 = faker36.hacker();
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book42 = null;
        faker41.book = book42;
        com.github.javafaker.Code code44 = faker41.code();
        faker36.code = code44;
        com.github.javafaker.Address address46 = faker36.address;
        faker29.address = address46;
        faker12.address = address46;
        faker10.address = address46;
        faker0.address = address46;
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(address8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(name13);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(fakeValuesService15);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(randomService26);
        org.junit.Assert.assertNotNull(address28);
        org.junit.Assert.assertNotNull(name30);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertNotNull(fakeValuesService32);
        org.junit.Assert.assertNotNull(name35);
        org.junit.Assert.assertNotNull(name37);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(name39);
        org.junit.Assert.assertNotNull(hacker40);
        org.junit.Assert.assertNotNull(code44);
        org.junit.Assert.assertNotNull(address46);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", 0.8746788966462123d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        java.util.Locale locale2 = new java.util.Locale("hi!", "\u4e2d\u6587");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u6587");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh", (double) 1L);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.util.Locale locale1 = new java.util.Locale("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertEquals(locale1.toString(), "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Lorem lorem3 = faker0.lorem;
        java.lang.String str5 = faker0.numerify("");
        com.github.javafaker.Hacker hacker6 = faker0.hacker;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(hacker6);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book9 = null;
        faker8.book = book9;
        com.github.javafaker.Code code11 = faker8.code();
        faker5.code = code11;
        java.lang.String str14 = faker5.bothify("Japan");
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name16 = faker15.name;
        com.github.javafaker.Options options17 = faker15.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService18 = faker15.fakeValuesService;
        com.github.javafaker.service.RandomService randomService19 = null;
        faker15.randomService = randomService19;
        com.github.javafaker.Options options21 = faker15.options;
        java.util.Random random22 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream25 = random22.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream27 = random22.doubles((long) (short) 1);
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.service.RandomService randomService29 = faker28.randomService;
        faker15.randomService = randomService29;
        com.github.javafaker.Address address31 = faker15.address;
        com.github.javafaker.Lorem lorem32 = faker15.lorem();
        faker5.lorem = lorem32;
        com.github.javafaker.Options options34 = faker5.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService35 = faker5.fakeValuesService;
        com.github.javafaker.Internet internet36 = faker5.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Japan" + "'", str14, "Japan");
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(fakeValuesService18);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(doubleStream25);
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(randomService29);
        org.junit.Assert.assertNotNull(address31);
        org.junit.Assert.assertNotNull(lorem32);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(fakeValuesService35);
        org.junit.Assert.assertNotNull(internet36);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setLanguageTag("de-DE");
        java.util.Locale.Builder builder9 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setScript("\u65e5\u672c (GERMAN (GERMANY),en,GB)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? (GERMAN (GERMANY),en,GB) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de" + "'", str2, "de");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u30c9\u30a4\u30c4", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Company company3 = faker0.company();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale4, random5);
        com.github.javafaker.Business business10 = null;
        faker9.business = business10;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book13 = null;
        faker12.book = book13;
        com.github.javafaker.Code code15 = faker12.code();
        faker9.code = code15;
        java.lang.String str18 = faker9.bothify("Japan");
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService22 = faker19.fakeValuesService;
        com.github.javafaker.service.RandomService randomService23 = null;
        faker19.randomService = randomService23;
        com.github.javafaker.Options options25 = faker19.options;
        java.util.Random random26 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream29 = random26.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream31 = random26.doubles((long) (short) 1);
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.service.RandomService randomService33 = faker32.randomService;
        faker19.randomService = randomService33;
        com.github.javafaker.Address address35 = faker19.address;
        com.github.javafaker.Lorem lorem36 = faker19.lorem();
        faker9.lorem = lorem36;
        faker0.lorem = lorem36;
        java.util.Locale locale39 = java.util.Locale.FRANCE;
        java.util.Random random40 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream43 = random40.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(locale39, random40);
        com.github.javafaker.Faker faker45 = new com.github.javafaker.Faker(random40);
        com.github.javafaker.Faker faker46 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name47 = faker46.name;
        com.github.javafaker.Options options48 = faker46.options;
        com.github.javafaker.Company company49 = faker46.company();
        faker45.company = company49;
        com.github.javafaker.Hacker hacker51 = faker45.hacker;
        com.github.javafaker.Company company52 = faker45.company;
        com.github.javafaker.Hacker hacker53 = faker45.hacker;
        java.util.Locale locale54 = java.util.Locale.FRANCE;
        java.util.Random random55 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream58 = random55.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker59 = new com.github.javafaker.Faker(locale54, random55);
        com.github.javafaker.Faker faker60 = new com.github.javafaker.Faker(random55);
        com.github.javafaker.service.RandomService randomService61 = faker60.randomService;
        faker45.randomService = randomService61;
        faker0.randomService = randomService61;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Japan" + "'", str18, "Japan");
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(fakeValuesService22);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertNotNull(randomService33);
        org.junit.Assert.assertNotNull(address35);
        org.junit.Assert.assertNotNull(lorem36);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream43);
        org.junit.Assert.assertNotNull(name47);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertNotNull(company49);
        org.junit.Assert.assertNotNull(hacker51);
        org.junit.Assert.assertNotNull(company52);
        org.junit.Assert.assertNotNull(hacker53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream58);
        org.junit.Assert.assertNotNull(randomService61);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        java.util.stream.IntStream intStream7 = random0.ints((long) '4');
        double double8 = random0.nextDouble();
        java.util.stream.LongStream longStream11 = random0.longs((long) 1, (long) 8);
        java.util.stream.LongStream longStream13 = random0.longs((long) 20);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream7);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08620657049514768d + "'", double8 == 0.08620657049514768d);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        java.lang.String str3 = faker0.numerify("Germany");
        com.github.javafaker.Address address4 = faker0.address;
        com.github.javafaker.DateAndTime dateAndTime5 = faker0.date();
        java.util.Random random6 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream9 = random6.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream11 = random6.doubles((long) (short) 1);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.service.RandomService randomService13 = faker12.randomService;
        faker0.randomService = randomService13;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Germany" + "'", str3, "Germany");
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(randomService13);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.util.Random random1 = new java.util.Random((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream4 = random1.ints((int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setVariant("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: United Kingdom [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        java.util.Random random1 = new java.util.Random((long) '#');
        java.util.stream.LongStream longStream3 = random1.longs((long) 'a');
        boolean boolean4 = random1.nextBoolean();
        java.util.stream.IntStream intStream6 = random1.ints((long) 'u');
        random1.setSeed((-8113469208120271707L));
        double double9 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.18222452765257022d) + "'", double9 == (-0.18222452765257022d));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.Company company13 = faker6.company;
        com.github.javafaker.Hacker hacker14 = faker6.hacker;
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.util.Random random16 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream19 = random16.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale15, random16);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.service.RandomService randomService22 = faker21.randomService;
        faker6.randomService = randomService22;
        com.github.javafaker.DateAndTime dateAndTime24 = faker6.dateAndTime;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(hacker14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertNotNull(randomService22);
        org.junit.Assert.assertNotNull(dateAndTime24);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Chinese", 0.5996864898745049d);
        java.lang.String str3 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chinese" + "'", str3, "chinese");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        java.util.Locale locale0 = java.util.Locale.UK;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Code code2 = faker1.code;
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale3);
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Random random8 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream11 = random8.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale7, random8);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name15 = faker14.name;
        com.github.javafaker.Options options16 = faker14.options;
        com.github.javafaker.Company company17 = faker14.company();
        faker13.company = company17;
        com.github.javafaker.Hacker hacker19 = faker13.hacker;
        com.github.javafaker.Company company20 = faker13.company;
        com.github.javafaker.Hacker hacker21 = faker13.hacker;
        faker6.hacker = hacker21;
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Random random24 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream27 = random24.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale23, random24);
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random24);
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name31 = faker30.name;
        com.github.javafaker.Options options32 = faker30.options;
        com.github.javafaker.Company company33 = faker30.company();
        faker29.company = company33;
        com.github.javafaker.Hacker hacker35 = faker29.hacker;
        com.github.javafaker.Company company36 = faker29.company;
        com.github.javafaker.Hacker hacker37 = faker29.hacker;
        faker6.hacker = hacker37;
        faker1.hacker = hacker37;
        com.github.javafaker.Finance finance40 = faker1.finance;
        com.github.javafaker.Finance finance41 = faker1.finance;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "anglais" + "'", str5, "anglais");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(company17);
        org.junit.Assert.assertNotNull(hacker19);
        org.junit.Assert.assertNotNull(company20);
        org.junit.Assert.assertNotNull(hacker21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(name31);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(company33);
        org.junit.Assert.assertNotNull(hacker35);
        org.junit.Assert.assertNotNull(company36);
        org.junit.Assert.assertNotNull(hacker37);
        org.junit.Assert.assertNotNull(finance40);
        org.junit.Assert.assertNotNull(finance41);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Name name10 = faker7.name();
        faker0.name = name10;
        com.github.javafaker.service.RandomService randomService12 = faker0.randomService;
        com.github.javafaker.DateAndTime dateAndTime13 = faker0.dateAndTime;
        com.github.javafaker.Company company14 = faker0.company;
        com.github.javafaker.Number number15 = faker0.number();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(randomService12);
        org.junit.Assert.assertNotNull(dateAndTime13);
        org.junit.Assert.assertNotNull(company14);
        org.junit.Assert.assertNotNull(number15);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Lorem lorem3 = faker0.lorem;
        java.lang.String str5 = faker0.numerify("");
        com.github.javafaker.Number number6 = faker0.number();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Internet internet9 = faker7.internet;
        com.github.javafaker.Options options10 = null;
        faker7.options = options10;
        com.github.javafaker.Options options12 = faker7.options;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name14 = faker13.name;
        com.github.javafaker.Options options15 = faker13.options;
        com.github.javafaker.App app16 = faker13.app();
        com.github.javafaker.Options options17 = faker13.options;
        com.github.javafaker.Options options18 = faker13.options();
        com.github.javafaker.Name name19 = faker13.name();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name21 = faker20.name;
        com.github.javafaker.Options options22 = faker20.options;
        com.github.javafaker.Name name23 = faker20.name();
        faker13.name = name23;
        com.github.javafaker.Internet internet25 = faker13.internet;
        com.github.javafaker.Internet internet26 = faker13.internet;
        faker7.internet = internet26;
        faker0.internet = internet26;
        com.github.javafaker.Finance finance29 = faker0.finance;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNotNull(name14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(app16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(name19);
        org.junit.Assert.assertNotNull(name21);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(name23);
        org.junit.Assert.assertNotNull(internet25);
        org.junit.Assert.assertNotNull(internet26);
        org.junit.Assert.assertNotNull(finance29);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        java.lang.String str6 = faker0.numerify("");
        java.lang.String str8 = faker0.letterify("french");
        com.github.javafaker.Color color9 = faker0.color;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name11 = faker10.name;
        com.github.javafaker.Options options12 = faker10.options;
        com.github.javafaker.Name name13 = faker10.name();
        com.github.javafaker.Hacker hacker14 = faker10.hacker();
        java.lang.String str16 = faker10.numerify("");
        java.lang.String str18 = faker10.letterify("french");
        com.github.javafaker.Color color19 = faker10.color;
        faker0.color = color19;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "french" + "'", str8, "french");
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(name13);
        org.junit.Assert.assertNotNull(hacker14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "french" + "'", str18, "french");
        org.junit.Assert.assertNotNull(color19);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguage("China");
        java.util.Locale.Builder builder5 = builder3.setVariant("allemand");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Name name5 = faker0.name;
        com.github.javafaker.App app6 = faker0.app;
        com.github.javafaker.App app7 = faker0.app;
        java.util.Locale locale8 = java.util.Locale.UK;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale8);
        com.github.javafaker.Internet internet10 = faker9.internet();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name12 = faker11.name;
        com.github.javafaker.Options options13 = faker11.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = faker11.fakeValuesService;
        com.github.javafaker.service.RandomService randomService15 = null;
        faker11.randomService = randomService15;
        com.github.javafaker.Options options17 = faker11.options;
        java.util.Random random18 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream21 = random18.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream23 = random18.doubles((long) (short) 1);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.service.RandomService randomService25 = faker24.randomService;
        faker11.randomService = randomService25;
        com.github.javafaker.Address address27 = faker11.address;
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name29 = faker28.name;
        com.github.javafaker.Options options30 = faker28.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService31 = faker28.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber32 = null;
        faker28.phoneNumber = phoneNumber32;
        com.github.javafaker.Name name34 = faker28.name();
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name36 = faker35.name;
        com.github.javafaker.Options options37 = faker35.options;
        com.github.javafaker.Name name38 = faker35.name();
        com.github.javafaker.Hacker hacker39 = faker35.hacker();
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book41 = null;
        faker40.book = book41;
        com.github.javafaker.Code code43 = faker40.code();
        faker35.code = code43;
        com.github.javafaker.Address address45 = faker35.address;
        faker28.address = address45;
        faker11.address = address45;
        faker9.address = address45;
        com.github.javafaker.Company company49 = faker9.company();
        faker0.company = company49;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(app6);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(fakeValuesService14);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertNotNull(randomService25);
        org.junit.Assert.assertNotNull(address27);
        org.junit.Assert.assertNotNull(name29);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(fakeValuesService31);
        org.junit.Assert.assertNotNull(name34);
        org.junit.Assert.assertNotNull(name36);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(name38);
        org.junit.Assert.assertNotNull(hacker39);
        org.junit.Assert.assertNotNull(code43);
        org.junit.Assert.assertNotNull(address45);
        org.junit.Assert.assertNotNull(company49);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        java.util.stream.LongStream longStream8 = random0.longs((long) 'u', (long) 'x');
        int int9 = random0.nextInt();
        java.util.stream.LongStream longStream11 = random0.longs((long) 'a');
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1395808272 + "'", int9 == 1395808272);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Canada", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = locale1.getDisplayCountry(locale2);
        java.util.Random random5 = new java.util.Random((long) (byte) 10);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale2, random5);
        double double7 = random5.nextDouble();
        java.util.Random random9 = new java.util.Random((long) 'u');
        int int10 = random9.nextInt();
        java.util.Random random11 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream14 = random11.doubles((double) (byte) 10, (double) '#');
        java.util.stream.LongStream longStream17 = random11.longs((long) 1, (long) (short) 100);
        java.util.Random random19 = new java.util.Random((long) (byte) 10);
        double double20 = random19.nextDouble();
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        random19.nextBytes(byteArray26);
        random11.nextBytes(byteArray26);
        random9.nextBytes(byteArray26);
        random5.nextBytes(byteArray26);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7304302967434272d + "'", double7 == 0.7304302967434272d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1188188233) + "'", int10 == (-1188188233));
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.7304302967434272d + "'", double20 == 0.7304302967434272d);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[58, 93, -1, 65, -76]");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        double double2 = random1.nextDouble();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0, random1);
        boolean boolean5 = random1.nextBoolean();
        java.util.stream.IntStream intStream8 = random1.ints((int) (byte) -1, 20);
        java.util.stream.IntStream intStream9 = random1.ints();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.44358731064595336d + "'", double2 == 0.44358731064595336d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        java.util.Locale locale2 = new java.util.Locale("allemand", "french");
        java.lang.String str3 = locale2.getScript();
        org.junit.Assert.assertEquals(locale2.toString(), "allemand_FRENCH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.IntStream intStream3 = random1.ints();
        long long4 = random1.nextLong();
        java.util.stream.IntStream intStream6 = random1.ints(3162505054923319084L);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-4972683369271453960L) + "'", long4 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale locale4 = new java.util.Locale("Japan");
        java.util.Locale.Builder builder5 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder5.setLanguage("");
        java.util.Locale locale8 = builder5.build();
        java.util.Locale.Builder builder10 = builder5.setRegion("");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "japan");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.Company company7 = faker0.company();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(company7);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        java.lang.String str6 = faker0.numerify("");
        java.lang.String str8 = faker0.letterify("french");
        com.github.javafaker.Color color9 = faker0.color;
        com.github.javafaker.App app10 = faker0.app;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name12 = faker11.name;
        com.github.javafaker.Book book13 = faker11.book;
        com.github.javafaker.Company company14 = faker11.company();
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.util.Random random16 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream19 = random16.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale15, random16);
        com.github.javafaker.Business business21 = null;
        faker20.business = business21;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book24 = null;
        faker23.book = book24;
        com.github.javafaker.Code code26 = faker23.code();
        faker20.code = code26;
        com.github.javafaker.Company company28 = faker20.company;
        faker11.company = company28;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name31 = faker30.name;
        com.github.javafaker.Options options32 = faker30.options;
        com.github.javafaker.Name name33 = faker30.name();
        com.github.javafaker.Hacker hacker34 = faker30.hacker();
        java.lang.String str36 = faker30.numerify("");
        com.github.javafaker.Internet internet37 = faker30.internet();
        com.github.javafaker.Address address38 = faker30.address;
        faker11.address = address38;
        faker0.address = address38;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "french" + "'", str8, "french");
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(app10);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(book13);
        org.junit.Assert.assertNotNull(company14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertNotNull(code26);
        org.junit.Assert.assertNotNull(company28);
        org.junit.Assert.assertNotNull(name31);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(name33);
        org.junit.Assert.assertNotNull(hacker34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(internet37);
        org.junit.Assert.assertNotNull(address38);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name5 = faker4.name;
        com.github.javafaker.Options options6 = faker4.options;
        com.github.javafaker.DateAndTime dateAndTime7 = faker4.date();
        faker0.dateAndTime = dateAndTime7;
        com.github.javafaker.Address address9 = faker0.address;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(address9);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.util.Locale locale6 = new java.util.Locale("", "");
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.ROOT;
        java.lang.String str9 = locale8.toLanguageTag();
        java.lang.String str10 = locale8.getDisplayLanguage();
        java.lang.String str11 = locale2.getDisplayScript(locale8);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "und" + "'", str9, "und");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("French (Canada)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=french (canada)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        java.lang.String str3 = faker0.numerify("Germany");
        com.github.javafaker.Color color4 = faker0.color();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Germany" + "'", str3, "Germany");
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Canada", 0.0d);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Deutschland", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        java.util.Locale locale1 = new java.util.Locale("DE");
        org.junit.Assert.assertEquals(locale1.toString(), "de");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        java.util.Random random1 = new java.util.Random((long) (short) -1);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Lorem lorem6 = faker0.lorem;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Color color10 = faker7.color();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name12 = faker11.name;
        com.github.javafaker.Options options13 = faker11.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = faker11.fakeValuesService;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name16 = faker15.name;
        com.github.javafaker.Options options17 = faker15.options;
        com.github.javafaker.DateAndTime dateAndTime18 = faker15.date();
        faker11.dateAndTime = dateAndTime18;
        faker7.dateAndTime = dateAndTime18;
        faker0.dateAndTime = dateAndTime18;
        com.github.javafaker.Color color22 = faker0.color();
        com.github.javafaker.Business business23 = faker0.business();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(fakeValuesService14);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(dateAndTime18);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(business23);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.IntStream intStream5 = random1.ints((long) (byte) 100, (int) (byte) 1, (int) ' ');
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Name name10 = faker7.name();
        com.github.javafaker.Hacker hacker11 = faker7.hacker();
        java.lang.String str13 = faker7.numerify("");
        java.lang.String str15 = faker7.letterify("french");
        com.github.javafaker.Color color16 = faker7.color;
        faker6.color = color16;
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(hacker11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "french" + "'", str15, "french");
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random0);
        double double8 = random0.nextDouble();
        long long9 = random0.nextLong();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7401367029983512d + "'", double8 == 0.7401367029983512d);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 8278537745003022145L + "'", long9 == 8278537745003022145L);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Random random3 = new java.util.Random((long) '#');
        java.util.stream.LongStream longStream5 = random3.longs((long) 'a');
        boolean boolean6 = random3.nextBoolean();
        java.util.stream.IntStream intStream8 = random3.ints((long) 'u');
        random3.setSeed((-8113469208120271707L));
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.Address address12 = faker11.address;
        com.github.javafaker.Name name13 = faker11.name();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(address12);
        org.junit.Assert.assertNotNull(name13);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale4, random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name12 = faker11.name;
        com.github.javafaker.Options options13 = faker11.options;
        com.github.javafaker.Company company14 = faker11.company();
        faker10.company = company14;
        com.github.javafaker.Hacker hacker16 = faker10.hacker;
        com.github.javafaker.Company company17 = faker10.company;
        com.github.javafaker.Hacker hacker18 = faker10.hacker;
        faker3.hacker = hacker18;
        com.github.javafaker.Finance finance20 = faker3.finance;
        com.github.javafaker.Company company21 = faker3.company;
        com.github.javafaker.Finance finance22 = faker3.finance;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais" + "'", str2, "anglais");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(company14);
        org.junit.Assert.assertNotNull(hacker16);
        org.junit.Assert.assertNotNull(company17);
        org.junit.Assert.assertNotNull(hacker18);
        org.junit.Assert.assertNotNull(finance20);
        org.junit.Assert.assertNotNull(company21);
        org.junit.Assert.assertNotNull(finance22);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        java.util.Random random1 = new java.util.Random((long) 100);
        int int3 = random1.nextInt((int) (short) 1);
        double double4 = random1.nextGaussian();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9875616649976979d + "'", double4 == 0.9875616649976979d);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        com.github.javafaker.Address address3 = faker0.address();
        com.github.javafaker.Lorem lorem4 = faker0.lorem;
        com.github.javafaker.Company company5 = faker0.company();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2);
        java.util.Set<java.lang.Character> charSet6 = locale2.getExtensionKeys();
        java.lang.String str7 = locale0.getDisplayLanguage(locale2);
        boolean boolean8 = locale2.hasExtensions();
        java.util.Random random10 = new java.util.Random((long) '#');
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        boolean boolean12 = locale2.equals((java.lang.Object) random10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Deutschland" + "'", str1, "Deutschland");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anglais" + "'", str4, "anglais");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "German" + "'", str7, "German");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = java.util.Locale.UK;
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        java.lang.String str3 = locale0.getDisplayScript(locale1);
        java.util.Locale.setDefault(locale1);
        java.lang.String str5 = locale1.getLanguage();
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Number number5 = faker4.number;
        faker0.number = number5;
        com.github.javafaker.App app7 = faker0.app;
        com.github.javafaker.Address address8 = faker0.address();
        com.github.javafaker.Finance finance9 = faker0.finance();
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(address8);
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name5 = faker4.name;
        com.github.javafaker.Options options6 = faker4.options;
        com.github.javafaker.Name name7 = faker4.name();
        com.github.javafaker.Hacker hacker8 = faker4.hacker();
        java.lang.String str10 = faker4.numerify("");
        java.lang.String str12 = faker4.letterify("french");
        java.util.Locale locale13 = java.util.Locale.UK;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale13);
        com.github.javafaker.Code code15 = faker14.code;
        java.util.Locale locale16 = java.util.Locale.ENGLISH;
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.lang.String str18 = locale16.getDisplayName(locale17);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale16);
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.util.Random random21 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream24 = random21.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale20, random21);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name28 = faker27.name;
        com.github.javafaker.Options options29 = faker27.options;
        com.github.javafaker.Company company30 = faker27.company();
        faker26.company = company30;
        com.github.javafaker.Hacker hacker32 = faker26.hacker;
        com.github.javafaker.Company company33 = faker26.company;
        com.github.javafaker.Hacker hacker34 = faker26.hacker;
        faker19.hacker = hacker34;
        java.util.Locale locale36 = java.util.Locale.FRANCE;
        java.util.Random random37 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream40 = random37.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(locale36, random37);
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name44 = faker43.name;
        com.github.javafaker.Options options45 = faker43.options;
        com.github.javafaker.Company company46 = faker43.company();
        faker42.company = company46;
        com.github.javafaker.Hacker hacker48 = faker42.hacker;
        com.github.javafaker.Company company49 = faker42.company;
        com.github.javafaker.Hacker hacker50 = faker42.hacker;
        faker19.hacker = hacker50;
        faker14.hacker = hacker50;
        com.github.javafaker.Finance finance53 = faker14.finance;
        faker4.finance = finance53;
        faker0.finance = finance53;
        com.github.javafaker.Company company56 = faker0.company();
        com.github.javafaker.Code code57 = faker0.code;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "french" + "'", str12, "french");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "anglais" + "'", str18, "anglais");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(name28);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(company30);
        org.junit.Assert.assertNotNull(hacker32);
        org.junit.Assert.assertNotNull(company33);
        org.junit.Assert.assertNotNull(hacker34);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream40);
        org.junit.Assert.assertNotNull(name44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(company46);
        org.junit.Assert.assertNotNull(hacker48);
        org.junit.Assert.assertNotNull(company49);
        org.junit.Assert.assertNotNull(hacker50);
        org.junit.Assert.assertNotNull(finance53);
        org.junit.Assert.assertNotNull(company56);
        org.junit.Assert.assertNotNull(code57);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getCountry();
        java.util.Locale locale5 = new java.util.Locale("");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale5.getDisplayCountry(locale6);
        java.lang.String str8 = locale0.getDisplayScript(locale6);
        java.util.Locale locale9 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Germany" + "'", str1, "Germany");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DE" + "'", str3, "DE");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.util.Locale locale0 = java.util.Locale.UK;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Code code2 = faker1.code;
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale3);
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Random random8 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream11 = random8.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale7, random8);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name15 = faker14.name;
        com.github.javafaker.Options options16 = faker14.options;
        com.github.javafaker.Company company17 = faker14.company();
        faker13.company = company17;
        com.github.javafaker.Hacker hacker19 = faker13.hacker;
        com.github.javafaker.Company company20 = faker13.company;
        com.github.javafaker.Hacker hacker21 = faker13.hacker;
        faker6.hacker = hacker21;
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Random random24 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream27 = random24.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale23, random24);
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random24);
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name31 = faker30.name;
        com.github.javafaker.Options options32 = faker30.options;
        com.github.javafaker.Company company33 = faker30.company();
        faker29.company = company33;
        com.github.javafaker.Hacker hacker35 = faker29.hacker;
        com.github.javafaker.Company company36 = faker29.company;
        com.github.javafaker.Hacker hacker37 = faker29.hacker;
        faker6.hacker = hacker37;
        faker1.hacker = hacker37;
        com.github.javafaker.App app40 = faker1.app;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "anglais" + "'", str5, "anglais");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(company17);
        org.junit.Assert.assertNotNull(hacker19);
        org.junit.Assert.assertNotNull(company20);
        org.junit.Assert.assertNotNull(hacker21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(name31);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(company33);
        org.junit.Assert.assertNotNull(hacker35);
        org.junit.Assert.assertNotNull(company36);
        org.junit.Assert.assertNotNull(hacker37);
        org.junit.Assert.assertNotNull(app40);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        com.github.javafaker.Book book8 = faker5.book;
        com.github.javafaker.Address address9 = faker5.address();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name11 = faker10.name;
        com.github.javafaker.Options options12 = faker10.options;
        com.github.javafaker.Company company13 = faker10.company();
        faker5.company = company13;
        com.github.javafaker.Company company15 = faker5.company;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(company15);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        java.util.Locale locale1 = new java.util.Locale("Japan");
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale.setDefault(category3, locale4);
        java.util.Locale locale7 = java.util.Locale.getDefault(category3);
        java.lang.String str8 = locale1.getDisplayLanguage(locale7);
        org.junit.Assert.assertEquals(locale1.toString(), "japan");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "japan" + "'", str8, "japan");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.util.Random random1 = new java.util.Random((long) 'u');
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        java.util.stream.IntStream intStream5 = random1.ints(1, (int) ' ');
        long long6 = random1.nextLong();
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-5103229603519042219L) + "'", long6 == (-5103229603519042219L));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        java.lang.String str6 = faker0.numerify("");
        java.lang.String str8 = faker0.letterify("french");
        com.github.javafaker.Internet internet9 = faker0.internet;
        com.github.javafaker.Lorem lorem10 = faker0.lorem();
        com.github.javafaker.Business business11 = faker0.business();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "french" + "'", str8, "french");
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNotNull(business11);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Company company3 = faker0.company();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale4, random5);
        com.github.javafaker.Business business10 = null;
        faker9.business = business10;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book13 = null;
        faker12.book = book13;
        com.github.javafaker.Code code15 = faker12.code();
        faker9.code = code15;
        java.lang.String str18 = faker9.bothify("Japan");
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService22 = faker19.fakeValuesService;
        com.github.javafaker.service.RandomService randomService23 = null;
        faker19.randomService = randomService23;
        com.github.javafaker.Options options25 = faker19.options;
        java.util.Random random26 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream29 = random26.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream31 = random26.doubles((long) (short) 1);
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.service.RandomService randomService33 = faker32.randomService;
        faker19.randomService = randomService33;
        com.github.javafaker.Address address35 = faker19.address;
        com.github.javafaker.Lorem lorem36 = faker19.lorem();
        faker9.lorem = lorem36;
        faker0.lorem = lorem36;
        com.github.javafaker.service.FakeValuesService fakeValuesService39 = faker0.fakeValuesService;
        com.github.javafaker.Company company40 = faker0.company;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Japan" + "'", str18, "Japan");
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(fakeValuesService22);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertNotNull(randomService33);
        org.junit.Assert.assertNotNull(address35);
        org.junit.Assert.assertNotNull(lorem36);
        org.junit.Assert.assertNotNull(fakeValuesService39);
        org.junit.Assert.assertNotNull(company40);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        java.util.Random random3 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name9 = faker8.name;
        com.github.javafaker.Options options10 = faker8.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = faker8.fakeValuesService;
        com.github.javafaker.service.RandomService randomService12 = null;
        faker8.randomService = randomService12;
        com.github.javafaker.Options options14 = faker8.options;
        java.util.Random random15 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream18 = random15.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream20 = random15.doubles((long) (short) 1);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.service.RandomService randomService22 = faker21.randomService;
        faker8.randomService = randomService22;
        com.github.javafaker.Address address24 = faker8.address;
        com.github.javafaker.Lorem lorem25 = faker8.lorem();
        faker7.lorem = lorem25;
        faker2.lorem = lorem25;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(fakeValuesService11);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(randomService22);
        org.junit.Assert.assertNotNull(address24);
        org.junit.Assert.assertNotNull(lorem25);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        com.github.javafaker.Code code3 = faker0.code();
        com.github.javafaker.Book book4 = faker0.book;
        com.github.javafaker.Code code5 = faker0.code();
        com.github.javafaker.Number number6 = faker0.number;
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Name name5 = faker0.name;
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = faker0.fakeValuesService;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.Color color8 = faker5.color();
        faker0.color = color8;
        com.github.javafaker.Finance finance10 = faker0.finance;
        com.github.javafaker.App app11 = faker0.app;
        com.github.javafaker.Hacker hacker12 = faker0.hacker();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(app11);
        org.junit.Assert.assertNotNull(hacker12);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        java.util.Random random1 = new java.util.Random((long) 'u');
        int int3 = random1.nextInt((int) ' ');
        double double4 = random1.nextDouble();
        random1.setSeed((-4972683369271453960L));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6991794951529816d + "'", double4 == 0.6991794951529816d);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        java.util.Locale locale1 = new java.util.Locale("Japan");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = locale3.stripExtensions();
        boolean boolean5 = locale4.hasExtensions();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale4);
        java.lang.String str7 = locale4.getVariant();
        java.lang.String str8 = locale1.getDisplayCountry(locale4);
        org.junit.Assert.assertEquals(locale1.toString(), "japan");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "japan");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Internet internet2 = faker0.internet;
        com.github.javafaker.Finance finance3 = faker0.finance();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(finance3);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        boolean boolean4 = locale1.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale1.getDisplayLanguage(locale5);
        java.util.Locale locale7 = locale5.stripExtensions();
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale7, random8);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Random random11 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream14 = random11.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale10, random11);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Internet internet17 = faker16.internet;
        com.github.javafaker.Name name18 = faker16.name();
        com.github.javafaker.Color color19 = faker16.color();
        com.github.javafaker.Name name20 = faker16.name;
        com.github.javafaker.Book book21 = faker16.book();
        faker9.book = book21;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = faker9.resolve("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(internet17);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(book21);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name5 = faker4.name;
        com.github.javafaker.Options options6 = faker4.options;
        com.github.javafaker.Name name7 = faker4.name();
        com.github.javafaker.Hacker hacker8 = faker4.hacker();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = faker4.fakeValuesService;
        com.github.javafaker.Book book10 = faker4.book();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name12 = faker11.name;
        com.github.javafaker.Options options13 = faker11.options;
        com.github.javafaker.Name name14 = faker11.name();
        com.github.javafaker.Hacker hacker15 = faker11.hacker();
        com.github.javafaker.service.FakeValuesService fakeValuesService16 = faker11.fakeValuesService;
        faker4.fakeValuesService = fakeValuesService16;
        faker2.fakeValuesService = fakeValuesService16;
        com.github.javafaker.Options options19 = faker2.options();
        com.github.javafaker.Book book20 = faker2.book();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(name14);
        org.junit.Assert.assertNotNull(hacker15);
        org.junit.Assert.assertNotNull(fakeValuesService16);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(book20);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("Japan");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setLanguageTag("French (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: French (Canada) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("German");
        java.util.Locale locale7 = builder3.build();
        java.lang.String str8 = locale2.getDisplayLanguage(locale7);
        java.lang.String str9 = locale2.getVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker5.fakeValuesService;
        com.github.javafaker.service.RandomService randomService9 = null;
        faker5.randomService = randomService9;
        com.github.javafaker.Options options11 = faker5.options;
        java.util.Random random12 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream15 = random12.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream17 = random12.doubles((long) (short) 1);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.service.RandomService randomService19 = faker18.randomService;
        faker5.randomService = randomService19;
        com.github.javafaker.Address address21 = faker5.address;
        com.github.javafaker.Lorem lorem22 = faker5.lorem();
        faker4.lorem = lorem22;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name25 = faker24.name;
        com.github.javafaker.Business business26 = null;
        faker24.business = business26;
        com.github.javafaker.PhoneNumber phoneNumber28 = faker24.phoneNumber;
        com.github.javafaker.App app29 = faker24.app();
        com.github.javafaker.Code code30 = faker24.code();
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book32 = null;
        faker31.book = book32;
        java.lang.String str35 = faker31.bothify("Germany");
        com.github.javafaker.Business business36 = faker31.business;
        faker24.business = business36;
        java.util.Locale locale38 = java.util.Locale.FRANCE;
        java.util.Random random39 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream42 = random39.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker(locale38, random39);
        com.github.javafaker.Business business44 = null;
        faker43.business = business44;
        com.github.javafaker.Book book46 = faker43.book;
        faker24.book = book46;
        com.github.javafaker.Internet internet48 = faker24.internet();
        faker4.internet = internet48;
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertNotNull(randomService19);
        org.junit.Assert.assertNotNull(address21);
        org.junit.Assert.assertNotNull(lorem22);
        org.junit.Assert.assertNotNull(name25);
        org.junit.Assert.assertNotNull(phoneNumber28);
        org.junit.Assert.assertNotNull(app29);
        org.junit.Assert.assertNotNull(code30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Germany" + "'", str35, "Germany");
        org.junit.Assert.assertNotNull(business36);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream42);
        org.junit.Assert.assertNotNull(book46);
        org.junit.Assert.assertNotNull(internet48);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        boolean boolean4 = locale1.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale1.getDisplayLanguage(locale5);
        java.util.Locale locale7 = locale5.stripExtensions();
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale7, random8);
        java.lang.String str10 = locale7.getDisplayName();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "German (Germany)" + "'", str10, "German (Germany)");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        boolean boolean2 = locale1.hasExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1);
        java.lang.String str4 = locale1.getVariant();
        java.util.Set<java.lang.Character> charSet5 = locale1.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale1.getUnicodeLocaleType("German");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: German");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charSet5);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        java.util.Locale locale1 = new java.util.Locale("ja");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "ja");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "ja");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "ja");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.Color color8 = faker5.color();
        faker0.color = color8;
        com.github.javafaker.Finance finance10 = faker0.finance;
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name14 = faker13.name;
        com.github.javafaker.Business business15 = null;
        faker13.business = business15;
        com.github.javafaker.PhoneNumber phoneNumber17 = faker13.phoneNumber;
        com.github.javafaker.App app18 = faker13.app();
        com.github.javafaker.Book book19 = faker13.book;
        faker12.book = book19;
        java.util.Locale locale21 = java.util.Locale.ENGLISH;
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        java.lang.String str23 = locale21.getDisplayName(locale22);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale21);
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.util.Random random26 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream29 = random26.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale25, random26);
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name33 = faker32.name;
        com.github.javafaker.Options options34 = faker32.options;
        com.github.javafaker.Company company35 = faker32.company();
        faker31.company = company35;
        com.github.javafaker.Hacker hacker37 = faker31.hacker;
        com.github.javafaker.Company company38 = faker31.company;
        com.github.javafaker.Hacker hacker39 = faker31.hacker;
        faker24.hacker = hacker39;
        com.github.javafaker.Finance finance41 = faker24.finance;
        faker12.finance = finance41;
        java.util.Locale locale43 = java.util.Locale.ENGLISH;
        java.util.Locale locale44 = java.util.Locale.FRANCE;
        java.lang.String str45 = locale43.getDisplayName(locale44);
        com.github.javafaker.Faker faker46 = new com.github.javafaker.Faker(locale43);
        java.util.Locale locale47 = java.util.Locale.FRANCE;
        java.util.Random random48 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream51 = random48.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker52 = new com.github.javafaker.Faker(locale47, random48);
        com.github.javafaker.Faker faker53 = new com.github.javafaker.Faker(random48);
        com.github.javafaker.Faker faker54 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name55 = faker54.name;
        com.github.javafaker.Options options56 = faker54.options;
        com.github.javafaker.Company company57 = faker54.company();
        faker53.company = company57;
        com.github.javafaker.Hacker hacker59 = faker53.hacker;
        com.github.javafaker.Company company60 = faker53.company;
        com.github.javafaker.Hacker hacker61 = faker53.hacker;
        faker46.hacker = hacker61;
        com.github.javafaker.Internet internet63 = faker46.internet;
        faker12.internet = internet63;
        faker0.internet = internet63;
        com.github.javafaker.Name name66 = faker0.name;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(name14);
        org.junit.Assert.assertNotNull(phoneNumber17);
        org.junit.Assert.assertNotNull(app18);
        org.junit.Assert.assertNotNull(book19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "anglais" + "'", str23, "anglais");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(name33);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(company35);
        org.junit.Assert.assertNotNull(hacker37);
        org.junit.Assert.assertNotNull(company38);
        org.junit.Assert.assertNotNull(hacker39);
        org.junit.Assert.assertNotNull(finance41);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "anglais" + "'", str45, "anglais");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream51);
        org.junit.Assert.assertNotNull(name55);
        org.junit.Assert.assertNotNull(options56);
        org.junit.Assert.assertNotNull(company57);
        org.junit.Assert.assertNotNull(hacker59);
        org.junit.Assert.assertNotNull(company60);
        org.junit.Assert.assertNotNull(hacker61);
        org.junit.Assert.assertNotNull(internet63);
        org.junit.Assert.assertNotNull(name66);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        com.github.javafaker.Book book6 = faker0.book();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Name name10 = faker7.name();
        com.github.javafaker.Hacker hacker11 = faker7.hacker();
        com.github.javafaker.Internet internet12 = faker7.internet();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name14 = faker13.name;
        com.github.javafaker.Options options15 = faker13.options;
        com.github.javafaker.App app16 = faker13.app();
        com.github.javafaker.Options options17 = faker13.options;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name19 = faker18.name;
        com.github.javafaker.Options options20 = faker18.options;
        com.github.javafaker.Color color21 = faker18.color();
        faker13.color = color21;
        com.github.javafaker.Finance finance23 = faker13.finance;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book25 = null;
        faker24.book = book25;
        java.util.Random random27 = null;
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(random27);
        com.github.javafaker.Number number29 = faker28.number;
        faker24.number = number29;
        faker13.number = number29;
        faker7.number = number29;
        com.github.javafaker.Finance finance33 = faker7.finance;
        faker0.finance = finance33;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(hacker11);
        org.junit.Assert.assertNotNull(internet12);
        org.junit.Assert.assertNotNull(name14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(app16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(name19);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(finance23);
        org.junit.Assert.assertNotNull(number29);
        org.junit.Assert.assertNotNull(finance33);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u65e5\u672c", 0.23893314808203703d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.util.Locale locale2 = new java.util.Locale("hi!", "de-DE");
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_DE-DE");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.util.Locale locale3 = new java.util.Locale("Chinese", "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))", "English (Canada)");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: chinese_JAPAN (DE-DE,?? (?????))_English (Canada) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))_English (Canada)");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Deutschland", 0.21103359155983303d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=deutschland");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str4 = locale2.getDisplayName();
        boolean boolean5 = locale2.hasExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale2.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = locale0.getDisplayLanguage(locale1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = null; // flaky: locale0.getDisplayScript(locale4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str3, "\u4e2d\u56fd\u8a9e");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = locale1.getDisplayCountry(locale2);
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2, random4);
        java.lang.String str6 = locale2.getCountry();
        java.lang.String str7 = locale2.getScript();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale2);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FR" + "'", str6, "FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream12 = random7.doubles((long) (short) 1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService14 = faker13.randomService;
        faker0.randomService = randomService14;
        com.github.javafaker.Address address16 = faker0.address;
        com.github.javafaker.Lorem lorem17 = faker0.lorem();
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Random random19 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream22 = random19.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(locale18, random19);
        com.github.javafaker.Business business24 = null;
        faker23.business = business24;
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book27 = null;
        faker26.book = book27;
        com.github.javafaker.Code code29 = faker26.code();
        faker23.code = code29;
        com.github.javafaker.Company company31 = faker23.company;
        com.github.javafaker.PhoneNumber phoneNumber32 = faker23.phoneNumber;
        faker0.phoneNumber = phoneNumber32;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(randomService14);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(lorem17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertNotNull(code29);
        org.junit.Assert.assertNotNull(company31);
        org.junit.Assert.assertNotNull(phoneNumber32);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        java.util.Random random1 = new java.util.Random((long) 1);
        long long2 = random1.nextLong();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        java.util.stream.LongStream longStream5 = random1.longs();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4964420948893066024L) + "'", long2 == (-4964420948893066024L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale4, random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name12 = faker11.name;
        com.github.javafaker.Options options13 = faker11.options;
        com.github.javafaker.Company company14 = faker11.company();
        faker10.company = company14;
        com.github.javafaker.Hacker hacker16 = faker10.hacker;
        com.github.javafaker.Company company17 = faker10.company;
        com.github.javafaker.Hacker hacker18 = faker10.hacker;
        faker3.hacker = hacker18;
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.util.Random random21 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream24 = random21.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale20, random21);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name28 = faker27.name;
        com.github.javafaker.Options options29 = faker27.options;
        com.github.javafaker.Company company30 = faker27.company();
        faker26.company = company30;
        com.github.javafaker.Hacker hacker32 = faker26.hacker;
        com.github.javafaker.Company company33 = faker26.company;
        com.github.javafaker.Hacker hacker34 = faker26.hacker;
        faker3.hacker = hacker34;
        com.github.javafaker.Hacker hacker36 = faker3.hacker();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais" + "'", str2, "anglais");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(company14);
        org.junit.Assert.assertNotNull(hacker16);
        org.junit.Assert.assertNotNull(company17);
        org.junit.Assert.assertNotNull(hacker18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(name28);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(company30);
        org.junit.Assert.assertNotNull(hacker32);
        org.junit.Assert.assertNotNull(company33);
        org.junit.Assert.assertNotNull(hacker34);
        org.junit.Assert.assertNotNull(hacker36);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Finance finance2 = faker1.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(finance2);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Name name10 = faker7.name();
        faker0.name = name10;
        com.github.javafaker.Internet internet12 = faker0.internet;
        com.github.javafaker.Internet internet13 = faker0.internet;
        com.github.javafaker.Internet internet14 = faker0.internet;
        java.lang.String str16 = faker0.numerify("Germany");
        com.github.javafaker.Internet internet17 = faker0.internet;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(internet12);
        org.junit.Assert.assertNotNull(internet13);
        org.junit.Assert.assertNotNull(internet14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Germany" + "'", str16, "Germany");
        org.junit.Assert.assertNotNull(internet17);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.lang.String str4 = locale0.getDisplayName(locale2);
        java.lang.String str5 = locale0.getCountry();
        java.util.Random random6 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream9 = random6.doubles((double) (byte) 10, (double) '#');
        java.util.stream.LongStream longStream12 = random6.longs((long) 1, (long) (short) 100);
        java.util.Random random14 = new java.util.Random((long) (byte) 10);
        double double15 = random14.nextDouble();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        random14.nextBytes(byteArray21);
        random6.nextBytes(byteArray21);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale0, random6);
        java.lang.String str25 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anglais" + "'", str3, "anglais");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.7304302967434272d + "'", double15 == 0.7304302967434272d);
        org.junit.Assert.assertNotNull(byteArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-8, -83, 97, -61, -18]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "deu" + "'", str25, "deu");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber4 = null;
        faker0.phoneNumber = phoneNumber4;
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Name name10 = faker7.name();
        com.github.javafaker.Hacker hacker11 = faker7.hacker();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book13 = null;
        faker12.book = book13;
        com.github.javafaker.Code code15 = faker12.code();
        faker7.code = code15;
        com.github.javafaker.Address address17 = faker7.address;
        faker0.address = address17;
        com.github.javafaker.App app19 = faker0.app();
        com.github.javafaker.DateAndTime dateAndTime20 = faker0.dateAndTime;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(hacker11);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertNotNull(address17);
        org.junit.Assert.assertNotNull(app19);
        org.junit.Assert.assertNotNull(dateAndTime20);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.util.Locale locale2 = new java.util.Locale("\u82f1\u8a9e", "german (germany)");
        org.junit.Assert.assertEquals(locale2.toString(), "\u82f1\u8a9e_GERMAN (GERMANY)");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.Company company13 = faker6.company;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name15 = faker14.name;
        com.github.javafaker.Options options16 = faker14.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService17 = faker14.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber18 = null;
        faker14.phoneNumber = phoneNumber18;
        com.github.javafaker.Name name20 = faker14.name();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name22 = faker21.name;
        com.github.javafaker.Options options23 = faker21.options;
        com.github.javafaker.Name name24 = faker21.name();
        com.github.javafaker.Hacker hacker25 = faker21.hacker();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book27 = null;
        faker26.book = book27;
        com.github.javafaker.Code code29 = faker26.code();
        faker21.code = code29;
        com.github.javafaker.Address address31 = faker21.address;
        faker14.address = address31;
        faker6.address = address31;
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book35 = null;
        faker34.book = book35;
        java.util.Random random37 = null;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Number number39 = faker38.number;
        faker34.number = number39;
        faker6.number = number39;
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name43 = faker42.name;
        com.github.javafaker.Options options44 = faker42.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService45 = faker42.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber46 = null;
        faker42.phoneNumber = phoneNumber46;
        com.github.javafaker.Name name48 = faker42.name();
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name50 = faker49.name;
        com.github.javafaker.Options options51 = faker49.options;
        com.github.javafaker.Name name52 = faker49.name();
        com.github.javafaker.Hacker hacker53 = faker49.hacker();
        com.github.javafaker.Faker faker54 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book55 = null;
        faker54.book = book55;
        com.github.javafaker.Code code57 = faker54.code();
        faker49.code = code57;
        com.github.javafaker.Address address59 = faker49.address;
        faker42.address = address59;
        faker6.address = address59;
        java.util.Locale locale62 = java.util.Locale.FRANCE;
        java.util.Random random63 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream66 = random63.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker67 = new com.github.javafaker.Faker(locale62, random63);
        com.github.javafaker.Faker faker68 = new com.github.javafaker.Faker(random63);
        com.github.javafaker.Faker faker69 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name70 = faker69.name;
        com.github.javafaker.Options options71 = faker69.options;
        com.github.javafaker.Company company72 = faker69.company();
        faker68.company = company72;
        com.github.javafaker.Hacker hacker74 = faker68.hacker;
        com.github.javafaker.PhoneNumber phoneNumber75 = faker68.phoneNumber;
        com.github.javafaker.Number number76 = faker68.number();
        faker6.number = number76;
        com.github.javafaker.Address address78 = faker6.address;
        com.github.javafaker.Internet internet79 = null;
        faker6.internet = internet79;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(fakeValuesService17);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(hacker25);
        org.junit.Assert.assertNotNull(code29);
        org.junit.Assert.assertNotNull(address31);
        org.junit.Assert.assertNotNull(number39);
        org.junit.Assert.assertNotNull(name43);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNotNull(fakeValuesService45);
        org.junit.Assert.assertNotNull(name48);
        org.junit.Assert.assertNotNull(name50);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertNotNull(name52);
        org.junit.Assert.assertNotNull(hacker53);
        org.junit.Assert.assertNotNull(code57);
        org.junit.Assert.assertNotNull(address59);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream66);
        org.junit.Assert.assertNotNull(name70);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertNotNull(company72);
        org.junit.Assert.assertNotNull(hacker74);
        org.junit.Assert.assertNotNull(phoneNumber75);
        org.junit.Assert.assertNotNull(number76);
        org.junit.Assert.assertNotNull(address78);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name3 = faker2.name;
        com.github.javafaker.Options options4 = faker2.options;
        com.github.javafaker.App app5 = faker2.app();
        faker1.app = app5;
        com.github.javafaker.Code code7 = faker1.code();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Random random9 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream12 = random9.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale8, random9);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name16 = faker15.name;
        com.github.javafaker.Options options17 = faker15.options;
        com.github.javafaker.Company company18 = faker15.company();
        faker14.company = company18;
        com.github.javafaker.Hacker hacker20 = faker14.hacker;
        com.github.javafaker.PhoneNumber phoneNumber21 = faker14.phoneNumber;
        com.github.javafaker.Number number22 = faker14.number();
        java.util.Locale locale23 = java.util.Locale.UK;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale23);
        com.github.javafaker.Internet internet25 = faker24.internet();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name27 = faker26.name;
        com.github.javafaker.Options options28 = faker26.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService29 = faker26.fakeValuesService;
        com.github.javafaker.service.RandomService randomService30 = null;
        faker26.randomService = randomService30;
        com.github.javafaker.Options options32 = faker26.options;
        java.util.Random random33 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream36 = random33.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream38 = random33.doubles((long) (short) 1);
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(random33);
        com.github.javafaker.service.RandomService randomService40 = faker39.randomService;
        faker26.randomService = randomService40;
        com.github.javafaker.Address address42 = faker26.address;
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name44 = faker43.name;
        com.github.javafaker.Options options45 = faker43.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService46 = faker43.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber47 = null;
        faker43.phoneNumber = phoneNumber47;
        com.github.javafaker.Name name49 = faker43.name();
        com.github.javafaker.Faker faker50 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name51 = faker50.name;
        com.github.javafaker.Options options52 = faker50.options;
        com.github.javafaker.Name name53 = faker50.name();
        com.github.javafaker.Hacker hacker54 = faker50.hacker();
        com.github.javafaker.Faker faker55 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book56 = null;
        faker55.book = book56;
        com.github.javafaker.Code code58 = faker55.code();
        faker50.code = code58;
        com.github.javafaker.Address address60 = faker50.address;
        faker43.address = address60;
        faker26.address = address60;
        faker24.address = address60;
        com.github.javafaker.Hacker hacker64 = faker24.hacker;
        com.github.javafaker.Faker faker65 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name66 = faker65.name;
        com.github.javafaker.Options options67 = faker65.options;
        com.github.javafaker.App app68 = faker65.app();
        com.github.javafaker.Options options69 = faker65.options;
        com.github.javafaker.Options options70 = faker65.options();
        faker24.options = options70;
        faker14.options = options70;
        com.github.javafaker.Hacker hacker73 = faker14.hacker();
        faker1.hacker = hacker73;
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(company18);
        org.junit.Assert.assertNotNull(hacker20);
        org.junit.Assert.assertNotNull(phoneNumber21);
        org.junit.Assert.assertNotNull(number22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_GB");
        org.junit.Assert.assertNotNull(internet25);
        org.junit.Assert.assertNotNull(name27);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(fakeValuesService29);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(doubleStream36);
        org.junit.Assert.assertNotNull(doubleStream38);
        org.junit.Assert.assertNotNull(randomService40);
        org.junit.Assert.assertNotNull(address42);
        org.junit.Assert.assertNotNull(name44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(fakeValuesService46);
        org.junit.Assert.assertNotNull(name49);
        org.junit.Assert.assertNotNull(name51);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertNotNull(name53);
        org.junit.Assert.assertNotNull(hacker54);
        org.junit.Assert.assertNotNull(code58);
        org.junit.Assert.assertNotNull(address60);
        org.junit.Assert.assertNotNull(hacker64);
        org.junit.Assert.assertNotNull(name66);
        org.junit.Assert.assertNotNull(options67);
        org.junit.Assert.assertNotNull(app68);
        org.junit.Assert.assertNotNull(options69);
        org.junit.Assert.assertNotNull(options70);
        org.junit.Assert.assertNotNull(hacker73);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = new java.util.Locale("", "");
        java.util.Locale locale6 = java.util.Locale.UK;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale5.getDisplayLanguage(locale7);
        java.lang.String str9 = locale7.getDisplayVariant();
        java.util.Locale.setDefault(category0, locale7);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        java.util.Random random1 = new java.util.Random((long) 23);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.App app3 = faker2.app();
        org.junit.Assert.assertNotNull(app3);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Lorem lorem6 = faker0.lorem;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Color color10 = faker7.color();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name12 = faker11.name;
        com.github.javafaker.Options options13 = faker11.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = faker11.fakeValuesService;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name16 = faker15.name;
        com.github.javafaker.Options options17 = faker15.options;
        com.github.javafaker.DateAndTime dateAndTime18 = faker15.date();
        faker11.dateAndTime = dateAndTime18;
        faker7.dateAndTime = dateAndTime18;
        faker0.dateAndTime = dateAndTime18;
        com.github.javafaker.Hacker hacker22 = faker0.hacker;
        com.github.javafaker.service.FakeValuesService fakeValuesService23 = faker0.fakeValuesService;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(fakeValuesService14);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(dateAndTime18);
        org.junit.Assert.assertNotNull(hacker22);
        org.junit.Assert.assertNotNull(fakeValuesService23);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Japanese");
        java.util.Locale.setDefault(locale1);
        java.lang.String str3 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "japanese");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        double double7 = random1.nextDouble();
        double double8 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.11868689588225534d + "'", double7 == 0.11868689588225534d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0075679741157871185d + "'", double8 == 0.0075679741157871185d);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Company company3 = faker0.company();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale4, random5);
        com.github.javafaker.Business business10 = null;
        faker9.business = business10;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book13 = null;
        faker12.book = book13;
        com.github.javafaker.Code code15 = faker12.code();
        faker9.code = code15;
        java.lang.String str18 = faker9.bothify("Japan");
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService22 = faker19.fakeValuesService;
        com.github.javafaker.service.RandomService randomService23 = null;
        faker19.randomService = randomService23;
        com.github.javafaker.Options options25 = faker19.options;
        java.util.Random random26 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream29 = random26.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream31 = random26.doubles((long) (short) 1);
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.service.RandomService randomService33 = faker32.randomService;
        faker19.randomService = randomService33;
        com.github.javafaker.Address address35 = faker19.address;
        com.github.javafaker.Lorem lorem36 = faker19.lorem();
        faker9.lorem = lorem36;
        faker0.lorem = lorem36;
        com.github.javafaker.service.FakeValuesService fakeValuesService39 = faker0.fakeValuesService;
        com.github.javafaker.Business business40 = faker0.business;
        com.github.javafaker.service.FakeValuesService fakeValuesService41 = faker0.fakeValuesService;
        java.util.Locale locale42 = java.util.Locale.FRANCE;
        java.util.Random random43 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream46 = random43.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker47 = new com.github.javafaker.Faker(locale42, random43);
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(random43);
        com.github.javafaker.Internet internet49 = faker48.internet;
        faker0.internet = internet49;
        com.github.javafaker.service.RandomService randomService51 = faker0.randomService;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Japan" + "'", str18, "Japan");
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(fakeValuesService22);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertNotNull(randomService33);
        org.junit.Assert.assertNotNull(address35);
        org.junit.Assert.assertNotNull(lorem36);
        org.junit.Assert.assertNotNull(fakeValuesService39);
        org.junit.Assert.assertNotNull(business40);
        org.junit.Assert.assertNotNull(fakeValuesService41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream46);
        org.junit.Assert.assertNotNull(internet49);
        org.junit.Assert.assertNotNull(randomService51);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = java.util.Locale.UK;
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        java.lang.String str3 = locale0.getDisplayScript(locale1);
        java.util.Locale.setDefault(locale1);
        java.lang.String str5 = locale1.getLanguage();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Name name5 = faker0.name;
        com.github.javafaker.App app6 = faker0.app;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Book book9 = faker7.book;
        com.github.javafaker.Company company10 = faker7.company();
        com.github.javafaker.Book book11 = faker7.book();
        com.github.javafaker.Code code12 = faker7.code();
        com.github.javafaker.Hacker hacker13 = faker7.hacker();
        faker0.hacker = hacker13;
        java.lang.String str16 = faker0.numerify("ja");
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(app6);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(hacker13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ja" + "'", str16, "ja");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book9 = null;
        faker8.book = book9;
        com.github.javafaker.Code code11 = faker8.code();
        faker5.code = code11;
        com.github.javafaker.Company company13 = faker5.company;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book15 = null;
        faker14.book = book15;
        java.lang.String str18 = faker14.bothify("Germany");
        com.github.javafaker.Business business19 = faker14.business;
        faker5.business = business19;
        com.github.javafaker.Finance finance21 = faker5.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Germany" + "'", str18, "Germany");
        org.junit.Assert.assertNotNull(business19);
        org.junit.Assert.assertNotNull(finance21);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        java.util.Random random1 = new java.util.Random((long) (byte) 1);
        boolean boolean2 = random1.nextBoolean();
        float float3 = random1.nextFloat();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        java.util.stream.LongStream longStream11 = random5.longs((long) 1, (long) (short) 100);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random5);
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = locale13.getDisplayName(locale14);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale13);
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Random random18 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream21 = random18.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale17, random18);
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name25 = faker24.name;
        com.github.javafaker.Options options26 = faker24.options;
        com.github.javafaker.Company company27 = faker24.company();
        faker23.company = company27;
        com.github.javafaker.Hacker hacker29 = faker23.hacker;
        com.github.javafaker.Company company30 = faker23.company;
        com.github.javafaker.Hacker hacker31 = faker23.hacker;
        faker16.hacker = hacker31;
        faker12.hacker = hacker31;
        faker4.hacker = hacker31;
        java.util.Random random35 = null;
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(random35);
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name38 = faker37.name;
        com.github.javafaker.Options options39 = faker37.options;
        com.github.javafaker.App app40 = faker37.app();
        faker36.app = app40;
        com.github.javafaker.Code code42 = faker36.code();
        com.github.javafaker.service.RandomService randomService43 = faker36.randomService;
        faker4.randomService = randomService43;
        com.github.javafaker.App app45 = faker4.app();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.100473166f + "'", float3 == 0.100473166f);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "anglais" + "'", str15, "anglais");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(name25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(company27);
        org.junit.Assert.assertNotNull(hacker29);
        org.junit.Assert.assertNotNull(company30);
        org.junit.Assert.assertNotNull(hacker31);
        org.junit.Assert.assertNotNull(name38);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(app40);
        org.junit.Assert.assertNotNull(code42);
        org.junit.Assert.assertNotNull(randomService43);
        org.junit.Assert.assertNotNull(app45);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.util.Random random1 = new java.util.Random((long) 25);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.bothify("Chinese (China)");
        java.lang.Class<?> wildcardClass5 = faker2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinese (China)" + "'", str4, "Chinese (China)");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        java.util.Locale locale2 = new java.util.Locale("ja", "Chinese");
        org.junit.Assert.assertEquals(locale2.toString(), "ja_CHINESE");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber4 = null;
        faker0.phoneNumber = phoneNumber4;
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Options options7 = faker0.options();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker0.fakeValuesService;
        java.lang.String str10 = faker0.numerify("United Kingdom");
        com.github.javafaker.Address address11 = faker0.address();
        com.github.javafaker.Company company12 = faker0.company;
        com.github.javafaker.PhoneNumber phoneNumber13 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "United Kingdom" + "'", str10, "United Kingdom");
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(company12);
        org.junit.Assert.assertNull(phoneNumber13);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        java.lang.String str3 = faker0.letterify("hi!");
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name5 = faker4.name;
        com.github.javafaker.Options options6 = faker4.options;
        com.github.javafaker.App app7 = faker4.app();
        faker0.app = app7;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Random random10 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream13 = random10.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale9, random10);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name17 = faker16.name;
        com.github.javafaker.Options options18 = faker16.options;
        com.github.javafaker.Company company19 = faker16.company();
        faker15.company = company19;
        com.github.javafaker.Hacker hacker21 = faker15.hacker;
        com.github.javafaker.Company company22 = faker15.company;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name24 = faker23.name;
        com.github.javafaker.Options options25 = faker23.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService26 = faker23.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber27 = null;
        faker23.phoneNumber = phoneNumber27;
        com.github.javafaker.Name name29 = faker23.name();
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name31 = faker30.name;
        com.github.javafaker.Options options32 = faker30.options;
        com.github.javafaker.Name name33 = faker30.name();
        com.github.javafaker.Hacker hacker34 = faker30.hacker();
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book36 = null;
        faker35.book = book36;
        com.github.javafaker.Code code38 = faker35.code();
        faker30.code = code38;
        com.github.javafaker.Address address40 = faker30.address;
        faker23.address = address40;
        faker15.address = address40;
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name44 = faker43.name;
        com.github.javafaker.Options options45 = faker43.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService46 = faker43.fakeValuesService;
        com.github.javafaker.Faker faker47 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name48 = faker47.name;
        com.github.javafaker.Options options49 = faker47.options;
        com.github.javafaker.DateAndTime dateAndTime50 = faker47.date();
        faker43.dateAndTime = dateAndTime50;
        com.github.javafaker.Address address52 = faker43.address();
        faker15.address = address52;
        faker0.address = address52;
        com.github.javafaker.Business business55 = faker0.business;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(name17);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(company19);
        org.junit.Assert.assertNotNull(hacker21);
        org.junit.Assert.assertNotNull(company22);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(fakeValuesService26);
        org.junit.Assert.assertNotNull(name29);
        org.junit.Assert.assertNotNull(name31);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(name33);
        org.junit.Assert.assertNotNull(hacker34);
        org.junit.Assert.assertNotNull(code38);
        org.junit.Assert.assertNotNull(address40);
        org.junit.Assert.assertNotNull(name44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(fakeValuesService46);
        org.junit.Assert.assertNotNull(name48);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertNotNull(dateAndTime50);
        org.junit.Assert.assertNotNull(address52);
        org.junit.Assert.assertNotNull(business55);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        java.util.Locale.Builder builder9 = builder5.addUnicodeLocaleAttribute("Germany");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder5.setRegion("JPN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: JPN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        java.util.Random random1 = new java.util.Random((long) '#');
        java.util.stream.LongStream longStream3 = random1.longs((long) 'a');
        boolean boolean4 = random1.nextBoolean();
        java.util.stream.IntStream intStream6 = random1.ints((long) 'u');
        java.util.stream.LongStream longStream9 = random1.longs((-4964420948893066024L), (long) (short) 1);
        long long10 = random1.nextLong();
        java.util.stream.LongStream longStream12 = random1.longs((long) 3);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3162505054923319084L + "'", long10 == 3162505054923319084L);
        org.junit.Assert.assertNotNull(longStream12);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.util.Locale locale1 = new java.util.Locale("Japan");
        java.lang.String str2 = locale1.toLanguageTag();
        org.junit.Assert.assertEquals(locale1.toString(), "japan");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "japan" + "'", str2, "japan");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.Company company13 = faker6.company;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name15 = faker14.name;
        com.github.javafaker.Options options16 = faker14.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService17 = faker14.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber18 = null;
        faker14.phoneNumber = phoneNumber18;
        com.github.javafaker.Name name20 = faker14.name();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name22 = faker21.name;
        com.github.javafaker.Options options23 = faker21.options;
        com.github.javafaker.Name name24 = faker21.name();
        com.github.javafaker.Hacker hacker25 = faker21.hacker();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book27 = null;
        faker26.book = book27;
        com.github.javafaker.Code code29 = faker26.code();
        faker21.code = code29;
        com.github.javafaker.Address address31 = faker21.address;
        faker14.address = address31;
        faker6.address = address31;
        com.github.javafaker.DateAndTime dateAndTime34 = faker6.dateAndTime;
        java.lang.String str36 = faker6.letterify("United Kingdom");
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name38 = faker37.name;
        com.github.javafaker.Options options39 = faker37.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService40 = faker37.fakeValuesService;
        com.github.javafaker.service.RandomService randomService41 = null;
        faker37.randomService = randomService41;
        com.github.javafaker.Options options43 = faker37.options;
        java.util.Random random44 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream47 = random44.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream49 = random44.doubles((long) (short) 1);
        com.github.javafaker.Faker faker50 = new com.github.javafaker.Faker(random44);
        com.github.javafaker.service.RandomService randomService51 = faker50.randomService;
        faker37.randomService = randomService51;
        com.github.javafaker.Address address53 = faker37.address;
        com.github.javafaker.Faker faker54 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book55 = null;
        faker54.book = book55;
        java.util.Random random57 = null;
        com.github.javafaker.Faker faker58 = new com.github.javafaker.Faker(random57);
        com.github.javafaker.Number number59 = faker58.number;
        faker54.number = number59;
        com.github.javafaker.App app61 = faker54.app;
        java.util.Locale locale62 = java.util.Locale.FRANCE;
        java.util.Random random63 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream66 = random63.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker67 = new com.github.javafaker.Faker(locale62, random63);
        com.github.javafaker.Faker faker68 = new com.github.javafaker.Faker(random63);
        com.github.javafaker.Internet internet69 = faker68.internet;
        faker54.internet = internet69;
        com.github.javafaker.Lorem lorem71 = faker54.lorem();
        faker37.lorem = lorem71;
        com.github.javafaker.service.FakeValuesService fakeValuesService73 = faker37.fakeValuesService;
        java.util.Random random75 = new java.util.Random((-1L));
        com.github.javafaker.Faker faker76 = new com.github.javafaker.Faker(random75);
        com.github.javafaker.Faker faker77 = new com.github.javafaker.Faker(random75);
        com.github.javafaker.Code code78 = faker77.code();
        faker37.code = code78;
        faker6.code = code78;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(fakeValuesService17);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(hacker25);
        org.junit.Assert.assertNotNull(code29);
        org.junit.Assert.assertNotNull(address31);
        org.junit.Assert.assertNotNull(dateAndTime34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "United Kingdom" + "'", str36, "United Kingdom");
        org.junit.Assert.assertNotNull(name38);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(fakeValuesService40);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNotNull(doubleStream47);
        org.junit.Assert.assertNotNull(doubleStream49);
        org.junit.Assert.assertNotNull(randomService51);
        org.junit.Assert.assertNotNull(address53);
        org.junit.Assert.assertNotNull(number59);
        org.junit.Assert.assertNotNull(app61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream66);
        org.junit.Assert.assertNotNull(internet69);
        org.junit.Assert.assertNotNull(lorem71);
        org.junit.Assert.assertNotNull(fakeValuesService73);
        org.junit.Assert.assertNotNull(code78);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("de", (double) 0L);
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("Chinese");
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("de", (double) 0L);
        java.util.Locale.LanguageRange languageRange10 = new java.util.Locale.LanguageRange("de", 0.7011546391008482d);
        java.util.Locale.LanguageRange languageRange12 = new java.util.Locale.LanguageRange("German");
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("fra");
        java.util.Locale.LanguageRange languageRange17 = new java.util.Locale.LanguageRange("CN", 0.3306491713080322d);
        java.util.Locale.LanguageRange languageRange20 = new java.util.Locale.LanguageRange("de", 0.6991794951529816d);
        java.util.Locale.LanguageRange languageRange22 = new java.util.Locale.LanguageRange("French");
        java.lang.String str23 = languageRange22.getRange();
        java.util.Locale.LanguageRange languageRange26 = new java.util.Locale.LanguageRange("CAN", 0.7281907524383029d);
        java.util.Locale.LanguageRange languageRange28 = new java.util.Locale.LanguageRange("fra");
        java.util.Locale.LanguageRange languageRange31 = new java.util.Locale.LanguageRange("de-DE", (double) 1L);
        double double32 = languageRange31.getWeight();
        java.util.Locale.LanguageRange languageRange35 = new java.util.Locale.LanguageRange("ja", 0.730967787376657d);
        java.lang.String str36 = languageRange35.getRange();
        java.util.Locale.LanguageRange languageRange39 = new java.util.Locale.LanguageRange("de", (double) 0.24377757f);
        java.lang.String str40 = languageRange39.getRange();
        java.util.Locale.LanguageRange languageRange43 = new java.util.Locale.LanguageRange("Canada", 0.0d);
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] { languageRange2, languageRange4, languageRange7, languageRange10, languageRange12, languageRange14, languageRange17, languageRange20, languageRange22, languageRange26, languageRange28, languageRange31, languageRange35, languageRange39, languageRange43 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap47 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, strMap47);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "french" + "'", str23, "french");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ja" + "'", str36, "ja");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "de" + "'", str40, "de");
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(languageRangeList48);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        java.util.Locale locale3 = new java.util.Locale("Chinese", "United Kingdom", "Japan");
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        java.lang.String str5 = locale3.getScript();
        org.junit.Assert.assertEquals(locale3.toString(), "chinese_UNITED KINGDOM_Japan");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder0.clear();
        java.util.Locale locale7 = builder0.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.util.Random random1 = new java.util.Random((long) 431529176);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream5 = random1.ints((long) 1342085725, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        double double6 = random0.nextGaussian();
        random0.setSeed((long) 25);
        java.util.stream.DoubleStream doubleStream11 = random0.doubles(10.0d, (double) 16);
        java.util.stream.LongStream longStream12 = random0.longs();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8123401992912016d + "'", double6 == 0.8123401992912016d);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream12);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.Random random4 = new java.util.Random((long) (byte) 10);
        double double5 = random4.nextDouble();
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        random4.nextBytes(byteArray11);
        random1.nextBytes(byteArray11);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7304302967434272d + "'", double5 == 0.7304302967434272d);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-61, -42, 100, -70, 55]");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Internet internet7 = faker6.internet;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name9 = faker8.name;
        com.github.javafaker.Options options10 = faker8.options;
        com.github.javafaker.Name name11 = faker8.name();
        com.github.javafaker.Code code12 = faker8.code;
        faker6.code = code12;
        com.github.javafaker.Number number14 = faker6.number;
        com.github.javafaker.Book book15 = faker6.book();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(book15);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        double double6 = random0.nextGaussian();
        random0.setSeed((long) 25);
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream13 = random0.doubles(946239036256691512L, (double) (byte) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.6745571397618757d) + "'", double6 == (-0.6745571397618757d));
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Number number5 = faker4.number;
        faker0.number = number5;
        com.github.javafaker.App app7 = faker0.app;
        com.github.javafaker.Business business8 = null;
        faker0.business = business8;
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(app7);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.DateAndTime dateAndTime3 = faker2.dateAndTime;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker2.phoneNumber;
        com.github.javafaker.Lorem lorem5 = faker2.lorem;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Germany", 0.10434413736109727d);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        java.util.Locale locale3 = new java.util.Locale("English", "CN", "German (Germany)");
        org.junit.Assert.assertEquals(locale3.toString(), "english_CN_German (Germany)");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getScript();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.util.Random random1 = new java.util.Random((long) 1);
        int int3 = random1.nextInt((int) '#');
        int int4 = random1.nextInt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25 + "'", int3 == 25);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 431529176 + "'", int4 == 431529176);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        java.lang.String str3 = faker0.letterify("hi!");
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name5 = faker4.name;
        com.github.javafaker.Options options6 = faker4.options;
        com.github.javafaker.App app7 = faker4.app();
        faker0.app = app7;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Random random10 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream13 = random10.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale9, random10);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name17 = faker16.name;
        com.github.javafaker.Options options18 = faker16.options;
        com.github.javafaker.Company company19 = faker16.company();
        faker15.company = company19;
        com.github.javafaker.Hacker hacker21 = faker15.hacker;
        com.github.javafaker.Company company22 = faker15.company;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name24 = faker23.name;
        com.github.javafaker.Options options25 = faker23.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService26 = faker23.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber27 = null;
        faker23.phoneNumber = phoneNumber27;
        com.github.javafaker.Name name29 = faker23.name();
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name31 = faker30.name;
        com.github.javafaker.Options options32 = faker30.options;
        com.github.javafaker.Name name33 = faker30.name();
        com.github.javafaker.Hacker hacker34 = faker30.hacker();
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book36 = null;
        faker35.book = book36;
        com.github.javafaker.Code code38 = faker35.code();
        faker30.code = code38;
        com.github.javafaker.Address address40 = faker30.address;
        faker23.address = address40;
        faker15.address = address40;
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name44 = faker43.name;
        com.github.javafaker.Options options45 = faker43.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService46 = faker43.fakeValuesService;
        com.github.javafaker.Faker faker47 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name48 = faker47.name;
        com.github.javafaker.Options options49 = faker47.options;
        com.github.javafaker.DateAndTime dateAndTime50 = faker47.date();
        faker43.dateAndTime = dateAndTime50;
        com.github.javafaker.Address address52 = faker43.address();
        faker15.address = address52;
        faker0.address = address52;
        com.github.javafaker.App app55 = faker0.app();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(name17);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(company19);
        org.junit.Assert.assertNotNull(hacker21);
        org.junit.Assert.assertNotNull(company22);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(fakeValuesService26);
        org.junit.Assert.assertNotNull(name29);
        org.junit.Assert.assertNotNull(name31);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(name33);
        org.junit.Assert.assertNotNull(hacker34);
        org.junit.Assert.assertNotNull(code38);
        org.junit.Assert.assertNotNull(address40);
        org.junit.Assert.assertNotNull(name44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(fakeValuesService46);
        org.junit.Assert.assertNotNull(name48);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertNotNull(dateAndTime50);
        org.junit.Assert.assertNotNull(address52);
        org.junit.Assert.assertNotNull(app55);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream12 = random7.doubles((long) (short) 1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService14 = faker13.randomService;
        faker0.randomService = randomService14;
        com.github.javafaker.Address address16 = faker0.address;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name18 = faker17.name;
        com.github.javafaker.Options options19 = faker17.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService20 = faker17.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber21 = null;
        faker17.phoneNumber = phoneNumber21;
        com.github.javafaker.Name name23 = faker17.name();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name25 = faker24.name;
        com.github.javafaker.Options options26 = faker24.options;
        com.github.javafaker.Name name27 = faker24.name();
        com.github.javafaker.Hacker hacker28 = faker24.hacker();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book30 = null;
        faker29.book = book30;
        com.github.javafaker.Code code32 = faker29.code();
        faker24.code = code32;
        com.github.javafaker.Address address34 = faker24.address;
        faker17.address = address34;
        faker0.address = address34;
        com.github.javafaker.PhoneNumber phoneNumber37 = faker0.phoneNumber;
        com.github.javafaker.App app38 = faker0.app();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(randomService14);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(fakeValuesService20);
        org.junit.Assert.assertNotNull(name23);
        org.junit.Assert.assertNotNull(name25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(name27);
        org.junit.Assert.assertNotNull(hacker28);
        org.junit.Assert.assertNotNull(code32);
        org.junit.Assert.assertNotNull(address34);
        org.junit.Assert.assertNotNull(phoneNumber37);
        org.junit.Assert.assertNotNull(app38);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        double double2 = random1.nextDouble();
        float float3 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7304302967434272d + "'", double2 == 0.7304302967434272d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25780278f + "'", float3 == 0.25780278f);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Japanese");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        java.lang.String str5 = locale2.getDisplayLanguage(locale3);
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale6, random7);
        java.lang.String str12 = locale3.getDisplayVariant(locale6);
        boolean boolean13 = languageRange1.equals((java.lang.Object) locale3);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str5, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Internet internet7 = faker6.internet;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name9 = faker8.name;
        com.github.javafaker.Options options10 = faker8.options;
        com.github.javafaker.Name name11 = faker8.name();
        com.github.javafaker.Code code12 = faker8.code;
        faker6.code = code12;
        com.github.javafaker.Number number14 = faker6.number;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name16 = faker15.name;
        com.github.javafaker.Options options17 = faker15.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService18 = faker15.fakeValuesService;
        com.github.javafaker.service.RandomService randomService19 = null;
        faker15.randomService = randomService19;
        com.github.javafaker.Options options21 = faker15.options;
        faker6.options = options21;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name24 = faker23.name;
        com.github.javafaker.Options options25 = faker23.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService26 = faker23.fakeValuesService;
        java.lang.String str28 = faker23.letterify("de");
        com.github.javafaker.Finance finance29 = faker23.finance();
        faker6.finance = finance29;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(fakeValuesService18);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(fakeValuesService26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "de" + "'", str28, "de");
        org.junit.Assert.assertNotNull(finance29);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.util.Locale locale3 = new java.util.Locale("\u65e5\u672c", "FRENCH", "\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u65e5\u672c\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.DateAndTime dateAndTime3 = faker0.date();
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Address address5 = faker0.address();
        java.lang.Class<?> wildcardClass6 = faker0.getClass();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(book4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.Color color8 = faker5.color();
        faker0.color = color8;
        com.github.javafaker.Finance finance10 = faker0.finance;
        com.github.javafaker.App app11 = faker0.app;
        java.lang.String str13 = faker0.regexify("Chinese");
        com.github.javafaker.Finance finance14 = faker0.finance;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(app11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese" + "'", str13, "Chinese");
        org.junit.Assert.assertNotNull(finance14);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2);
        java.util.Set<java.lang.Character> charSet6 = locale2.getExtensionKeys();
        java.lang.String str7 = locale0.getDisplayLanguage(locale2);
        java.lang.String str8 = locale2.getVariant();
        java.lang.Object obj9 = locale2.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Germany" + "'", str1, "Germany");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anglais" + "'", str4, "anglais");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "German" + "'", str7, "German");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "en");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.letterify("\u65e5\u672c");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u65e5\u672c" + "'", str3, "\u65e5\u672c");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book9 = null;
        faker8.book = book9;
        com.github.javafaker.Code code11 = faker8.code();
        faker5.code = code11;
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.util.Locale locale14 = locale13.stripExtensions();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale14);
        com.github.javafaker.Address address16 = faker15.address();
        faker5.address = address16;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(address16);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.util.Random random1 = new java.util.Random((long) (byte) 100);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 25);
        java.util.stream.IntStream intStream4 = random1.ints();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book6 = null;
        faker5.book = book6;
        com.github.javafaker.Code code8 = faker5.code();
        faker0.code = code8;
        com.github.javafaker.App app10 = faker0.app();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name12 = faker11.name;
        com.github.javafaker.Options options13 = faker11.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = faker11.fakeValuesService;
        com.github.javafaker.service.RandomService randomService15 = null;
        faker11.randomService = randomService15;
        com.github.javafaker.Options options17 = faker11.options;
        com.github.javafaker.App app18 = faker11.app();
        faker0.app = app18;
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.util.Random random21 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream24 = random21.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale20, random21);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name28 = faker27.name;
        com.github.javafaker.Options options29 = faker27.options;
        com.github.javafaker.Company company30 = faker27.company();
        faker26.company = company30;
        com.github.javafaker.Hacker hacker32 = faker26.hacker;
        com.github.javafaker.Company company33 = faker26.company;
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name35 = faker34.name;
        com.github.javafaker.Options options36 = faker34.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService37 = faker34.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber38 = null;
        faker34.phoneNumber = phoneNumber38;
        com.github.javafaker.Name name40 = faker34.name();
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name42 = faker41.name;
        com.github.javafaker.Options options43 = faker41.options;
        com.github.javafaker.Name name44 = faker41.name();
        com.github.javafaker.Hacker hacker45 = faker41.hacker();
        com.github.javafaker.Faker faker46 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book47 = null;
        faker46.book = book47;
        com.github.javafaker.Code code49 = faker46.code();
        faker41.code = code49;
        com.github.javafaker.Address address51 = faker41.address;
        faker34.address = address51;
        faker26.address = address51;
        com.github.javafaker.Faker faker54 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book55 = null;
        faker54.book = book55;
        java.util.Random random57 = null;
        com.github.javafaker.Faker faker58 = new com.github.javafaker.Faker(random57);
        com.github.javafaker.Number number59 = faker58.number;
        faker54.number = number59;
        faker26.number = number59;
        com.github.javafaker.Lorem lorem62 = faker26.lorem();
        faker0.lorem = lorem62;
        com.github.javafaker.Finance finance64 = faker0.finance();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(app10);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(fakeValuesService14);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(app18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(name28);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(company30);
        org.junit.Assert.assertNotNull(hacker32);
        org.junit.Assert.assertNotNull(company33);
        org.junit.Assert.assertNotNull(name35);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertNotNull(fakeValuesService37);
        org.junit.Assert.assertNotNull(name40);
        org.junit.Assert.assertNotNull(name42);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNotNull(name44);
        org.junit.Assert.assertNotNull(hacker45);
        org.junit.Assert.assertNotNull(code49);
        org.junit.Assert.assertNotNull(address51);
        org.junit.Assert.assertNotNull(number59);
        org.junit.Assert.assertNotNull(lorem62);
        org.junit.Assert.assertNotNull(finance64);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        boolean boolean4 = locale1.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale1.getDisplayLanguage(locale5);
        java.util.Locale locale7 = locale5.stripExtensions();
        java.util.Locale locale10 = new java.util.Locale("en_US", "en_GB");
        java.lang.String str11 = locale5.getDisplayName(locale10);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertEquals(locale10.toString(), "en_us_EN_GB");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "German (Germany)" + "'", str11, "German (Germany)");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Random random2 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream5 = random2.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream7 = random2.doubles((long) (short) 1);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random2);
        java.util.stream.DoubleStream doubleStream9 = random2.doubles();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random2);
        java.lang.String str11 = locale0.getDisplayScript();
        java.util.Locale locale14 = new java.util.Locale("", "");
        java.util.Locale locale15 = java.util.Locale.UK;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale14.getDisplayLanguage(locale16);
        java.util.Set<java.lang.String> strSet18 = locale14.getUnicodeLocaleKeys();
        java.lang.String str19 = locale0.getDisplayCountry(locale14);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese" + "'", str1, "Chinese");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "China" + "'", str19, "China");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.addUnicodeLocaleAttribute("German");
        java.util.Locale.Builder builder5 = builder0.setLanguage("China");
        java.util.Locale locale6 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet7 = locale6.getExtensionKeys();
        java.lang.String str8 = locale6.getDisplayCountry();
        java.util.Locale locale9 = locale6.stripExtensions();
        java.util.Locale.Builder builder10 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder13 = builder10.setExtension('u', "ja");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setRegion("GBR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: GBR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Japan" + "'", str8, "Japan");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        java.lang.String str9 = faker5.bothify("\u4e2d\u56fd\u8a9e");
        java.lang.String str11 = faker5.letterify("Chinese");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str9, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese" + "'", str11, "Chinese");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        java.util.Locale locale2 = new java.util.Locale("English", "Chinese");
        java.lang.String str3 = locale2.getDisplayVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "english_CHINESE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        java.util.Locale locale2 = new java.util.Locale("japan", "french");
        java.util.Locale.Category category3 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.util.Locale locale5 = java.util.Locale.getDefault(category3);
        java.util.Locale locale8 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale12 = new java.util.Locale("", "");
        java.lang.String str13 = locale8.getDisplayVariant(locale12);
        java.util.Set<java.lang.Character> charSet14 = locale8.getExtensionKeys();
        java.util.Set<java.lang.String> strSet15 = locale8.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category3, locale8);
        java.util.Locale locale17 = java.util.Locale.getDefault(category3);
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.Locale.setDefault(category3, locale18);
        java.util.Locale locale20 = java.util.Locale.TAIWAN;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Locale.setDefault(category3, locale21);
        java.lang.String str24 = locale21.getUnicodeLocaleType("en");
        java.lang.String str25 = locale2.getDisplayVariant(locale21);
        org.junit.Assert.assertEquals(locale2.toString(), "japan_FRENCH");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "japan");
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "japan");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.util.Locale locale4 = locale0.stripExtensions();
        java.lang.String str5 = locale4.getVariant();
        java.util.Locale locale6 = locale4.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale4.getUnicodeLocaleType("Canada");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Canada");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u65e5\u672c" + "'", str2, "\u65e5\u672c");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja_JP");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        java.util.Random random1 = new java.util.Random((long) 'u');
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        java.util.stream.LongStream longStream4 = random1.longs((long) 6);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        boolean boolean4 = locale1.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale1.getDisplayLanguage(locale5);
        java.util.Locale locale7 = locale5.stripExtensions();
        java.util.Locale locale10 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet11 = locale10.getExtensionKeys();
        java.util.Locale locale14 = new java.util.Locale("", "");
        java.lang.String str15 = locale10.getDisplayVariant(locale14);
        java.util.Set<java.lang.Character> charSet16 = locale14.getExtensionKeys();
        java.lang.String str17 = locale7.getDisplayLanguage(locale14);
        java.util.Locale locale19 = new java.util.Locale("french");
        java.util.Locale.Category category20 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale21 = java.util.Locale.getDefault(category20);
        java.util.Locale locale22 = java.util.Locale.getDefault(category20);
        java.lang.String str23 = locale19.getDisplayScript(locale22);
        java.lang.String str24 = locale7.getDisplayVariant(locale19);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "German" + "'", str17, "German");
        org.junit.Assert.assertEquals(locale19.toString(), "french");
        org.junit.Assert.assertTrue("'" + category20 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category20.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.lang.String str2 = locale1.getCountry();
        java.lang.String str3 = locale1.getISO3Language();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList11, strMap12);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList20, filteringMode22);
        java.util.Locale locale26 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet27 = locale26.getExtensionKeys();
        java.util.Locale locale30 = new java.util.Locale("", "");
        java.lang.String str31 = locale26.getDisplayVariant(locale30);
        java.util.Set<java.lang.String> strSet32 = locale26.getUnicodeLocaleKeys();
        java.lang.String str33 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strSet32);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList40, filteringMode42);
        java.util.Locale locale46 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet47 = locale46.getExtensionKeys();
        java.util.Locale locale50 = new java.util.Locale("", "");
        java.lang.String str51 = locale46.getDisplayVariant(locale50);
        java.util.Set<java.lang.String> strSet52 = locale46.getUnicodeLocaleKeys();
        java.lang.String str53 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strSet52);
        java.util.Locale locale56 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet57 = locale56.getExtensionKeys();
        java.util.Locale locale60 = new java.util.Locale("", "");
        java.lang.String str61 = locale56.getDisplayVariant(locale60);
        java.util.Set<java.lang.String> strSet62 = locale56.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strSet62);
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strSet62);
        java.util.Locale locale67 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet68 = locale67.getExtensionKeys();
        java.util.Locale locale71 = new java.util.Locale("", "");
        java.lang.String str72 = locale67.getDisplayVariant(locale71);
        java.util.Set<java.lang.Character> charSet73 = locale67.getExtensionKeys();
        java.util.Set<java.lang.String> strSet74 = locale67.getUnicodeLocaleAttributes();
        java.lang.String str75 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strSet74);
        java.lang.String str76 = java.util.Locale.lookupTag(languageRangeList13, (java.util.Collection<java.lang.String>) strSet74);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode22.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(charSet27);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode42.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertNotNull(charSet47);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertNotNull(charSet57);
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertNotNull(charSet68);
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(charSet73);
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNull(str76);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Random random2 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream5 = random2.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream7 = random2.doubles((long) (short) 1);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random2);
        java.util.stream.DoubleStream doubleStream9 = random2.doubles();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random2);
        com.github.javafaker.DateAndTime dateAndTime11 = faker10.dateAndTime;
        com.github.javafaker.Color color12 = faker10.color;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587" + "'", str1, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.lang.String str4 = locale1.getLanguage();
        java.lang.String str5 = locale0.getDisplayCountry(locale1);
        java.lang.String str6 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anglais" + "'", str3, "anglais");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Canada" + "'", str5, "Canada");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr-CA" + "'", str6, "fr-CA");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        com.github.javafaker.Company company3 = faker0.company();
        java.lang.String str5 = faker0.letterify("ja");
        com.github.javafaker.PhoneNumber phoneNumber6 = faker0.phoneNumber;
        java.lang.String str8 = faker0.regexify("de-DE");
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ja" + "'", str5, "ja");
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "de-DE" + "'", str8, "de-DE");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book6 = null;
        faker5.book = book6;
        com.github.javafaker.Code code8 = faker5.code();
        faker0.code = code8;
        com.github.javafaker.App app10 = faker0.app();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name12 = faker11.name;
        com.github.javafaker.Options options13 = faker11.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = faker11.fakeValuesService;
        com.github.javafaker.service.RandomService randomService15 = null;
        faker11.randomService = randomService15;
        com.github.javafaker.Options options17 = faker11.options;
        com.github.javafaker.App app18 = faker11.app();
        faker0.app = app18;
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.util.Random random21 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream24 = random21.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale20, random21);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name28 = faker27.name;
        com.github.javafaker.Options options29 = faker27.options;
        com.github.javafaker.Company company30 = faker27.company();
        faker26.company = company30;
        com.github.javafaker.Hacker hacker32 = faker26.hacker;
        com.github.javafaker.Company company33 = faker26.company;
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name35 = faker34.name;
        com.github.javafaker.Options options36 = faker34.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService37 = faker34.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber38 = null;
        faker34.phoneNumber = phoneNumber38;
        com.github.javafaker.Name name40 = faker34.name();
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name42 = faker41.name;
        com.github.javafaker.Options options43 = faker41.options;
        com.github.javafaker.Name name44 = faker41.name();
        com.github.javafaker.Hacker hacker45 = faker41.hacker();
        com.github.javafaker.Faker faker46 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book47 = null;
        faker46.book = book47;
        com.github.javafaker.Code code49 = faker46.code();
        faker41.code = code49;
        com.github.javafaker.Address address51 = faker41.address;
        faker34.address = address51;
        faker26.address = address51;
        com.github.javafaker.Faker faker54 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book55 = null;
        faker54.book = book55;
        java.util.Random random57 = null;
        com.github.javafaker.Faker faker58 = new com.github.javafaker.Faker(random57);
        com.github.javafaker.Number number59 = faker58.number;
        faker54.number = number59;
        faker26.number = number59;
        com.github.javafaker.Lorem lorem62 = faker26.lorem();
        faker0.lorem = lorem62;
        com.github.javafaker.DateAndTime dateAndTime64 = faker0.dateAndTime;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(app10);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(fakeValuesService14);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(app18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(name28);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(company30);
        org.junit.Assert.assertNotNull(hacker32);
        org.junit.Assert.assertNotNull(company33);
        org.junit.Assert.assertNotNull(name35);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertNotNull(fakeValuesService37);
        org.junit.Assert.assertNotNull(name40);
        org.junit.Assert.assertNotNull(name42);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNotNull(name44);
        org.junit.Assert.assertNotNull(hacker45);
        org.junit.Assert.assertNotNull(code49);
        org.junit.Assert.assertNotNull(address51);
        org.junit.Assert.assertNotNull(number59);
        org.junit.Assert.assertNotNull(lorem62);
        org.junit.Assert.assertNotNull(dateAndTime64);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        java.util.stream.LongStream longStream7 = random1.longs((long) 1, (long) (short) 100);
        java.util.Random random9 = new java.util.Random((long) (byte) 10);
        double double10 = random9.nextDouble();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        random9.nextBytes(byteArray16);
        random1.nextBytes(byteArray16);
        java.util.stream.IntStream intStream19 = random1.ints();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.service.RandomService randomService21 = faker20.randomService;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7304302967434272d + "'", double10 == 0.7304302967434272d);
        org.junit.Assert.assertNotNull(byteArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[98, -30, 80, -11, -83]");
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertNotNull(randomService21);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Company company3 = faker0.company();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale4, random5);
        com.github.javafaker.Business business10 = null;
        faker9.business = business10;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book13 = null;
        faker12.book = book13;
        com.github.javafaker.Code code15 = faker12.code();
        faker9.code = code15;
        java.lang.String str18 = faker9.bothify("Japan");
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService22 = faker19.fakeValuesService;
        com.github.javafaker.service.RandomService randomService23 = null;
        faker19.randomService = randomService23;
        com.github.javafaker.Options options25 = faker19.options;
        java.util.Random random26 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream29 = random26.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream31 = random26.doubles((long) (short) 1);
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.service.RandomService randomService33 = faker32.randomService;
        faker19.randomService = randomService33;
        com.github.javafaker.Address address35 = faker19.address;
        com.github.javafaker.Lorem lorem36 = faker19.lorem();
        faker9.lorem = lorem36;
        faker0.lorem = lorem36;
        com.github.javafaker.service.FakeValuesService fakeValuesService39 = faker0.fakeValuesService;
        com.github.javafaker.Business business40 = faker0.business;
        com.github.javafaker.service.FakeValuesService fakeValuesService41 = faker0.fakeValuesService;
        com.github.javafaker.Color color42 = faker0.color;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Japan" + "'", str18, "Japan");
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(fakeValuesService22);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertNotNull(randomService33);
        org.junit.Assert.assertNotNull(address35);
        org.junit.Assert.assertNotNull(lorem36);
        org.junit.Assert.assertNotNull(fakeValuesService39);
        org.junit.Assert.assertNotNull(business40);
        org.junit.Assert.assertNotNull(fakeValuesService41);
        org.junit.Assert.assertNotNull(color42);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book9 = null;
        faker8.book = book9;
        com.github.javafaker.Code code11 = faker8.code();
        faker5.code = code11;
        com.github.javafaker.Company company13 = faker5.company;
        com.github.javafaker.Book book14 = faker5.book();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(book14);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        java.lang.String str3 = faker0.numerify("Germany");
        com.github.javafaker.Address address4 = faker0.address;
        com.github.javafaker.DateAndTime dateAndTime5 = faker0.date();
        java.lang.String str7 = faker0.numerify("de-DE");
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker0.fakeValuesService;
        com.github.javafaker.Address address9 = faker0.address();
        com.github.javafaker.Finance finance10 = faker0.finance;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Germany" + "'", str3, "Germany");
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "de-DE" + "'", str7, "de-DE");
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        java.util.Locale.Builder builder11 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder14 = builder7.setExtension('x', "anglais");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder7.removeUnicodeLocaleAttribute("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "anglais" + "'", str10, "anglais");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber4 = null;
        faker0.phoneNumber = phoneNumber4;
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Finance finance7 = faker0.finance();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.util.Locale locale2 = new java.util.Locale("deu", "japan");
        org.junit.Assert.assertEquals(locale2.toString(), "deu_JAPAN");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=22.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale1.getDisplayName(locale2);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)" + "'", str4, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        java.util.Locale locale2 = new java.util.Locale("English (Canada)", "germany");
        org.junit.Assert.assertEquals(locale2.toString(), "english (canada)_GERMANY");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Locale locale4 = new java.util.Locale("");
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        java.lang.String str7 = locale1.getDisplayCountry(locale4);
        java.lang.String str8 = locale1.getDisplayVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name5 = faker4.name;
        com.github.javafaker.Options options6 = faker4.options;
        com.github.javafaker.Name name7 = faker4.name();
        com.github.javafaker.Hacker hacker8 = faker4.hacker();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = faker4.fakeValuesService;
        com.github.javafaker.Book book10 = faker4.book();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name12 = faker11.name;
        com.github.javafaker.Options options13 = faker11.options;
        com.github.javafaker.Name name14 = faker11.name();
        com.github.javafaker.Hacker hacker15 = faker11.hacker();
        com.github.javafaker.service.FakeValuesService fakeValuesService16 = faker11.fakeValuesService;
        faker4.fakeValuesService = fakeValuesService16;
        faker2.fakeValuesService = fakeValuesService16;
        com.github.javafaker.Name name19 = faker2.name;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name21 = faker20.name;
        com.github.javafaker.Options options22 = faker20.options;
        com.github.javafaker.Name name23 = faker20.name();
        com.github.javafaker.Hacker hacker24 = faker20.hacker();
        java.lang.String str26 = faker20.numerify("");
        java.lang.String str28 = faker20.letterify("french");
        java.util.Locale locale29 = java.util.Locale.UK;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale29);
        com.github.javafaker.Code code31 = faker30.code;
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.util.Locale locale33 = java.util.Locale.FRANCE;
        java.lang.String str34 = locale32.getDisplayName(locale33);
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(locale32);
        java.util.Locale locale36 = java.util.Locale.FRANCE;
        java.util.Random random37 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream40 = random37.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(locale36, random37);
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name44 = faker43.name;
        com.github.javafaker.Options options45 = faker43.options;
        com.github.javafaker.Company company46 = faker43.company();
        faker42.company = company46;
        com.github.javafaker.Hacker hacker48 = faker42.hacker;
        com.github.javafaker.Company company49 = faker42.company;
        com.github.javafaker.Hacker hacker50 = faker42.hacker;
        faker35.hacker = hacker50;
        java.util.Locale locale52 = java.util.Locale.FRANCE;
        java.util.Random random53 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream56 = random53.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker57 = new com.github.javafaker.Faker(locale52, random53);
        com.github.javafaker.Faker faker58 = new com.github.javafaker.Faker(random53);
        com.github.javafaker.Faker faker59 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name60 = faker59.name;
        com.github.javafaker.Options options61 = faker59.options;
        com.github.javafaker.Company company62 = faker59.company();
        faker58.company = company62;
        com.github.javafaker.Hacker hacker64 = faker58.hacker;
        com.github.javafaker.Company company65 = faker58.company;
        com.github.javafaker.Hacker hacker66 = faker58.hacker;
        faker35.hacker = hacker66;
        faker30.hacker = hacker66;
        com.github.javafaker.Finance finance69 = faker30.finance;
        faker20.finance = finance69;
        faker2.finance = finance69;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(name14);
        org.junit.Assert.assertNotNull(hacker15);
        org.junit.Assert.assertNotNull(fakeValuesService16);
        org.junit.Assert.assertNotNull(name19);
        org.junit.Assert.assertNotNull(name21);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(name23);
        org.junit.Assert.assertNotNull(hacker24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "french" + "'", str28, "french");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_GB");
        org.junit.Assert.assertNotNull(code31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "anglais" + "'", str34, "anglais");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream40);
        org.junit.Assert.assertNotNull(name44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(company46);
        org.junit.Assert.assertNotNull(hacker48);
        org.junit.Assert.assertNotNull(company49);
        org.junit.Assert.assertNotNull(hacker50);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream56);
        org.junit.Assert.assertNotNull(name60);
        org.junit.Assert.assertNotNull(options61);
        org.junit.Assert.assertNotNull(company62);
        org.junit.Assert.assertNotNull(hacker64);
        org.junit.Assert.assertNotNull(company65);
        org.junit.Assert.assertNotNull(hacker66);
        org.junit.Assert.assertNotNull(finance69);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        com.github.javafaker.Address address3 = faker0.address();
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Number number5 = faker0.number();
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        double double6 = random0.nextGaussian();
        double double7 = random0.nextGaussian();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.23661271752087418d) + "'", double6 == (-0.23661271752087418d));
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.10122020896114646d + "'", double7 == 0.10122020896114646d);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Locale locale12 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.util.Locale locale16 = new java.util.Locale("", "");
        java.lang.String str17 = locale12.getDisplayVariant(locale16);
        java.util.Set<java.lang.String> strSet18 = locale12.getUnicodeLocaleKeys();
        java.lang.String str19 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet18);
        java.util.Locale locale22 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet23 = locale22.getExtensionKeys();
        java.util.Locale locale26 = new java.util.Locale("", "");
        java.lang.String str27 = locale22.getDisplayVariant(locale26);
        java.util.Set<java.lang.String> strSet28 = locale22.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet28);
        java.util.Locale locale30 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode32 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet31, filteringMode32);
        java.util.Locale locale35 = new java.util.Locale("hi!");
        java.lang.String str36 = locale35.getISO3Language();
        java.util.Set<java.lang.String> strSet37 = locale35.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode38 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet37, filteringMode38);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.Locale.FilteringMode filteringMode48 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList46, filteringMode48);
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList46);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(charSet23);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + filteringMode32 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode32.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertEquals(locale35.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertTrue("'" + filteringMode38 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode38.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + filteringMode48 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode48.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList50);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Number number2 = faker1.number;
        com.github.javafaker.App app3 = faker1.app;
        java.util.Random random4 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream7 = random4.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name10 = faker9.name;
        com.github.javafaker.Options options11 = faker9.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService12 = faker9.fakeValuesService;
        com.github.javafaker.service.RandomService randomService13 = null;
        faker9.randomService = randomService13;
        com.github.javafaker.Options options15 = faker9.options;
        java.util.Random random16 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream19 = random16.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream21 = random16.doubles((long) (short) 1);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.service.RandomService randomService23 = faker22.randomService;
        faker9.randomService = randomService23;
        com.github.javafaker.Address address25 = faker9.address;
        com.github.javafaker.Lorem lorem26 = faker9.lorem();
        faker8.lorem = lorem26;
        java.util.Locale locale28 = java.util.Locale.UK;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(locale28);
        com.github.javafaker.Internet internet30 = faker29.internet();
        com.github.javafaker.service.RandomService randomService31 = faker29.randomService;
        faker8.randomService = randomService31;
        faker1.randomService = randomService31;
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(fakeValuesService12);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(randomService23);
        org.junit.Assert.assertNotNull(address25);
        org.junit.Assert.assertNotNull(lorem26);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_GB");
        org.junit.Assert.assertNotNull(internet30);
        org.junit.Assert.assertNotNull(randomService31);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        boolean boolean4 = locale1.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale1.getDisplayLanguage(locale5);
        java.util.Locale locale7 = locale5.stripExtensions();
        java.lang.String str8 = locale5.getDisplayVariant();
        java.lang.String str9 = locale5.getDisplayScript();
        java.util.Locale.setDefault(locale5);
        java.util.Set<java.lang.String> strSet11 = locale5.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Options options1 = faker0.options;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.App app4 = faker0.app;
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker0.fakeValuesService;
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream12 = random7.doubles((long) (short) 1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService14 = faker13.randomService;
        faker0.randomService = randomService14;
        com.github.javafaker.Business business16 = faker0.business();
        com.github.javafaker.App app17 = faker0.app;
        com.github.javafaker.Book book18 = faker0.book();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(randomService14);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertNotNull(app17);
        org.junit.Assert.assertNotNull(book18);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        java.util.Random random1 = new java.util.Random((long) 'a');
        java.util.stream.LongStream longStream3 = random1.longs((long) 8);
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Company company3 = faker0.company();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale4, random5);
        com.github.javafaker.Business business10 = null;
        faker9.business = business10;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book13 = null;
        faker12.book = book13;
        com.github.javafaker.Code code15 = faker12.code();
        faker9.code = code15;
        java.lang.String str18 = faker9.bothify("Japan");
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService22 = faker19.fakeValuesService;
        com.github.javafaker.service.RandomService randomService23 = null;
        faker19.randomService = randomService23;
        com.github.javafaker.Options options25 = faker19.options;
        java.util.Random random26 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream29 = random26.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream31 = random26.doubles((long) (short) 1);
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.service.RandomService randomService33 = faker32.randomService;
        faker19.randomService = randomService33;
        com.github.javafaker.Address address35 = faker19.address;
        com.github.javafaker.Lorem lorem36 = faker19.lorem();
        faker9.lorem = lorem36;
        faker0.lorem = lorem36;
        com.github.javafaker.service.FakeValuesService fakeValuesService39 = faker0.fakeValuesService;
        com.github.javafaker.Business business40 = faker0.business;
        com.github.javafaker.service.FakeValuesService fakeValuesService41 = faker0.fakeValuesService;
        com.github.javafaker.App app42 = faker0.app();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Japan" + "'", str18, "Japan");
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(fakeValuesService22);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertNotNull(randomService33);
        org.junit.Assert.assertNotNull(address35);
        org.junit.Assert.assertNotNull(lorem36);
        org.junit.Assert.assertNotNull(fakeValuesService39);
        org.junit.Assert.assertNotNull(business40);
        org.junit.Assert.assertNotNull(fakeValuesService41);
        org.junit.Assert.assertNotNull(app42);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.IntStream intStream3 = random1.ints();
        double double4 = random1.nextGaussian();
        java.util.stream.LongStream longStream8 = random1.longs((long) 2095092988, (-8942412734154293847L), (long) (-1));
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8746788966462123d + "'", double4 == 0.8746788966462123d);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        random0.setSeed((long) (-1193959466));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream8 = random0.ints(3162505054923319084L, 732730024, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48467283155151497d + "'", double1 == 0.48467283155151497d);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Name name10 = faker7.name();
        faker0.name = name10;
        com.github.javafaker.Address address12 = faker0.address;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(address12);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Company company3 = faker0.company();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale4, random5);
        com.github.javafaker.Business business10 = null;
        faker9.business = business10;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book13 = null;
        faker12.book = book13;
        com.github.javafaker.Code code15 = faker12.code();
        faker9.code = code15;
        java.lang.String str18 = faker9.bothify("Japan");
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService22 = faker19.fakeValuesService;
        com.github.javafaker.service.RandomService randomService23 = null;
        faker19.randomService = randomService23;
        com.github.javafaker.Options options25 = faker19.options;
        java.util.Random random26 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream29 = random26.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream31 = random26.doubles((long) (short) 1);
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.service.RandomService randomService33 = faker32.randomService;
        faker19.randomService = randomService33;
        com.github.javafaker.Address address35 = faker19.address;
        com.github.javafaker.Lorem lorem36 = faker19.lorem();
        faker9.lorem = lorem36;
        faker0.lorem = lorem36;
        com.github.javafaker.Book book39 = faker0.book;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Japan" + "'", str18, "Japan");
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(fakeValuesService22);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertNotNull(randomService33);
        org.junit.Assert.assertNotNull(address35);
        org.junit.Assert.assertNotNull(lorem36);
        org.junit.Assert.assertNotNull(book39);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.Color color7 = faker0.color;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name9 = faker8.name;
        com.github.javafaker.Options options10 = faker8.options;
        com.github.javafaker.App app11 = faker8.app();
        com.github.javafaker.Options options12 = faker8.options;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name14 = faker13.name;
        com.github.javafaker.Options options15 = faker13.options;
        com.github.javafaker.Color color16 = faker13.color();
        faker8.color = color16;
        com.github.javafaker.Finance finance18 = faker8.finance;
        faker0.finance = finance18;
        com.github.javafaker.Color color20 = faker0.color;
        com.github.javafaker.Company company21 = faker0.company;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(app11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(name14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(finance18);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(company21);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setLanguageTag("de-DE");
        java.util.Locale.Builder builder9 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setExtension(' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        java.util.Locale.Builder builder11 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder14 = builder7.setExtension('x', "anglais");
        java.util.Locale.Builder builder15 = builder7.clearExtensions();
        java.util.Locale.Builder builder17 = builder7.addUnicodeLocaleAttribute("ALLEMAND");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "anglais" + "'", str10, "anglais");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder9 = builder7.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.util.Random random1 = new java.util.Random((long) 1);
        long long2 = random1.nextLong();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (short) 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Business business6 = faker5.business();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4964420948893066024L) + "'", long2 == (-4964420948893066024L));
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        double double2 = random1.nextDouble();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0, random1);
        boolean boolean5 = random1.nextBoolean();
        java.util.stream.IntStream intStream8 = random1.ints((int) (byte) -1, 20);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5338280988887443d + "'", double2 == 0.5338280988887443d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.Color color8 = faker5.color();
        faker0.color = color8;
        com.github.javafaker.Finance finance10 = faker0.finance;
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.util.Random random12 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream15 = random12.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale11, random12);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.service.RandomService randomService18 = faker17.randomService;
        faker0.randomService = randomService18;
        com.github.javafaker.Name name20 = faker0.name();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(randomService18);
        org.junit.Assert.assertNotNull(name20);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Locale locale12 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.util.Locale locale16 = new java.util.Locale("", "");
        java.lang.String str17 = locale12.getDisplayVariant(locale16);
        java.util.Set<java.lang.String> strSet18 = locale12.getUnicodeLocaleKeys();
        java.lang.String str19 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet18);
        java.util.Locale locale22 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet23 = locale22.getExtensionKeys();
        java.util.Locale locale26 = new java.util.Locale("", "");
        java.lang.String str27 = locale22.getDisplayVariant(locale26);
        java.util.Set<java.lang.String> strSet28 = locale22.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet28);
        java.util.Locale locale30 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode32 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet31, filteringMode32);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList40, filteringMode42);
        java.util.Locale locale46 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet47 = locale46.getExtensionKeys();
        java.util.Locale locale50 = new java.util.Locale("", "");
        java.lang.String str51 = locale46.getDisplayVariant(locale50);
        java.util.Set<java.lang.String> strSet52 = locale46.getUnicodeLocaleKeys();
        java.lang.String str53 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strSet52);
        java.util.Locale locale56 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet57 = locale56.getExtensionKeys();
        java.util.Locale locale60 = new java.util.Locale("", "");
        java.lang.String str61 = locale56.getDisplayVariant(locale60);
        java.util.Set<java.lang.String> strSet62 = locale56.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strSet62);
        java.util.Locale locale64 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet65 = locale64.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode66 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strSet65, filteringMode66);
        java.util.Locale.FilteringMode filteringMode68 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList69 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet65, filteringMode68);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap70 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList71 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap70);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(charSet23);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + filteringMode32 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode32.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode42.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertNotNull(charSet47);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertNotNull(charSet57);
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertTrue("'" + filteringMode66 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode66.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertTrue("'" + filteringMode68 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode68.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(languageRangeList71);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        java.util.Random random1 = new java.util.Random((long) 1);
        long long2 = random1.nextLong();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (short) 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = random1.doubles(6417334589337766472L, (double) 688822307316714936L, 0.44358731064595336d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4964420948893066024L) + "'", long2 == (-4964420948893066024L));
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder9 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder9.setVariant("french");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.addUnicodeLocaleAttribute("German");
        java.util.Locale.Builder builder5 = builder0.setLanguage("China");
        java.util.Locale locale6 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet7 = locale6.getExtensionKeys();
        java.lang.String str8 = locale6.getDisplayCountry();
        java.util.Locale locale9 = locale6.stripExtensions();
        java.util.Locale.Builder builder10 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder13 = builder10.setExtension('u', "ja");
        java.util.Locale.Builder builder15 = builder13.setVariant("Germany");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Japan" + "'", str8, "Japan");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        java.util.Random random1 = new java.util.Random((long) 'u');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem3 = faker2.lorem;
        org.junit.Assert.assertNotNull(lorem3);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Name name5 = faker0.name;
        com.github.javafaker.Code code6 = faker0.code;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        java.util.Locale locale2 = new java.util.Locale("United Kingdom", "English (Canada)");
        java.lang.String str3 = locale2.toLanguageTag();
        org.junit.Assert.assertEquals(locale2.toString(), "united kingdom_ENGLISH (CANADA)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("German", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.Locale.FilteringMode filteringMode24 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList22, filteringMode24);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList22);
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList22);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.Locale.FilteringMode filteringMode36 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList34, filteringMode36);
        java.util.Locale locale40 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet41 = locale40.getExtensionKeys();
        java.util.Locale locale44 = new java.util.Locale("", "");
        java.lang.String str45 = locale40.getDisplayVariant(locale44);
        java.util.Set<java.lang.String> strSet46 = locale40.getUnicodeLocaleKeys();
        java.lang.String str47 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strSet46);
        java.util.Locale locale50 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet51 = locale50.getExtensionKeys();
        java.util.Locale locale54 = new java.util.Locale("", "");
        java.lang.String str55 = locale50.getDisplayVariant(locale54);
        java.util.Set<java.lang.String> strSet56 = locale50.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strSet56);
        java.util.Collection<java.util.Locale> localeCollection58 = null;
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, localeCollection58);
        java.util.Locale.FilteringMode filteringMode60 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList61 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList59, filteringMode60);
        java.util.Locale locale62 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList59);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + filteringMode11 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode11.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + filteringMode24 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode24.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + filteringMode36 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode36.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertNotNull(charSet41);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertNotNull(charSet51);
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertTrue("'" + filteringMode60 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode60.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList61);
        org.junit.Assert.assertNull(locale62);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = new java.util.Locale("Japan");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals(locale3.toString(), "japan");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "japan");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "japan");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.addUnicodeLocaleAttribute("German");
        java.util.Locale.Builder builder5 = builder3.setLanguage("Chinese");
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.util.Locale locale1 = new java.util.Locale("Japan");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale1.getDisplayCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "japan");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "japan");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder9 = builder7.setLanguage("allemand");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.Color color8 = faker5.color();
        faker0.color = color8;
        com.github.javafaker.Business business10 = null;
        faker0.business = business10;
        com.github.javafaker.Company company12 = faker0.company;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name14 = faker13.name;
        com.github.javafaker.Options options15 = faker13.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService16 = faker13.fakeValuesService;
        com.github.javafaker.service.RandomService randomService17 = null;
        faker13.randomService = randomService17;
        com.github.javafaker.Options options19 = faker13.options;
        java.util.Random random20 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream23 = random20.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream25 = random20.doubles((long) (short) 1);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.service.RandomService randomService27 = faker26.randomService;
        faker13.randomService = randomService27;
        com.github.javafaker.Address address29 = faker13.address;
        com.github.javafaker.Number number30 = faker13.number();
        java.util.Locale locale31 = java.util.Locale.TAIWAN;
        java.util.Locale locale32 = locale31.stripExtensions();
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale32);
        com.github.javafaker.Address address34 = faker33.address();
        com.github.javafaker.Hacker hacker35 = faker33.hacker;
        faker13.hacker = hacker35;
        faker0.hacker = hacker35;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(company12);
        org.junit.Assert.assertNotNull(name14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(fakeValuesService16);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertNotNull(doubleStream25);
        org.junit.Assert.assertNotNull(randomService27);
        org.junit.Assert.assertNotNull(address29);
        org.junit.Assert.assertNotNull(number30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(address34);
        org.junit.Assert.assertNotNull(hacker35);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ALLEMAND", 0.15268242552628042d);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.IntStream intStream5 = random1.ints((long) (byte) 100, (int) (byte) 1, (int) ' ');
        java.util.stream.IntStream intStream9 = random1.ints((long) 'x', (-1), 10);
        boolean boolean10 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream11 = random1.doubles();
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleStream11);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream12 = random7.doubles((long) (short) 1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService14 = faker13.randomService;
        faker0.randomService = randomService14;
        com.github.javafaker.Address address16 = faker0.address;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name18 = faker17.name;
        com.github.javafaker.Options options19 = faker17.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService20 = faker17.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber21 = null;
        faker17.phoneNumber = phoneNumber21;
        com.github.javafaker.Name name23 = faker17.name();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name25 = faker24.name;
        com.github.javafaker.Options options26 = faker24.options;
        com.github.javafaker.Name name27 = faker24.name();
        com.github.javafaker.Hacker hacker28 = faker24.hacker();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book30 = null;
        faker29.book = book30;
        com.github.javafaker.Code code32 = faker29.code();
        faker24.code = code32;
        com.github.javafaker.Address address34 = faker24.address;
        faker17.address = address34;
        faker0.address = address34;
        com.github.javafaker.Options options37 = faker0.options();
        com.github.javafaker.Company company38 = faker0.company;
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name40 = faker39.name;
        com.github.javafaker.Options options41 = faker39.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService42 = faker39.fakeValuesService;
        com.github.javafaker.service.RandomService randomService43 = null;
        faker39.randomService = randomService43;
        com.github.javafaker.Options options45 = faker39.options;
        java.util.Random random46 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream49 = random46.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream51 = random46.doubles((long) (short) 1);
        com.github.javafaker.Faker faker52 = new com.github.javafaker.Faker(random46);
        com.github.javafaker.service.RandomService randomService53 = faker52.randomService;
        faker39.randomService = randomService53;
        com.github.javafaker.Address address55 = faker39.address;
        com.github.javafaker.Faker faker56 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book57 = null;
        faker56.book = book57;
        java.util.Random random59 = null;
        com.github.javafaker.Faker faker60 = new com.github.javafaker.Faker(random59);
        com.github.javafaker.Number number61 = faker60.number;
        faker56.number = number61;
        com.github.javafaker.App app63 = faker56.app;
        java.util.Locale locale64 = java.util.Locale.FRANCE;
        java.util.Random random65 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream68 = random65.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker69 = new com.github.javafaker.Faker(locale64, random65);
        com.github.javafaker.Faker faker70 = new com.github.javafaker.Faker(random65);
        com.github.javafaker.Internet internet71 = faker70.internet;
        faker56.internet = internet71;
        com.github.javafaker.Lorem lorem73 = faker56.lorem();
        faker39.lorem = lorem73;
        faker0.lorem = lorem73;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(randomService14);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(fakeValuesService20);
        org.junit.Assert.assertNotNull(name23);
        org.junit.Assert.assertNotNull(name25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(name27);
        org.junit.Assert.assertNotNull(hacker28);
        org.junit.Assert.assertNotNull(code32);
        org.junit.Assert.assertNotNull(address34);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(company38);
        org.junit.Assert.assertNotNull(name40);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNotNull(fakeValuesService42);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(doubleStream49);
        org.junit.Assert.assertNotNull(doubleStream51);
        org.junit.Assert.assertNotNull(randomService53);
        org.junit.Assert.assertNotNull(address55);
        org.junit.Assert.assertNotNull(number61);
        org.junit.Assert.assertNotNull(app63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream68);
        org.junit.Assert.assertNotNull(internet71);
        org.junit.Assert.assertNotNull(lorem73);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Internet internet2 = faker0.internet;
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Random random4 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream7 = random4.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale3, random4);
        com.github.javafaker.Business business9 = null;
        faker8.business = business9;
        com.github.javafaker.Book book11 = faker8.book;
        com.github.javafaker.Color color12 = faker8.color;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name14 = faker13.name;
        com.github.javafaker.Book book15 = faker13.book;
        com.github.javafaker.Company company16 = faker13.company();
        com.github.javafaker.Book book17 = faker13.book();
        com.github.javafaker.Code code18 = faker13.code();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.App app22 = faker19.app();
        com.github.javafaker.Options options23 = faker19.options;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name25 = faker24.name;
        com.github.javafaker.Options options26 = faker24.options;
        com.github.javafaker.Color color27 = faker24.color();
        faker19.color = color27;
        com.github.javafaker.Finance finance29 = faker19.finance;
        faker13.finance = finance29;
        faker8.finance = finance29;
        faker0.finance = finance29;
        com.github.javafaker.Internet internet33 = faker0.internet;
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name35 = faker34.name;
        com.github.javafaker.Internet internet36 = faker34.internet;
        com.github.javafaker.Options options37 = null;
        faker34.options = options37;
        com.github.javafaker.Options options39 = faker34.options;
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name41 = faker40.name;
        com.github.javafaker.Options options42 = faker40.options;
        com.github.javafaker.App app43 = faker40.app();
        com.github.javafaker.Options options44 = faker40.options;
        com.github.javafaker.Options options45 = faker40.options();
        com.github.javafaker.Name name46 = faker40.name();
        com.github.javafaker.Faker faker47 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name48 = faker47.name;
        com.github.javafaker.Options options49 = faker47.options;
        com.github.javafaker.Name name50 = faker47.name();
        faker40.name = name50;
        com.github.javafaker.Internet internet52 = faker40.internet;
        com.github.javafaker.Internet internet53 = faker40.internet;
        faker34.internet = internet53;
        com.github.javafaker.Finance finance55 = faker34.finance();
        faker0.finance = finance55;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(name14);
        org.junit.Assert.assertNotNull(book15);
        org.junit.Assert.assertNotNull(company16);
        org.junit.Assert.assertNotNull(book17);
        org.junit.Assert.assertNotNull(code18);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(app22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(name25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(finance29);
        org.junit.Assert.assertNotNull(internet33);
        org.junit.Assert.assertNotNull(name35);
        org.junit.Assert.assertNotNull(internet36);
        org.junit.Assert.assertNull(options39);
        org.junit.Assert.assertNotNull(name41);
        org.junit.Assert.assertNotNull(options42);
        org.junit.Assert.assertNotNull(app43);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(name46);
        org.junit.Assert.assertNotNull(name48);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertNotNull(name50);
        org.junit.Assert.assertNotNull(internet52);
        org.junit.Assert.assertNotNull(internet53);
        org.junit.Assert.assertNotNull(finance55);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name3 = faker2.name;
        com.github.javafaker.Business business4 = null;
        faker2.business = business4;
        com.github.javafaker.PhoneNumber phoneNumber6 = faker2.phoneNumber;
        com.github.javafaker.App app7 = faker2.app();
        com.github.javafaker.Book book8 = faker2.book;
        faker1.book = book8;
        com.github.javafaker.Number number10 = faker1.number;
        com.github.javafaker.Address address11 = faker1.address;
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(address11);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Locale locale12 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.util.Locale locale16 = new java.util.Locale("", "");
        java.lang.String str17 = locale12.getDisplayVariant(locale16);
        java.util.Set<java.lang.String> strSet18 = locale12.getUnicodeLocaleKeys();
        java.lang.String str19 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet18);
        java.util.Collection<java.lang.String> strCollection20 = null;
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.Locale.FilteringMode filteringMode29 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList27, filteringMode29);
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection20, filteringMode29);
        java.util.Locale locale32 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet33 = locale32.getExtensionKeys();
        java.lang.String str34 = locale32.getDisplayCountry();
        java.util.Locale locale35 = locale32.stripExtensions();
        java.util.Locale locale36 = locale32.stripExtensions();
        java.util.Locale locale39 = new java.util.Locale("French", "");
        java.lang.String str40 = locale36.getDisplayName(locale39);
        java.util.Set<java.lang.String> strSet41 = locale39.getUnicodeLocaleKeys();
        java.lang.String str42 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet41);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + filteringMode29 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode29.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Japan" + "'", str34, "Japan");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ja_JP");
        org.junit.Assert.assertEquals(locale39.toString(), "french");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Japanese (Japan)" + "'", str40, "Japanese (Japan)");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        java.util.Locale locale3 = new java.util.Locale("Chinesisch", "Canada", "anglais");
        org.junit.Assert.assertEquals(locale3.toString(), "chinesisch_CANADA_anglais");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u30c9\u30a4\u30c4", 0.45944494096343136d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        java.util.Locale locale3 = new java.util.Locale("Germany", "hi!", "deu");
        org.junit.Assert.assertEquals(locale3.toString(), "germany_HI!_deu");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.lang.String str3 = locale0.getDisplayLanguage(locale2);
        java.util.Locale.setDefault(locale0);
        java.util.Random random6 = new java.util.Random((long) (byte) 10);
        float float7 = random6.nextFloat();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random6);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Japanese" + "'", str3, "Japanese");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.73043025f + "'", float7 == 0.73043025f);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u65e5\u672c");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.util.Locale locale2 = new java.util.Locale("\u65e5\u672c (GERMAN (GERMANY),en,GB)", "\u4e2d\u56fd\u8a9e");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u65e5\u672c\u4e2d\u56fd\u8a9e");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        java.util.Random random1 = new java.util.Random((long) (byte) 1);
        boolean boolean2 = random1.nextBoolean();
        int int3 = random1.nextInt();
        java.util.stream.IntStream intStream5 = random1.ints(0L);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 431529176 + "'", int3 == 431529176);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder9 = builder7.clear();
        java.util.Locale.Builder builder11 = builder7.setVariant("Japanese");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        java.lang.String str13 = faker6.numerify("\u4e2d\u56fd\u8a9e");
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book15 = null;
        faker14.book = book15;
        java.util.Random random17 = null;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Number number19 = faker18.number;
        faker14.number = number19;
        com.github.javafaker.App app21 = faker14.app;
        faker6.app = app21;
        com.github.javafaker.service.RandomService randomService23 = null;
        faker6.randomService = randomService23;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str13, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(number19);
        org.junit.Assert.assertNotNull(app21);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        java.lang.String str13 = faker6.numerify("\u4e2d\u56fd\u8a9e");
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book15 = null;
        faker14.book = book15;
        java.util.Random random17 = null;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Number number19 = faker18.number;
        faker14.number = number19;
        com.github.javafaker.App app21 = faker14.app;
        faker6.app = app21;
        com.github.javafaker.Finance finance23 = faker6.finance();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name25 = faker24.name;
        com.github.javafaker.Options options26 = faker24.options;
        com.github.javafaker.App app27 = faker24.app();
        com.github.javafaker.Options options28 = faker24.options;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name30 = faker29.name;
        com.github.javafaker.Options options31 = faker29.options;
        com.github.javafaker.Color color32 = faker29.color();
        faker24.color = color32;
        com.github.javafaker.Finance finance34 = faker24.finance;
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book36 = null;
        faker35.book = book36;
        java.util.Random random38 = null;
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(random38);
        com.github.javafaker.Number number40 = faker39.number;
        faker35.number = number40;
        faker24.number = number40;
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name44 = faker43.name;
        com.github.javafaker.Options options45 = faker43.options;
        com.github.javafaker.Name name46 = faker43.name();
        com.github.javafaker.Hacker hacker47 = faker43.hacker();
        com.github.javafaker.service.FakeValuesService fakeValuesService48 = faker43.fakeValuesService;
        com.github.javafaker.Book book49 = faker43.book();
        faker24.book = book49;
        com.github.javafaker.Color color51 = faker24.color();
        faker6.color = color51;
        com.github.javafaker.Hacker hacker53 = faker6.hacker();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str13, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(number19);
        org.junit.Assert.assertNotNull(app21);
        org.junit.Assert.assertNotNull(finance23);
        org.junit.Assert.assertNotNull(name25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(app27);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(name30);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(finance34);
        org.junit.Assert.assertNotNull(number40);
        org.junit.Assert.assertNotNull(name44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(name46);
        org.junit.Assert.assertNotNull(hacker47);
        org.junit.Assert.assertNotNull(fakeValuesService48);
        org.junit.Assert.assertNotNull(book49);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(hacker53);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        java.util.stream.LongStream longStream8 = random0.longs((long) 'u', (long) 'x');
        int int9 = random0.nextInt();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Number number11 = faker10.number;
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Random random13 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream16 = random13.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale12, random13);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Internet internet19 = faker18.internet;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name21 = faker20.name;
        com.github.javafaker.Options options22 = faker20.options;
        com.github.javafaker.Name name23 = faker20.name();
        com.github.javafaker.Code code24 = faker20.code;
        faker18.code = code24;
        faker10.code = code24;
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2085992140 + "'", int9 == 2085992140);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(internet19);
        org.junit.Assert.assertNotNull(name21);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(name23);
        org.junit.Assert.assertNotNull(code24);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker4 = faker0.hacker;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(hacker4);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        java.util.Locale.Builder builder9 = builder5.addUnicodeLocaleAttribute("Germany");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder5.setScript("Japanisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Japanisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.util.Locale locale1 = new java.util.Locale("ja");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.ENGLISH;
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        java.lang.String str7 = locale3.getDisplayName(locale5);
        java.lang.String str8 = locale1.getDisplayLanguage(locale5);
        java.util.Locale locale12 = new java.util.Locale("Germany", "anglais", "de");
        java.lang.String str13 = locale12.getDisplayCountry();
        java.lang.String str14 = locale12.getScript();
        java.util.Locale locale17 = new java.util.Locale("allemand", "french");
        java.lang.String str18 = locale12.getDisplayScript(locale17);
        java.util.Locale locale19 = null;
        java.lang.String str20 = null; // flaky: locale12.getDisplayScript(locale19);
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.lang.String str22 = locale21.getDisplayCountry();
        java.lang.String str23 = locale21.getLanguage();
        java.lang.String str24 = locale21.getDisplayName();
        java.lang.String str25 = locale21.toLanguageTag();
        java.util.Locale.setDefault(locale21);
        java.lang.String str27 = locale12.getDisplayLanguage(locale21);
        java.lang.String str28 = locale5.getDisplayVariant(locale12);
        java.lang.String str30 = locale5.getExtension('x');
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "anglais" + "'", str6, "anglais");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "allemand" + "'", str7, "allemand");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "japonais" + "'", str8, "japonais");
        org.junit.Assert.assertEquals(locale12.toString(), "germany_ANGLAIS_de");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ANGLAIS" + "'", str13, "ANGLAIS");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale17.toString(), "allemand_FRENCH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u30c9\u30a4\u30c4" + "'", str22, "\u30c9\u30a4\u30c4");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "de" + "'", str23, "de");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)" + "'", str24, "\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "de-DE" + "'", str25, "de-DE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "germany" + "'", str27, "germany");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name5 = faker4.name;
        com.github.javafaker.Internet internet6 = faker4.internet;
        com.github.javafaker.service.RandomService randomService7 = faker4.randomService;
        boolean boolean8 = languageRange1.equals((java.lang.Object) faker4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(randomService7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        java.util.Locale locale3 = new java.util.Locale("de-DE", "japan", "Germany");
        java.util.Locale.setDefault(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de-de_JAPAN_Germany");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setVariant("zh");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: zh [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Set<java.lang.Character> charSet4 = locale0.getExtensionKeys();
        java.util.Locale locale6 = new java.util.Locale("");
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale6.getDisplayCountry(locale7);
        java.lang.String str9 = locale0.getDisplayCountry(locale7);
        java.lang.String str10 = locale7.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale7.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais" + "'", str2, "anglais");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setLanguageTag("de-DE");
        java.util.Locale.Builder builder9 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setScript("japonais");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: japonais [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((long) (short) 1);
        java.util.stream.IntStream intStream9 = random0.ints(0L);
        long long10 = random0.nextLong();
        boolean boolean11 = random0.nextBoolean();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(intStream9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1879949409285931914L) + "'", long10 == (-1879949409285931914L));
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        java.util.Locale locale1 = new java.util.Locale("Japan");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Random random4 = new java.util.Random();
        double double5 = random4.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale3, random4);
        java.lang.String str8 = locale2.getDisplayVariant(locale3);
        org.junit.Assert.assertEquals(locale1.toString(), "japan");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "japan");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6692676656084896d + "'", double5 == 0.6692676656084896d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        double double2 = random1.nextDouble();
        double double3 = random1.nextDouble();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles(688822307316714936L);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Code code7 = faker6.code();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7304302967434272d + "'", double2 == 0.7304302967434272d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.2578027905957804d + "'", double3 == 0.2578027905957804d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book6 = null;
        faker5.book = book6;
        com.github.javafaker.Code code8 = faker5.code();
        faker0.code = code8;
        java.lang.Class<?> wildcardClass10 = faker0.getClass();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getCountry();
        java.util.Locale locale7 = new java.util.Locale("ANGLAIS", "allemand", "German");
        java.lang.String str8 = locale7.getCountry();
        java.lang.String str9 = locale0.getDisplayCountry(locale7);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Germany" + "'", str1, "Germany");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DE" + "'", str3, "DE");
        org.junit.Assert.assertEquals(locale7.toString(), "anglais_ALLEMAND_German");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ALLEMAND" + "'", str8, "ALLEMAND");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Germany" + "'", str9, "Germany");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Internet internet7 = faker6.internet;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name9 = faker8.name;
        com.github.javafaker.Options options10 = faker8.options;
        com.github.javafaker.Name name11 = faker8.name();
        com.github.javafaker.Code code12 = faker8.code;
        faker6.code = code12;
        com.github.javafaker.Number number14 = faker6.number;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name16 = faker15.name;
        com.github.javafaker.Options options17 = faker15.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService18 = faker15.fakeValuesService;
        com.github.javafaker.service.RandomService randomService19 = null;
        faker15.randomService = randomService19;
        com.github.javafaker.Options options21 = faker15.options;
        faker6.options = options21;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name24 = faker23.name;
        com.github.javafaker.Options options25 = faker23.options;
        com.github.javafaker.Name name26 = faker23.name();
        com.github.javafaker.Hacker hacker27 = faker23.hacker();
        com.github.javafaker.service.RandomService randomService28 = faker23.randomService;
        faker6.randomService = randomService28;
        com.github.javafaker.service.RandomService randomService30 = faker6.randomService;
        com.github.javafaker.Number number31 = faker6.number();
        com.github.javafaker.Finance finance32 = faker6.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(fakeValuesService18);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(name26);
        org.junit.Assert.assertNotNull(hacker27);
        org.junit.Assert.assertNotNull(randomService28);
        org.junit.Assert.assertNotNull(randomService30);
        org.junit.Assert.assertNotNull(number31);
        org.junit.Assert.assertNotNull(finance32);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        com.github.javafaker.Book book8 = faker5.book;
        com.github.javafaker.Company company9 = faker5.company;
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Random random11 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream14 = random11.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale10, random11);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name18 = faker17.name;
        com.github.javafaker.Options options19 = faker17.options;
        com.github.javafaker.Company company20 = faker17.company();
        faker16.company = company20;
        java.lang.String str23 = faker16.numerify("\u4e2d\u56fd\u8a9e");
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book25 = null;
        faker24.book = book25;
        java.util.Random random27 = null;
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(random27);
        com.github.javafaker.Number number29 = faker28.number;
        faker24.number = number29;
        com.github.javafaker.App app31 = faker24.app;
        faker16.app = app31;
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name34 = faker33.name;
        com.github.javafaker.Options options35 = faker33.options;
        com.github.javafaker.Name name36 = faker33.name();
        faker16.name = name36;
        faker5.name = name36;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(company20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str23, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(number29);
        org.junit.Assert.assertNotNull(app31);
        org.junit.Assert.assertNotNull(name34);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNotNull(name36);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Business business2 = null;
        faker0.business = business2;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber;
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.Book book6 = faker0.book;
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Random random8 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream11 = random8.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale7, random8);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random8);
        java.util.Random random14 = new java.util.Random();
        double double15 = random14.nextDouble();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name18 = faker17.name;
        com.github.javafaker.Options options19 = faker17.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService20 = faker17.fakeValuesService;
        com.github.javafaker.service.RandomService randomService21 = null;
        faker17.randomService = randomService21;
        com.github.javafaker.DateAndTime dateAndTime23 = faker17.date();
        faker16.dateAndTime = dateAndTime23;
        faker13.dateAndTime = dateAndTime23;
        faker0.dateAndTime = dateAndTime23;
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name28 = faker27.name;
        com.github.javafaker.Options options29 = faker27.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService30 = faker27.fakeValuesService;
        com.github.javafaker.service.RandomService randomService31 = null;
        faker27.randomService = randomService31;
        com.github.javafaker.Finance finance33 = faker27.finance;
        faker0.finance = finance33;
        com.github.javafaker.Address address35 = faker0.address();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream11);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.32321890351417304d + "'", double15 == 0.32321890351417304d);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(fakeValuesService20);
        org.junit.Assert.assertNotNull(dateAndTime23);
        org.junit.Assert.assertNotNull(name28);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(fakeValuesService30);
        org.junit.Assert.assertNotNull(finance33);
        org.junit.Assert.assertNotNull(address35);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.IntStream intStream3 = random1.ints();
        java.util.stream.LongStream longStream4 = random1.longs();
        java.util.stream.DoubleStream doubleStream7 = random1.doubles(0.0d, (double) 23);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        java.util.Locale locale3 = new java.util.Locale("hi!", "", "");
        java.lang.String str4 = locale3.getDisplayLanguage();
        boolean boolean5 = locale3.hasExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        java.util.Locale.Builder builder11 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder14 = builder7.setExtension('x', "anglais");
        java.util.Locale.Builder builder15 = builder7.clearExtensions();
        java.util.Locale locale16 = builder15.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "anglais" + "'", str10, "anglais");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.DateAndTime dateAndTime3 = faker2.dateAndTime;
        com.github.javafaker.Internet internet4 = null;
        faker2.internet = internet4;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(dateAndTime3);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        java.lang.String str3 = faker0.numerify("Germany");
        com.github.javafaker.Address address4 = faker0.address;
        com.github.javafaker.DateAndTime dateAndTime5 = faker0.date();
        com.github.javafaker.Lorem lorem6 = faker0.lorem;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Germany" + "'", str3, "Germany");
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book9 = null;
        faker8.book = book9;
        com.github.javafaker.Code code11 = faker8.code();
        faker5.code = code11;
        com.github.javafaker.Company company13 = faker5.company;
        com.github.javafaker.Options options14 = faker5.options;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(options14);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Germany" + "'", str1, "Germany");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "de_DE" + "'", str3, "de_DE");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream12 = random7.doubles((long) (short) 1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService14 = faker13.randomService;
        faker0.randomService = randomService14;
        com.github.javafaker.Address address16 = faker0.address;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book18 = null;
        faker17.book = book18;
        java.util.Random random20 = null;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Number number22 = faker21.number;
        faker17.number = number22;
        com.github.javafaker.App app24 = faker17.app;
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.util.Random random26 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream29 = random26.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale25, random26);
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.Internet internet32 = faker31.internet;
        faker17.internet = internet32;
        com.github.javafaker.Lorem lorem34 = faker17.lorem();
        faker0.lorem = lorem34;
        com.github.javafaker.service.FakeValuesService fakeValuesService36 = faker0.fakeValuesService;
        com.github.javafaker.Business business37 = null;
        faker0.business = business37;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(randomService14);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(number22);
        org.junit.Assert.assertNotNull(app24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(internet32);
        org.junit.Assert.assertNotNull(lorem34);
        org.junit.Assert.assertNotNull(fakeValuesService36);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.IntStream intStream5 = random1.ints((long) (byte) 100, (int) (byte) 1, (int) ' ');
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        java.util.stream.IntStream intStream8 = random1.ints((long) 100);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Code code6 = faker0.code;
        com.github.javafaker.Finance finance7 = faker0.finance;
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Random random9 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream12 = random9.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale8, random9);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Internet internet15 = faker14.internet;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name17 = faker16.name;
        com.github.javafaker.Options options18 = faker16.options;
        com.github.javafaker.Name name19 = faker16.name();
        com.github.javafaker.Code code20 = faker16.code;
        faker14.code = code20;
        com.github.javafaker.Number number22 = faker14.number;
        faker0.number = number22;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(internet15);
        org.junit.Assert.assertNotNull(name17);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(name19);
        org.junit.Assert.assertNotNull(code20);
        org.junit.Assert.assertNotNull(number22);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        java.lang.String str5 = faker0.letterify("de");
        com.github.javafaker.Finance finance6 = faker0.finance();
        java.util.Locale locale7 = java.util.Locale.UK;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale7);
        com.github.javafaker.Internet internet9 = faker8.internet();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name11 = faker10.name;
        com.github.javafaker.Options options12 = faker10.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService13 = faker10.fakeValuesService;
        com.github.javafaker.service.RandomService randomService14 = null;
        faker10.randomService = randomService14;
        com.github.javafaker.Options options16 = faker10.options;
        java.util.Random random17 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream20 = random17.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream22 = random17.doubles((long) (short) 1);
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.service.RandomService randomService24 = faker23.randomService;
        faker10.randomService = randomService24;
        com.github.javafaker.Address address26 = faker10.address;
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name28 = faker27.name;
        com.github.javafaker.Options options29 = faker27.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService30 = faker27.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber31 = null;
        faker27.phoneNumber = phoneNumber31;
        com.github.javafaker.Name name33 = faker27.name();
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name35 = faker34.name;
        com.github.javafaker.Options options36 = faker34.options;
        com.github.javafaker.Name name37 = faker34.name();
        com.github.javafaker.Hacker hacker38 = faker34.hacker();
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book40 = null;
        faker39.book = book40;
        com.github.javafaker.Code code42 = faker39.code();
        faker34.code = code42;
        com.github.javafaker.Address address44 = faker34.address;
        faker27.address = address44;
        faker10.address = address44;
        faker8.address = address44;
        com.github.javafaker.Company company48 = faker8.company();
        faker0.company = company48;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "de" + "'", str5, "de");
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(fakeValuesService13);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertNotNull(randomService24);
        org.junit.Assert.assertNotNull(address26);
        org.junit.Assert.assertNotNull(name28);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(fakeValuesService30);
        org.junit.Assert.assertNotNull(name33);
        org.junit.Assert.assertNotNull(name35);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertNotNull(name37);
        org.junit.Assert.assertNotNull(hacker38);
        org.junit.Assert.assertNotNull(code42);
        org.junit.Assert.assertNotNull(address44);
        org.junit.Assert.assertNotNull(company48);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random0);
        int int9 = random0.nextInt(6);
        java.util.stream.LongStream longStream10 = random0.longs();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        java.util.Locale.Builder builder9 = builder5.addUnicodeLocaleAttribute("Germany");
        java.util.Locale locale11 = new java.util.Locale("Japan");
        java.util.Locale locale12 = locale11.stripExtensions();
        java.util.Locale locale14 = new java.util.Locale("hi!");
        java.lang.String str15 = locale14.getISO3Language();
        java.util.Set<java.lang.String> strSet16 = locale14.getUnicodeLocaleAttributes();
        java.lang.String str17 = locale12.getDisplayLanguage(locale14);
        java.lang.String str18 = locale14.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder9.setLocale(locale14);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale11.toString(), "japan");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "japan");
        org.junit.Assert.assertEquals(locale14.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "japan" + "'", str17, "japan");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Japanese");
        java.util.Locale.setDefault(locale1);
        java.lang.String str3 = locale1.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "japanese");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("German");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.setLanguageTag("ja");
        java.util.Locale.Builder builder6 = builder2.clear();
        java.util.Locale.Builder builder8 = builder2.setLanguage("German");
        boolean boolean9 = languageRange1.equals((java.lang.Object) builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.util.Locale locale1 = new java.util.Locale("jpn");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getCountry();
        java.lang.String str4 = locale1.getVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "jpn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = new java.util.Locale("hi!", "", "");
        java.lang.String str5 = locale0.getDisplayScript(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale6.getDisplayCountry();
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale8);
        java.util.Set<java.lang.Character> charSet12 = locale8.getExtensionKeys();
        java.lang.String str13 = locale6.getDisplayLanguage(locale8);
        java.lang.String str14 = locale4.getDisplayLanguage(locale8);
        java.lang.String str15 = locale8.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Germany" + "'", str7, "Germany");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "anglais" + "'", str10, "anglais");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "German" + "'", str13, "German");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name3 = faker2.name;
        com.github.javafaker.Options options4 = faker2.options;
        com.github.javafaker.App app5 = faker2.app();
        faker1.app = app5;
        com.github.javafaker.Code code7 = faker1.code();
        com.github.javafaker.Hacker hacker8 = faker1.hacker;
        com.github.javafaker.Name name9 = faker1.name;
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNotNull(name9);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("FR", 0.0075679741157871185d);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        java.util.Locale locale2 = new java.util.Locale("japonais", "japonais");
        org.junit.Assert.assertEquals(locale2.toString(), "japonais_JAPONAIS");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        java.util.Random random1 = new java.util.Random((-4962768465676381896L));
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("japan", 1.0702551062704795d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.0702551062704795");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        java.util.Locale locale1 = new java.util.Locale("Deutschland");
        org.junit.Assert.assertEquals(locale1.toString(), "deutschland");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        java.util.Random random1 = new java.util.Random((long) 2085992140);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale5 = locale3.stripExtensions();
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale7 = java.util.Locale.GERMANY;
        java.lang.String str8 = locale7.getDisplayCountry();
        java.lang.String str9 = locale7.getVariant();
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Random random11 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream14 = random11.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale10, random11);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale7, random11);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale5, random11);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "japanese");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "japanese");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Germany" + "'", str8, "Germany");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream14);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u30c9\u30a4\u30c4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.PhoneNumber phoneNumber13 = faker6.phoneNumber;
        com.github.javafaker.PhoneNumber phoneNumber14 = faker6.phoneNumber;
        com.github.javafaker.Book book15 = faker6.book();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(phoneNumber13);
        org.junit.Assert.assertNotNull(phoneNumber14);
        org.junit.Assert.assertNotNull(book15);
    }
}
