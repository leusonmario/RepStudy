import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream2 = random1.longs();
        int int4 = random1.nextInt((int) 'u');
        boolean boolean5 = random1.nextBoolean();
        int int6 = random1.nextInt();
        long long7 = random1.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream11 = random1.doubles((long) ' ', (double) 'a', (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 69 + "'", int4 == 69);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1761283695 + "'", int6 == 1761283695);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 7515937759503895804L + "'", long7 == 7515937759503895804L);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        java.util.stream.IntStream intStream3 = random1.ints();
        java.util.stream.LongStream longStream7 = random1.longs((long) 100, 0L, (long) 'u');
        double double8 = random1.nextGaussian();
        long long9 = random1.nextLong();
        java.util.stream.LongStream longStream13 = random1.longs((long) (byte) 10, (long) ' ', 3831662765844904176L);
        java.util.stream.IntStream intStream17 = random1.ints((long) '4', (int) (short) 10, (int) '4');
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.561581040188955d + "'", double8 == 1.561581040188955d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3831662765844904176L + "'", long9 == 3831662765844904176L);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(intStream17);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.util.Locale.setDefault(category0, locale1);
        java.lang.String str3 = locale1.getScript();
        java.util.Random random5 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream6 = random5.longs();
        int int8 = random5.nextInt((int) 'u');
        random5.setSeed((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream11 = random5.doubles();
        java.util.stream.DoubleStream doubleStream12 = random5.doubles();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale1, random5);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = random5.nextInt((-1901749300));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 69 + "'", int8 == 69);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(doubleStream12);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder3 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Canada");
        java.util.Locale locale6 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setRegion("inglese (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: inglese (Canada) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "italian");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "italian");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream2 = random1.longs();
        int int4 = random1.nextInt((int) 'u');
        boolean boolean5 = random1.nextBoolean();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService8 = faker7.randomService;
        java.lang.String str10 = faker7.bothify("");
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService12 = faker11.randomService;
        java.lang.String str14 = faker11.bothify("");
        com.github.javafaker.Book book15 = faker11.book();
        faker7.book = book15;
        faker6.book = book15;
        com.github.javafaker.Internet internet18 = faker6.internet();
        com.github.javafaker.Color color19 = faker6.color;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService21 = faker20.randomService;
        java.lang.String str23 = faker20.bothify("");
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService25 = faker24.randomService;
        com.github.javafaker.Book book26 = faker24.book();
        com.github.javafaker.Finance finance27 = faker24.finance();
        com.github.javafaker.Book book28 = faker24.book();
        com.github.javafaker.Options options29 = faker24.options();
        com.github.javafaker.PhoneNumber phoneNumber30 = faker24.phoneNumber();
        faker20.phoneNumber = phoneNumber30;
        com.github.javafaker.Finance finance32 = faker20.finance();
        java.util.Locale locale33 = java.util.Locale.ITALIAN;
        java.util.Locale locale34 = java.util.Locale.CANADA;
        java.util.Locale locale35 = java.util.Locale.KOREAN;
        java.lang.String str36 = locale34.getDisplayName(locale35);
        java.lang.String str37 = locale34.getISO3Language();
        java.util.Locale locale38 = locale34.stripExtensions();
        java.lang.String str39 = locale38.toLanguageTag();
        java.lang.String str40 = locale33.getDisplayLanguage(locale38);
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(locale33);
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService43 = faker42.randomService;
        java.lang.String str45 = faker42.bothify("");
        com.github.javafaker.service.RandomService randomService46 = faker42.randomService;
        faker41.randomService = randomService46;
        faker20.randomService = randomService46;
        faker6.randomService = randomService46;
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 69 + "'", int4 == 69);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(randomService8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(randomService12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(book15);
        org.junit.Assert.assertNotNull(internet18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(randomService21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(randomService25);
        org.junit.Assert.assertNotNull(book26);
        org.junit.Assert.assertNotNull(finance27);
        org.junit.Assert.assertNotNull(book28);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(phoneNumber30);
        org.junit.Assert.assertNotNull(finance32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str36, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "eng" + "'", str37, "eng");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "en-CA" + "'", str39, "en-CA");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Italian" + "'", str40, "Italian");
        org.junit.Assert.assertNotNull(randomService43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(randomService46);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.dateAndTime;
        com.github.javafaker.DateAndTime dateAndTime5 = faker0.dateAndTime;
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Random random8 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream9 = random8.longs();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale6, random8);
        com.github.javafaker.Internet internet11 = faker10.internet();
        faker0.internet = internet11;
        com.github.javafaker.Name name13 = faker0.name;
        org.junit.Assert.assertNotNull(randomService1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(name13);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream2 = random1.longs();
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        random1.nextBytes(byteArray9);
        double double11 = random1.nextGaussian();
        boolean boolean12 = random1.nextBoolean();
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[115, -43, 26, -69, -40, -100]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.4123569817688534d) + "'", double11 == (-0.4123569817688534d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Locale.setDefault(locale0);
        java.lang.String str3 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random2 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream3 = random2.longs();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0, random2);
        com.github.javafaker.DateAndTime dateAndTime5 = faker4.date();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService7 = faker6.randomService;
        java.lang.String str9 = faker6.bothify("");
        com.github.javafaker.Book book10 = faker6.book();
        java.lang.String str12 = faker6.regexify("eng");
        com.github.javafaker.service.RandomService randomService13 = faker6.randomService;
        com.github.javafaker.Code code14 = faker6.code;
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.util.Locale locale16 = java.util.Locale.CANADA;
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.lang.String str18 = locale16.getDisplayName(locale17);
        java.lang.String str19 = locale16.getISO3Language();
        java.util.Locale locale20 = locale16.stripExtensions();
        java.lang.String str21 = locale20.toLanguageTag();
        java.lang.String str22 = locale15.getDisplayLanguage(locale20);
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(locale15);
        com.github.javafaker.Company company24 = faker23.company();
        com.github.javafaker.App app25 = faker23.app;
        faker6.app = app25;
        faker4.app = app25;
        com.github.javafaker.Name name28 = faker4.name();
        com.github.javafaker.Internet internet29 = faker4.internet();
        com.github.javafaker.Address address30 = faker4.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(randomService7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eng" + "'", str12, "eng");
        org.junit.Assert.assertNotNull(randomService13);
        org.junit.Assert.assertNotNull(code14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str18, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "eng" + "'", str19, "eng");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en-CA" + "'", str21, "en-CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Italian" + "'", str22, "Italian");
        org.junit.Assert.assertNotNull(company24);
        org.junit.Assert.assertNotNull(app25);
        org.junit.Assert.assertNotNull(name28);
        org.junit.Assert.assertNotNull(internet29);
        org.junit.Assert.assertNotNull(address30);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale0.getCountry();
        java.lang.String str4 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str2, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CA" + "'", str3, "CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-CA" + "'", str4, "en-CA");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale0.getISO3Language();
        java.lang.String str4 = locale0.getDisplayVariant();
        java.lang.String str6 = locale0.getExtension('a');
        java.lang.String str7 = locale0.getDisplayVariant();
        java.util.Locale locale8 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str2, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        java.util.stream.LongStream longStream5 = random1.longs((long) 0, 10L);
        java.util.Random random7 = new java.util.Random((long) 1);
        random7.setSeed((long) (-1));
        double double10 = random7.nextGaussian();
        java.util.Random random12 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream13 = random12.longs();
        int int15 = random12.nextInt((int) 'u');
        random12.setSeed((long) (byte) 10);
        java.util.Random random19 = new java.util.Random((long) 1);
        java.util.Random random21 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream22 = random21.longs();
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        random21.nextBytes(byteArray29);
        random19.nextBytes(byteArray29);
        random12.nextBytes(byteArray29);
        random7.nextBytes(byteArray29);
        java.util.Random random35 = new java.util.Random((long) 1);
        java.util.stream.DoubleStream doubleStream36 = random35.doubles();
        java.util.stream.IntStream intStream37 = random35.ints();
        java.util.stream.LongStream longStream41 = random35.longs((long) 100, 0L, (long) 'u');
        java.util.Random random43 = new java.util.Random((long) 1);
        java.util.stream.DoubleStream doubleStream44 = random43.doubles();
        java.util.Random random46 = new java.util.Random((long) 1);
        java.util.Random random48 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream49 = random48.longs();
        byte[] byteArray56 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        random48.nextBytes(byteArray56);
        random46.nextBytes(byteArray56);
        random43.nextBytes(byteArray56);
        random35.nextBytes(byteArray56);
        random7.nextBytes(byteArray56);
        random1.nextBytes(byteArray56);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7853314409882288d + "'", double10 == 1.7853314409882288d);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertNotNull(longStream22);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-54, -101, 127, -45, -10, 56]");
        org.junit.Assert.assertNotNull(doubleStream36);
        org.junit.Assert.assertNotNull(intStream37);
        org.junit.Assert.assertNotNull(longStream41);
        org.junit.Assert.assertNotNull(doubleStream44);
        org.junit.Assert.assertNotNull(longStream49);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[115, -43, 26, -69, -40, -100]");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream2 = random1.longs();
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        random1.nextBytes(byteArray9);
        long long11 = random1.nextLong();
        java.util.stream.LongStream longStream13 = random1.longs((long) ' ');
        java.util.stream.DoubleStream doubleStream15 = random1.doubles((long) 0);
        java.util.stream.LongStream longStream19 = random1.longs((long) 1414906606, (long) 1, (long) 491102327);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[115, -43, 26, -69, -40, -100]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 7564655870752979346L + "'", long11 == 7564655870752979346L);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(longStream19);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder3 = builder0.setLocale(locale1);
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
        java.lang.String str15 = locale13.getDisplayCountry();
        java.util.Locale.Builder builder16 = builder3.setLocale(locale13);
        java.util.Locale.Builder builder18 = builder16.setLanguage("ita");
        java.util.Locale.Builder builder21 = builder18.setExtension('a', "CAN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str6, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CA" + "'", str7, "CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str11, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eng" + "'", str12, "eng");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Canada" + "'", str15, "Canada");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getScript();
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale2.getDisplayScript();
        java.lang.String str4 = locale0.getDisplayVariant(locale2);
        java.lang.String str5 = locale2.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale2.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "South Korea" + "'", str5, "South Korea");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService30 = faker29.randomService;
        java.lang.String str32 = faker29.bothify("");
        com.github.javafaker.DateAndTime dateAndTime33 = faker29.dateAndTime;
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService35 = faker34.randomService;
        com.github.javafaker.Book book36 = faker34.book();
        faker29.book = book36;
        com.github.javafaker.Business business38 = faker29.business;
        faker16.business = business38;
        com.github.javafaker.Name name40 = faker16.name;
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business42 = null;
        faker41.business = business42;
        com.github.javafaker.Color color44 = null;
        faker41.color = color44;
        com.github.javafaker.App app46 = faker41.app;
        faker16.app = app46;
        org.junit.Assert.assertEquals(locale1.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str6, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CA" + "'", str7, "CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str11, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eng" + "'", str12, "eng");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(randomService19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(dateAndTime22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "en-CA" + "'", str24, "en-CA");
        org.junit.Assert.assertNotNull(fakeValuesService27);
        org.junit.Assert.assertNotNull(randomService30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(dateAndTime33);
        org.junit.Assert.assertNotNull(randomService35);
        org.junit.Assert.assertNotNull(book36);
        org.junit.Assert.assertNotNull(business38);
        org.junit.Assert.assertNotNull(name40);
        org.junit.Assert.assertNotNull(app46);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(locale0);
        boolean boolean2 = locale0.hasExtensions();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.util.Locale.setDefault(category4, locale5);
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.lang.String str9 = locale7.getDisplayName(locale8);
        java.lang.String str10 = locale7.getISO3Language();
        java.util.Locale locale11 = locale7.stripExtensions();
        java.util.Locale.setDefault(category4, locale7);
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(locale13);
        boolean boolean15 = locale13.hasExtensions();
        java.util.Locale locale16 = locale13.stripExtensions();
        java.util.Locale.setDefault(category4, locale13);
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder20 = builder18.setRegion("CA");
        java.util.Locale locale21 = java.util.Locale.CANADA;
        java.util.Locale locale22 = java.util.Locale.KOREAN;
        java.lang.String str23 = locale21.getDisplayName(locale22);
        java.lang.String str24 = locale21.getCountry();
        java.lang.String str25 = locale21.getScript();
        java.util.Locale locale26 = java.util.Locale.ROOT;
        java.lang.String str27 = locale26.getVariant();
        java.lang.String str28 = locale21.getDisplayCountry(locale26);
        java.util.Locale.Builder builder29 = builder18.setLocale(locale26);
        java.lang.String str30 = locale26.getScript();
        java.util.Locale.setDefault(category4, locale26);
        java.lang.String str32 = locale3.getDisplayVariant(locale26);
        java.lang.String str33 = locale3.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str9, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "eng" + "'", str10, "eng");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str23, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "CA" + "'", str24, "CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Canada" + "'", str28, "Canada");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "it" + "'", str33, "it");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.lang.String str5 = locale2.getISO3Language();
        java.util.Locale locale6 = locale2.stripExtensions();
        java.lang.String str7 = locale0.getDisplayName(locale2);
        java.util.Random random9 = new java.util.Random((long) 1);
        java.util.stream.DoubleStream doubleStream10 = random9.doubles();
        java.util.stream.LongStream longStream13 = random9.longs((long) 0, 10L);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale2, random9);
        java.util.stream.IntStream intStream17 = random9.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random9);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Korean" + "'", str1, "Korean");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str4, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eng" + "'", str5, "eng");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Korean" + "'", str7, "Korean");
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(intStream17);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.lang.String str4 = locale1.getISO3Language();
        java.util.Locale locale5 = locale1.stripExtensions();
        java.lang.String str6 = locale5.toLanguageTag();
        java.lang.String str7 = locale0.getDisplayLanguage(locale5);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService10 = faker9.randomService;
        java.lang.String str12 = faker9.bothify("");
        com.github.javafaker.service.RandomService randomService13 = faker9.randomService;
        faker8.randomService = randomService13;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService16 = faker15.randomService;
        java.lang.String str18 = faker15.bothify("");
        com.github.javafaker.service.RandomService randomService19 = faker15.randomService;
        com.github.javafaker.Book book20 = faker15.book;
        com.github.javafaker.Lorem lorem21 = null;
        faker15.lorem = lorem21;
        java.util.Locale locale23 = java.util.Locale.CANADA;
        java.lang.String str24 = locale23.getDisplayVariant();
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale23);
        com.github.javafaker.Finance finance26 = faker25.finance();
        com.github.javafaker.Code code27 = faker25.code;
        faker15.code = code27;
        faker8.code = code27;
        com.github.javafaker.Book book30 = faker8.book();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str3, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eng" + "'", str4, "eng");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-CA" + "'", str6, "en-CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Italian" + "'", str7, "Italian");
        org.junit.Assert.assertNotNull(randomService10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(randomService13);
        org.junit.Assert.assertNotNull(randomService16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(randomService19);
        org.junit.Assert.assertNotNull(book20);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(finance26);
        org.junit.Assert.assertNotNull(code27);
        org.junit.Assert.assertNotNull(book30);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getLanguage();
        java.lang.String str2 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr" + "'", str1, "fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRA" + "'", str2, "FRA");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.lang.String str5 = locale2.getISO3Language();
        java.util.Locale locale6 = locale2.stripExtensions();
        java.lang.String str7 = locale0.getDisplayName(locale2);
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.lang.String str10 = locale0.getDisplayVariant(locale8);
        java.util.Random random12 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream13 = random12.longs();
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        random12.nextBytes(byteArray20);
        double double22 = random12.nextGaussian();
        java.util.stream.DoubleStream doubleStream24 = random12.doubles((long) '#');
        int int25 = random12.nextInt();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale8, random12);
        java.lang.String str28 = faker26.bothify("can");
        java.util.Locale locale29 = java.util.Locale.CHINA;
        java.util.Random random31 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream32 = random31.longs();
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale29, random31);
        com.github.javafaker.DateAndTime dateAndTime34 = faker33.date();
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService36 = faker35.randomService;
        java.lang.String str38 = faker35.bothify("");
        com.github.javafaker.Book book39 = faker35.book();
        java.lang.String str41 = faker35.regexify("eng");
        com.github.javafaker.service.RandomService randomService42 = faker35.randomService;
        com.github.javafaker.Code code43 = faker35.code;
        java.util.Locale locale44 = java.util.Locale.ITALIAN;
        java.util.Locale locale45 = java.util.Locale.CANADA;
        java.util.Locale locale46 = java.util.Locale.KOREAN;
        java.lang.String str47 = locale45.getDisplayName(locale46);
        java.lang.String str48 = locale45.getISO3Language();
        java.util.Locale locale49 = locale45.stripExtensions();
        java.lang.String str50 = locale49.toLanguageTag();
        java.lang.String str51 = locale44.getDisplayLanguage(locale49);
        com.github.javafaker.Faker faker52 = new com.github.javafaker.Faker(locale44);
        com.github.javafaker.Company company53 = faker52.company();
        com.github.javafaker.App app54 = faker52.app;
        faker35.app = app54;
        faker33.app = app54;
        faker26.app = app54;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Korean" + "'", str1, "Korean");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str4, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eng" + "'", str5, "eng");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Korean" + "'", str7, "Korean");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[115, -43, 26, -69, -40, -100]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.4123569817688534d) + "'", double22 == (-0.4123569817688534d));
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1429008869 + "'", int25 == 1429008869);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "can" + "'", str28, "can");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream32);
        org.junit.Assert.assertNotNull(dateAndTime34);
        org.junit.Assert.assertNotNull(randomService36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(book39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "eng" + "'", str41, "eng");
        org.junit.Assert.assertNotNull(randomService42);
        org.junit.Assert.assertNotNull(code43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "it");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str47, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "eng" + "'", str48, "eng");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "en-CA" + "'", str50, "en-CA");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Italian" + "'", str51, "Italian");
        org.junit.Assert.assertNotNull(company53);
        org.junit.Assert.assertNotNull(app54);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.util.Random random1 = new java.util.Random((long) 1);
        random1.setSeed((long) (-1));
        float float4 = random1.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) (-1465154083));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.2689426f + "'", float4 == 0.2689426f);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream2 = random1.longs();
        int int4 = random1.nextInt((int) 'u');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        java.lang.String str7 = faker5.regexify("\u52a0\u62ff\u5927");
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService9 = faker8.randomService;
        java.lang.String str11 = faker8.bothify("");
        com.github.javafaker.DateAndTime dateAndTime12 = faker8.dateAndTime;
        com.github.javafaker.Lorem lorem13 = null;
        faker8.lorem = lorem13;
        com.github.javafaker.Code code15 = faker8.code();
        com.github.javafaker.Address address16 = faker8.address();
        faker5.address = address16;
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 69 + "'", int4 == 69);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u52a0\u62ff\u5927" + "'", str7, "\u52a0\u62ff\u5927");
        org.junit.Assert.assertNotNull(randomService9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(dateAndTime12);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertNotNull(address16);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.util.Locale locale2 = new java.util.Locale("en-CA", "\u82f1\u6587");
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u82f1\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u6587)" + "'", str3, "\u82f1\u6587)");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.util.Random random1 = new java.util.Random((long) 1);
        boolean boolean2 = random1.nextBoolean();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        random1.setSeed(0L);
        java.util.stream.LongStream longStream6 = random1.longs();
        int int8 = random1.nextInt(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream11 = random1.longs(3596673253889729385L, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream2 = random1.longs();
        int int4 = random1.nextInt((int) 'u');
        random1.setSeed((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream7 = random1.doubles();
        java.util.stream.DoubleStream doubleStream8 = random1.doubles();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem10 = faker9.lorem();
        com.github.javafaker.Company company11 = faker9.company;
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 69 + "'", int4 == 69);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNotNull(company11);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale0.getISO3Language();
        java.util.Locale locale4 = locale0.stripExtensions();
        java.lang.String str5 = locale0.getDisplayVariant();
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = locale6.getDisplayVariant();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale6);
        java.util.Set<java.lang.String> strSet9 = locale6.getUnicodeLocaleKeys();
        java.lang.String str10 = locale0.getDisplayLanguage(locale6);
        java.lang.String str11 = locale0.getDisplayScript();
        java.util.Random random13 = new java.util.Random((long) (byte) 10);
        float float14 = random13.nextFloat();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale0, random13);
        java.util.stream.IntStream intStream16 = random13.ints();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str2, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "English" + "'", str10, "English");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.73043025f + "'", float14 == 0.73043025f);
        org.junit.Assert.assertNotNull(intStream16);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder3 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Canada");
        java.util.Locale.Builder builder7 = builder3.setVariant("");
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("english");
        java.util.Locale locale10 = builder7.build();
        java.util.Locale.Builder builder11 = builder7.clearExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "english");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder3 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Canada");
        java.util.Locale.Builder builder7 = builder5.setLanguage("Korean");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setLanguageTag("en_CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: en_CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.service.RandomService randomService4 = faker0.randomService;
        com.github.javafaker.Book book5 = faker0.book;
        com.github.javafaker.Lorem lorem6 = null;
        faker0.lorem = lorem6;
        com.github.javafaker.Hacker hacker8 = null;
        faker0.hacker = hacker8;
        com.github.javafaker.Color color10 = faker0.color;
        com.github.javafaker.Book book11 = faker0.book();
        com.github.javafaker.Code code12 = faker0.code;
        com.github.javafaker.Company company13 = faker0.company;
        org.junit.Assert.assertNotNull(randomService1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(randomService4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(company13);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder3 = builder0.setLocale(locale1);
        java.util.Locale locale4 = builder0.build();
        java.util.Random random6 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream7 = random6.longs();
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        random6.nextBytes(byteArray14);
        double double16 = random6.nextGaussian();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale4, random6);
        java.lang.String str18 = locale4.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[115, -43, 26, -69, -40, -100]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.4123569817688534d) + "'", double16 == (-0.4123569817688534d));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Italian" + "'", str18, "Italian");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        com.github.javafaker.Book book19 = faker0.book();
        com.github.javafaker.Book book20 = faker0.book;
        org.junit.Assert.assertNotNull(randomService1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(book4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(randomService7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(randomService11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(randomService18);
        org.junit.Assert.assertNotNull(book19);
        org.junit.Assert.assertNotNull(book20);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("CAN");
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: can could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "can");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService2 = faker1.randomService;
        java.lang.String str4 = faker1.bothify("");
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService6 = faker5.randomService;
        java.lang.String str8 = faker5.bothify("");
        com.github.javafaker.Book book9 = faker5.book();
        faker1.book = book9;
        com.github.javafaker.Options options11 = faker1.options();
        com.github.javafaker.App app12 = faker1.app;
        faker0.app = app12;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService15 = faker14.randomService;
        java.lang.String str17 = faker14.bothify("");
        com.github.javafaker.DateAndTime dateAndTime18 = faker14.dateAndTime;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService20 = faker19.randomService;
        java.lang.String str22 = faker19.bothify("");
        com.github.javafaker.DateAndTime dateAndTime23 = faker19.dateAndTime;
        faker14.dateAndTime = dateAndTime23;
        com.github.javafaker.Code code25 = null;
        faker14.code = code25;
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService28 = faker27.randomService;
        java.lang.String str30 = faker27.bothify("");
        com.github.javafaker.DateAndTime dateAndTime31 = faker27.dateAndTime;
        com.github.javafaker.Lorem lorem32 = null;
        faker27.lorem = lorem32;
        com.github.javafaker.Code code34 = faker27.code();
        faker14.code = code34;
        com.github.javafaker.Company company36 = faker14.company();
        com.github.javafaker.Business business37 = faker14.business();
        faker0.business = business37;
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business40 = null;
        faker39.business = business40;
        com.github.javafaker.Color color42 = null;
        faker39.color = color42;
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService45 = faker44.randomService;
        java.lang.String str47 = faker44.bothify("");
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService49 = faker48.randomService;
        java.lang.String str51 = faker48.bothify("");
        com.github.javafaker.Book book52 = faker48.book();
        faker44.book = book52;
        com.github.javafaker.Address address54 = faker44.address();
        faker39.address = address54;
        com.github.javafaker.Faker faker56 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name57 = faker56.name();
        com.github.javafaker.Faker faker58 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name59 = faker58.name();
        faker56.name = name59;
        faker39.name = name59;
        com.github.javafaker.DateAndTime dateAndTime62 = faker39.date();
        faker0.dateAndTime = dateAndTime62;
        com.github.javafaker.service.RandomService randomService64 = faker0.randomService;
        com.github.javafaker.Lorem lorem65 = faker0.lorem();
        org.junit.Assert.assertNotNull(randomService2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(randomService6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(app12);
        org.junit.Assert.assertNotNull(randomService15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(dateAndTime18);
        org.junit.Assert.assertNotNull(randomService20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(dateAndTime23);
        org.junit.Assert.assertNotNull(randomService28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(dateAndTime31);
        org.junit.Assert.assertNotNull(code34);
        org.junit.Assert.assertNotNull(company36);
        org.junit.Assert.assertNotNull(business37);
        org.junit.Assert.assertNotNull(randomService45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(randomService49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(book52);
        org.junit.Assert.assertNotNull(address54);
        org.junit.Assert.assertNotNull(name57);
        org.junit.Assert.assertNotNull(name59);
        org.junit.Assert.assertNotNull(dateAndTime62);
        org.junit.Assert.assertNotNull(randomService64);
        org.junit.Assert.assertNotNull(lorem65);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder3 = builder0.setLocale(locale1);
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
        java.lang.String str15 = locale13.getDisplayCountry();
        java.util.Locale.Builder builder16 = builder3.setLocale(locale13);
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.util.Locale locale19 = new java.util.Locale("\uc601\uc5b4\uce90\ub098\ub2e4)");
        java.util.Locale locale20 = locale19.stripExtensions();
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Locale locale22 = java.util.Locale.CANADA;
        java.util.Locale locale23 = java.util.Locale.KOREAN;
        java.lang.String str24 = locale22.getDisplayName(locale23);
        java.lang.String str25 = locale22.getCountry();
        java.lang.String str26 = locale22.getScript();
        java.util.Locale locale27 = java.util.Locale.CANADA;
        java.util.Locale locale28 = java.util.Locale.KOREAN;
        java.lang.String str29 = locale27.getDisplayName(locale28);
        java.lang.String str30 = locale27.getISO3Language();
        java.util.Locale locale31 = locale27.stripExtensions();
        java.lang.String str32 = locale22.getDisplayScript(locale31);
        java.lang.String str33 = locale21.getDisplayScript(locale22);
        java.lang.String str34 = locale17.getDisplayScript(locale22);
        java.lang.String str35 = locale13.getDisplayName(locale17);
        java.lang.String str36 = locale17.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str6, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CA" + "'", str7, "CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str11, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eng" + "'", str12, "eng");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Canada" + "'", str15, "Canada");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertEquals(locale19.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str24, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "CA" + "'", str25, "CA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str29, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "eng" + "'", str30, "eng");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str35, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ko" + "'", str36, "ko");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.lang.String str4 = locale1.getISO3Language();
        java.util.Locale locale5 = locale1.stripExtensions();
        java.lang.String str6 = locale5.toLanguageTag();
        java.lang.String str7 = locale0.getDisplayLanguage(locale5);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number9 = faker8.number;
        com.github.javafaker.Business business10 = faker8.business;
        com.github.javafaker.Finance finance11 = faker8.finance();
        com.github.javafaker.service.RandomService randomService12 = faker8.randomService;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str3, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eng" + "'", str4, "eng");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-CA" + "'", str6, "en-CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Italian" + "'", str7, "Italian");
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(business10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(randomService12);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream2 = random1.longs();
        int int4 = random1.nextInt((int) 'u');
        boolean boolean5 = random1.nextBoolean();
        int int7 = random1.nextInt(1);
        int int8 = random1.nextInt();
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 69 + "'", int4 == 69);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1749940626 + "'", int8 == 1749940626);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        com.github.javafaker.Finance finance2 = faker0.finance();
        org.junit.Assert.assertNotNull(randomService1);
        org.junit.Assert.assertNotNull(finance2);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        boolean boolean16 = locale3.hasExtensions();
        java.util.Locale locale17 = locale3.stripExtensions();
        java.util.Locale locale19 = new java.util.Locale("deu");
        java.lang.String str20 = locale17.getDisplayVariant(locale19);
        org.junit.Assert.assertEquals(locale1.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str6, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CA" + "'", str7, "CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str11, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eng" + "'", str12, "eng");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals(locale19.toString(), "deu");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(locale0);
        boolean boolean2 = locale0.hasExtensions();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.lang.String str4 = locale0.getVariant();
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale7 = new java.util.Locale("\uc601\uc5b4\uce90\ub098\ub2e4)");
        java.util.Locale locale8 = locale7.stripExtensions();
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Locale locale13 = new java.util.Locale("Italian", "", "English");
        boolean boolean14 = locale13.hasExtensions();
        java.lang.String str15 = locale9.getDisplayName(locale13);
        java.lang.String str17 = locale9.getExtension('a');
        java.lang.String str18 = locale0.getDisplayName(locale9);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale7.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals(locale13.toString(), "italian__English");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str15, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Italian" + "'", str18, "Italian");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale0.getISO3Language();
        java.util.Locale locale4 = locale0.stripExtensions();
        java.lang.String str5 = locale0.getDisplayVariant();
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = locale6.getDisplayVariant();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale6);
        java.util.Set<java.lang.String> strSet9 = locale6.getUnicodeLocaleKeys();
        java.lang.String str10 = locale0.getDisplayLanguage(locale6);
        java.lang.String str11 = locale0.getDisplayScript();
        java.util.Random random13 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream14 = random13.longs();
        int int16 = random13.nextInt((int) 'u');
        random13.setSeed((long) (byte) 10);
        java.util.Random random20 = new java.util.Random((long) 1);
        java.util.Random random22 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream23 = random22.longs();
        byte[] byteArray30 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        random22.nextBytes(byteArray30);
        random20.nextBytes(byteArray30);
        random13.nextBytes(byteArray30);
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(locale0, random13);
        java.util.Locale locale35 = java.util.Locale.CHINA;
        java.lang.String str36 = locale0.getDisplayCountry(locale35);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str2, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "English" + "'", str10, "English");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 69 + "'", int16 == 69);
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-46, 122, -3, -70, -8, 22]");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u52a0\u62ff\u5927" + "'", str36, "\u52a0\u62ff\u5927");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.lang.String str4 = locale1.getISO3Language();
        java.util.Locale locale5 = locale1.stripExtensions();
        java.lang.String str6 = locale5.toLanguageTag();
        java.lang.String str7 = locale0.getDisplayLanguage(locale5);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number9 = faker8.number;
        com.github.javafaker.Name name10 = faker8.name;
        com.github.javafaker.App app11 = faker8.app();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService13 = faker12.randomService;
        java.lang.String str15 = faker12.bothify("");
        com.github.javafaker.Book book16 = faker12.book();
        com.github.javafaker.Book book17 = faker12.book;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService19 = faker18.randomService;
        com.github.javafaker.Book book20 = faker18.book();
        com.github.javafaker.Finance finance21 = faker18.finance();
        com.github.javafaker.Book book22 = faker18.book();
        com.github.javafaker.Options options23 = faker18.options();
        com.github.javafaker.PhoneNumber phoneNumber24 = faker18.phoneNumber();
        com.github.javafaker.service.FakeValuesService fakeValuesService25 = faker18.fakeValuesService;
        faker12.fakeValuesService = fakeValuesService25;
        faker8.fakeValuesService = fakeValuesService25;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str3, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eng" + "'", str4, "eng");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-CA" + "'", str6, "en-CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Italian" + "'", str7, "Italian");
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(app11);
        org.junit.Assert.assertNotNull(randomService13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(book16);
        org.junit.Assert.assertNotNull(book17);
        org.junit.Assert.assertNotNull(randomService19);
        org.junit.Assert.assertNotNull(book20);
        org.junit.Assert.assertNotNull(finance21);
        org.junit.Assert.assertNotNull(book22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(phoneNumber24);
        org.junit.Assert.assertNotNull(fakeValuesService25);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getLanguage();
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr" + "'", str1, "fr");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.LongStream longStream5 = random1.longs((long) (byte) 1);
        double double6 = random1.nextGaussian();
        random1.setSeed(100L);
        java.util.Random random10 = new java.util.Random((long) 1);
        java.util.stream.DoubleStream doubleStream11 = random10.doubles();
        java.util.stream.IntStream intStream12 = random10.ints();
        java.util.stream.LongStream longStream16 = random10.longs((long) 100, 0L, (long) 'u');
        java.util.Random random18 = new java.util.Random((long) 1);
        java.util.stream.DoubleStream doubleStream19 = random18.doubles();
        java.util.Random random21 = new java.util.Random((long) 1);
        java.util.Random random23 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream24 = random23.longs();
        byte[] byteArray31 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        random23.nextBytes(byteArray31);
        random21.nextBytes(byteArray31);
        random18.nextBytes(byteArray31);
        random10.nextBytes(byteArray31);
        random1.nextBytes(byteArray31);
        java.util.stream.LongStream longStream37 = random1.longs();
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.561581040188955d + "'", double6 == 1.561581040188955d);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertNotNull(longStream24);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-42, -97, -43, -72, -76, -37]");
        org.junit.Assert.assertNotNull(longStream37);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder3 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder5 = builder0.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.setLanguage("Italian");
        java.util.Locale.Builder builder10 = builder5.setLanguage("deu");
        java.util.Locale locale11 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder5.setUnicodeLocaleKeyword("United States", "CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: United States [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "deu");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(locale0);
        boolean boolean2 = locale0.hasExtensions();
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.Random random3 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream4 = random3.longs();
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        random3.nextBytes(byteArray11);
        random1.nextBytes(byteArray11);
        double double14 = random1.nextDouble();
        java.util.stream.IntStream intStream15 = random1.ints();
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[115, -43, 26, -69, -40, -100]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.41008081149220166d + "'", double14 == 0.41008081149220166d);
        org.junit.Assert.assertNotNull(intStream15);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.util.Locale locale3 = new java.util.Locale("Italian", "", "English");
        boolean boolean4 = locale3.hasExtensions();
        java.util.Locale locale5 = locale3.stripExtensions();
        java.util.Locale.setDefault(locale5);
        java.lang.String str7 = locale5.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "italian__English");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "italian__English");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "italian" + "'", str7, "italian");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.dateAndTime;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService6 = faker5.randomService;
        com.github.javafaker.Book book7 = faker5.book();
        faker0.book = book7;
        com.github.javafaker.Business business9 = faker0.business;
        com.github.javafaker.Name name10 = faker0.name;
        com.github.javafaker.DateAndTime dateAndTime11 = faker0.date();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService13 = faker12.randomService;
        com.github.javafaker.Book book14 = faker12.book();
        com.github.javafaker.Finance finance15 = faker12.finance();
        com.github.javafaker.Book book16 = faker12.book();
        com.github.javafaker.Name name17 = faker12.name;
        faker0.name = name17;
        org.junit.Assert.assertNotNull(randomService1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(randomService6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNotNull(randomService13);
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(finance15);
        org.junit.Assert.assertNotNull(book16);
        org.junit.Assert.assertNotNull(name17);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.util.Locale locale3 = new java.util.Locale("Korean", "cinese (Cina)", "\uc601\uc5b4\uce90\ub098\ub2e4)");
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
        java.lang.String str15 = locale13.getDisplayVariant();
        java.lang.String str16 = locale3.getDisplayVariant(locale13);
        java.lang.String str17 = locale13.toLanguageTag();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str6, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CA" + "'", str7, "CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str11, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eng" + "'", str12, "eng");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str16, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en-CA" + "'", str17, "en-CA");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        com.github.javafaker.App app17 = faker16.app();
        com.github.javafaker.Color color18 = faker16.color;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService20 = faker19.randomService;
        java.lang.String str22 = faker19.bothify("");
        com.github.javafaker.Book book23 = faker19.book();
        com.github.javafaker.Book book24 = faker19.book;
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService26 = faker25.randomService;
        com.github.javafaker.Book book27 = faker25.book();
        com.github.javafaker.Finance finance28 = faker25.finance();
        com.github.javafaker.Book book29 = faker25.book();
        com.github.javafaker.Options options30 = faker25.options();
        com.github.javafaker.PhoneNumber phoneNumber31 = faker25.phoneNumber();
        com.github.javafaker.service.FakeValuesService fakeValuesService32 = faker25.fakeValuesService;
        faker19.fakeValuesService = fakeValuesService32;
        faker16.fakeValuesService = fakeValuesService32;
        com.github.javafaker.Business business35 = faker16.business();
        org.junit.Assert.assertEquals(locale1.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str6, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CA" + "'", str7, "CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str11, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eng" + "'", str12, "eng");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(app17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(randomService20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(book23);
        org.junit.Assert.assertNotNull(book24);
        org.junit.Assert.assertNotNull(randomService26);
        org.junit.Assert.assertNotNull(book27);
        org.junit.Assert.assertNotNull(finance28);
        org.junit.Assert.assertNotNull(book29);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(phoneNumber31);
        org.junit.Assert.assertNotNull(fakeValuesService32);
        org.junit.Assert.assertNotNull(business35);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("inglese (Canada)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.util.Random random1 = new java.util.Random((long) 1);
        boolean boolean2 = random1.nextBoolean();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        random1.setSeed(0L);
        java.util.stream.LongStream longStream6 = random1.longs();
        java.util.stream.IntStream intStream10 = random1.ints(1092083446069765248L, 52699159, 1761283695);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.lang.String str5 = locale2.getISO3Language();
        java.util.Locale locale6 = locale2.stripExtensions();
        java.lang.String str7 = locale0.getDisplayName(locale2);
        java.util.Random random9 = new java.util.Random((long) 1);
        java.util.stream.DoubleStream doubleStream10 = random9.doubles();
        java.util.stream.LongStream longStream13 = random9.longs((long) 0, 10L);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale2, random9);
        com.github.javafaker.DateAndTime dateAndTime15 = faker14.date();
        java.lang.String str17 = faker14.regexify("CAN");
        java.lang.String str19 = faker14.letterify("Canada");
        java.util.Locale locale20 = java.util.Locale.CANADA;
        java.util.Locale locale21 = java.util.Locale.KOREAN;
        java.lang.String str22 = locale20.getDisplayName(locale21);
        java.lang.String str23 = locale20.getLanguage();
        java.util.Random random25 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream26 = random25.longs();
        java.util.stream.DoubleStream doubleStream27 = random25.doubles();
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale20, random25);
        com.github.javafaker.Business business29 = faker28.business();
        com.github.javafaker.Color color30 = faker28.color;
        faker14.color = color30;
        java.util.Locale locale32 = java.util.Locale.ITALIAN;
        java.util.Locale locale33 = java.util.Locale.CANADA;
        java.util.Locale locale34 = java.util.Locale.KOREAN;
        java.lang.String str35 = locale33.getDisplayName(locale34);
        java.lang.String str36 = locale33.getISO3Language();
        java.util.Locale locale37 = locale33.stripExtensions();
        java.lang.String str38 = locale37.toLanguageTag();
        java.lang.String str39 = locale32.getDisplayLanguage(locale37);
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(locale32);
        com.github.javafaker.Number number41 = faker40.number;
        com.github.javafaker.Lorem lorem42 = faker40.lorem;
        faker14.lorem = lorem42;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Korean" + "'", str1, "Korean");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str4, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eng" + "'", str5, "eng");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Korean" + "'", str7, "Korean");
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(dateAndTime15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CAN" + "'", str17, "CAN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Canada" + "'", str19, "Canada");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str22, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "en" + "'", str23, "en");
        org.junit.Assert.assertNotNull(longStream26);
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(business29);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str35, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "eng" + "'", str36, "eng");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "en-CA" + "'", str38, "en-CA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Italian" + "'", str39, "Italian");
        org.junit.Assert.assertNotNull(number41);
        org.junit.Assert.assertNotNull(lorem42);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder3 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Canada");
        java.util.Locale.Builder builder6 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setExtension('u', "english (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: english (Canada) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "italian__English");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale0.getLanguage();
        java.util.Random random5 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream6 = random5.longs();
        java.util.stream.DoubleStream doubleStream7 = random5.doubles();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.PhoneNumber phoneNumber9 = faker8.phoneNumber;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService11 = faker10.randomService;
        java.lang.String str13 = faker10.bothify("");
        com.github.javafaker.DateAndTime dateAndTime14 = faker10.dateAndTime;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService16 = faker15.randomService;
        java.lang.String str18 = faker15.bothify("");
        com.github.javafaker.DateAndTime dateAndTime19 = faker15.dateAndTime;
        faker10.dateAndTime = dateAndTime19;
        com.github.javafaker.Code code21 = null;
        faker10.code = code21;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService24 = faker23.randomService;
        java.lang.String str26 = faker23.bothify("");
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService28 = faker27.randomService;
        com.github.javafaker.Book book29 = faker27.book();
        com.github.javafaker.Finance finance30 = faker27.finance();
        com.github.javafaker.Book book31 = faker27.book();
        com.github.javafaker.Options options32 = faker27.options();
        com.github.javafaker.PhoneNumber phoneNumber33 = faker27.phoneNumber();
        faker23.phoneNumber = phoneNumber33;
        com.github.javafaker.Name name35 = faker23.name();
        faker10.name = name35;
        com.github.javafaker.Finance finance37 = faker10.finance();
        com.github.javafaker.Number number38 = faker10.number;
        com.github.javafaker.service.FakeValuesService fakeValuesService39 = faker10.fakeValuesService;
        faker8.fakeValuesService = fakeValuesService39;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = faker8.resolve("italiano");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str2, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en" + "'", str3, "en");
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(randomService11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(dateAndTime14);
        org.junit.Assert.assertNotNull(randomService16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(dateAndTime19);
        org.junit.Assert.assertNotNull(randomService24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(randomService28);
        org.junit.Assert.assertNotNull(book29);
        org.junit.Assert.assertNotNull(finance30);
        org.junit.Assert.assertNotNull(book31);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(phoneNumber33);
        org.junit.Assert.assertNotNull(name35);
        org.junit.Assert.assertNotNull(finance37);
        org.junit.Assert.assertNotNull(number38);
        org.junit.Assert.assertNotNull(fakeValuesService39);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.Random random3 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream4 = random3.longs();
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        random3.nextBytes(byteArray11);
        random1.nextBytes(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream17 = random1.doubles((long) 100, (double) 1414906606, (double) (-4964420948893066024L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[115, -43, 26, -69, -40, -100]");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.util.Random random1 = new java.util.Random(1853403699951111791L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Company company3 = faker2.company();
        org.junit.Assert.assertNotNull(company3);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name();
        com.github.javafaker.Finance finance2 = faker0.finance;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(finance2);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Address address5 = faker0.address;
        org.junit.Assert.assertNotNull(randomService1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(book4);
        org.junit.Assert.assertNotNull(address5);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.lang.String str4 = locale1.getISO3Language();
        java.util.Locale locale5 = locale1.stripExtensions();
        java.lang.String str6 = locale5.toLanguageTag();
        java.lang.String str7 = locale0.getDisplayLanguage(locale5);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale9 = locale0.stripExtensions();
        java.lang.String str10 = locale0.getISO3Language();
        java.util.Random random12 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream13 = random12.longs();
        java.util.stream.DoubleStream doubleStream14 = random12.doubles();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale0, random12);
        double double16 = random12.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream19 = random12.longs((long) '4', (-4964420948893066024L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str3, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eng" + "'", str4, "eng");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-CA" + "'", str6, "en-CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Italian" + "'", str7, "Italian");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ita" + "'", str10, "ita");
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.7308781907032909d + "'", double16 == 0.7308781907032909d);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("can");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("ko");
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.lang.String str9 = locale8.getDisplayVariant();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.lang.String str15 = locale13.getDisplayName(locale14);
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.lang.String str19 = locale17.getDisplayName(locale18);
        java.lang.String str20 = locale17.getISO3Language();
        java.util.Locale locale21 = locale17.stripExtensions();
        java.util.Locale locale22 = java.util.Locale.CANADA;
        java.util.Locale locale23 = java.util.Locale.KOREAN;
        java.lang.String str24 = locale22.getDisplayName(locale23);
        java.lang.String str25 = locale22.getISO3Language();
        java.lang.String str26 = locale22.getDisplayVariant();
        java.lang.String str28 = locale22.getExtension('a');
        java.util.Locale locale29 = java.util.Locale.CANADA;
        java.util.Locale locale30 = java.util.Locale.KOREAN;
        java.lang.String str31 = locale29.getDisplayName(locale30);
        java.lang.String str32 = locale29.getISO3Language();
        java.util.Locale locale33 = locale29.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.CANADA;
        java.util.Locale locale35 = java.util.Locale.KOREAN;
        java.lang.String str36 = locale34.getDisplayName(locale35);
        java.lang.String str37 = locale34.getISO3Language();
        java.lang.String str38 = locale34.getDisplayVariant();
        java.lang.String str40 = locale34.getExtension('a');
        java.util.Locale locale41 = java.util.Locale.CANADA;
        java.util.Locale locale42 = java.util.Locale.KOREAN;
        java.lang.String str43 = locale41.getDisplayName(locale42);
        java.lang.String str44 = locale41.getISO3Language();
        java.lang.String str45 = locale41.getDisplayVariant();
        java.util.Locale locale46 = java.util.Locale.CANADA;
        java.util.Locale locale47 = java.util.Locale.KOREAN;
        java.lang.String str48 = locale46.getDisplayName(locale47);
        java.util.Locale locale49 = java.util.Locale.CANADA;
        java.lang.String str50 = locale49.getDisplayVariant();
        java.util.Locale locale51 = java.util.Locale.ITALIAN;
        java.util.Locale locale52 = java.util.Locale.CANADA;
        java.util.Locale locale53 = java.util.Locale.KOREAN;
        java.lang.String str54 = locale52.getDisplayName(locale53);
        java.lang.String str55 = locale52.getISO3Language();
        java.util.Locale locale56 = locale52.stripExtensions();
        java.lang.String str57 = locale56.toLanguageTag();
        java.lang.String str58 = locale51.getDisplayLanguage(locale56);
        java.util.Locale locale59 = java.util.Locale.CANADA;
        java.util.Locale locale60 = java.util.Locale.KOREAN;
        java.lang.String str61 = locale59.getDisplayName(locale60);
        java.lang.String str62 = locale59.getCountry();
        java.util.Locale locale63 = java.util.Locale.CANADA;
        java.util.Locale locale64 = java.util.Locale.KOREAN;
        java.lang.String str65 = locale63.getDisplayName(locale64);
        java.lang.String str66 = locale63.getISO3Language();
        java.util.Locale locale67 = locale63.stripExtensions();
        java.util.Locale locale68 = java.util.Locale.JAPAN;
        java.util.Locale locale69 = java.util.Locale.CANADA;
        java.lang.String str70 = locale69.getDisplayVariant();
        java.util.Locale.setDefault(locale69);
        java.util.Locale[] localeArray72 = new java.util.Locale[] { locale7, locale8, locale11, locale14, locale16, locale21, locale22, locale33, locale34, locale41, locale47, locale49, locale51, locale59, locale63, locale68, locale69 };
        java.util.ArrayList<java.util.Locale> localeList73 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList73, localeArray72);
        java.util.Locale.FilteringMode filteringMode75 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList76 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList73, filteringMode75);
        java.util.List<java.util.Locale> localeList77 = java.util.Locale.filter(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.Locale.FilteringMode filteringMode78 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList79 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList73, filteringMode78);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str12, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str15, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str19, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "eng" + "'", str20, "eng");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str24, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "eng" + "'", str25, "eng");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str31, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "eng" + "'", str32, "eng");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str36, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "eng" + "'", str37, "eng");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str43, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "eng" + "'", str44, "eng");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str48, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "it");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str54, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "eng" + "'", str55, "eng");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "en-CA" + "'", str57, "en-CA");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Italian" + "'", str58, "Italian");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str61, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "CA" + "'", str62, "CA");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str65, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "eng" + "'", str66, "eng");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(localeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + filteringMode75 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode75.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList76);
        org.junit.Assert.assertNotNull(localeList77);
        org.junit.Assert.assertTrue("'" + filteringMode78 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode78.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList79);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("en-CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream2 = random1.longs();
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        random1.nextBytes(byteArray9);
        double double11 = random1.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream15 = random1.ints((-4972683369271453960L), 1749940626, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[115, -43, 26, -69, -40, -100]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.4123569817688534d) + "'", double11 == (-0.4123569817688534d));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Canada", strMap1);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str10 = locale9.getDisplayVariant();
        java.util.Locale locale11 = java.util.Locale.CANADA;
        java.util.Locale locale12 = java.util.Locale.KOREAN;
        java.lang.String str13 = locale11.getDisplayName(locale12);
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.lang.String str16 = locale14.getDisplayName(locale15);
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.util.Locale locale18 = java.util.Locale.CANADA;
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.lang.String str20 = locale18.getDisplayName(locale19);
        java.lang.String str21 = locale18.getISO3Language();
        java.util.Locale locale22 = locale18.stripExtensions();
        java.util.Locale locale23 = java.util.Locale.CANADA;
        java.util.Locale locale24 = java.util.Locale.KOREAN;
        java.lang.String str25 = locale23.getDisplayName(locale24);
        java.lang.String str26 = locale23.getISO3Language();
        java.lang.String str27 = locale23.getDisplayVariant();
        java.lang.String str29 = locale23.getExtension('a');
        java.util.Locale locale30 = java.util.Locale.CANADA;
        java.util.Locale locale31 = java.util.Locale.KOREAN;
        java.lang.String str32 = locale30.getDisplayName(locale31);
        java.lang.String str33 = locale30.getISO3Language();
        java.util.Locale locale34 = locale30.stripExtensions();
        java.util.Locale locale35 = java.util.Locale.CANADA;
        java.util.Locale locale36 = java.util.Locale.KOREAN;
        java.lang.String str37 = locale35.getDisplayName(locale36);
        java.lang.String str38 = locale35.getISO3Language();
        java.lang.String str39 = locale35.getDisplayVariant();
        java.lang.String str41 = locale35.getExtension('a');
        java.util.Locale locale42 = java.util.Locale.CANADA;
        java.util.Locale locale43 = java.util.Locale.KOREAN;
        java.lang.String str44 = locale42.getDisplayName(locale43);
        java.lang.String str45 = locale42.getISO3Language();
        java.lang.String str46 = locale42.getDisplayVariant();
        java.util.Locale locale47 = java.util.Locale.CANADA;
        java.util.Locale locale48 = java.util.Locale.KOREAN;
        java.lang.String str49 = locale47.getDisplayName(locale48);
        java.util.Locale locale50 = java.util.Locale.CANADA;
        java.lang.String str51 = locale50.getDisplayVariant();
        java.util.Locale locale52 = java.util.Locale.ITALIAN;
        java.util.Locale locale53 = java.util.Locale.CANADA;
        java.util.Locale locale54 = java.util.Locale.KOREAN;
        java.lang.String str55 = locale53.getDisplayName(locale54);
        java.lang.String str56 = locale53.getISO3Language();
        java.util.Locale locale57 = locale53.stripExtensions();
        java.lang.String str58 = locale57.toLanguageTag();
        java.lang.String str59 = locale52.getDisplayLanguage(locale57);
        java.util.Locale locale60 = java.util.Locale.CANADA;
        java.util.Locale locale61 = java.util.Locale.KOREAN;
        java.lang.String str62 = locale60.getDisplayName(locale61);
        java.lang.String str63 = locale60.getCountry();
        java.util.Locale locale64 = java.util.Locale.CANADA;
        java.util.Locale locale65 = java.util.Locale.KOREAN;
        java.lang.String str66 = locale64.getDisplayName(locale65);
        java.lang.String str67 = locale64.getISO3Language();
        java.util.Locale locale68 = locale64.stripExtensions();
        java.util.Locale locale69 = java.util.Locale.JAPAN;
        java.util.Locale locale70 = java.util.Locale.CANADA;
        java.lang.String str71 = locale70.getDisplayVariant();
        java.util.Locale.setDefault(locale70);
        java.util.Locale[] localeArray73 = new java.util.Locale[] { locale8, locale9, locale12, locale15, locale17, locale22, locale23, locale34, locale35, locale42, locale48, locale50, locale52, locale60, locale64, locale69, locale70 };
        java.util.ArrayList<java.util.Locale> localeList74 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList74, localeArray73);
        java.util.Locale.FilteringMode filteringMode76 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList77 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList74, filteringMode76);
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet4, filteringMode76);
        java.util.Collection<java.lang.String> strCollection79 = null;
        java.util.Locale.FilteringMode filteringMode80 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList81 = java.util.Locale.filterTags(languageRangeList2, strCollection79, filteringMode80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str13, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str16, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str20, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "eng" + "'", str21, "eng");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str25, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "eng" + "'", str26, "eng");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str32, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "eng" + "'", str33, "eng");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str37, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "eng" + "'", str38, "eng");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str44, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "eng" + "'", str45, "eng");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str49, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "it");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str55, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "eng" + "'", str56, "eng");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "en-CA" + "'", str58, "en-CA");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Italian" + "'", str59, "Italian");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str62, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "CA" + "'", str63, "CA");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str66, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "eng" + "'", str67, "eng");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(localeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + filteringMode76 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode76.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList77);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertTrue("'" + filteringMode80 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode80.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale0.getISO3Language();
        java.util.Locale locale4 = locale0.stripExtensions();
        java.lang.String str5 = locale0.getISO3Language();
        java.lang.String str6 = locale0.getDisplayVariant();
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.lang.String str9 = locale7.getDisplayName(locale8);
        java.lang.String str10 = locale7.getCountry();
        java.lang.String str11 = locale7.getScript();
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        java.lang.String str14 = locale12.getDisplayName(locale13);
        java.lang.String str15 = locale12.getISO3Language();
        java.util.Locale locale16 = locale12.stripExtensions();
        java.lang.String str17 = locale7.getDisplayScript(locale16);
        java.lang.String str18 = locale0.getDisplayLanguage(locale16);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str2, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eng" + "'", str5, "eng");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str9, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CA" + "'", str10, "CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str14, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "eng" + "'", str15, "eng");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "English" + "'", str18, "English");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder3 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Canada");
        java.util.Locale.Builder builder7 = builder3.setVariant("");
        java.util.Locale.Builder builder9 = builder7.setLanguage("Korean");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("hi! (CHINESE (CHINA))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: hi! (CHINESE (CHINA)) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService5 = faker4.randomService;
        java.lang.String str7 = faker4.bothify("");
        com.github.javafaker.Book book8 = faker4.book();
        faker0.book = book8;
        com.github.javafaker.DateAndTime dateAndTime10 = faker0.dateAndTime;
        com.github.javafaker.App app11 = faker0.app;
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder15 = builder12.setLocale(locale13);
        java.util.Locale locale16 = builder12.build();
        java.util.Random random18 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream19 = random18.longs();
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        random18.nextBytes(byteArray26);
        double double28 = random18.nextGaussian();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(locale16, random18);
        java.lang.String str31 = faker29.numerify("");
        com.github.javafaker.Company company32 = faker29.company;
        faker0.company = company32;
        org.junit.Assert.assertNotNull(randomService1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(randomService5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(app11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_CA");
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[115, -43, 26, -69, -40, -100]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.4123569817688534d) + "'", double28 == (-0.4123569817688534d));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(company32);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.lang.String str5 = locale2.getISO3Language();
        java.util.Locale locale6 = locale2.stripExtensions();
        java.lang.String str7 = locale0.getDisplayName(locale2);
        java.util.Random random9 = new java.util.Random((long) 1);
        java.util.stream.DoubleStream doubleStream10 = random9.doubles();
        java.util.stream.LongStream longStream13 = random9.longs((long) 0, 10L);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale2, random9);
        java.util.Set<java.lang.Character> charSet15 = locale2.getExtensionKeys();
        java.lang.String str16 = locale2.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Korean" + "'", str1, "Korean");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str4, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eng" + "'", str5, "eng");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Korean" + "'", str7, "Korean");
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Canada" + "'", str16, "Canada");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 10L, (double) 904578013);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(locale0);
        boolean boolean2 = locale0.hasExtensions();
        java.util.Locale locale3 = locale0.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale0.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.service.RandomService randomService4 = faker0.randomService;
        com.github.javafaker.Book book5 = faker0.book;
        com.github.javafaker.Internet internet6 = faker0.internet();
        com.github.javafaker.Internet internet7 = faker0.internet;
        com.github.javafaker.DateAndTime dateAndTime8 = faker0.date();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService10 = faker9.randomService;
        java.lang.String str12 = faker9.bothify("");
        com.github.javafaker.DateAndTime dateAndTime13 = faker9.dateAndTime;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService15 = faker14.randomService;
        com.github.javafaker.Book book16 = faker14.book();
        faker9.book = book16;
        com.github.javafaker.Finance finance18 = faker9.finance();
        com.github.javafaker.Lorem lorem19 = faker9.lorem();
        com.github.javafaker.PhoneNumber phoneNumber20 = faker9.phoneNumber;
        com.github.javafaker.Company company21 = faker9.company;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name23 = faker22.name();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name25 = faker24.name();
        faker22.name = name25;
        com.github.javafaker.Lorem lorem27 = faker22.lorem();
        com.github.javafaker.Code code28 = faker22.code();
        com.github.javafaker.Number number29 = faker22.number();
        faker9.number = number29;
        faker0.number = number29;
        org.junit.Assert.assertNotNull(randomService1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(randomService4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(randomService10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(dateAndTime13);
        org.junit.Assert.assertNotNull(randomService15);
        org.junit.Assert.assertNotNull(book16);
        org.junit.Assert.assertNotNull(finance18);
        org.junit.Assert.assertNotNull(lorem19);
        org.junit.Assert.assertNotNull(phoneNumber20);
        org.junit.Assert.assertNotNull(company21);
        org.junit.Assert.assertNotNull(name23);
        org.junit.Assert.assertNotNull(name25);
        org.junit.Assert.assertNotNull(lorem27);
        org.junit.Assert.assertNotNull(code28);
        org.junit.Assert.assertNotNull(number29);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder3 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Canada");
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale.Builder builder8 = builder3.setLanguageTag("it");
        java.util.Locale.Builder builder10 = builder8.setVariant("Korean");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.util.Locale locale1 = new java.util.Locale("en-CA");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.lang.String str3 = locale1.getScript();
        java.util.Locale locale5 = new java.util.Locale("\uc601\uc5b4\uce90\ub098\ub2e4)");
        java.util.Locale locale6 = locale5.stripExtensions();
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Locale locale11 = new java.util.Locale("Italian", "", "English");
        boolean boolean12 = locale11.hasExtensions();
        java.lang.String str13 = locale7.getDisplayName(locale11);
        java.lang.String str14 = locale1.getDisplayCountry(locale11);
        java.util.Locale locale15 = locale1.stripExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "en-ca");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals(locale5.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals(locale11.toString(), "italian__English");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str13, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en-ca");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.dateAndTime;
        com.github.javafaker.Lorem lorem5 = null;
        faker0.lorem = lorem5;
        com.github.javafaker.DateAndTime dateAndTime7 = faker0.date();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService9 = faker8.randomService;
        java.lang.String str11 = faker8.bothify("");
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService13 = faker12.randomService;
        java.lang.String str15 = faker12.bothify("");
        com.github.javafaker.Book book16 = faker12.book();
        faker8.book = book16;
        com.github.javafaker.DateAndTime dateAndTime18 = faker8.dateAndTime;
        faker0.dateAndTime = dateAndTime18;
        com.github.javafaker.Lorem lorem20 = faker0.lorem;
        com.github.javafaker.Hacker hacker21 = faker0.hacker;
        com.github.javafaker.Lorem lorem22 = faker0.lorem;
        com.github.javafaker.Hacker hacker23 = faker0.hacker();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business25 = null;
        faker24.business = business25;
        com.github.javafaker.Color color27 = null;
        faker24.color = color27;
        com.github.javafaker.App app29 = faker24.app;
        com.github.javafaker.Address address30 = faker24.address();
        com.github.javafaker.Options options31 = faker24.options();
        faker0.options = options31;
        com.github.javafaker.Book book33 = faker0.book;
        org.junit.Assert.assertNotNull(randomService1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(randomService9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(randomService13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(book16);
        org.junit.Assert.assertNotNull(dateAndTime18);
        org.junit.Assert.assertNull(lorem20);
        org.junit.Assert.assertNotNull(hacker21);
        org.junit.Assert.assertNull(lorem22);
        org.junit.Assert.assertNotNull(hacker23);
        org.junit.Assert.assertNotNull(app29);
        org.junit.Assert.assertNotNull(address30);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertNotNull(book33);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale0.getLanguage();
        java.util.Random random5 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream6 = random5.longs();
        java.util.stream.DoubleStream doubleStream7 = random5.doubles();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.PhoneNumber phoneNumber9 = faker8.phoneNumber;
        com.github.javafaker.Name name10 = faker8.name();
        com.github.javafaker.Business business11 = faker8.business;
        com.github.javafaker.Name name12 = faker8.name;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str2, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en" + "'", str3, "en");
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertNotNull(name12);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business1 = null;
        faker0.business = business1;
        com.github.javafaker.Color color3 = null;
        faker0.color = color3;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService6 = faker5.randomService;
        java.lang.String str8 = faker5.bothify("");
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService10 = faker9.randomService;
        java.lang.String str12 = faker9.bothify("");
        com.github.javafaker.Book book13 = faker9.book();
        faker5.book = book13;
        com.github.javafaker.Address address15 = faker5.address();
        faker0.address = address15;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name18 = faker17.name();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name();
        faker17.name = name20;
        faker0.name = name20;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService24 = faker23.randomService;
        java.lang.String str26 = faker23.bothify("");
        com.github.javafaker.DateAndTime dateAndTime27 = faker23.dateAndTime;
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService29 = faker28.randomService;
        java.lang.String str31 = faker28.bothify("");
        com.github.javafaker.DateAndTime dateAndTime32 = faker28.dateAndTime;
        faker23.dateAndTime = dateAndTime32;
        com.github.javafaker.Code code34 = null;
        faker23.code = code34;
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService37 = faker36.randomService;
        java.lang.String str39 = faker36.bothify("");
        com.github.javafaker.DateAndTime dateAndTime40 = faker36.dateAndTime;
        com.github.javafaker.Lorem lorem41 = null;
        faker36.lorem = lorem41;
        com.github.javafaker.Code code43 = faker36.code();
        faker23.code = code43;
        com.github.javafaker.Faker faker45 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService46 = faker45.randomService;
        java.lang.String str48 = faker45.bothify("");
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService50 = faker49.randomService;
        com.github.javafaker.Book book51 = faker49.book();
        com.github.javafaker.Finance finance52 = faker49.finance();
        com.github.javafaker.Book book53 = faker49.book();
        com.github.javafaker.Options options54 = faker49.options();
        com.github.javafaker.PhoneNumber phoneNumber55 = faker49.phoneNumber();
        faker45.phoneNumber = phoneNumber55;
        com.github.javafaker.Name name57 = faker45.name();
        com.github.javafaker.Hacker hacker58 = faker45.hacker;
        faker23.hacker = hacker58;
        faker0.hacker = hacker58;
        java.lang.String str62 = faker0.numerify("\u52a0\u62ff\u5927");
        org.junit.Assert.assertNotNull(randomService6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(randomService10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(book13);
        org.junit.Assert.assertNotNull(address15);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(randomService24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(dateAndTime27);
        org.junit.Assert.assertNotNull(randomService29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(dateAndTime32);
        org.junit.Assert.assertNotNull(randomService37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(dateAndTime40);
        org.junit.Assert.assertNotNull(code43);
        org.junit.Assert.assertNotNull(randomService46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(randomService50);
        org.junit.Assert.assertNotNull(book51);
        org.junit.Assert.assertNotNull(finance52);
        org.junit.Assert.assertNotNull(book53);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(phoneNumber55);
        org.junit.Assert.assertNotNull(name57);
        org.junit.Assert.assertNotNull(hacker58);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\u52a0\u62ff\u5927" + "'", str62, "\u52a0\u62ff\u5927");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.util.Locale locale2 = new java.util.Locale("ita", "fr");
        org.junit.Assert.assertEquals(locale2.toString(), "ita_FR");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.lang.String str4 = locale1.getISO3Language();
        java.util.Locale locale5 = locale1.stripExtensions();
        java.lang.String str6 = locale5.toLanguageTag();
        java.lang.String str7 = locale0.getDisplayLanguage(locale5);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale9 = locale0.stripExtensions();
        java.lang.String str10 = locale0.getISO3Language();
        java.util.Random random12 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream13 = random12.longs();
        java.util.stream.DoubleStream doubleStream14 = random12.doubles();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale0, random12);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService17 = faker16.randomService;
        java.lang.String str19 = faker16.bothify("");
        com.github.javafaker.Book book20 = faker16.book();
        com.github.javafaker.Number number21 = faker16.number();
        com.github.javafaker.Lorem lorem22 = null;
        faker16.lorem = lorem22;
        com.github.javafaker.Business business24 = faker16.business();
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService26 = faker25.randomService;
        java.lang.String str28 = faker25.bothify("");
        com.github.javafaker.DateAndTime dateAndTime29 = faker25.dateAndTime;
        com.github.javafaker.Lorem lorem30 = null;
        faker25.lorem = lorem30;
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService33 = faker32.randomService;
        com.github.javafaker.Book book34 = faker32.book();
        com.github.javafaker.Finance finance35 = faker32.finance();
        com.github.javafaker.Lorem lorem36 = faker32.lorem();
        faker25.lorem = lorem36;
        faker16.lorem = lorem36;
        faker15.lorem = lorem36;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str3, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eng" + "'", str4, "eng");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-CA" + "'", str6, "en-CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Italian" + "'", str7, "Italian");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ita" + "'", str10, "ita");
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(randomService17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(book20);
        org.junit.Assert.assertNotNull(number21);
        org.junit.Assert.assertNotNull(business24);
        org.junit.Assert.assertNotNull(randomService26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(dateAndTime29);
        org.junit.Assert.assertNotNull(randomService33);
        org.junit.Assert.assertNotNull(book34);
        org.junit.Assert.assertNotNull(finance35);
        org.junit.Assert.assertNotNull(lorem36);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.util.Locale locale1 = new java.util.Locale("en-CA");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.lang.String str3 = locale1.getScript();
        java.util.Locale locale5 = new java.util.Locale("\uc601\uc5b4\uce90\ub098\ub2e4)");
        java.util.Locale locale6 = locale5.stripExtensions();
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        java.lang.String str11 = locale8.getCountry();
        java.lang.String str12 = locale8.getScript();
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.lang.String str15 = locale13.getDisplayName(locale14);
        java.lang.String str16 = locale13.getISO3Language();
        java.util.Locale locale17 = locale13.stripExtensions();
        java.lang.String str18 = locale8.getDisplayScript(locale17);
        java.lang.String str19 = locale7.getDisplayScript(locale8);
        java.lang.String str20 = locale1.getDisplayScript(locale8);
        java.lang.String str21 = locale8.toLanguageTag();
        org.junit.Assert.assertEquals(locale1.toString(), "en-ca");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals(locale5.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str10, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CA" + "'", str11, "CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str15, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "eng" + "'", str16, "eng");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en-CA" + "'", str21, "en-CA");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService5 = faker4.randomService;
        com.github.javafaker.Book book6 = faker4.book();
        com.github.javafaker.Finance finance7 = faker4.finance();
        com.github.javafaker.Book book8 = faker4.book();
        com.github.javafaker.Options options9 = faker4.options();
        com.github.javafaker.PhoneNumber phoneNumber10 = faker4.phoneNumber();
        faker0.phoneNumber = phoneNumber10;
        com.github.javafaker.Name name12 = faker0.name();
        com.github.javafaker.Hacker hacker13 = faker0.hacker;
        com.github.javafaker.Finance finance14 = faker0.finance;
        com.github.javafaker.Finance finance15 = faker0.finance();
        org.junit.Assert.assertNotNull(randomService1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(randomService5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(hacker13);
        org.junit.Assert.assertNotNull(finance14);
        org.junit.Assert.assertNotNull(finance15);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.util.Locale locale1 = new java.util.Locale("eng");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "eng");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business1 = null;
        faker0.business = business1;
        com.github.javafaker.Color color3 = null;
        faker0.color = color3;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService6 = faker5.randomService;
        java.lang.String str8 = faker5.bothify("");
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService10 = faker9.randomService;
        java.lang.String str12 = faker9.bothify("");
        com.github.javafaker.Book book13 = faker9.book();
        faker5.book = book13;
        com.github.javafaker.Address address15 = faker5.address();
        faker0.address = address15;
        com.github.javafaker.Company company17 = faker0.company;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService19 = faker18.randomService;
        java.lang.String str21 = faker18.bothify("");
        com.github.javafaker.service.RandomService randomService22 = faker18.randomService;
        com.github.javafaker.Book book23 = faker18.book;
        com.github.javafaker.Lorem lorem24 = null;
        faker18.lorem = lorem24;
        com.github.javafaker.Hacker hacker26 = null;
        faker18.hacker = hacker26;
        com.github.javafaker.Color color28 = faker18.color;
        com.github.javafaker.Book book29 = faker18.book();
        com.github.javafaker.App app30 = faker18.app;
        faker0.app = app30;
        org.junit.Assert.assertNotNull(randomService6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(randomService10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(book13);
        org.junit.Assert.assertNotNull(address15);
        org.junit.Assert.assertNotNull(company17);
        org.junit.Assert.assertNotNull(randomService19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(randomService22);
        org.junit.Assert.assertNotNull(book23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(book29);
        org.junit.Assert.assertNotNull(app30);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.dateAndTime;
        java.lang.String str6 = faker0.letterify("en-CA");
        com.github.javafaker.Code code7 = null;
        faker0.code = code7;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService10 = faker9.randomService;
        java.lang.String str12 = faker9.bothify("");
        com.github.javafaker.DateAndTime dateAndTime13 = faker9.dateAndTime;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService15 = faker14.randomService;
        java.lang.String str17 = faker14.bothify("");
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService19 = faker18.randomService;
        java.lang.String str21 = faker18.bothify("");
        com.github.javafaker.Book book22 = faker18.book();
        faker14.book = book22;
        faker9.book = book22;
        faker0.book = book22;
        java.util.Locale locale27 = new java.util.Locale("\uc601\uc5b4\uce90\ub098\ub2e4)");
        java.util.Locale locale28 = locale27.stripExtensions();
        java.util.Locale locale29 = locale28.stripExtensions();
        java.util.Locale locale30 = java.util.Locale.CANADA;
        java.util.Locale locale31 = java.util.Locale.KOREAN;
        java.lang.String str32 = locale30.getDisplayName(locale31);
        java.lang.String str33 = locale30.getCountry();
        java.lang.String str34 = locale30.getScript();
        java.util.Locale locale35 = java.util.Locale.CANADA;
        java.util.Locale locale36 = java.util.Locale.KOREAN;
        java.lang.String str37 = locale35.getDisplayName(locale36);
        java.lang.String str38 = locale35.getISO3Language();
        java.util.Locale locale39 = locale35.stripExtensions();
        java.lang.String str40 = locale30.getDisplayScript(locale39);
        java.lang.String str41 = locale29.getDisplayScript(locale30);
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker(locale30);
        com.github.javafaker.Color color43 = faker42.color;
        faker0.color = color43;
        com.github.javafaker.Book book45 = faker0.book();
        com.github.javafaker.Number number46 = faker0.number;
        org.junit.Assert.assertNotNull(randomService1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-CA" + "'", str6, "en-CA");
        org.junit.Assert.assertNotNull(randomService10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(dateAndTime13);
        org.junit.Assert.assertNotNull(randomService15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(randomService19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(book22);
        org.junit.Assert.assertEquals(locale27.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str32, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "CA" + "'", str33, "CA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str37, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "eng" + "'", str38, "eng");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(book45);
        org.junit.Assert.assertNotNull(number46);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale0.getLanguage();
        java.util.Random random5 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream6 = random5.longs();
        java.util.stream.DoubleStream doubleStream7 = random5.doubles();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.PhoneNumber phoneNumber9 = faker8.phoneNumber;
        com.github.javafaker.Name name10 = faker8.name();
        com.github.javafaker.Business business11 = faker8.business;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService13 = faker12.randomService;
        java.lang.String str15 = faker12.bothify("");
        com.github.javafaker.Book book16 = faker12.book();
        com.github.javafaker.Book book17 = faker12.book;
        com.github.javafaker.Finance finance18 = faker12.finance();
        com.github.javafaker.Hacker hacker19 = null;
        faker12.hacker = hacker19;
        com.github.javafaker.Hacker hacker21 = faker12.hacker();
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.util.Locale locale23 = java.util.Locale.CANADA;
        java.util.Locale locale24 = java.util.Locale.KOREAN;
        java.lang.String str25 = locale23.getDisplayName(locale24);
        java.lang.String str26 = locale23.getISO3Language();
        java.util.Locale locale27 = locale23.stripExtensions();
        java.lang.String str28 = locale27.toLanguageTag();
        java.lang.String str29 = locale22.getDisplayLanguage(locale27);
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale22);
        com.github.javafaker.Address address31 = faker30.address();
        com.github.javafaker.Address address32 = faker30.address();
        java.lang.String str34 = faker30.letterify("Korean");
        com.github.javafaker.Code code35 = faker30.code();
        com.github.javafaker.Options options36 = faker30.options;
        faker12.options = options36;
        faker8.options = options36;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str2, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en" + "'", str3, "en");
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertNotNull(randomService13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(book16);
        org.junit.Assert.assertNotNull(book17);
        org.junit.Assert.assertNotNull(finance18);
        org.junit.Assert.assertNull(hacker21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str25, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "eng" + "'", str26, "eng");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "en-CA" + "'", str28, "en-CA");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Italian" + "'", str29, "Italian");
        org.junit.Assert.assertNotNull(address31);
        org.junit.Assert.assertNotNull(address32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Korean" + "'", str34, "Korean");
        org.junit.Assert.assertNotNull(code35);
        org.junit.Assert.assertNotNull(options36);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService29 = faker28.randomService;
        java.lang.String str31 = faker28.bothify("");
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService33 = faker32.randomService;
        java.lang.String str35 = faker32.bothify("");
        com.github.javafaker.Book book36 = faker32.book();
        faker28.book = book36;
        com.github.javafaker.DateAndTime dateAndTime38 = faker28.dateAndTime;
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService40 = faker39.randomService;
        java.lang.String str42 = faker39.bothify("");
        com.github.javafaker.Book book43 = faker39.book();
        com.github.javafaker.Finance finance44 = faker39.finance();
        com.github.javafaker.Faker faker45 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService46 = faker45.randomService;
        java.lang.String str48 = faker45.bothify("");
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService50 = faker49.randomService;
        java.lang.String str52 = faker49.bothify("");
        com.github.javafaker.Book book53 = faker49.book();
        faker45.book = book53;
        com.github.javafaker.Options options55 = faker45.options();
        faker39.options = options55;
        com.github.javafaker.service.RandomService randomService57 = faker39.randomService;
        com.github.javafaker.Faker faker58 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService59 = faker58.randomService;
        com.github.javafaker.Book book60 = faker58.book();
        com.github.javafaker.Finance finance61 = faker58.finance();
        com.github.javafaker.Book book62 = faker58.book();
        com.github.javafaker.Options options63 = faker58.options();
        com.github.javafaker.PhoneNumber phoneNumber64 = faker58.phoneNumber();
        com.github.javafaker.service.FakeValuesService fakeValuesService65 = faker58.fakeValuesService;
        faker39.fakeValuesService = fakeValuesService65;
        faker28.fakeValuesService = fakeValuesService65;
        faker0.fakeValuesService = fakeValuesService65;
        org.junit.Assert.assertNotNull(randomService1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(randomService6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(randomService14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(randomService18);
        org.junit.Assert.assertNotNull(book19);
        org.junit.Assert.assertNotNull(finance20);
        org.junit.Assert.assertNotNull(book21);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(phoneNumber23);
        org.junit.Assert.assertNotNull(name25);
        org.junit.Assert.assertNotNull(finance27);
        org.junit.Assert.assertNotNull(randomService29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(randomService33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(book36);
        org.junit.Assert.assertNotNull(dateAndTime38);
        org.junit.Assert.assertNotNull(randomService40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(book43);
        org.junit.Assert.assertNotNull(finance44);
        org.junit.Assert.assertNotNull(randomService46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(randomService50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(book53);
        org.junit.Assert.assertNotNull(options55);
        org.junit.Assert.assertNotNull(randomService57);
        org.junit.Assert.assertNotNull(randomService59);
        org.junit.Assert.assertNotNull(book60);
        org.junit.Assert.assertNotNull(finance61);
        org.junit.Assert.assertNotNull(book62);
        org.junit.Assert.assertNotNull(options63);
        org.junit.Assert.assertNotNull(phoneNumber64);
        org.junit.Assert.assertNotNull(fakeValuesService65);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService5 = faker4.randomService;
        java.lang.String str7 = faker4.bothify("");
        com.github.javafaker.Book book8 = faker4.book();
        faker0.book = book8;
        com.github.javafaker.Options options10 = faker0.options();
        com.github.javafaker.App app11 = faker0.app;
        com.github.javafaker.Code code12 = faker0.code();
        com.github.javafaker.Address address13 = faker0.address();
        org.junit.Assert.assertNotNull(randomService1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(randomService5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(app11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(address13);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.dateAndTime;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService6 = faker5.randomService;
        com.github.javafaker.Book book7 = faker5.book();
        faker0.book = book7;
        com.github.javafaker.Finance finance9 = faker0.finance();
        com.github.javafaker.Lorem lorem10 = faker0.lorem();
        com.github.javafaker.PhoneNumber phoneNumber11 = faker0.phoneNumber;
        com.github.javafaker.Business business12 = faker0.business;
        com.github.javafaker.Color color13 = faker0.color();
        org.junit.Assert.assertNotNull(randomService1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(randomService6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNotNull(phoneNumber11);
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ita");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("ITALIAN");
        java.util.Locale.Category category6 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.util.Locale.setDefault(category6, locale7);
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale9.getDisplayName(locale10);
        java.lang.String str12 = locale9.getISO3Language();
        java.util.Locale locale13 = locale9.stripExtensions();
        java.util.Locale.setDefault(category6, locale9);
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(locale15);
        boolean boolean17 = locale15.hasExtensions();
        java.util.Locale locale18 = locale15.stripExtensions();
        java.util.Locale.setDefault(category6, locale15);
        java.util.Locale locale20 = null;
        java.lang.String str21 = null; // flaky: locale15.getDisplayCountry(locale20);
        java.lang.String str22 = locale15.getLanguage();
        java.util.Locale.Builder builder23 = builder3.setLocale(locale15);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str11, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eng" + "'", str12, "eng");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "it" + "'", str22, "it");
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.util.Random random1 = new java.util.Random(1853403699951111791L);
        int int2 = random1.nextInt();
        int int3 = random1.nextInt();
        boolean boolean4 = random1.nextBoolean();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 491102327 + "'", int2 == 491102327);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1901749300) + "'", int3 == (-1901749300));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.util.Locale locale2 = new java.util.Locale("ita", "coreano");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str4 = locale2.getScript();
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale2.getDisplayCountry(locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "ita_COREANO");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        java.util.Random random1 = new java.util.Random((-5128016860359238732L));
        java.util.stream.IntStream intStream2 = random1.ints();
        boolean boolean3 = random1.nextBoolean();
        double double4 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.3338712005659887d + "'", double4 == 1.3338712005659887d);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream2 = random1.longs();
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        random1.nextBytes(byteArray9);
        long long11 = random1.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream14 = random1.longs((long) 4, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[115, -43, 26, -69, -40, -100]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 7564655870752979346L + "'", long11 == 7564655870752979346L);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Germania" + "'", str1, "Germania");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DE" + "'", str2, "DE");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale0.getCountry();
        java.lang.String str4 = locale0.getScript();
        java.util.Locale locale5 = java.util.Locale.ROOT;
        java.lang.String str6 = locale5.getVariant();
        java.lang.String str7 = locale0.getDisplayCountry(locale5);
        java.lang.String str8 = locale5.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str2, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CA" + "'", str3, "CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Canada" + "'", str7, "Canada");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream2 = random1.longs();
        int int4 = random1.nextInt((int) 'u');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Business business6 = faker5.business;
        java.util.Random random8 = new java.util.Random((long) 1);
        random8.setSeed((long) (short) 100);
        java.util.stream.DoubleStream doubleStream11 = random8.doubles();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Company company13 = faker12.company;
        faker5.company = company13;
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 69 + "'", int4 == 69);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(company13);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business1 = null;
        faker0.business = business1;
        java.lang.String str4 = faker0.numerify("hi!");
        com.github.javafaker.Name name5 = faker0.name();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(name5);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("CAN");
        java.lang.String str2 = locale1.getCountry();
        java.lang.String str3 = locale1.getVariant();
        java.lang.String str4 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "can");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "can" + "'", str4, "can");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.lang.String str4 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService5 = faker4.randomService;
        java.lang.String str7 = faker4.bothify("");
        com.github.javafaker.Book book8 = faker4.book();
        faker0.book = book8;
        com.github.javafaker.Options options10 = faker0.options();
        com.github.javafaker.App app11 = faker0.app;
        com.github.javafaker.Finance finance12 = faker0.finance();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService14 = faker13.randomService;
        java.lang.String str16 = faker13.bothify("");
        com.github.javafaker.DateAndTime dateAndTime17 = faker13.dateAndTime;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService19 = faker18.randomService;
        java.lang.String str21 = faker18.bothify("");
        com.github.javafaker.DateAndTime dateAndTime22 = faker18.dateAndTime;
        faker13.dateAndTime = dateAndTime22;
        com.github.javafaker.DateAndTime dateAndTime24 = faker13.dateAndTime;
        faker0.dateAndTime = dateAndTime24;
        org.junit.Assert.assertNotNull(randomService1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(randomService5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(app11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(randomService14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(dateAndTime17);
        org.junit.Assert.assertNotNull(randomService19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(dateAndTime22);
        org.junit.Assert.assertNotNull(dateAndTime24);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("CAN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService2 = faker1.randomService;
        java.lang.String str4 = faker1.bothify("");
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService6 = faker5.randomService;
        java.lang.String str8 = faker5.bothify("");
        com.github.javafaker.Book book9 = faker5.book();
        faker1.book = book9;
        com.github.javafaker.Options options11 = faker1.options();
        com.github.javafaker.App app12 = faker1.app;
        faker0.app = app12;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService15 = faker14.randomService;
        java.lang.String str17 = faker14.bothify("");
        com.github.javafaker.DateAndTime dateAndTime18 = faker14.dateAndTime;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService20 = faker19.randomService;
        java.lang.String str22 = faker19.bothify("");
        com.github.javafaker.DateAndTime dateAndTime23 = faker19.dateAndTime;
        faker14.dateAndTime = dateAndTime23;
        com.github.javafaker.Code code25 = null;
        faker14.code = code25;
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService28 = faker27.randomService;
        java.lang.String str30 = faker27.bothify("");
        com.github.javafaker.DateAndTime dateAndTime31 = faker27.dateAndTime;
        com.github.javafaker.Lorem lorem32 = null;
        faker27.lorem = lorem32;
        com.github.javafaker.Code code34 = faker27.code();
        faker14.code = code34;
        com.github.javafaker.Company company36 = faker14.company();
        com.github.javafaker.Business business37 = faker14.business();
        faker0.business = business37;
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business40 = null;
        faker39.business = business40;
        com.github.javafaker.Color color42 = null;
        faker39.color = color42;
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService45 = faker44.randomService;
        java.lang.String str47 = faker44.bothify("");
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService49 = faker48.randomService;
        java.lang.String str51 = faker48.bothify("");
        com.github.javafaker.Book book52 = faker48.book();
        faker44.book = book52;
        com.github.javafaker.Address address54 = faker44.address();
        faker39.address = address54;
        com.github.javafaker.Faker faker56 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name57 = faker56.name();
        com.github.javafaker.Faker faker58 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name59 = faker58.name();
        faker56.name = name59;
        faker39.name = name59;
        com.github.javafaker.DateAndTime dateAndTime62 = faker39.date();
        faker0.dateAndTime = dateAndTime62;
        com.github.javafaker.service.RandomService randomService64 = faker0.randomService;
        com.github.javafaker.Book book65 = faker0.book;
        com.github.javafaker.Lorem lorem66 = faker0.lorem;
        org.junit.Assert.assertNotNull(randomService2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(randomService6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(app12);
        org.junit.Assert.assertNotNull(randomService15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(dateAndTime18);
        org.junit.Assert.assertNotNull(randomService20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(dateAndTime23);
        org.junit.Assert.assertNotNull(randomService28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(dateAndTime31);
        org.junit.Assert.assertNotNull(code34);
        org.junit.Assert.assertNotNull(company36);
        org.junit.Assert.assertNotNull(business37);
        org.junit.Assert.assertNotNull(randomService45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(randomService49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(book52);
        org.junit.Assert.assertNotNull(address54);
        org.junit.Assert.assertNotNull(name57);
        org.junit.Assert.assertNotNull(name59);
        org.junit.Assert.assertNotNull(dateAndTime62);
        org.junit.Assert.assertNotNull(randomService64);
        org.junit.Assert.assertNotNull(book65);
        org.junit.Assert.assertNotNull(lorem66);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream2 = random1.longs();
        int int4 = random1.nextInt((int) 'u');
        boolean boolean5 = random1.nextBoolean();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService8 = faker7.randomService;
        java.lang.String str10 = faker7.bothify("");
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService12 = faker11.randomService;
        java.lang.String str14 = faker11.bothify("");
        com.github.javafaker.Book book15 = faker11.book();
        faker7.book = book15;
        faker6.book = book15;
        com.github.javafaker.Internet internet18 = faker6.internet();
        com.github.javafaker.Lorem lorem19 = faker6.lorem;
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 69 + "'", int4 == 69);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(randomService8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(randomService12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(book15);
        org.junit.Assert.assertNotNull(internet18);
        org.junit.Assert.assertNotNull(lorem19);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.dateAndTime;
        java.lang.String str6 = faker0.letterify("en-CA");
        com.github.javafaker.Code code7 = null;
        faker0.code = code7;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService10 = faker9.randomService;
        java.lang.String str12 = faker9.bothify("");
        com.github.javafaker.DateAndTime dateAndTime13 = faker9.dateAndTime;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService15 = faker14.randomService;
        java.lang.String str17 = faker14.bothify("");
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService19 = faker18.randomService;
        java.lang.String str21 = faker18.bothify("");
        com.github.javafaker.Book book22 = faker18.book();
        faker14.book = book22;
        faker9.book = book22;
        faker0.book = book22;
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService27 = faker26.randomService;
        java.lang.String str29 = faker26.bothify("");
        com.github.javafaker.Book book30 = faker26.book();
        com.github.javafaker.Number number31 = faker26.number();
        faker0.number = number31;
        java.util.Locale locale33 = java.util.Locale.ITALIAN;
        java.util.Locale locale34 = java.util.Locale.CANADA;
        java.util.Locale locale35 = java.util.Locale.KOREAN;
        java.lang.String str36 = locale34.getDisplayName(locale35);
        java.lang.String str37 = locale34.getISO3Language();
        java.util.Locale locale38 = locale34.stripExtensions();
        java.lang.String str39 = locale38.toLanguageTag();
        java.lang.String str40 = locale33.getDisplayLanguage(locale38);
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(locale33);
        com.github.javafaker.Company company42 = faker41.company();
        faker0.company = company42;
        com.github.javafaker.Name name44 = faker0.name();
        com.github.javafaker.Code code45 = faker0.code();
        com.github.javafaker.Company company46 = faker0.company;
        java.util.Locale locale47 = java.util.Locale.CHINA;
        java.util.Random random49 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream50 = random49.longs();
        com.github.javafaker.Faker faker51 = new com.github.javafaker.Faker(locale47, random49);
        com.github.javafaker.DateAndTime dateAndTime52 = faker51.date();
        com.github.javafaker.Faker faker53 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService54 = faker53.randomService;
        java.lang.String str56 = faker53.bothify("");
        com.github.javafaker.Book book57 = faker53.book();
        java.lang.String str59 = faker53.regexify("eng");
        com.github.javafaker.service.RandomService randomService60 = faker53.randomService;
        com.github.javafaker.Code code61 = faker53.code;
        java.util.Locale locale62 = java.util.Locale.ITALIAN;
        java.util.Locale locale63 = java.util.Locale.CANADA;
        java.util.Locale locale64 = java.util.Locale.KOREAN;
        java.lang.String str65 = locale63.getDisplayName(locale64);
        java.lang.String str66 = locale63.getISO3Language();
        java.util.Locale locale67 = locale63.stripExtensions();
        java.lang.String str68 = locale67.toLanguageTag();
        java.lang.String str69 = locale62.getDisplayLanguage(locale67);
        com.github.javafaker.Faker faker70 = new com.github.javafaker.Faker(locale62);
        com.github.javafaker.Company company71 = faker70.company();
        com.github.javafaker.App app72 = faker70.app;
        faker53.app = app72;
        faker51.app = app72;
        com.github.javafaker.Name name75 = faker51.name();
        faker0.name = name75;
        com.github.javafaker.Faker faker77 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService78 = faker77.randomService;
        java.lang.String str80 = faker77.bothify("");
        com.github.javafaker.Faker faker81 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService82 = faker81.randomService;
        com.github.javafaker.Book book83 = faker81.book();
        com.github.javafaker.Finance finance84 = faker81.finance();
        com.github.javafaker.Book book85 = faker81.book();
        com.github.javafaker.Options options86 = faker81.options();
        com.github.javafaker.PhoneNumber phoneNumber87 = faker81.phoneNumber();
        faker77.phoneNumber = phoneNumber87;
        com.github.javafaker.Hacker hacker89 = faker77.hacker;
        faker0.hacker = hacker89;
        com.github.javafaker.Book book91 = faker0.book();
        org.junit.Assert.assertNotNull(randomService1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-CA" + "'", str6, "en-CA");
        org.junit.Assert.assertNotNull(randomService10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(dateAndTime13);
        org.junit.Assert.assertNotNull(randomService15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(randomService19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(book22);
        org.junit.Assert.assertNotNull(randomService27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(book30);
        org.junit.Assert.assertNotNull(number31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str36, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "eng" + "'", str37, "eng");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "en-CA" + "'", str39, "en-CA");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Italian" + "'", str40, "Italian");
        org.junit.Assert.assertNotNull(company42);
        org.junit.Assert.assertNotNull(name44);
        org.junit.Assert.assertNull(code45);
        org.junit.Assert.assertNotNull(company46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream50);
        org.junit.Assert.assertNotNull(dateAndTime52);
        org.junit.Assert.assertNotNull(randomService54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(book57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "eng" + "'", str59, "eng");
        org.junit.Assert.assertNotNull(randomService60);
        org.junit.Assert.assertNotNull(code61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "it");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str65, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "eng" + "'", str66, "eng");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "en-CA" + "'", str68, "en-CA");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Italian" + "'", str69, "Italian");
        org.junit.Assert.assertNotNull(company71);
        org.junit.Assert.assertNotNull(app72);
        org.junit.Assert.assertNotNull(name75);
        org.junit.Assert.assertNotNull(randomService78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(randomService82);
        org.junit.Assert.assertNotNull(book83);
        org.junit.Assert.assertNotNull(finance84);
        org.junit.Assert.assertNotNull(book85);
        org.junit.Assert.assertNotNull(options86);
        org.junit.Assert.assertNotNull(phoneNumber87);
        org.junit.Assert.assertNotNull(hacker89);
        org.junit.Assert.assertNotNull(book91);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.dateAndTime;
        java.lang.String str6 = faker0.letterify("en-CA");
        com.github.javafaker.Code code7 = null;
        faker0.code = code7;
        com.github.javafaker.Code code9 = faker0.code;
        com.github.javafaker.Options options10 = faker0.options;
        com.github.javafaker.Internet internet11 = faker0.internet();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService13 = faker12.randomService;
        com.github.javafaker.Book book14 = faker12.book();
        com.github.javafaker.Finance finance15 = faker12.finance();
        com.github.javafaker.Book book16 = faker12.book();
        com.github.javafaker.Lorem lorem17 = faker12.lorem;
        com.github.javafaker.Finance finance18 = faker12.finance();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.util.Locale locale20 = java.util.Locale.CANADA;
        java.util.Locale locale21 = java.util.Locale.KOREAN;
        java.lang.String str22 = locale20.getDisplayName(locale21);
        java.lang.String str23 = locale20.getISO3Language();
        java.util.Locale locale24 = locale20.stripExtensions();
        java.lang.String str25 = locale24.toLanguageTag();
        java.lang.String str26 = locale19.getDisplayLanguage(locale24);
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale19);
        com.github.javafaker.Number number28 = faker27.number;
        com.github.javafaker.Business business29 = faker27.business;
        com.github.javafaker.App app30 = faker27.app();
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService32 = faker31.randomService;
        java.lang.String str34 = faker31.bothify("");
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService36 = faker35.randomService;
        java.lang.String str38 = faker35.bothify("");
        com.github.javafaker.Book book39 = faker35.book();
        faker31.book = book39;
        com.github.javafaker.App app41 = faker31.app();
        faker27.app = app41;
        com.github.javafaker.Color color43 = faker27.color;
        faker12.color = color43;
        faker0.color = color43;
        java.lang.String str47 = faker0.letterify("english");
        org.junit.Assert.assertNotNull(randomService1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-CA" + "'", str6, "en-CA");
        org.junit.Assert.assertNull(code9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(randomService13);
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(finance15);
        org.junit.Assert.assertNotNull(book16);
        org.junit.Assert.assertNotNull(lorem17);
        org.junit.Assert.assertNotNull(finance18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str22, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "eng" + "'", str23, "eng");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en-CA" + "'", str25, "en-CA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Italian" + "'", str26, "Italian");
        org.junit.Assert.assertNotNull(number28);
        org.junit.Assert.assertNotNull(business29);
        org.junit.Assert.assertNotNull(app30);
        org.junit.Assert.assertNotNull(randomService32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(randomService36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(book39);
        org.junit.Assert.assertNotNull(app41);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "english" + "'", str47, "english");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.util.Random random1 = new java.util.Random((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream3 = random1.ints((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.dateAndTime;
        java.lang.String str6 = faker0.letterify("en-CA");
        com.github.javafaker.Code code7 = null;
        faker0.code = code7;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService10 = faker9.randomService;
        java.lang.String str12 = faker9.bothify("");
        com.github.javafaker.DateAndTime dateAndTime13 = faker9.dateAndTime;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService15 = faker14.randomService;
        java.lang.String str17 = faker14.bothify("");
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService19 = faker18.randomService;
        java.lang.String str21 = faker18.bothify("");
        com.github.javafaker.Book book22 = faker18.book();
        faker14.book = book22;
        faker9.book = book22;
        faker0.book = book22;
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService27 = faker26.randomService;
        java.lang.String str29 = faker26.bothify("");
        com.github.javafaker.Book book30 = faker26.book();
        com.github.javafaker.Number number31 = faker26.number();
        faker0.number = number31;
        java.util.Locale locale33 = java.util.Locale.ITALIAN;
        java.util.Locale locale34 = java.util.Locale.CANADA;
        java.util.Locale locale35 = java.util.Locale.KOREAN;
        java.lang.String str36 = locale34.getDisplayName(locale35);
        java.lang.String str37 = locale34.getISO3Language();
        java.util.Locale locale38 = locale34.stripExtensions();
        java.lang.String str39 = locale38.toLanguageTag();
        java.lang.String str40 = locale33.getDisplayLanguage(locale38);
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(locale33);
        com.github.javafaker.Company company42 = faker41.company();
        faker0.company = company42;
        com.github.javafaker.Name name44 = faker0.name();
        com.github.javafaker.Code code45 = faker0.code();
        com.github.javafaker.Finance finance46 = faker0.finance();
        java.lang.String str48 = faker0.bothify("Korean");
        org.junit.Assert.assertNotNull(randomService1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-CA" + "'", str6, "en-CA");
        org.junit.Assert.assertNotNull(randomService10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(dateAndTime13);
        org.junit.Assert.assertNotNull(randomService15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(randomService19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(book22);
        org.junit.Assert.assertNotNull(randomService27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(book30);
        org.junit.Assert.assertNotNull(number31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str36, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "eng" + "'", str37, "eng");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "en-CA" + "'", str39, "en-CA");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Italian" + "'", str40, "Italian");
        org.junit.Assert.assertNotNull(company42);
        org.junit.Assert.assertNotNull(name44);
        org.junit.Assert.assertNull(code45);
        org.junit.Assert.assertNotNull(finance46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Korean" + "'", str48, "Korean");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Germany");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "germany");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("eng", 1.3338712005659887d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.3338712005659887");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder3 = builder0.setLocale(locale1);
        java.util.Locale locale4 = builder0.build();
        java.util.Locale.Builder builder6 = builder0.setLanguageTag("it");
        java.util.Locale.Builder builder7 = builder6.clear();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business1 = null;
        faker0.business = business1;
        com.github.javafaker.Color color3 = null;
        faker0.color = color3;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService6 = faker5.randomService;
        java.lang.String str8 = faker5.bothify("");
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService10 = faker9.randomService;
        java.lang.String str12 = faker9.bothify("");
        com.github.javafaker.Book book13 = faker9.book();
        faker5.book = book13;
        com.github.javafaker.Address address15 = faker5.address();
        faker0.address = address15;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name18 = faker17.name();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name();
        faker17.name = name20;
        faker0.name = name20;
        com.github.javafaker.Number number23 = faker0.number;
        com.github.javafaker.Finance finance24 = faker0.finance;
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService26 = faker25.randomService;
        java.lang.String str28 = faker25.bothify("");
        com.github.javafaker.DateAndTime dateAndTime29 = faker25.dateAndTime;
        com.github.javafaker.Lorem lorem30 = null;
        faker25.lorem = lorem30;
        com.github.javafaker.DateAndTime dateAndTime32 = faker25.date();
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService34 = faker33.randomService;
        java.lang.String str36 = faker33.bothify("");
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService38 = faker37.randomService;
        java.lang.String str40 = faker37.bothify("");
        com.github.javafaker.Book book41 = faker37.book();
        faker33.book = book41;
        com.github.javafaker.DateAndTime dateAndTime43 = faker33.dateAndTime;
        faker25.dateAndTime = dateAndTime43;
        com.github.javafaker.Lorem lorem45 = faker25.lorem;
        com.github.javafaker.Hacker hacker46 = faker25.hacker;
        com.github.javafaker.Lorem lorem47 = faker25.lorem;
        com.github.javafaker.Hacker hacker48 = faker25.hacker();
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business50 = null;
        faker49.business = business50;
        com.github.javafaker.Color color52 = null;
        faker49.color = color52;
        com.github.javafaker.App app54 = faker49.app;
        com.github.javafaker.Address address55 = faker49.address();
        com.github.javafaker.Options options56 = faker49.options();
        faker25.options = options56;
        faker0.options = options56;
        org.junit.Assert.assertNotNull(randomService6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(randomService10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(book13);
        org.junit.Assert.assertNotNull(address15);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(number23);
        org.junit.Assert.assertNotNull(finance24);
        org.junit.Assert.assertNotNull(randomService26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(dateAndTime29);
        org.junit.Assert.assertNotNull(dateAndTime32);
        org.junit.Assert.assertNotNull(randomService34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(randomService38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(book41);
        org.junit.Assert.assertNotNull(dateAndTime43);
        org.junit.Assert.assertNull(lorem45);
        org.junit.Assert.assertNotNull(hacker46);
        org.junit.Assert.assertNull(lorem47);
        org.junit.Assert.assertNotNull(hacker48);
        org.junit.Assert.assertNotNull(app54);
        org.junit.Assert.assertNotNull(address55);
        org.junit.Assert.assertNotNull(options56);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguage("italian");
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale4.getVariant();
        java.util.Set<java.lang.Character> charSet6 = locale4.getExtensionKeys();
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.lang.String str9 = locale7.getDisplayName(locale8);
        java.lang.String str10 = locale7.getLanguage();
        java.util.Set<java.lang.String> strSet11 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale4.getDisplayLanguage(locale7);
        java.util.Locale.Builder builder13 = builder3.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setVariant("de");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: de [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str9, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Italian" + "'", str12, "Italian");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.dateAndTime;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService6 = faker5.randomService;
        com.github.javafaker.Book book7 = faker5.book();
        faker0.book = book7;
        com.github.javafaker.Business business9 = faker0.business;
        com.github.javafaker.Internet internet10 = faker0.internet;
        com.github.javafaker.Internet internet11 = faker0.internet();
        com.github.javafaker.PhoneNumber phoneNumber12 = faker0.phoneNumber;
        org.junit.Assert.assertNotNull(randomService1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(randomService6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(phoneNumber12);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream2 = random1.longs();
        int int4 = random1.nextInt((int) 'u');
        random1.setSeed((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream7 = random1.doubles();
        java.util.stream.DoubleStream doubleStream8 = random1.doubles();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService11 = faker10.randomService;
        java.lang.String str13 = faker10.bothify("");
        com.github.javafaker.DateAndTime dateAndTime14 = faker10.dateAndTime;
        com.github.javafaker.Internet internet15 = faker10.internet;
        com.github.javafaker.Number number16 = faker10.number;
        com.github.javafaker.service.RandomService randomService17 = faker10.randomService;
        com.github.javafaker.Hacker hacker18 = faker10.hacker;
        faker9.hacker = hacker18;
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 69 + "'", int4 == 69);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(randomService11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(dateAndTime14);
        org.junit.Assert.assertNotNull(internet15);
        org.junit.Assert.assertNotNull(number16);
        org.junit.Assert.assertNotNull(randomService17);
        org.junit.Assert.assertNotNull(hacker18);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService1 = faker0.randomService;
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.dateAndTime;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService6 = faker5.randomService;
        java.lang.String str8 = faker5.bothify("");
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService10 = faker9.randomService;
        java.lang.String str12 = faker9.bothify("");
        com.github.javafaker.Book book13 = faker9.book();
        faker5.book = book13;
        faker0.book = book13;
        com.github.javafaker.Name name16 = faker0.name();
        com.github.javafaker.Business business17 = faker0.business;
        org.junit.Assert.assertNotNull(randomService1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(randomService6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(randomService10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(book13);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(business17);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        java.lang.String str43 = faker40.bothify("");
        com.github.javafaker.DateAndTime dateAndTime44 = faker40.dateAndTime;
        java.lang.String str46 = faker40.letterify("en-CA");
        com.github.javafaker.Code code47 = null;
        faker40.code = code47;
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService50 = faker49.randomService;
        java.lang.String str52 = faker49.bothify("");
        com.github.javafaker.DateAndTime dateAndTime53 = faker49.dateAndTime;
        com.github.javafaker.Faker faker54 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService55 = faker54.randomService;
        java.lang.String str57 = faker54.bothify("");
        com.github.javafaker.Faker faker58 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService59 = faker58.randomService;
        java.lang.String str61 = faker58.bothify("");
        com.github.javafaker.Book book62 = faker58.book();
        faker54.book = book62;
        faker49.book = book62;
        faker40.book = book62;
        com.github.javafaker.Faker faker66 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService67 = faker66.randomService;
        java.lang.String str69 = faker66.bothify("");
        com.github.javafaker.Book book70 = faker66.book();
        com.github.javafaker.Number number71 = faker66.number();
        faker40.number = number71;
        java.util.Locale locale73 = java.util.Locale.ITALIAN;
        java.util.Locale locale74 = java.util.Locale.CANADA;
        java.util.Locale locale75 = java.util.Locale.KOREAN;
        java.lang.String str76 = locale74.getDisplayName(locale75);
        java.lang.String str77 = locale74.getISO3Language();
        java.util.Locale locale78 = locale74.stripExtensions();
        java.lang.String str79 = locale78.toLanguageTag();
        java.lang.String str80 = locale73.getDisplayLanguage(locale78);
        com.github.javafaker.Faker faker81 = new com.github.javafaker.Faker(locale73);
        com.github.javafaker.Company company82 = faker81.company();
        faker40.company = company82;
        com.github.javafaker.Name name84 = faker40.name();
        faker0.name = name84;
        java.lang.String str87 = faker0.regexify("ko");
        com.github.javafaker.Options options88 = faker0.options();
        org.junit.Assert.assertNotNull(randomService1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(randomService5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(randomService12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(book15);
        org.junit.Assert.assertNotNull(finance16);
        org.junit.Assert.assertNotNull(randomService18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(randomService22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(book25);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(randomService29);
        org.junit.Assert.assertNotNull(randomService31);
        org.junit.Assert.assertNotNull(book32);
        org.junit.Assert.assertNotNull(finance33);
        org.junit.Assert.assertNotNull(book34);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNotNull(phoneNumber36);
        org.junit.Assert.assertNotNull(fakeValuesService37);
        org.junit.Assert.assertNotNull(randomService41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(dateAndTime44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "en-CA" + "'", str46, "en-CA");
        org.junit.Assert.assertNotNull(randomService50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(dateAndTime53);
        org.junit.Assert.assertNotNull(randomService55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(randomService59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(book62);
        org.junit.Assert.assertNotNull(randomService67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(book70);
        org.junit.Assert.assertNotNull(number71);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "it");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str76, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "eng" + "'", str77, "eng");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "en-CA" + "'", str79, "en-CA");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Italian" + "'", str80, "Italian");
        org.junit.Assert.assertNotNull(company82);
        org.junit.Assert.assertNotNull(name84);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "ko" + "'", str87, "ko");
        org.junit.Assert.assertNotNull(options88);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        java.util.Random random1 = new java.util.Random((long) 1);
        random1.setSeed((long) (-1));
        float float4 = random1.nextFloat();
        int int5 = random1.nextInt();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.2689426f + "'", float4 == 0.2689426f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1887904451 + "'", int5 == 1887904451);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Options options1 = faker0.options;
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService3 = faker2.randomService;
        java.lang.String str5 = faker2.bothify("");
        com.github.javafaker.DateAndTime dateAndTime6 = faker2.dateAndTime;
        java.lang.String str8 = faker2.letterify("en-CA");
        com.github.javafaker.Code code9 = null;
        faker2.code = code9;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService12 = faker11.randomService;
        java.lang.String str14 = faker11.bothify("");
        com.github.javafaker.DateAndTime dateAndTime15 = faker11.dateAndTime;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService17 = faker16.randomService;
        java.lang.String str19 = faker16.bothify("");
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService21 = faker20.randomService;
        java.lang.String str23 = faker20.bothify("");
        com.github.javafaker.Book book24 = faker20.book();
        faker16.book = book24;
        faker11.book = book24;
        faker2.book = book24;
        faker0.book = book24;
        com.github.javafaker.Book book29 = faker0.book;
        java.lang.String str31 = faker0.numerify("english");
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(randomService3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en-CA" + "'", str8, "en-CA");
        org.junit.Assert.assertNotNull(randomService12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(dateAndTime15);
        org.junit.Assert.assertNotNull(randomService17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(randomService21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(book24);
        org.junit.Assert.assertNotNull(book29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "english" + "'", str31, "english");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        com.github.javafaker.Hacker hacker40 = null;
        faker0.hacker = hacker40;
        org.junit.Assert.assertNotNull(randomService1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(randomService5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(randomService12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(book15);
        org.junit.Assert.assertNotNull(finance16);
        org.junit.Assert.assertNotNull(randomService18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(randomService22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(book25);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(randomService29);
        org.junit.Assert.assertNotNull(randomService31);
        org.junit.Assert.assertNotNull(book32);
        org.junit.Assert.assertNotNull(finance33);
        org.junit.Assert.assertNotNull(book34);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNotNull(phoneNumber36);
        org.junit.Assert.assertNotNull(fakeValuesService37);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.stream.LongStream longStream2 = random1.longs();
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        random1.nextBytes(byteArray9);
        double double11 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream13 = random1.doubles((long) '#');
        java.util.stream.DoubleStream doubleStream17 = random1.doubles((long) ' ', 0.0d, (double) 10);
        java.util.stream.DoubleStream doubleStream18 = random1.doubles();
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[115, -43, 26, -69, -40, -100]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.4123569817688534d) + "'", double11 == (-0.4123569817688534d));
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertNotNull(doubleStream18);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Options options1 = faker0.options;
        com.github.javafaker.Options options2 = faker0.options;
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(options2);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.lang.String str6 = locale3.getISO3Language();
        java.util.Locale locale7 = locale3.stripExtensions();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(locale9);
        boolean boolean11 = locale9.hasExtensions();
        java.util.Locale locale12 = locale9.stripExtensions();
        java.util.Locale.setDefault(category0, locale9);
        java.util.Locale locale14 = java.util.Locale.ROOT;
        java.util.Set<java.lang.Character> charSet15 = locale14.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale14);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str5, "\uc601\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "eng" + "'", str6, "eng");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(charSet15);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        java.util.Random random1 = new java.util.Random(100L);
        long long2 = random1.nextLong();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5128016860359238732L) + "'", long2 == (-5128016860359238732L));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService2 = faker1.randomService;
        java.lang.String str4 = faker1.bothify("");
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService6 = faker5.randomService;
        java.lang.String str8 = faker5.bothify("");
        com.github.javafaker.Book book9 = faker5.book();
        faker1.book = book9;
        com.github.javafaker.Options options11 = faker1.options();
        com.github.javafaker.App app12 = faker1.app;
        faker0.app = app12;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService15 = faker14.randomService;
        java.lang.String str17 = faker14.bothify("");
        com.github.javafaker.DateAndTime dateAndTime18 = faker14.dateAndTime;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService20 = faker19.randomService;
        java.lang.String str22 = faker19.bothify("");
        com.github.javafaker.DateAndTime dateAndTime23 = faker19.dateAndTime;
        faker14.dateAndTime = dateAndTime23;
        com.github.javafaker.Code code25 = null;
        faker14.code = code25;
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.service.RandomService randomService28 = faker27.randomService;
        java.lang.String str30 = faker27.bothify("");
        com.github.javafaker.DateAndTime dateAndTime31 = faker27.dateAndTime;
        com.github.javafaker.Lorem lorem32 = null;
        faker27.lorem = lorem32;
        com.github.javafaker.Code code34 = faker27.code();
        faker14.code = code34;
        com.github.javafaker.Company company36 = faker14.company();
        com.github.javafaker.Business business37 = faker14.business();
        faker0.business = business37;
        com.github.javafaker.Name name39 = faker0.name;
        com.github.javafaker.Finance finance40 = faker0.finance();
        org.junit.Assert.assertNotNull(randomService2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(randomService6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(app12);
        org.junit.Assert.assertNotNull(randomService15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(dateAndTime18);
        org.junit.Assert.assertNotNull(randomService20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(dateAndTime23);
        org.junit.Assert.assertNotNull(randomService28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(dateAndTime31);
        org.junit.Assert.assertNotNull(code34);
        org.junit.Assert.assertNotNull(company36);
        org.junit.Assert.assertNotNull(business37);
        org.junit.Assert.assertNotNull(name39);
        org.junit.Assert.assertNotNull(finance40);
    }
}
