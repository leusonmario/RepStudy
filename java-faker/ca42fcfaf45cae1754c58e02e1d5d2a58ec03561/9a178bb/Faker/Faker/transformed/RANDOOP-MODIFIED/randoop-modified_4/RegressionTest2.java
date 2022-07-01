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
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = new java.util.Locale("en-US", "en");
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder13 = builder10.setScript("");
        java.util.Locale locale14 = builder13.build();
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = locale15.getDisplayScript();
        java.util.Locale.setDefault(category0, locale15);
        java.util.Locale.setDefault(locale15);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "en-us_EN");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Lorem lorem6 = null;
        faker5.lorem = lorem6;
        com.github.javafaker.Internet internet8 = null;
        faker5.internet = internet8;
        com.github.javafaker.Number number10 = faker5.number;
        com.github.javafaker.Number number11 = faker5.number;
        faker3.number = number11;
        java.util.Random random13 = new java.util.Random();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Lorem lorem15 = null;
        faker14.lorem = lorem15;
        com.github.javafaker.Internet internet17 = null;
        faker14.internet = internet17;
        com.github.javafaker.Name name19 = faker14.name;
        com.github.javafaker.Code code20 = faker14.code;
        java.util.Random random21 = new java.util.Random();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Lorem lorem23 = null;
        faker22.lorem = lorem23;
        java.lang.String str26 = faker22.numerify("hi!");
        com.github.javafaker.Color color27 = faker22.color;
        java.util.Random random28 = new java.util.Random();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Lorem lorem30 = null;
        faker29.lorem = lorem30;
        java.lang.String str33 = faker29.numerify("");
        com.github.javafaker.Company company34 = faker29.company;
        com.github.javafaker.Options options35 = faker29.options();
        faker22.options = options35;
        faker14.options = options35;
        faker3.options = options35;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(name19);
        org.junit.Assert.assertNotNull(code20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(company34);
        org.junit.Assert.assertNotNull(options35);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        com.github.javafaker.Business business11 = faker10.business;
        java.lang.String str13 = faker10.bothify("en-US");
        com.github.javafaker.Number number14 = faker10.number();
        java.lang.String str16 = faker10.numerify("");
        java.lang.String str18 = faker10.letterify("x-lvariant-eng");
        com.github.javafaker.Code code19 = faker10.code;
        java.util.Random random20 = new java.util.Random();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Lorem lorem22 = null;
        faker21.lorem = lorem22;
        java.lang.String str25 = faker21.numerify("");
        java.util.Random random26 = new java.util.Random();
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.Lorem lorem28 = null;
        faker27.lorem = lorem28;
        com.github.javafaker.Color color30 = faker27.color;
        faker21.color = color30;
        java.lang.String str33 = faker21.bothify("fr_fr_HI!_eng");
        java.util.Random random34 = new java.util.Random();
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(random34);
        com.github.javafaker.Lorem lorem36 = null;
        faker35.lorem = lorem36;
        com.github.javafaker.Internet internet38 = null;
        faker35.internet = internet38;
        java.lang.String str41 = faker35.bothify("");
        com.github.javafaker.Name name42 = faker35.name;
        com.github.javafaker.Internet internet43 = faker35.internet();
        com.github.javafaker.Number number44 = faker35.number();
        faker21.number = number44;
        faker10.number = number44;
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3796967621823091d + "'", double7 == 0.3796967621823091d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-US" + "'", str13, "en-US");
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "x-lvariant-eng" + "'", str18, "x-lvariant-eng");
        org.junit.Assert.assertNotNull(code19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "fr_fr_HI!_eng" + "'", str33, "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(name42);
        org.junit.Assert.assertNull(internet43);
        org.junit.Assert.assertNotNull(number44);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.util.Random random1 = new java.util.Random((long) 10);
        long long2 = random1.nextLong();
        java.lang.Class<?> wildcardClass3 = random1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4972683369271453960L) + "'", long2 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.util.Random random1 = new java.util.Random((long) 'a');
        boolean boolean2 = random1.nextBoolean();
        java.util.stream.LongStream longStream4 = random1.longs((long) (byte) 10);
        int int5 = random1.nextInt();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-311101228) + "'", int5 == (-311101228));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        com.github.javafaker.Address address11 = faker0.address;
        com.github.javafaker.Business business12 = faker0.business;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(business12);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.util.Locale locale2 = new java.util.Locale("fr_fr_HI!_eng", "fr_fr");
        java.lang.String str4 = locale2.getExtension('x');
        java.lang.String str5 = locale2.getLanguage();
        org.junit.Assert.assertEquals(locale2.toString(), "fr_fr_hi!_eng_FR_FR");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr_fr_hi!_eng" + "'", str5, "fr_fr_hi!_eng");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.util.Locale locale2 = new java.util.Locale("Canada", "fr_FR");
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getVariant();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale4.getDisplayVariant(locale6);
        java.lang.String str8 = locale6.getCountry();
        java.lang.String str9 = locale6.getDisplayLanguage();
        java.util.Locale locale10 = java.util.Locale.JAPANESE;
        java.lang.String str11 = locale6.getDisplayScript(locale10);
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.lang.String str13 = locale6.getDisplayCountry(locale12);
        java.lang.String str14 = locale12.getDisplayLanguage();
        java.lang.String str15 = locale2.getDisplayVariant(locale12);
        java.util.Locale locale19 = new java.util.Locale("en-us (ENGLISH (UNITED KINGDOM))", "Japanese", "fr-FR");
        java.lang.String str20 = locale12.getDisplayCountry(locale19);
        java.util.Locale locale21 = locale19.stripExtensions();
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.lang.String str23 = locale22.toLanguageTag();
        java.lang.String str24 = locale19.getDisplayLanguage(locale22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = locale19.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "canada_FR_FR");
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FR" + "'", str8, "FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "French" + "'", str9, "French");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "France" + "'", str13, "France");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "French" + "'", str14, "French");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals(locale19.toString(), "en-us (english (united kingdom))_JAPANESE_fr-FR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en-us (english (united kingdom))_JAPANESE_fr-FR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "it" + "'", str23, "it");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "en-us (english (united kingdom))" + "'", str24, "en-us (english (united kingdom))");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        com.github.javafaker.Internet internet32 = null;
        faker29.internet = internet32;
        com.github.javafaker.Name name34 = faker29.name;
        com.github.javafaker.Code code35 = faker29.code;
        java.util.Random random36 = new java.util.Random();
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker(random36);
        com.github.javafaker.Lorem lorem38 = null;
        faker37.lorem = lorem38;
        com.github.javafaker.Color color40 = faker37.color;
        com.github.javafaker.Finance finance41 = faker37.finance();
        com.github.javafaker.Business business42 = faker37.business();
        faker29.business = business42;
        faker0.business = business42;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(finance15);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(company23);
        org.junit.Assert.assertNotNull(number24);
        org.junit.Assert.assertNotNull(fakeValuesService25);
        org.junit.Assert.assertNotNull(name34);
        org.junit.Assert.assertNotNull(code35);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(finance41);
        org.junit.Assert.assertNotNull(business42);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        boolean boolean4 = random1.nextBoolean();
        double double5 = random1.nextGaussian();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        int int8 = random1.nextInt(100);
        boolean boolean9 = random1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream12 = random1.ints((int) (byte) 10, (-1583863767));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.1435759059990083d) + "'", double5 == (-1.1435759059990083d));
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 82 + "'", int8 == 82);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Locale locale6 = locale3.stripExtensions();
        java.util.Locale locale9 = new java.util.Locale("hi!", "en-US");
        java.lang.String str10 = locale3.getDisplayName(locale9);
        java.util.Set<java.lang.Character> charSet11 = locale9.getExtensionKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!_EN-US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "French (France)" + "'", str10, "French (France)");
        org.junit.Assert.assertNotNull(charSet11);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale locale7 = new java.util.Locale("hi!");
        java.lang.String str8 = locale7.getVariant();
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleKeys();
        java.lang.String str10 = locale5.getDisplayLanguage(locale7);
        java.lang.String str11 = locale5.getLanguage();
        java.lang.String str12 = locale5.getLanguage();
        java.lang.String str13 = locale5.getDisplayCountry();
        java.lang.String str14 = locale0.getDisplayName(locale5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Korean" + "'", str14, "Korean");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.lang.String str3 = locale2.getDisplayVariant();
        java.util.Locale locale7 = new java.util.Locale("", "", "");
        java.util.Locale locale11 = new java.util.Locale("hi!", "en-US", "en-US");
        java.lang.String str12 = locale7.getDisplayName(locale11);
        java.lang.String str13 = locale2.getDisplayScript(locale11);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "hi!_EN-US_en-US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles();
        java.util.stream.IntStream intStream4 = random0.ints((long) 'x');
        float float5 = random0.nextFloat();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5355774577972108d + "'", double1 == 0.5355774577972108d);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(intStream4);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.62268317f + "'", float5 == 0.62268317f);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.util.Random random4 = new java.util.Random();
        double double5 = random4.nextDouble();
        java.util.stream.IntStream intStream8 = random4.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Code code10 = faker9.code();
        faker1.code = code10;
        java.util.Random random12 = new java.util.Random();
        double double13 = random12.nextDouble();
        java.util.stream.IntStream intStream16 = random12.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Code code18 = faker17.code();
        com.github.javafaker.Address address19 = faker17.address;
        java.util.Random random20 = new java.util.Random();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Lorem lorem22 = null;
        faker21.lorem = lorem22;
        com.github.javafaker.Internet internet24 = null;
        faker21.internet = internet24;
        java.lang.String str27 = faker21.bothify("");
        com.github.javafaker.Business business28 = faker21.business;
        faker17.business = business28;
        com.github.javafaker.Lorem lorem30 = faker17.lorem;
        com.github.javafaker.DateAndTime dateAndTime31 = faker17.date();
        faker1.dateAndTime = dateAndTime31;
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7291225796087263d + "'", double5 == 0.7291225796087263d);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(code10);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.7200857600055263d + "'", double13 == 0.7200857600055263d);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(code18);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(business28);
        org.junit.Assert.assertNotNull(lorem30);
        org.junit.Assert.assertNotNull(dateAndTime31);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.util.Random random1 = new java.util.Random((long) ' ');
        int int3 = random1.nextInt(10);
        double double4 = random1.nextGaussian();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.35703205834598994d) + "'", double4 == (-0.35703205834598994d));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale3.getDisplayLanguage(locale5);
        java.util.Locale.Category category9 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale10 = java.util.Locale.getDefault(category9);
        java.util.Locale locale11 = java.util.Locale.getDefault(category9);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Random random13 = new java.util.Random();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale12, random13);
        java.lang.String str15 = locale12.getISO3Language();
        java.util.Locale.setDefault(category9, locale12);
        java.lang.String str17 = locale5.getDisplayLanguage(locale12);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category9.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fra" + "'", str15, "fra");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = new java.util.Locale("hi!", "en-US");
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.lang.String str6 = locale5.getDisplayScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_EN-US");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!_EN-US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.util.Locale locale2 = new java.util.Locale("hi!", "French");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_FRENCH");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.util.Random random1 = new java.util.Random((long) 90);
        java.util.stream.LongStream longStream2 = random1.longs();
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.util.Locale locale2 = new java.util.Locale("english (united kingdom)", "en-GB");
        org.junit.Assert.assertEquals(locale2.toString(), "english (united kingdom)_EN-GB");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.getDisplayScript();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Random random4 = new java.util.Random((long) 'a');
        boolean boolean5 = random4.nextBoolean();
        java.util.stream.LongStream longStream7 = random4.longs((long) (byte) 10);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ja");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fr_fr_hi!_eng");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fr_fr_hi!_eng");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale3.getDisplayCountry(locale9);
        java.util.Set<java.lang.String> strSet11 = locale9.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fran\347ais" + "'", str6, "fran\347ais");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "France" + "'", str10, "France");
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str4 = locale3.getScript();
        java.lang.String str5 = locale3.getISO3Language();
        java.util.Locale.setDefault(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.util.Random random1 = new java.util.Random(6785130368950820155L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.PhoneNumber phoneNumber3 = faker2.phoneNumber;
        org.junit.Assert.assertNotNull(phoneNumber3);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.util.Locale locale6 = new java.util.Locale("hi!");
        java.lang.String str7 = locale6.getVariant();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.lang.String str9 = locale4.getDisplayLanguage(locale6);
        java.lang.String str10 = locale4.getLanguage();
        java.lang.String str11 = locale0.getDisplayCountry(locale4);
        java.lang.String str12 = locale4.getVariant();
        java.lang.String str13 = locale4.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = new java.util.Locale("en-US", "en");
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale8 = new java.util.Locale("fr_FR");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale.Category category10 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale11 = java.util.Locale.getDefault(category10);
        java.util.Locale locale12 = java.util.Locale.getDefault(category10);
        java.util.Locale locale15 = new java.util.Locale("en-US", "en");
        java.util.Locale.setDefault(category10, locale15);
        java.util.Locale locale18 = new java.util.Locale("fr_FR");
        java.util.Locale.setDefault(category10, locale18);
        java.util.Locale locale20 = java.util.Locale.getDefault(category10);
        java.lang.String str21 = locale8.getDisplayCountry(locale20);
        java.lang.String str22 = locale8.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "en-us_EN");
        org.junit.Assert.assertEquals(locale8.toString(), "fr_fr");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category10.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_fr");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_fr");
        org.junit.Assert.assertEquals(locale15.toString(), "en-us_EN");
        org.junit.Assert.assertEquals(locale18.toString(), "fr_fr");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "fr_fr" + "'", str22, "fr_fr");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale7 = new java.util.Locale("hi!", "en-US", "en-US");
        java.lang.String str8 = locale3.getDisplayName(locale7);
        java.lang.String str9 = locale3.getDisplayCountry();
        java.lang.String str11 = locale3.getExtension('u');
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "hi!_EN-US_en-US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale locale8 = builder3.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Business business8 = faker1.business();
        com.github.javafaker.Lorem lorem9 = faker1.lorem();
        com.github.javafaker.Options options10 = faker1.options;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNull(lorem9);
        org.junit.Assert.assertNotNull(options10);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number8 = faker7.number;
        com.github.javafaker.Business business9 = faker7.business();
        java.util.Random random10 = new java.util.Random();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Lorem lorem12 = null;
        faker11.lorem = lorem12;
        com.github.javafaker.Color color14 = faker11.color;
        com.github.javafaker.Finance finance15 = faker11.finance();
        com.github.javafaker.Address address16 = faker11.address;
        faker7.address = address16;
        java.util.Random random18 = new java.util.Random();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.Lorem lorem20 = null;
        faker19.lorem = lorem20;
        java.util.Random random22 = new java.util.Random();
        double double23 = random22.nextDouble();
        java.util.stream.IntStream intStream26 = random22.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.Code code28 = faker27.code();
        faker19.code = code28;
        com.github.javafaker.Lorem lorem30 = faker19.lorem();
        java.util.Random random31 = new java.util.Random();
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        com.github.javafaker.Lorem lorem33 = null;
        faker32.lorem = lorem33;
        com.github.javafaker.PhoneNumber phoneNumber35 = faker32.phoneNumber;
        faker19.phoneNumber = phoneNumber35;
        com.github.javafaker.PhoneNumber phoneNumber37 = faker19.phoneNumber();
        com.github.javafaker.Code code38 = faker19.code;
        faker7.code = code38;
        faker5.code = code38;
        com.github.javafaker.Number number41 = faker5.number;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5968644947228448d + "'", double1 == 0.5968644947228448d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(finance15);
        org.junit.Assert.assertNotNull(address16);
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6270166808073145d + "'", double23 == 0.6270166808073145d);
        org.junit.Assert.assertNotNull(intStream26);
        org.junit.Assert.assertNotNull(code28);
        org.junit.Assert.assertNull(lorem30);
        org.junit.Assert.assertNotNull(phoneNumber35);
        org.junit.Assert.assertNotNull(phoneNumber37);
        org.junit.Assert.assertNotNull(code38);
        org.junit.Assert.assertNotNull(number41);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Name name8 = faker1.name;
        com.github.javafaker.Internet internet9 = faker1.internet();
        com.github.javafaker.Address address10 = faker1.address();
        com.github.javafaker.Business business11 = faker1.business;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNull(internet9);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(business11);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.PhoneNumber phoneNumber6 = faker1.phoneNumber;
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem9 = null;
        faker8.lorem = lorem9;
        com.github.javafaker.Color color11 = faker8.color;
        com.github.javafaker.Finance finance12 = faker8.finance();
        com.github.javafaker.PhoneNumber phoneNumber13 = faker8.phoneNumber();
        faker1.phoneNumber = phoneNumber13;
        java.util.Random random15 = new java.util.Random();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.Lorem lorem17 = null;
        faker16.lorem = lorem17;
        com.github.javafaker.Internet internet19 = null;
        faker16.internet = internet19;
        java.util.Random random21 = new java.util.Random();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Lorem lorem23 = null;
        faker22.lorem = lorem23;
        java.lang.String str26 = faker22.numerify("");
        com.github.javafaker.PhoneNumber phoneNumber27 = faker22.phoneNumber;
        faker16.phoneNumber = phoneNumber27;
        com.github.javafaker.Options options29 = faker16.options();
        java.util.Random random30 = new java.util.Random();
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(random30);
        com.github.javafaker.Lorem lorem32 = null;
        faker31.lorem = lorem32;
        java.lang.String str35 = faker31.numerify("hi!");
        com.github.javafaker.Color color36 = faker31.color;
        faker16.color = color36;
        faker1.color = color36;
        java.lang.String str40 = faker1.numerify("fran\347ais (france) (X-LVARIANT-ENG)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(phoneNumber13);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(phoneNumber27);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "fran\347ais (france) (X-LVARIANT-ENG)" + "'", str40, "fran\347ais (france) (X-LVARIANT-ENG)");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Book book5 = faker4.book();
        com.github.javafaker.Company company6 = faker4.company;
        com.github.javafaker.Lorem lorem7 = faker4.lorem;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41500654193728603d + "'", double1 == 0.41500654193728603d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Color color6 = faker1.color;
        com.github.javafaker.Business business7 = faker1.business();
        java.util.Random random8 = new java.util.Random();
        double double9 = random8.nextDouble();
        int int11 = random8.nextInt(1);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Internet internet13 = faker12.internet();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        java.util.Random random15 = new java.util.Random();
        double double16 = random15.nextDouble();
        int int18 = random15.nextInt(1);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.Book book20 = faker19.book();
        faker14.book = book20;
        com.github.javafaker.Address address22 = faker14.address;
        faker12.address = address22;
        faker1.address = address22;
        com.github.javafaker.Name name25 = faker1.name;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(business7);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.727932082270973d + "'", double9 == 0.727932082270973d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(internet13);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.300641700673255d + "'", double16 == 0.300641700673255d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(book20);
        org.junit.Assert.assertNotNull(address22);
        org.junit.Assert.assertNotNull(name25);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.clear();
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("Italian");
        java.util.Locale.Builder builder13 = builder8.setExtension('u', "jpn");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder8.setUnicodeLocaleKeyword("twi", "Korean");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: twi [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fr_FR_FR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fr_fr_fr");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale3.getDisplayLanguage(locale5);
        java.lang.String str9 = locale3.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet10 = locale3.getExtensionKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charSet10);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles((long) (byte) 100, 0.5819794877433786d, (double) 'x');
        java.util.stream.IntStream intStream6 = random1.ints();
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker2.fakeValuesService;
        org.junit.Assert.assertNotNull(fakeValuesService3);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Internet internet5 = faker4.internet();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        java.util.Random random7 = new java.util.Random();
        double double8 = random7.nextDouble();
        int int10 = random7.nextInt(1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Book book12 = faker11.book();
        faker6.book = book12;
        com.github.javafaker.Address address14 = faker6.address;
        faker4.address = address14;
        java.lang.String str17 = faker4.letterify("ja");
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27724781229709083d + "'", double1 == 0.27724781229709083d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(internet5);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5368394821763447d + "'", double8 == 0.5368394821763447d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(book12);
        org.junit.Assert.assertNotNull(address14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ja" + "'", str17, "ja");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str2 = locale0.getDisplayVariant();
        java.util.Locale locale3 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.util.Locale locale3 = new java.util.Locale("france", "italian", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "france_ITALIAN_hi!");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        double double2 = random1.nextDouble();
        int int4 = random1.nextInt(1);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Book book6 = faker5.book();
        faker0.book = book6;
        com.github.javafaker.Address address8 = faker0.address;
        com.github.javafaker.Number number9 = faker0.number;
        java.util.Random random10 = new java.util.Random();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Lorem lorem12 = null;
        faker11.lorem = lorem12;
        com.github.javafaker.Internet internet14 = null;
        faker11.internet = internet14;
        java.lang.String str17 = faker11.bothify("");
        com.github.javafaker.Name name18 = faker11.name;
        com.github.javafaker.Color color19 = faker11.color;
        com.github.javafaker.Color color20 = faker11.color;
        faker0.color = color20;
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5285451850439322d + "'", double2 == 0.5285451850439322d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(address8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random1.doubles((double) (short) 0, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream13 = random1.ints((long) (-2092345703), 959194146, 1891812663);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.util.Locale locale3 = new java.util.Locale("it_IT", "fran\347ais (France)", "fr_FR");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getUnicodeLocaleType("fran\347ais (france) (X-LVARIANT-ENG)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: franc?ais (france) (X-LVARIANT-ENG)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "it_it_FRAN\347AIS (FRANCE)_fr_FR");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-US");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("en");
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange3 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap9);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList16);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strMap19);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList26);
        java.util.Locale locale32 = new java.util.Locale("", "", "");
        java.util.Set<java.lang.String> strSet33 = locale32.getUnicodeLocaleKeys();
        java.lang.String str34 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strSet33);
        java.util.Locale locale38 = new java.util.Locale("FR", "TW", "German");
        java.util.Locale locale40 = new java.util.Locale("hi!");
        java.lang.String str41 = locale40.getVariant();
        java.util.Locale locale42 = java.util.Locale.FRANCE;
        java.lang.String str43 = locale40.getDisplayVariant(locale42);
        java.lang.String str44 = locale42.toLanguageTag();
        java.lang.String str45 = locale38.getDisplayLanguage(locale42);
        java.util.Set<java.lang.String> strSet46 = locale38.getUnicodeLocaleAttributes();
        java.util.Locale locale47 = java.util.Locale.FRANCE;
        java.util.Random random48 = new java.util.Random();
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker(locale47, random48);
        java.util.Locale locale50 = java.util.Locale.GERMAN;
        java.util.Locale locale54 = new java.util.Locale("", "", "");
        java.util.Locale locale56 = new java.util.Locale("hi!");
        java.lang.String str57 = locale56.getVariant();
        java.util.Set<java.lang.String> strSet58 = locale56.getUnicodeLocaleKeys();
        java.lang.String str59 = locale54.getDisplayLanguage(locale56);
        java.lang.String str60 = locale54.getLanguage();
        java.lang.String str61 = locale50.getDisplayCountry(locale54);
        java.util.Locale locale62 = java.util.Locale.GERMAN;
        java.util.Locale locale66 = new java.util.Locale("", "", "");
        java.util.Locale locale68 = new java.util.Locale("hi!");
        java.lang.String str69 = locale68.getVariant();
        java.util.Set<java.lang.String> strSet70 = locale68.getUnicodeLocaleKeys();
        java.lang.String str71 = locale66.getDisplayLanguage(locale68);
        java.lang.String str72 = locale66.getLanguage();
        java.lang.String str73 = locale62.getDisplayCountry(locale66);
        java.lang.String str74 = locale62.getDisplayVariant();
        java.lang.String str75 = locale62.getISO3Language();
        java.util.Locale locale76 = java.util.Locale.JAPANESE;
        java.lang.String str77 = locale76.getDisplayScript();
        java.util.Locale locale78 = java.util.Locale.ITALY;
        java.lang.String str79 = locale78.getDisplayLanguage();
        java.util.Locale locale81 = new java.util.Locale("hi!");
        java.lang.String str82 = locale81.getVariant();
        java.util.Locale locale83 = java.util.Locale.FRANCE;
        java.lang.String str84 = locale81.getDisplayVariant(locale83);
        com.github.javafaker.Faker faker85 = new com.github.javafaker.Faker(locale83);
        java.lang.String str86 = locale83.toLanguageTag();
        java.util.Locale locale90 = new java.util.Locale("Franz\366sisch", "japonais", "en_US");
        java.util.Locale[] localeArray91 = new java.util.Locale[] { locale38, locale47, locale50, locale62, locale76, locale78, locale83, locale90 };
        java.util.ArrayList<java.util.Locale> localeList92 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList92, localeArray91);
        java.util.Locale locale94 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList92);
        java.util.Locale locale95 = java.util.Locale.lookup(languageRangeList20, (java.util.Collection<java.util.Locale>) localeList92);
        java.util.List<java.util.Locale> localeList96 = java.util.Locale.filter(languageRangeList10, (java.util.Collection<java.util.Locale>) localeList92);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals(locale38.toString(), "fr_TW_German");
        org.junit.Assert.assertEquals(locale40.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "fr-FR" + "'", str44, "fr-FR");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "fran\347ais" + "'", str45, "fran\347ais");
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "de");
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals(locale56.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(strSet58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "de");
        org.junit.Assert.assertEquals(locale66.toString(), "");
        org.junit.Assert.assertEquals(locale68.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(strSet70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "deu" + "'", str75, "deu");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Italian" + "'", str79, "Italian");
        org.junit.Assert.assertEquals(locale81.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "fr-FR" + "'", str86, "fr-FR");
        org.junit.Assert.assertEquals(locale90.toString(), "franz\366sisch_JAPONAIS_en_US");
        org.junit.Assert.assertNotNull(localeArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNull(locale94);
        org.junit.Assert.assertNull(locale95);
        org.junit.Assert.assertNotNull(localeList96);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.util.Random random1 = new java.util.Random((long) 'x');
        java.util.stream.LongStream longStream5 = random1.longs(0L, (long) (short) 10, (long) 'u');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream9 = random1.ints((-5067015723494352422L), 0, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.IntStream intStream4 = random1.ints((int) (byte) 1, (int) 'x');
        java.util.stream.IntStream intStream7 = random1.ints((-1646791838), 33);
        java.util.stream.LongStream longStream8 = random1.longs();
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Book book5 = faker0.book();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.dateAndTime;
        com.github.javafaker.Finance finance7 = faker0.finance();
        com.github.javafaker.Finance finance8 = faker0.finance;
        com.github.javafaker.Business business9 = faker0.business();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        boolean boolean7 = random1.nextBoolean();
        java.util.stream.IntStream intStream8 = random1.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream12 = random1.ints(0L, 1913984760, 349248668);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem3 = null;
        faker2.lorem = lorem3;
        com.github.javafaker.PhoneNumber phoneNumber5 = faker2.phoneNumber;
        faker0.phoneNumber = phoneNumber5;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        com.github.javafaker.PhoneNumber phoneNumber12 = faker9.phoneNumber;
        faker7.phoneNumber = phoneNumber12;
        com.github.javafaker.Options options14 = faker7.options;
        faker0.options = options14;
        java.util.Random random16 = new java.util.Random();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Lorem lorem18 = null;
        faker17.lorem = lorem18;
        java.lang.String str21 = faker17.numerify("");
        com.github.javafaker.Company company22 = faker17.company;
        com.github.javafaker.Number number23 = faker17.number();
        faker0.number = number23;
        java.util.Random random25 = new java.util.Random();
        double double26 = random25.nextDouble();
        int int28 = random25.nextInt(1);
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random25);
        com.github.javafaker.Code code30 = faker29.code();
        java.util.Random random31 = new java.util.Random();
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        com.github.javafaker.Lorem lorem33 = null;
        faker32.lorem = lorem33;
        com.github.javafaker.Internet internet35 = null;
        faker32.internet = internet35;
        com.github.javafaker.Name name37 = faker32.name;
        com.github.javafaker.Code code38 = faker32.code;
        com.github.javafaker.Business business39 = faker32.business;
        faker29.business = business39;
        java.util.Random random41 = new java.util.Random();
        double double42 = random41.nextDouble();
        int int44 = random41.nextInt(1);
        com.github.javafaker.Faker faker45 = new com.github.javafaker.Faker(random41);
        com.github.javafaker.service.RandomService randomService46 = faker45.randomService;
        faker29.randomService = randomService46;
        faker0.randomService = randomService46;
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(company22);
        org.junit.Assert.assertNotNull(number23);
// flaky:         org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.4965806201583487d + "'", double26 == 0.4965806201583487d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(code30);
        org.junit.Assert.assertNotNull(name37);
        org.junit.Assert.assertNotNull(code38);
        org.junit.Assert.assertNotNull(business39);
// flaky:         org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.8848537155662873d + "'", double42 == 0.8848537155662873d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(randomService46);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem3 = null;
        faker2.lorem = lorem3;
        com.github.javafaker.PhoneNumber phoneNumber5 = faker2.phoneNumber;
        faker0.phoneNumber = phoneNumber5;
        com.github.javafaker.Options options7 = faker0.options;
        com.github.javafaker.Options options8 = faker0.options;
        com.github.javafaker.Code code9 = faker0.code;
        com.github.javafaker.Code code10 = faker0.code;
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNotNull(code10);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.Company company6 = faker1.company;
        com.github.javafaker.Number number7 = faker1.number();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker1.phoneNumber;
        com.github.javafaker.Color color9 = faker1.color;
        com.github.javafaker.Number number10 = faker1.number;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(number10);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale11 = new java.util.Locale("", "", "");
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap14);
        java.util.Locale locale19 = new java.util.Locale("", "", "");
        java.util.Locale locale21 = new java.util.Locale("hi!");
        java.lang.String str22 = locale21.getVariant();
        java.util.Set<java.lang.String> strSet23 = locale21.getUnicodeLocaleKeys();
        java.lang.String str24 = locale19.getDisplayLanguage(locale21);
        java.lang.String str25 = locale19.getLanguage();
        java.util.Set<java.lang.String> strSet26 = locale19.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet26);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap28 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap28);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.parse("eng");
        java.util.Locale.LanguageRange languageRange33 = new java.util.Locale.LanguageRange("en-US");
        java.util.Locale.LanguageRange languageRange35 = new java.util.Locale.LanguageRange("en");
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] { languageRange33, languageRange35 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap39 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, strMap39);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strList46);
        java.util.Locale locale52 = new java.util.Locale("", "", "");
        java.util.Set<java.lang.String> strSet53 = locale52.getUnicodeLocaleKeys();
        java.lang.String str54 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strSet53);
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strSet53);
        java.lang.String str56 = java.util.Locale.lookupTag(languageRangeList31, (java.util.Collection<java.lang.String>) strSet53);
        java.lang.String str57 = java.util.Locale.lookupTag(languageRangeList29, (java.util.Collection<java.lang.String>) strSet53);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap58 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList29, strMap58);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals(locale21.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertNotNull(languageRangeList31);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(languageRangeList40);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(languageRangeList59);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.util.Locale locale1 = new java.util.Locale("x-lvariant-eng");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder4.setScript("");
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Locale locale13 = new java.util.Locale("fr_FR", "hi!", "eng");
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale8.getDisplayVariant(locale13);
        java.lang.String str16 = locale2.getDisplayVariant(locale8);
        org.junit.Assert.assertEquals(locale1.toString(), "x-lvariant-eng");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "x-lvariant-eng");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "x-lvariant-eng" + "'", str3, "x-lvariant-eng");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale13.toString(), "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "x-lvariant-eng" + "'", str14, "x-lvariant-eng");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Business business8 = faker1.business;
        com.github.javafaker.Code code9 = faker1.code();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Random random3 = new java.util.Random();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.Code code5 = faker4.code;
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Color color10 = faker7.color;
        com.github.javafaker.Finance finance11 = faker7.finance();
        com.github.javafaker.Address address12 = faker7.address;
        com.github.javafaker.Company company13 = faker7.company;
        faker4.company = company13;
        com.github.javafaker.Business business15 = faker4.business();
        com.github.javafaker.Color color16 = faker4.color();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-GB" + "'", str1, "en-GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (United Kingdom)" + "'", str2, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(address12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(business15);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList13);
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList13);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.parse("eng");
        java.util.Locale.LanguageRange languageRange20 = new java.util.Locale.LanguageRange("en-US");
        java.util.Locale.LanguageRange languageRange22 = new java.util.Locale.LanguageRange("en");
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] { languageRange20, languageRange22 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, strMap26);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList33);
        java.util.Locale locale39 = new java.util.Locale("", "", "");
        java.util.Set<java.lang.String> strSet40 = locale39.getUnicodeLocaleKeys();
        java.lang.String str41 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strSet40);
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.lang.String>) strSet40);
        java.lang.String str43 = java.util.Locale.lookupTag(languageRangeList18, (java.util.Collection<java.lang.String>) strSet40);
        java.lang.String str44 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet40);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.util.Locale locale2 = new java.util.Locale("it_IT", "tw");
        org.junit.Assert.assertEquals(locale2.toString(), "it_it_TW");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.util.Random random1 = new java.util.Random((long) (-1780303639));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fra (FR-FR)", (-0.19673982326898978d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-0.19673982326898978");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.util.Locale locale2 = new java.util.Locale("ja", "hi! (Taiwan)");
        org.junit.Assert.assertEquals(locale2.toString(), "ja_HI! (TAIWAN)");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = locale3.getVariant();
        java.util.Random random7 = new java.util.Random((-5067015723494352422L));
        java.util.stream.LongStream longStream9 = random7.longs((long) 90);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random7);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", 0.6171989232548247d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.Address address7 = faker5.address;
        com.github.javafaker.DateAndTime dateAndTime8 = faker5.date();
        java.util.Random random9 = new java.util.Random();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Lorem lorem11 = null;
        faker10.lorem = lorem11;
        java.lang.String str14 = faker10.numerify("");
        com.github.javafaker.Company company15 = faker10.company;
        com.github.javafaker.Number number16 = faker10.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService17 = faker10.fakeValuesService;
        com.github.javafaker.Book book18 = faker10.book;
        faker5.book = book18;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8170536779309551d + "'", double1 == 0.8170536779309551d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(company15);
        org.junit.Assert.assertNotNull(number16);
        org.junit.Assert.assertNotNull(fakeValuesService17);
        org.junit.Assert.assertNotNull(book18);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        com.github.javafaker.Book book7 = faker1.book;
        java.util.Random random8 = new java.util.Random();
        double double9 = random8.nextDouble();
        java.util.stream.IntStream intStream12 = random8.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Code code14 = faker13.code();
        com.github.javafaker.Address address15 = faker13.address;
        com.github.javafaker.DateAndTime dateAndTime16 = faker13.date();
        java.lang.String str18 = faker13.bothify("fran\347ais");
        com.github.javafaker.DateAndTime dateAndTime19 = faker13.dateAndTime;
        com.github.javafaker.Internet internet20 = faker13.internet;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number22 = faker21.number;
        com.github.javafaker.Number number23 = faker21.number();
        java.lang.String str25 = faker21.bothify("en-GB");
        com.github.javafaker.Name name26 = faker21.name();
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code28 = null;
        faker27.code = code28;
        com.github.javafaker.Lorem lorem30 = faker27.lorem();
        faker21.lorem = lorem30;
        com.github.javafaker.Business business32 = faker21.business();
        com.github.javafaker.Company company33 = faker21.company;
        com.github.javafaker.Internet internet34 = faker21.internet();
        faker13.internet = internet34;
        faker1.internet = internet34;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(lorem6);
        org.junit.Assert.assertNotNull(book7);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.37217915778374444d + "'", double9 == 0.37217915778374444d);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(code14);
        org.junit.Assert.assertNotNull(address15);
        org.junit.Assert.assertNotNull(dateAndTime16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fran\347ais" + "'", str18, "fran\347ais");
        org.junit.Assert.assertNotNull(dateAndTime19);
        org.junit.Assert.assertNotNull(internet20);
        org.junit.Assert.assertNotNull(number22);
        org.junit.Assert.assertNotNull(number23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en-GB" + "'", str25, "en-GB");
        org.junit.Assert.assertNotNull(name26);
        org.junit.Assert.assertNotNull(lorem30);
        org.junit.Assert.assertNotNull(business32);
        org.junit.Assert.assertNotNull(company33);
        org.junit.Assert.assertNotNull(internet34);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale7 = new java.util.Locale("hi!", "en-US", "en-US");
        java.lang.String str8 = locale3.getDisplayName(locale7);
        java.lang.String str9 = locale7.getCountry();
        java.lang.String str10 = locale7.getScript();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "hi!_EN-US_en-US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EN-US" + "'", str9, "EN-US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr_CA" + "'", str2, "fr_CA");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number7 = faker6.number;
        com.github.javafaker.Number number8 = faker6.number();
        java.lang.String str10 = faker6.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = faker6.fakeValuesService;
        java.util.Random random12 = new java.util.Random();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Lorem lorem14 = null;
        faker13.lorem = lorem14;
        com.github.javafaker.PhoneNumber phoneNumber16 = faker13.phoneNumber;
        com.github.javafaker.Color color17 = faker13.color();
        faker6.color = color17;
        faker5.color = color17;
        java.util.Random random21 = new java.util.Random(6785130368950820155L);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Code code23 = faker22.code;
        com.github.javafaker.PhoneNumber phoneNumber24 = faker22.phoneNumber();
        com.github.javafaker.Address address25 = faker22.address();
        faker5.address = address25;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7314182218333145d + "'", double1 == 0.7314182218333145d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-GB" + "'", str10, "en-GB");
        org.junit.Assert.assertNotNull(fakeValuesService11);
        org.junit.Assert.assertNotNull(phoneNumber16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(code23);
        org.junit.Assert.assertNotNull(phoneNumber24);
        org.junit.Assert.assertNotNull(address25);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.util.Random random1 = new java.util.Random(6785130368950820155L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Code code3 = faker2.code;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker2.phoneNumber();
        com.github.javafaker.Address address5 = faker2.address();
        com.github.javafaker.Color color6 = faker2.color();
        com.github.javafaker.Code code7 = faker2.code;
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.util.Random random1 = new java.util.Random(6785130368950820155L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Code code3 = faker2.code;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker2.phoneNumber();
        com.github.javafaker.Name name5 = faker2.name();
        com.github.javafaker.DateAndTime dateAndTime6 = faker2.date();
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3, random4);
        java.lang.String str6 = locale3.getISO3Language();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Set<java.lang.String> strSet8 = locale3.getUnicodeLocaleKeys();
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Random random10 = new java.util.Random();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale9, random10);
        java.util.stream.DoubleStream doubleStream12 = random10.doubles();
        java.util.stream.IntStream intStream15 = random10.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream18 = random10.doubles((double) (short) 0, 10.0d);
        java.util.stream.LongStream longStream19 = random10.longs();
        boolean boolean20 = random10.nextBoolean();
        java.util.stream.DoubleStream doubleStream21 = random10.doubles();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale3, random10);
        int int23 = random10.nextInt();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_fr");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_fr");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra" + "'", str6, "fra");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(longStream19);
// flaky:         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleStream21);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 765121682 + "'", int23 == 765121682);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        float float11 = random6.nextFloat();
        int int12 = random6.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random6.doubles();
        java.util.stream.LongStream longStream15 = random6.longs((long) 10);
        long long16 = random6.nextLong();
        java.util.stream.LongStream longStream18 = random6.longs((long) 33);
        java.util.stream.IntStream intStream20 = random6.ints((long) 'x');
        java.util.stream.LongStream longStream22 = random6.longs((long) 79);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.18776315142438493d + "'", double7 == 0.18776315142438493d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.14833277f + "'", float11 == 0.14833277f);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-647885168) + "'", int12 == (-647885168));
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 8470782857853326036L + "'", long16 == 8470782857853326036L);
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertNotNull(longStream22);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.util.Random random1 = new java.util.Random((long) 844792170);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.util.Locale locale2 = new java.util.Locale("fran\347ais (France)", "hi!");
        java.lang.String str3 = locale2.getDisplayName();
        org.junit.Assert.assertEquals(locale2.toString(), "fran\347ais (france)_HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (france) (HI!)" + "'", str3, "fran\347ais (france) (HI!)");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Color color10 = faker7.color;
        faker1.color = color10;
        java.lang.String str13 = faker1.bothify("fr_fr_HI!_eng");
        java.lang.String str15 = faker1.numerify("eng");
        java.util.Random random16 = new java.util.Random();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Lorem lorem18 = null;
        faker17.lorem = lorem18;
        com.github.javafaker.Internet internet20 = null;
        faker17.internet = internet20;
        java.lang.String str23 = faker17.bothify("");
        com.github.javafaker.Code code24 = null;
        faker17.code = code24;
        com.github.javafaker.DateAndTime dateAndTime26 = faker17.date();
        faker1.dateAndTime = dateAndTime26;
        java.util.Random random28 = new java.util.Random();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Lorem lorem30 = null;
        faker29.lorem = lorem30;
        java.lang.String str33 = faker29.numerify("hi!");
        com.github.javafaker.Lorem lorem34 = faker29.lorem;
        java.util.Random random35 = new java.util.Random();
        double double36 = random35.nextDouble();
        int int38 = random35.nextInt(1);
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(random35);
        com.github.javafaker.service.RandomService randomService40 = faker39.randomService;
        faker29.randomService = randomService40;
        faker1.randomService = randomService40;
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number44 = faker43.number;
        com.github.javafaker.Business business45 = faker43.business();
        java.util.Random random46 = new java.util.Random();
        com.github.javafaker.Faker faker47 = new com.github.javafaker.Faker(random46);
        com.github.javafaker.Lorem lorem48 = null;
        faker47.lorem = lorem48;
        com.github.javafaker.Color color50 = faker47.color;
        com.github.javafaker.Finance finance51 = faker47.finance();
        com.github.javafaker.Address address52 = faker47.address;
        faker43.address = address52;
        faker1.address = address52;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fr_fr_HI!_eng" + "'", str13, "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "eng" + "'", str15, "eng");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(dateAndTime26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(lorem34);
// flaky:         org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.27514864649527415d + "'", double36 == 0.27514864649527415d);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(randomService40);
        org.junit.Assert.assertNotNull(number44);
        org.junit.Assert.assertNotNull(business45);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(finance51);
        org.junit.Assert.assertNotNull(address52);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.util.Locale locale3 = new java.util.Locale("EN-US", "fr-fr", "EN-US");
        java.lang.String str4 = locale3.getVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "en-us_FR-FR_EN-US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EN-US" + "'", str4, "EN-US");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en", 0.46560633866972545d);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] { languageRange2 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList11);
        java.lang.String str14 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap15);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(languageRangeList16);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.clear();
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("Italian");
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getVariant();
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = locale12.getDisplayVariant(locale14);
        java.lang.String str16 = locale14.getCountry();
        java.lang.String str17 = locale14.getDisplayLanguage();
        java.util.Locale locale18 = java.util.Locale.JAPANESE;
        java.lang.String str19 = locale14.getDisplayScript(locale18);
        java.util.Random random20 = new java.util.Random();
        double double21 = random20.nextDouble();
        int int23 = random20.nextInt(1);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random20);
        double double25 = random20.nextDouble();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale14, random20);
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale14);
        java.util.Locale.Builder builder28 = builder10.setLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder31 = builder28.setUnicodeLocaleKeyword("fr_fr", "english (united kingdom)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: fr_fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FR" + "'", str16, "FR");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "French" + "'", str17, "French");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
// flaky:         org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.46601508157317173d + "'", double21 == 0.46601508157317173d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9146170118713025d + "'", double25 == 0.9146170118713025d);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("france");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList9);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<java.lang.String> strList19 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList17);
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList25);
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList25);
        java.util.Locale.FilteringMode filteringMode29 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList28, filteringMode29);
        java.lang.String str31 = java.util.Locale.lookupTag(languageRangeList3, (java.util.Collection<java.lang.String>) strList28);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + filteringMode29 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode29.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.PhoneNumber phoneNumber6 = faker1.phoneNumber;
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem9 = null;
        faker8.lorem = lorem9;
        com.github.javafaker.Color color11 = faker8.color;
        com.github.javafaker.Finance finance12 = faker8.finance();
        com.github.javafaker.PhoneNumber phoneNumber13 = faker8.phoneNumber();
        faker1.phoneNumber = phoneNumber13;
        com.github.javafaker.Options options15 = faker1.options;
        java.lang.String str17 = faker1.bothify("ENGLISH (UNITED KINGDOM)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(phoneNumber13);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ENGLISH (UNITED KINGDOM)" + "'", str17, "ENGLISH (UNITED KINGDOM)");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Locale locale6 = locale3.stripExtensions();
        java.lang.String str7 = locale6.getCountry();
        java.util.Random random9 = new java.util.Random(3309070468795520424L);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale6, random9);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random9);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FR" + "'", str7, "FR");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Number number4 = faker1.number();
        org.junit.Assert.assertNotNull(number4);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        com.github.javafaker.Company company12 = faker0.company();
        java.util.Random random13 = new java.util.Random();
        double double14 = random13.nextDouble();
        int int16 = random13.nextInt(1);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.service.RandomService randomService18 = faker17.randomService;
        faker0.randomService = randomService18;
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(randomService4);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en-GB" + "'", str9, "en-GB");
        org.junit.Assert.assertNotNull(fakeValuesService10);
        org.junit.Assert.assertNotNull(company12);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.10635943445557572d + "'", double14 == 0.10635943445557572d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(randomService18);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.util.Random random1 = new java.util.Random(6785130368950820155L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number4 = faker3.number;
        com.github.javafaker.Lorem lorem5 = faker3.lorem;
        faker2.lorem = lorem5;
        com.github.javafaker.Book book7 = faker2.book;
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(book7);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        double double5 = random0.nextDouble();
        double double6 = random0.nextDouble();
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        random0.nextBytes(byteArray10);
        java.util.stream.LongStream longStream12 = random0.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream16 = random0.doubles(3831662765844904176L, 0.9717327371889788d, 0.7342676417612181d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17293423542601372d + "'", double1 == 0.17293423542601372d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.29273680756685294d + "'", double5 == 0.29273680756685294d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5358692816736648d + "'", double6 == 0.5358692816736648d);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[13, 68, -41]");
        org.junit.Assert.assertNotNull(longStream12);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getVariant();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale4.getDisplayVariant(locale6);
        java.lang.String str8 = locale6.getCountry();
        java.lang.String str9 = locale6.getDisplayLanguage();
        java.util.Locale locale10 = java.util.Locale.JAPANESE;
        java.lang.String str11 = locale6.getDisplayScript(locale10);
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.lang.String str13 = locale6.getDisplayCountry(locale12);
        java.lang.String str14 = locale1.getDisplayScript(locale6);
        java.lang.String str15 = locale6.getISO3Language();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FR" + "'", str8, "FR");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "French" + "'", str9, "French");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "France" + "'", str13, "France");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fra" + "'", str15, "fra");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        com.github.javafaker.Code code25 = faker0.code();
        com.github.javafaker.Lorem lorem26 = faker0.lorem();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(phoneNumber23);
        org.junit.Assert.assertNotNull(code25);
        org.junit.Assert.assertNotNull(lorem26);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Book book5 = faker0.book();
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Internet internet10 = null;
        faker7.internet = internet10;
        java.lang.String str13 = faker7.bothify("");
        com.github.javafaker.Code code14 = null;
        faker7.code = code14;
        com.github.javafaker.DateAndTime dateAndTime16 = faker7.date();
        faker0.dateAndTime = dateAndTime16;
        com.github.javafaker.Lorem lorem18 = faker0.lorem();
        com.github.javafaker.Name name19 = faker0.name();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(dateAndTime16);
        org.junit.Assert.assertNotNull(lorem18);
        org.junit.Assert.assertNotNull(name19);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Locale locale6 = locale3.stripExtensions();
        java.lang.String str7 = locale6.getCountry();
        java.util.Random random9 = new java.util.Random(3309070468795520424L);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale6, random9);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random9);
        int int12 = random9.nextInt();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FR" + "'", str7, "FR");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1715861533) + "'", int12 == (-1715861533));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        com.github.javafaker.Business business11 = faker10.business;
        java.lang.String str13 = faker10.bothify("en-US");
        com.github.javafaker.Number number14 = faker10.number();
        java.lang.String str16 = faker10.numerify("");
        com.github.javafaker.Company company17 = faker10.company;
        com.github.javafaker.Finance finance18 = faker10.finance();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3223806207541694d + "'", double7 == 0.3223806207541694d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-US" + "'", str13, "en-US");
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(company17);
        org.junit.Assert.assertNotNull(finance18);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.IntStream intStream4 = random1.ints((int) (byte) 1, (int) 'x');
        java.util.stream.LongStream longStream5 = random1.longs();
        random1.setSeed((long) (byte) 0);
        float float8 = random1.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream12 = random1.doubles((long) 844792170, (double) 0.06469071f, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.73096776f + "'", float8 == 0.73096776f);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem9 = null;
        faker8.lorem = lorem9;
        com.github.javafaker.Internet internet11 = null;
        faker8.internet = internet11;
        java.lang.String str14 = faker8.bothify("");
        com.github.javafaker.Code code15 = null;
        faker8.code = code15;
        com.github.javafaker.DateAndTime dateAndTime17 = faker8.date();
        faker5.dateAndTime = dateAndTime17;
        java.util.Random random19 = new java.util.Random();
        double double20 = random19.nextDouble();
        java.util.stream.IntStream intStream23 = random19.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.Code code25 = faker24.code();
        com.github.javafaker.DateAndTime dateAndTime26 = faker24.date();
        faker5.dateAndTime = dateAndTime26;
        com.github.javafaker.Book book28 = faker5.book();
        com.github.javafaker.Internet internet29 = faker5.internet;
        com.github.javafaker.Business business30 = faker5.business;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8377360146903112d + "'", double1 == 0.8377360146903112d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(dateAndTime17);
// flaky:         org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.827485092811151d + "'", double20 == 0.827485092811151d);
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertNotNull(code25);
        org.junit.Assert.assertNotNull(dateAndTime26);
        org.junit.Assert.assertNotNull(book28);
        org.junit.Assert.assertNotNull(internet29);
        org.junit.Assert.assertNotNull(business30);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('x', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setLanguage("fr_fr_HI!_eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: fr_fr_HI!_eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Canada");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        java.util.Locale locale3 = new java.util.Locale("ENGLISH (UNITED KINGDOM)", "jpn", "Chinese (Taiwan)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for english (united kingdom)");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "english (united kingdom)_JPN_Chinese (Taiwan)");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.util.Random random1 = new java.util.Random(1L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.service.RandomService randomService3 = faker2.randomService;
        com.github.javafaker.Number number4 = faker2.number;
        com.github.javafaker.Finance finance5 = faker2.finance();
        com.github.javafaker.Name name6 = faker2.name();
        com.github.javafaker.Finance finance7 = faker2.finance();
        org.junit.Assert.assertNotNull(randomService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        java.util.stream.DoubleStream doubleStream6 = random0.doubles((long) (short) 10);
        boolean boolean7 = random0.nextBoolean();
        double double8 = random0.nextDouble();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8297802667973956d + "'", double1 == 0.8297802667973956d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.150114539243007d + "'", double8 == 0.150114539243007d);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Code code8 = null;
        faker1.code = code8;
        com.github.javafaker.Number number10 = faker1.number();
        com.github.javafaker.Finance finance11 = faker1.finance();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code13 = null;
        faker12.code = code13;
        com.github.javafaker.Lorem lorem15 = faker12.lorem();
        com.github.javafaker.service.RandomService randomService16 = faker12.randomService;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number18 = faker17.number;
        com.github.javafaker.Number number19 = faker17.number();
        java.lang.String str21 = faker17.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService22 = faker17.fakeValuesService;
        faker12.fakeValuesService = fakeValuesService22;
        faker1.fakeValuesService = fakeValuesService22;
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number26 = faker25.number;
        com.github.javafaker.Number number27 = faker25.number();
        com.github.javafaker.Options options28 = faker25.options;
        com.github.javafaker.Company company29 = faker25.company();
        faker1.company = company29;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(lorem15);
        org.junit.Assert.assertNotNull(randomService16);
        org.junit.Assert.assertNotNull(number18);
        org.junit.Assert.assertNotNull(number19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en-GB" + "'", str21, "en-GB");
        org.junit.Assert.assertNotNull(fakeValuesService22);
        org.junit.Assert.assertNotNull(number26);
        org.junit.Assert.assertNotNull(number27);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(company29);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.Company company6 = faker1.company;
        com.github.javafaker.Number number7 = faker1.number();
        java.lang.String str9 = faker1.numerify("Canada");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Canada" + "'", str9, "Canada");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("en-GB");
        java.util.Locale.Builder builder7 = builder0.setLanguageTag("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("fr_fr (HI!,eng)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fr_fr (HI!,eng) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.util.Locale locale2 = new java.util.Locale("eng", "x-lvariant-eng");
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "eng_X-LVARIANT-ENG");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "eng_X-LVARIANT-ENG");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Name name4 = faker1.name;
        com.github.javafaker.Book book5 = faker1.book;
        com.github.javafaker.Business business6 = faker1.business;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.dateAndTime;
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Book book5 = faker0.book();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.dateAndTime;
        com.github.javafaker.Finance finance7 = faker0.finance();
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        java.lang.String str13 = faker9.numerify("hi!");
        com.github.javafaker.Lorem lorem14 = faker9.lorem;
        java.util.Random random15 = new java.util.Random();
        double double16 = random15.nextDouble();
        int int18 = random15.nextInt(1);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.service.RandomService randomService20 = faker19.randomService;
        faker9.randomService = randomService20;
        com.github.javafaker.Finance finance22 = faker9.finance();
        com.github.javafaker.Options options23 = faker9.options;
        faker0.options = options23;
        java.util.Random random25 = new java.util.Random();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random25);
        com.github.javafaker.Lorem lorem27 = null;
        faker26.lorem = lorem27;
        com.github.javafaker.Internet internet29 = null;
        faker26.internet = internet29;
        java.lang.String str32 = faker26.bothify("");
        com.github.javafaker.Code code33 = null;
        faker26.code = code33;
        com.github.javafaker.Number number35 = faker26.number();
        com.github.javafaker.Finance finance36 = faker26.finance();
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code38 = null;
        faker37.code = code38;
        com.github.javafaker.Lorem lorem40 = faker37.lorem();
        com.github.javafaker.service.RandomService randomService41 = faker37.randomService;
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number43 = faker42.number;
        com.github.javafaker.Number number44 = faker42.number();
        java.lang.String str46 = faker42.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService47 = faker42.fakeValuesService;
        faker37.fakeValuesService = fakeValuesService47;
        faker26.fakeValuesService = fakeValuesService47;
        faker0.fakeValuesService = fakeValuesService47;
        com.github.javafaker.Color color51 = faker0.color();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(lorem14);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.7501324554738746d + "'", double16 == 0.7501324554738746d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(randomService20);
        org.junit.Assert.assertNotNull(finance22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(number35);
        org.junit.Assert.assertNotNull(finance36);
        org.junit.Assert.assertNotNull(lorem40);
        org.junit.Assert.assertNotNull(randomService41);
        org.junit.Assert.assertNotNull(number43);
        org.junit.Assert.assertNotNull(number44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "en-GB" + "'", str46, "en-GB");
        org.junit.Assert.assertNotNull(fakeValuesService47);
        org.junit.Assert.assertNotNull(color51);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        java.util.Locale locale4 = locale0.stripExtensions();
        java.lang.String str5 = locale4.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        java.util.Locale locale3 = new java.util.Locale("it_IT", "fra", "jpn");
        org.junit.Assert.assertEquals(locale3.toString(), "it_it_FRA_jpn");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = new java.util.Locale("en-us", "English (United Kingdom)");
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = new java.util.Locale("hi!");
        java.lang.String str7 = locale6.getVariant();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = locale6.getDisplayVariant(locale8);
        java.lang.String str10 = locale8.getCountry();
        java.util.Random random11 = new java.util.Random();
        double double12 = random11.nextDouble();
        int int14 = random11.nextInt(1);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale8, random11);
        float float16 = random11.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale3, random11);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: en-us_ENGLISH (UNITED KINGDOM) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale3.toString(), "en-us_ENGLISH (UNITED KINGDOM)");
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FR" + "'", str10, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.39040716027984845d + "'", double12 == 0.39040716027984845d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.76207274f + "'", float16 == 0.76207274f);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random1.doubles((double) (short) 0, 10.0d);
        java.util.stream.LongStream longStream10 = random1.longs();
        double double11 = random1.nextDouble();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.11393092012453143d + "'", double11 == 0.11393092012453143d);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr_fr (HI!,eng)", (-0.17583375681927463d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-0.17583375681927463");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.util.Locale locale2 = new java.util.Locale("Canada", "fr_FR");
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getVariant();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale4.getDisplayVariant(locale6);
        java.lang.String str8 = locale6.getCountry();
        java.lang.String str9 = locale6.getDisplayLanguage();
        java.util.Locale locale10 = java.util.Locale.JAPANESE;
        java.lang.String str11 = locale6.getDisplayScript(locale10);
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.lang.String str13 = locale6.getDisplayCountry(locale12);
        java.lang.String str14 = locale12.getDisplayLanguage();
        java.lang.String str15 = locale2.getDisplayVariant(locale12);
        java.util.Locale locale19 = new java.util.Locale("en-us (ENGLISH (UNITED KINGDOM))", "Japanese", "fr-FR");
        java.lang.String str20 = locale12.getDisplayCountry(locale19);
        java.util.Locale locale21 = locale19.stripExtensions();
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.lang.String str23 = locale22.toLanguageTag();
        java.lang.String str24 = locale19.getDisplayLanguage(locale22);
        java.lang.String str25 = locale22.getISO3Country();
        org.junit.Assert.assertEquals(locale2.toString(), "canada_FR_FR");
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FR" + "'", str8, "FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "French" + "'", str9, "French");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "France" + "'", str13, "France");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "French" + "'", str14, "French");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals(locale19.toString(), "en-us (english (united kingdom))_JAPANESE_fr-FR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en-us (english (united kingdom))_JAPANESE_fr-FR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "it" + "'", str23, "it");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "en-us (english (united kingdom))" + "'", str24, "en-us (english (united kingdom))");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Lorem lorem6 = null;
        faker5.lorem = lorem6;
        com.github.javafaker.Internet internet8 = null;
        faker5.internet = internet8;
        java.lang.String str11 = faker5.bothify("");
        com.github.javafaker.Code code12 = null;
        faker5.code = code12;
        com.github.javafaker.Number number14 = faker5.number();
        faker1.number = number14;
        com.github.javafaker.Color color16 = faker1.color;
        java.lang.String str18 = faker1.letterify("en-us (ENGLISH (UNITED KINGDOM))");
        com.github.javafaker.DateAndTime dateAndTime19 = faker1.date();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en-us (ENGLISH (UNITED KINGDOM))" + "'", str18, "en-us (ENGLISH (UNITED KINGDOM))");
        org.junit.Assert.assertNotNull(dateAndTime19);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem9 = null;
        faker8.lorem = lorem9;
        com.github.javafaker.Internet internet11 = null;
        faker8.internet = internet11;
        java.lang.String str14 = faker8.bothify("");
        com.github.javafaker.Code code15 = null;
        faker8.code = code15;
        com.github.javafaker.DateAndTime dateAndTime17 = faker8.date();
        faker5.dateAndTime = dateAndTime17;
        com.github.javafaker.service.RandomService randomService19 = faker5.randomService;
        com.github.javafaker.Book book20 = faker5.book();
        com.github.javafaker.Finance finance21 = faker5.finance();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11058007795850322d + "'", double1 == 0.11058007795850322d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(dateAndTime17);
        org.junit.Assert.assertNotNull(randomService19);
        org.junit.Assert.assertNotNull(book20);
        org.junit.Assert.assertNotNull(finance21);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Color color4 = faker1.color;
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Name name6 = faker1.name;
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(name6);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        java.util.Random random7 = new java.util.Random();
        double double8 = random7.nextDouble();
        int int10 = random7.nextInt(1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService12 = faker11.randomService;
        faker1.randomService = randomService12;
        com.github.javafaker.Finance finance14 = faker1.finance();
        com.github.javafaker.Options options15 = faker1.options;
        com.github.javafaker.Book book16 = faker1.book();
        com.github.javafaker.Address address17 = faker1.address;
        com.github.javafaker.Name name18 = faker1.name;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(lorem6);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5796857641460796d + "'", double8 == 0.5796857641460796d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(randomService12);
        org.junit.Assert.assertNotNull(finance14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(book16);
        org.junit.Assert.assertNotNull(address17);
        org.junit.Assert.assertNotNull(name18);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale.Builder builder8 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder3.setUnicodeLocaleKeyword("italian", "fr_fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: italian [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.Business business6 = faker1.business;
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = faker1.fakeValuesService;
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        java.lang.String str13 = faker9.numerify("");
        com.github.javafaker.Business business14 = faker9.business;
        com.github.javafaker.service.FakeValuesService fakeValuesService15 = faker9.fakeValuesService;
        faker1.fakeValuesService = fakeValuesService15;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(business14);
        org.junit.Assert.assertNotNull(fakeValuesService15);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.Address address7 = faker5.address;
        com.github.javafaker.DateAndTime dateAndTime8 = faker5.date();
        java.lang.String str10 = faker5.bothify("fran\347ais");
        com.github.javafaker.DateAndTime dateAndTime11 = faker5.dateAndTime;
        com.github.javafaker.Internet internet12 = faker5.internet;
        java.lang.String str14 = faker5.bothify("fra");
        java.util.Locale locale16 = new java.util.Locale("hi!");
        java.lang.String str17 = locale16.getVariant();
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.lang.String str19 = locale16.getDisplayVariant(locale18);
        java.lang.String str20 = locale18.getCountry();
        java.lang.String str21 = locale18.getDisplayLanguage();
        java.util.Locale locale22 = java.util.Locale.JAPANESE;
        java.lang.String str23 = locale18.getDisplayScript(locale22);
        java.lang.String str24 = locale22.getDisplayLanguage();
        java.util.Random random26 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream29 = random26.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale22, random26);
        java.util.Random random31 = new java.util.Random();
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        com.github.javafaker.Lorem lorem33 = null;
        faker32.lorem = lorem33;
        java.lang.String str36 = faker32.numerify("hi!");
        com.github.javafaker.Color color37 = faker32.color;
        java.util.Random random38 = new java.util.Random();
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(random38);
        com.github.javafaker.Lorem lorem40 = null;
        faker39.lorem = lorem40;
        java.lang.String str43 = faker39.numerify("");
        com.github.javafaker.Company company44 = faker39.company;
        com.github.javafaker.Options options45 = faker39.options();
        faker32.options = options45;
        faker30.options = options45;
        faker5.options = options45;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5126088169417488d + "'", double1 == 0.5126088169417488d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fran\347ais" + "'", str10, "fran\347ais");
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNotNull(internet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fra" + "'", str14, "fra");
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "FR" + "'", str20, "FR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "French" + "'", str21, "French");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Japanese" + "'", str24, "Japanese");
        org.junit.Assert.assertNotNull(longStream29);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(company44);
        org.junit.Assert.assertNotNull(options45);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und-TW");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        boolean boolean7 = random1.nextBoolean();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number8 = faker7.number;
        com.github.javafaker.Business business9 = faker7.business();
        java.util.Random random10 = new java.util.Random();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Lorem lorem12 = null;
        faker11.lorem = lorem12;
        com.github.javafaker.Color color14 = faker11.color;
        com.github.javafaker.Finance finance15 = faker11.finance();
        com.github.javafaker.Address address16 = faker11.address;
        faker7.address = address16;
        java.util.Random random18 = new java.util.Random();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.Lorem lorem20 = null;
        faker19.lorem = lorem20;
        java.util.Random random22 = new java.util.Random();
        double double23 = random22.nextDouble();
        java.util.stream.IntStream intStream26 = random22.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.Code code28 = faker27.code();
        faker19.code = code28;
        com.github.javafaker.Lorem lorem30 = faker19.lorem();
        java.util.Random random31 = new java.util.Random();
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        com.github.javafaker.Lorem lorem33 = null;
        faker32.lorem = lorem33;
        com.github.javafaker.PhoneNumber phoneNumber35 = faker32.phoneNumber;
        faker19.phoneNumber = phoneNumber35;
        com.github.javafaker.PhoneNumber phoneNumber37 = faker19.phoneNumber();
        com.github.javafaker.Code code38 = faker19.code;
        faker7.code = code38;
        faker5.code = code38;
        com.github.javafaker.Business business41 = faker5.business();
        java.util.Locale locale43 = new java.util.Locale("hi!");
        java.lang.String str44 = locale43.getVariant();
        java.util.Locale locale45 = java.util.Locale.FRANCE;
        java.lang.String str46 = locale43.getDisplayVariant(locale45);
        java.lang.String str47 = locale45.getCountry();
        java.util.Random random48 = new java.util.Random();
        double double49 = random48.nextDouble();
        int int51 = random48.nextInt(1);
        com.github.javafaker.Faker faker52 = new com.github.javafaker.Faker(locale45, random48);
        float float53 = random48.nextFloat();
        int int54 = random48.nextInt();
        int int56 = random48.nextInt((int) 'u');
        double double57 = random48.nextDouble();
        com.github.javafaker.Faker faker58 = new com.github.javafaker.Faker(random48);
        java.util.Random random59 = new java.util.Random();
        com.github.javafaker.Faker faker60 = new com.github.javafaker.Faker(random59);
        com.github.javafaker.DateAndTime dateAndTime61 = null;
        faker60.dateAndTime = dateAndTime61;
        com.github.javafaker.Business business63 = faker60.business;
        faker58.business = business63;
        faker5.business = business63;
        com.github.javafaker.Faker faker66 = new com.github.javafaker.Faker();
        java.util.Random random67 = new java.util.Random();
        com.github.javafaker.Faker faker68 = new com.github.javafaker.Faker(random67);
        com.github.javafaker.Lorem lorem69 = null;
        faker68.lorem = lorem69;
        com.github.javafaker.PhoneNumber phoneNumber71 = faker68.phoneNumber;
        faker66.phoneNumber = phoneNumber71;
        com.github.javafaker.Business business73 = faker66.business;
        com.github.javafaker.Faker faker74 = new com.github.javafaker.Faker();
        java.util.Random random75 = new java.util.Random();
        com.github.javafaker.Faker faker76 = new com.github.javafaker.Faker(random75);
        com.github.javafaker.Lorem lorem77 = null;
        faker76.lorem = lorem77;
        com.github.javafaker.PhoneNumber phoneNumber79 = faker76.phoneNumber;
        faker74.phoneNumber = phoneNumber79;
        com.github.javafaker.Options options81 = faker74.options;
        faker66.options = options81;
        com.github.javafaker.Color color83 = faker66.color();
        faker5.color = color83;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2263954139805413d + "'", double1 == 0.2263954139805413d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(finance15);
        org.junit.Assert.assertNotNull(address16);
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6786855404702583d + "'", double23 == 0.6786855404702583d);
        org.junit.Assert.assertNotNull(intStream26);
        org.junit.Assert.assertNotNull(code28);
        org.junit.Assert.assertNull(lorem30);
        org.junit.Assert.assertNotNull(phoneNumber35);
        org.junit.Assert.assertNotNull(phoneNumber37);
        org.junit.Assert.assertNotNull(code38);
        org.junit.Assert.assertNotNull(business41);
        org.junit.Assert.assertEquals(locale43.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "FR" + "'", str47, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.9331824897165878d + "'", double49 == 0.9331824897165878d);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.44459927f + "'", float53 == 0.44459927f);
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 291327698 + "'", int54 == 291327698);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 88 + "'", int56 == 88);
// flaky:         org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.023180056791820447d + "'", double57 == 0.023180056791820447d);
        org.junit.Assert.assertNotNull(business63);
        org.junit.Assert.assertNotNull(phoneNumber71);
        org.junit.Assert.assertNotNull(business73);
        org.junit.Assert.assertNotNull(phoneNumber79);
        org.junit.Assert.assertNotNull(options81);
        org.junit.Assert.assertNotNull(color83);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        com.github.javafaker.Business business11 = faker10.business;
        java.lang.String str13 = faker10.bothify("en-US");
        java.lang.String str15 = faker10.bothify("fr_FR");
        java.util.Locale locale17 = new java.util.Locale("hi!");
        java.lang.String str18 = locale17.getVariant();
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.lang.String str20 = locale17.getDisplayVariant(locale19);
        java.lang.String str21 = locale19.getCountry();
        java.util.Random random22 = new java.util.Random();
        double double23 = random22.nextDouble();
        int int25 = random22.nextInt(1);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale19, random22);
        com.github.javafaker.Business business27 = faker26.business;
        java.lang.String str29 = faker26.bothify("en-US");
        com.github.javafaker.Number number30 = faker26.number();
        com.github.javafaker.Options options31 = faker26.options();
        com.github.javafaker.Options options32 = faker26.options;
        faker10.options = options32;
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6274222752607872d + "'", double7 == 0.6274222752607872d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-US" + "'", str13, "en-US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fr_FR" + "'", str15, "fr_FR");
        org.junit.Assert.assertEquals(locale17.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "FR" + "'", str21, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.4807850332157555d + "'", double23 == 0.4807850332157555d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(business27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en-US" + "'", str29, "en-US");
        org.junit.Assert.assertNotNull(number30);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertNotNull(options32);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.Company company6 = faker1.company;
        com.github.javafaker.Options options7 = faker1.options();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number9 = faker8.number;
        com.github.javafaker.Number number10 = faker8.number();
        java.lang.String str12 = faker8.bothify("en-GB");
        com.github.javafaker.Name name13 = faker8.name();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code15 = null;
        faker14.code = code15;
        com.github.javafaker.Lorem lorem17 = faker14.lorem();
        faker8.lorem = lorem17;
        java.util.Random random19 = new java.util.Random();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.Lorem lorem21 = null;
        faker20.lorem = lorem21;
        java.lang.String str24 = faker20.numerify("");
        java.util.Random random25 = new java.util.Random();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random25);
        com.github.javafaker.Lorem lorem27 = null;
        faker26.lorem = lorem27;
        com.github.javafaker.Color color29 = faker26.color;
        faker20.color = color29;
        com.github.javafaker.PhoneNumber phoneNumber31 = faker20.phoneNumber;
        faker8.phoneNumber = phoneNumber31;
        faker1.phoneNumber = phoneNumber31;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en-GB" + "'", str12, "en-GB");
        org.junit.Assert.assertNotNull(name13);
        org.junit.Assert.assertNotNull(lorem17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(phoneNumber31);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.setScript("und");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-us");
        java.lang.String str2 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-us" + "'", str2, "en-us");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Japanese");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.Color color7 = faker5.color;
        java.util.Locale locale9 = new java.util.Locale("hi!");
        java.lang.String str10 = locale9.getVariant();
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.lang.String str12 = locale9.getDisplayVariant(locale11);
        java.lang.String str13 = locale11.getCountry();
        java.lang.String str14 = locale11.getDisplayLanguage();
        java.util.Locale locale15 = java.util.Locale.JAPANESE;
        java.lang.String str16 = locale11.getDisplayScript(locale15);
        java.lang.String str17 = locale15.getDisplayLanguage();
        java.util.Random random19 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream22 = random19.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(locale15, random19);
        com.github.javafaker.Business business24 = faker23.business();
        java.util.Random random25 = new java.util.Random();
        double double26 = random25.nextDouble();
        java.util.stream.IntStream intStream29 = random25.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random25);
        com.github.javafaker.Code code31 = faker30.code();
        java.util.Random random32 = new java.util.Random();
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(random32);
        com.github.javafaker.Lorem lorem34 = null;
        faker33.lorem = lorem34;
        com.github.javafaker.Internet internet36 = null;
        faker33.internet = internet36;
        java.lang.String str39 = faker33.bothify("");
        com.github.javafaker.Code code40 = null;
        faker33.code = code40;
        com.github.javafaker.DateAndTime dateAndTime42 = faker33.date();
        faker30.dateAndTime = dateAndTime42;
        java.util.Random random44 = new java.util.Random();
        double double45 = random44.nextDouble();
        java.util.stream.IntStream intStream48 = random44.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker(random44);
        com.github.javafaker.Code code50 = faker49.code();
        com.github.javafaker.DateAndTime dateAndTime51 = faker49.date();
        faker30.dateAndTime = dateAndTime51;
        faker23.dateAndTime = dateAndTime51;
        faker5.dateAndTime = dateAndTime51;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3504013852649439d + "'", double1 == 0.3504013852649439d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FR" + "'", str13, "FR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "French" + "'", str14, "French");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Japanese" + "'", str17, "Japanese");
        org.junit.Assert.assertNotNull(longStream22);
        org.junit.Assert.assertNotNull(business24);
// flaky:         org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.4341177610070567d + "'", double26 == 0.4341177610070567d);
        org.junit.Assert.assertNotNull(intStream29);
        org.junit.Assert.assertNotNull(code31);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(dateAndTime42);
// flaky:         org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.3855900045039369d + "'", double45 == 0.3855900045039369d);
        org.junit.Assert.assertNotNull(intStream48);
        org.junit.Assert.assertNotNull(code50);
        org.junit.Assert.assertNotNull(dateAndTime51);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        java.util.Locale locale3 = new java.util.Locale("fr_FR", "hi!", "eng");
        java.lang.String str4 = locale3.toLanguageTag();
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale3.getDisplayVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-lvariant-eng" + "'", str4, "x-lvariant-eng");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "eng" + "'", str6, "eng");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder6 = builder3.setScript("");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = builder6.build();
        java.util.Locale locale10 = new java.util.Locale("hi!");
        java.lang.String str11 = locale10.getVariant();
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.lang.String str13 = locale10.getDisplayVariant(locale12);
        java.lang.String str14 = locale12.getCountry();
        java.lang.String str15 = locale12.getDisplayLanguage();
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.lang.String str17 = locale12.getDisplayScript(locale16);
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.lang.String str19 = locale12.getDisplayCountry(locale18);
        java.lang.String str20 = locale8.getDisplayLanguage(locale18);
        java.util.Locale.Builder builder21 = builder2.setLocale(locale18);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FR" + "'", str14, "FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "French" + "'", str15, "French");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "France" + "'", str19, "France");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getDisplayName();
        java.lang.String str7 = locale5.getDisplayCountry();
        java.lang.String str8 = locale5.toLanguageTag();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und" + "'", str8, "und");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale5.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        boolean boolean4 = random1.nextBoolean();
        double double5 = random1.nextGaussian();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        int int8 = random1.nextInt(100);
        boolean boolean9 = random1.nextBoolean();
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Random random11 = new java.util.Random();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale10, random11);
        java.util.stream.LongStream longStream13 = random11.longs();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random11);
        java.util.Random random15 = new java.util.Random();
        double double16 = random15.nextDouble();
        int int18 = random15.nextInt(1);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random15);
        double double20 = random15.nextDouble();
        double double21 = random15.nextDouble();
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        random15.nextBytes(byteArray25);
        random11.nextBytes(byteArray25);
        random1.nextBytes(byteArray25);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.4076364187708377d) + "'", double5 == (-1.4076364187708377d));
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 73 + "'", int8 == 73);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.7005330723202301d + "'", double16 == 0.7005330723202301d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.19152570628232846d + "'", double20 == 0.19152570628232846d);
// flaky:         org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.6225350552692894d + "'", double21 == 0.6225350552692894d);
        org.junit.Assert.assertNotNull(byteArray25);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[12, 115, 28]");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        com.github.javafaker.Name name32 = faker29.name;
        com.github.javafaker.Finance finance33 = faker29.finance();
        faker0.finance = finance33;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(finance15);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(company23);
        org.junit.Assert.assertNotNull(number24);
        org.junit.Assert.assertNotNull(fakeValuesService25);
        org.junit.Assert.assertNotNull(name32);
        org.junit.Assert.assertNotNull(finance33);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.DateAndTime dateAndTime7 = faker5.date();
        com.github.javafaker.Options options8 = faker5.options();
        java.util.Random random9 = new java.util.Random();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Lorem lorem11 = null;
        faker10.lorem = lorem11;
        com.github.javafaker.Color color13 = faker10.color;
        com.github.javafaker.Finance finance14 = faker10.finance();
        com.github.javafaker.Address address15 = faker10.address;
        java.util.Random random16 = new java.util.Random();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Lorem lorem18 = null;
        faker17.lorem = lorem18;
        java.lang.String str21 = faker17.numerify("");
        com.github.javafaker.Company company22 = faker17.company;
        com.github.javafaker.Number number23 = faker17.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService24 = faker17.fakeValuesService;
        faker10.fakeValuesService = fakeValuesService24;
        com.github.javafaker.Color color26 = faker10.color();
        faker5.color = color26;
        java.lang.String str29 = faker5.numerify("fr_fr_HI!_eng");
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14528422918884365d + "'", double1 == 0.14528422918884365d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(finance14);
        org.junit.Assert.assertNotNull(address15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(company22);
        org.junit.Assert.assertNotNull(number23);
        org.junit.Assert.assertNotNull(fakeValuesService24);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "fr_fr_HI!_eng" + "'", str29, "fr_fr_HI!_eng");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Color color10 = faker7.color;
        faker1.color = color10;
        com.github.javafaker.PhoneNumber phoneNumber12 = faker1.phoneNumber;
        java.util.Random random13 = new java.util.Random();
        double double14 = random13.nextDouble();
        java.util.stream.IntStream intStream17 = random13.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Code code19 = faker18.code();
        com.github.javafaker.Address address20 = faker18.address;
        com.github.javafaker.DateAndTime dateAndTime21 = faker18.date();
        java.lang.String str23 = faker18.bothify("fran\347ais");
        com.github.javafaker.DateAndTime dateAndTime24 = faker18.dateAndTime;
        faker1.dateAndTime = dateAndTime24;
        com.github.javafaker.Internet internet26 = faker1.internet();
        com.github.javafaker.Company company27 = faker1.company;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(phoneNumber12);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23547324630498834d + "'", double14 == 0.23547324630498834d);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(code19);
        org.junit.Assert.assertNotNull(address20);
        org.junit.Assert.assertNotNull(dateAndTime21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "fran\347ais" + "'", str23, "fran\347ais");
        org.junit.Assert.assertNotNull(dateAndTime24);
        org.junit.Assert.assertNotNull(internet26);
        org.junit.Assert.assertNotNull(company27);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        java.util.Locale locale3 = new java.util.Locale("FR", "TW", "German");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale7.toLanguageTag();
        java.lang.String str10 = locale3.getDisplayLanguage(locale7);
        java.util.Set<java.lang.String> strSet11 = locale3.getUnicodeLocaleAttributes();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale3);
        com.github.javafaker.Finance finance13 = faker12.finance();
        java.util.Random random14 = new java.util.Random();
        double double15 = random14.nextDouble();
        java.util.stream.IntStream intStream18 = random14.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Code code20 = faker19.code();
        java.util.Random random21 = new java.util.Random();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Lorem lorem23 = null;
        faker22.lorem = lorem23;
        com.github.javafaker.Internet internet25 = null;
        faker22.internet = internet25;
        java.lang.String str28 = faker22.bothify("");
        com.github.javafaker.Code code29 = null;
        faker22.code = code29;
        com.github.javafaker.DateAndTime dateAndTime31 = faker22.date();
        faker19.dateAndTime = dateAndTime31;
        java.util.Random random33 = new java.util.Random();
        double double34 = random33.nextDouble();
        java.util.stream.IntStream intStream37 = random33.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random33);
        com.github.javafaker.Code code39 = faker38.code();
        com.github.javafaker.DateAndTime dateAndTime40 = faker38.date();
        faker19.dateAndTime = dateAndTime40;
        com.github.javafaker.Book book42 = faker19.book();
        java.util.Random random43 = new java.util.Random();
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(random43);
        com.github.javafaker.Lorem lorem45 = null;
        faker44.lorem = lorem45;
        com.github.javafaker.Internet internet47 = null;
        faker44.internet = internet47;
        java.lang.String str50 = faker44.bothify("");
        com.github.javafaker.Code code51 = null;
        faker44.code = code51;
        com.github.javafaker.DateAndTime dateAndTime53 = faker44.date();
        java.util.Random random54 = new java.util.Random();
        com.github.javafaker.Faker faker55 = new com.github.javafaker.Faker(random54);
        com.github.javafaker.DateAndTime dateAndTime56 = null;
        faker55.dateAndTime = dateAndTime56;
        com.github.javafaker.Business business58 = faker55.business;
        faker44.business = business58;
        com.github.javafaker.Code code60 = faker44.code();
        java.util.Random random61 = new java.util.Random();
        com.github.javafaker.Faker faker62 = new com.github.javafaker.Faker(random61);
        com.github.javafaker.Lorem lorem63 = null;
        faker62.lorem = lorem63;
        com.github.javafaker.Color color65 = faker62.color;
        com.github.javafaker.Finance finance66 = faker62.finance();
        com.github.javafaker.PhoneNumber phoneNumber67 = faker62.phoneNumber();
        com.github.javafaker.Options options68 = faker62.options();
        faker44.options = options68;
        faker19.options = options68;
        faker12.options = options68;
        com.github.javafaker.Finance finance72 = faker12.finance;
        com.github.javafaker.Options options73 = faker12.options();
        org.junit.Assert.assertEquals(locale3.toString(), "fr_TW_German");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr-FR" + "'", str9, "fr-FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fran\347ais" + "'", str10, "fran\347ais");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(finance13);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.33486922407865705d + "'", double15 == 0.33486922407865705d);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertNotNull(code20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(dateAndTime31);
// flaky:         org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.86366409483664d + "'", double34 == 0.86366409483664d);
        org.junit.Assert.assertNotNull(intStream37);
        org.junit.Assert.assertNotNull(code39);
        org.junit.Assert.assertNotNull(dateAndTime40);
        org.junit.Assert.assertNotNull(book42);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(dateAndTime53);
        org.junit.Assert.assertNotNull(business58);
        org.junit.Assert.assertNull(code60);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertNotNull(finance66);
        org.junit.Assert.assertNotNull(phoneNumber67);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertNotNull(finance72);
        org.junit.Assert.assertNotNull(options73);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Options options6 = faker1.options;
        com.github.javafaker.Finance finance7 = faker1.finance;
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        com.github.javafaker.Internet internet12 = null;
        faker9.internet = internet12;
        com.github.javafaker.Number number14 = faker9.number;
        faker1.number = number14;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(number14);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale7 = new java.util.Locale("hi!", "en-US", "en-US");
        java.lang.String str8 = locale3.getDisplayName(locale7);
        java.lang.String str9 = locale7.getDisplayScript();
        boolean boolean11 = locale7.equals((java.lang.Object) 844792170);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "hi!_EN-US_en-US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        java.util.Locale locale3 = new java.util.Locale("en_us", "Twi", "italien");
        org.junit.Assert.assertEquals(locale3.toString(), "en_us_TWI_italien");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale4 = new java.util.Locale("x-lvariant-eng", "", "");
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale7 = new java.util.Locale("TW");
        java.util.Locale.setDefault(category0, locale7);
        java.util.Random random9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale7, random9);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: tw could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale4.toString(), "x-lvariant-eng");
        org.junit.Assert.assertEquals(locale7.toString(), "tw");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        com.github.javafaker.Business business6 = faker1.business();
        com.github.javafaker.Color color7 = faker1.color;
        com.github.javafaker.Internet internet8 = faker1.internet();
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(internet8);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("French", strMap2);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap12);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList19);
        java.util.Locale locale25 = new java.util.Locale("", "", "");
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleKeys();
        java.lang.String str27 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strSet26);
        java.util.Locale locale31 = new java.util.Locale("FR", "TW", "German");
        java.util.Locale locale33 = new java.util.Locale("hi!");
        java.lang.String str34 = locale33.getVariant();
        java.util.Locale locale35 = java.util.Locale.FRANCE;
        java.lang.String str36 = locale33.getDisplayVariant(locale35);
        java.lang.String str37 = locale35.toLanguageTag();
        java.lang.String str38 = locale31.getDisplayLanguage(locale35);
        java.util.Set<java.lang.String> strSet39 = locale31.getUnicodeLocaleAttributes();
        java.util.Locale locale40 = java.util.Locale.FRANCE;
        java.util.Random random41 = new java.util.Random();
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker(locale40, random41);
        java.util.Locale locale43 = java.util.Locale.GERMAN;
        java.util.Locale locale47 = new java.util.Locale("", "", "");
        java.util.Locale locale49 = new java.util.Locale("hi!");
        java.lang.String str50 = locale49.getVariant();
        java.util.Set<java.lang.String> strSet51 = locale49.getUnicodeLocaleKeys();
        java.lang.String str52 = locale47.getDisplayLanguage(locale49);
        java.lang.String str53 = locale47.getLanguage();
        java.lang.String str54 = locale43.getDisplayCountry(locale47);
        java.util.Locale locale55 = java.util.Locale.GERMAN;
        java.util.Locale locale59 = new java.util.Locale("", "", "");
        java.util.Locale locale61 = new java.util.Locale("hi!");
        java.lang.String str62 = locale61.getVariant();
        java.util.Set<java.lang.String> strSet63 = locale61.getUnicodeLocaleKeys();
        java.lang.String str64 = locale59.getDisplayLanguage(locale61);
        java.lang.String str65 = locale59.getLanguage();
        java.lang.String str66 = locale55.getDisplayCountry(locale59);
        java.lang.String str67 = locale55.getDisplayVariant();
        java.lang.String str68 = locale55.getISO3Language();
        java.util.Locale locale69 = java.util.Locale.JAPANESE;
        java.lang.String str70 = locale69.getDisplayScript();
        java.util.Locale locale71 = java.util.Locale.ITALY;
        java.lang.String str72 = locale71.getDisplayLanguage();
        java.util.Locale locale74 = new java.util.Locale("hi!");
        java.lang.String str75 = locale74.getVariant();
        java.util.Locale locale76 = java.util.Locale.FRANCE;
        java.lang.String str77 = locale74.getDisplayVariant(locale76);
        com.github.javafaker.Faker faker78 = new com.github.javafaker.Faker(locale76);
        java.lang.String str79 = locale76.toLanguageTag();
        java.util.Locale locale83 = new java.util.Locale("Franz\366sisch", "japonais", "en_US");
        java.util.Locale[] localeArray84 = new java.util.Locale[] { locale31, locale40, locale43, locale55, locale69, locale71, locale76, locale83 };
        java.util.ArrayList<java.util.Locale> localeList85 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList85, localeArray84);
        java.util.Locale locale87 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.util.Locale>) localeList85);
        java.util.Locale locale88 = java.util.Locale.lookup(languageRangeList13, (java.util.Collection<java.util.Locale>) localeList85);
        java.util.Locale locale89 = java.util.Locale.lookup(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList85);
        java.util.Locale.FilteringMode filteringMode90 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList91 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList85, filteringMode90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_TW_German");
        org.junit.Assert.assertEquals(locale33.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "fr-FR" + "'", str37, "fr-FR");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "fran\347ais" + "'", str38, "fran\347ais");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "de");
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertEquals(locale49.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "de");
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals(locale61.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "deu" + "'", str68, "deu");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Italian" + "'", str72, "Italian");
        org.junit.Assert.assertEquals(locale74.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "fr-FR" + "'", str79, "fr-FR");
        org.junit.Assert.assertEquals(locale83.toString(), "franz\366sisch_JAPONAIS_en_US");
        org.junit.Assert.assertNotNull(localeArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNull(locale87);
        org.junit.Assert.assertNull(locale88);
        org.junit.Assert.assertNull(locale89);
        org.junit.Assert.assertTrue("'" + filteringMode90 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode90.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        java.util.Locale locale2 = new java.util.Locale("Chinese (Taiwan)", "fra");
        java.lang.String str3 = locale2.getDisplayVariant();
        java.lang.String str4 = locale2.getDisplayLanguage();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Locale locale8 = new java.util.Locale("fran\347ais (france) (X-LVARIANT-ENG)", "en-GB");
        java.lang.String str9 = locale2.getDisplayLanguage(locale8);
        org.junit.Assert.assertEquals(locale2.toString(), "chinese (taiwan)_FRA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chinese (taiwan)" + "'", str4, "chinese (taiwan)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinese (taiwan)" + "'", str5, "chinese (taiwan)");
        org.junit.Assert.assertEquals(locale8.toString(), "fran\347ais (france) (x-lvariant-eng)_EN-GB");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chinese (taiwan)" + "'", str9, "chinese (taiwan)");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setVariant("en-us");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: en-us [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("France", strMap1);
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getVariant();
        java.util.Set<java.lang.String> strSet6 = locale4.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet6);
        java.util.Locale.LanguageRange languageRange10 = new java.util.Locale.LanguageRange("en", 0.46560633866972545d);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] { languageRange10 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList19);
        java.lang.String str22 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList21);
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList21);
        java.util.Locale locale25 = new java.util.Locale("hi!");
        java.lang.String str26 = locale25.getVariant();
        java.util.Locale locale27 = java.util.Locale.FRANCE;
        java.lang.String str28 = locale25.getDisplayVariant(locale27);
        java.lang.String str29 = locale27.getCountry();
        java.lang.String str30 = locale27.getDisplayLanguage();
        java.util.Locale locale31 = java.util.Locale.JAPANESE;
        java.lang.String str32 = locale27.getDisplayScript(locale31);
        java.lang.String str33 = locale31.getDisplayLanguage();
        java.util.Random random35 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream38 = random35.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(locale31, random35);
        java.util.Set<java.lang.String> strSet40 = locale31.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet40);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap42 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList43 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap42);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals(locale25.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "FR" + "'", str29, "FR");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "French" + "'", str30, "French");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Japanese" + "'", str33, "Japanese");
        org.junit.Assert.assertNotNull(longStream38);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(languageRangeList43);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.getLanguage();
        java.util.Random random2 = new java.util.Random();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random2);
        java.util.stream.LongStream longStream8 = random2.longs((long) ' ', (long) (byte) 100, (long) 'u');
        double double9 = random2.nextGaussian();
        java.util.stream.IntStream intStream10 = random2.ints();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ja" + "'", str1, "ja");
        org.junit.Assert.assertNotNull(longStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5515851514684311d + "'", double9 == 0.5515851514684311d);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ENGLISH (UNITED KINGDOM)", 0.3415199772941956d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english (united kingdom)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        java.util.Locale locale1 = new java.util.Locale("fran\347ais (france) (X-LVARIANT-ENG)");
        org.junit.Assert.assertEquals(locale1.toString(), "fran\347ais (france) (x-lvariant-eng)");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("German");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.DateAndTime dateAndTime7 = faker5.date();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker5.phoneNumber;
        com.github.javafaker.Finance finance9 = faker5.finance();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number11 = faker10.number;
        com.github.javafaker.Number number12 = faker10.number();
        java.lang.String str14 = faker10.bothify("en-GB");
        com.github.javafaker.Name name15 = faker10.name();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code17 = null;
        faker16.code = code17;
        com.github.javafaker.Lorem lorem19 = faker16.lorem();
        faker10.lorem = lorem19;
        java.util.Random random21 = new java.util.Random();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Lorem lorem23 = null;
        faker22.lorem = lorem23;
        java.lang.String str26 = faker22.numerify("");
        java.util.Random random27 = new java.util.Random();
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(random27);
        com.github.javafaker.Lorem lorem29 = null;
        faker28.lorem = lorem29;
        com.github.javafaker.Color color31 = faker28.color;
        faker22.color = color31;
        com.github.javafaker.PhoneNumber phoneNumber33 = faker22.phoneNumber;
        faker10.phoneNumber = phoneNumber33;
        java.util.Locale locale36 = new java.util.Locale("hi!");
        java.lang.String str37 = locale36.getVariant();
        java.util.Locale locale38 = java.util.Locale.FRANCE;
        java.lang.String str39 = locale36.getDisplayVariant(locale38);
        java.lang.String str40 = locale38.getCountry();
        java.util.Random random41 = new java.util.Random();
        double double42 = random41.nextDouble();
        int int44 = random41.nextInt(1);
        com.github.javafaker.Faker faker45 = new com.github.javafaker.Faker(locale38, random41);
        com.github.javafaker.Internet internet46 = faker45.internet();
        faker10.internet = internet46;
        com.github.javafaker.Company company48 = faker10.company;
        java.util.Random random49 = new java.util.Random();
        com.github.javafaker.Faker faker50 = new com.github.javafaker.Faker(random49);
        com.github.javafaker.Lorem lorem51 = null;
        faker50.lorem = lorem51;
        com.github.javafaker.Internet internet53 = null;
        faker50.internet = internet53;
        java.lang.String str56 = faker50.bothify("");
        com.github.javafaker.Name name57 = faker50.name;
        com.github.javafaker.Internet internet58 = faker50.internet();
        com.github.javafaker.Address address59 = faker50.address();
        faker10.address = address59;
        java.util.Locale locale62 = new java.util.Locale("hi!");
        java.lang.String str63 = locale62.getVariant();
        java.util.Locale locale64 = java.util.Locale.FRANCE;
        java.lang.String str65 = locale62.getDisplayVariant(locale64);
        java.lang.String str66 = locale64.getCountry();
        java.lang.String str67 = locale64.getDisplayLanguage();
        java.util.Locale locale68 = java.util.Locale.JAPANESE;
        java.lang.String str69 = locale64.getDisplayScript(locale68);
        java.lang.String str70 = locale68.getDisplayLanguage();
        java.util.Random random72 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream75 = random72.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker76 = new com.github.javafaker.Faker(locale68, random72);
        com.github.javafaker.Business business77 = faker76.business();
        com.github.javafaker.service.FakeValuesService fakeValuesService78 = faker76.fakeValuesService;
        faker10.fakeValuesService = fakeValuesService78;
        faker5.fakeValuesService = fakeValuesService78;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44318755298794676d + "'", double1 == 0.44318755298794676d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(number12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-GB" + "'", str14, "en-GB");
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(lorem19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(phoneNumber33);
        org.junit.Assert.assertEquals(locale36.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "FR" + "'", str40, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.8047874939565682d + "'", double42 == 0.8047874939565682d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(internet46);
        org.junit.Assert.assertNotNull(company48);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(name57);
        org.junit.Assert.assertNull(internet58);
        org.junit.Assert.assertNotNull(address59);
        org.junit.Assert.assertEquals(locale62.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "FR" + "'", str66, "FR");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "French" + "'", str67, "French");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Japanese" + "'", str70, "Japanese");
        org.junit.Assert.assertNotNull(longStream75);
        org.junit.Assert.assertNotNull(business77);
        org.junit.Assert.assertNotNull(fakeValuesService78);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        java.util.Locale locale1 = new java.util.Locale("en");
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        java.util.Locale.Category category3 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.util.Locale locale5 = java.util.Locale.getDefault(category3);
        java.util.Locale locale8 = new java.util.Locale("en-US", "en");
        java.util.Locale.setDefault(category3, locale8);
        java.util.Locale locale10 = locale8.stripExtensions();
        java.lang.String str11 = locale1.getDisplayVariant(locale10);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "tw");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "tw");
        org.junit.Assert.assertEquals(locale8.toString(), "en-us_EN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en-us_EN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        java.util.Locale locale3 = new java.util.Locale("FR", "TW", "German");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale7.toLanguageTag();
        java.lang.String str10 = locale3.getDisplayLanguage(locale7);
        java.util.Set<java.lang.String> strSet11 = locale3.getUnicodeLocaleAttributes();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale3);
        java.lang.String str13 = locale3.getDisplayScript();
        org.junit.Assert.assertEquals(locale3.toString(), "fr_TW_German");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr-FR" + "'", str9, "fr-FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fran\347ais" + "'", str10, "fran\347ais");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("German", (double) 0.44563425f);
        boolean boolean4 = languageRange2.equals((java.lang.Object) 1.1593674159655354d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        java.util.Random random7 = new java.util.Random();
        double double8 = random7.nextDouble();
        int int10 = random7.nextInt(1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService12 = faker11.randomService;
        faker1.randomService = randomService12;
        com.github.javafaker.Number number14 = faker1.number;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(lorem6);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0723827274281641d + "'", double8 == 0.0723827274281641d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(randomService12);
        org.junit.Assert.assertNotNull(number14);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Lorem lorem6 = null;
        faker5.lorem = lorem6;
        com.github.javafaker.Internet internet8 = null;
        faker5.internet = internet8;
        com.github.javafaker.Number number10 = faker5.number;
        com.github.javafaker.Number number11 = faker5.number;
        faker3.number = number11;
        java.util.Random random13 = new java.util.Random();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Lorem lorem15 = null;
        faker14.lorem = lorem15;
        com.github.javafaker.Internet internet17 = null;
        faker14.internet = internet17;
        com.github.javafaker.Name name19 = faker14.name;
        com.github.javafaker.DateAndTime dateAndTime20 = faker14.dateAndTime;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number22 = faker21.number;
        com.github.javafaker.Number number23 = faker21.number();
        java.lang.String str25 = faker21.bothify("en-GB");
        com.github.javafaker.Name name26 = faker21.name();
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code28 = null;
        faker27.code = code28;
        com.github.javafaker.Lorem lorem30 = faker27.lorem();
        faker21.lorem = lorem30;
        java.util.Random random32 = new java.util.Random();
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(random32);
        com.github.javafaker.Lorem lorem34 = null;
        faker33.lorem = lorem34;
        java.lang.String str37 = faker33.numerify("");
        java.util.Random random38 = new java.util.Random();
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(random38);
        com.github.javafaker.Lorem lorem40 = null;
        faker39.lorem = lorem40;
        com.github.javafaker.Color color42 = faker39.color;
        faker33.color = color42;
        com.github.javafaker.PhoneNumber phoneNumber44 = faker33.phoneNumber;
        faker21.phoneNumber = phoneNumber44;
        java.util.Locale locale47 = new java.util.Locale("hi!");
        java.lang.String str48 = locale47.getVariant();
        java.util.Locale locale49 = java.util.Locale.FRANCE;
        java.lang.String str50 = locale47.getDisplayVariant(locale49);
        java.lang.String str51 = locale49.getCountry();
        java.util.Random random52 = new java.util.Random();
        double double53 = random52.nextDouble();
        int int55 = random52.nextInt(1);
        com.github.javafaker.Faker faker56 = new com.github.javafaker.Faker(locale49, random52);
        com.github.javafaker.Internet internet57 = faker56.internet();
        faker21.internet = internet57;
        com.github.javafaker.Company company59 = faker21.company;
        java.util.Random random60 = new java.util.Random();
        com.github.javafaker.Faker faker61 = new com.github.javafaker.Faker(random60);
        com.github.javafaker.Lorem lorem62 = null;
        faker61.lorem = lorem62;
        com.github.javafaker.Internet internet64 = null;
        faker61.internet = internet64;
        java.lang.String str67 = faker61.bothify("");
        com.github.javafaker.Name name68 = faker61.name;
        com.github.javafaker.Internet internet69 = faker61.internet();
        com.github.javafaker.Address address70 = faker61.address();
        faker21.address = address70;
        java.util.Locale locale73 = new java.util.Locale("hi!");
        java.lang.String str74 = locale73.getVariant();
        java.util.Locale locale75 = java.util.Locale.FRANCE;
        java.lang.String str76 = locale73.getDisplayVariant(locale75);
        java.lang.String str77 = locale75.getCountry();
        java.lang.String str78 = locale75.getDisplayLanguage();
        java.util.Locale locale79 = java.util.Locale.JAPANESE;
        java.lang.String str80 = locale75.getDisplayScript(locale79);
        java.lang.String str81 = locale79.getDisplayLanguage();
        java.util.Random random83 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream86 = random83.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker87 = new com.github.javafaker.Faker(locale79, random83);
        com.github.javafaker.Business business88 = faker87.business();
        com.github.javafaker.service.FakeValuesService fakeValuesService89 = faker87.fakeValuesService;
        faker21.fakeValuesService = fakeValuesService89;
        faker14.fakeValuesService = fakeValuesService89;
        faker3.fakeValuesService = fakeValuesService89;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(name19);
        org.junit.Assert.assertNotNull(dateAndTime20);
        org.junit.Assert.assertNotNull(number22);
        org.junit.Assert.assertNotNull(number23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en-GB" + "'", str25, "en-GB");
        org.junit.Assert.assertNotNull(name26);
        org.junit.Assert.assertNotNull(lorem30);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(phoneNumber44);
        org.junit.Assert.assertEquals(locale47.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "FR" + "'", str51, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.14552511900084508d + "'", double53 == 0.14552511900084508d);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(internet57);
        org.junit.Assert.assertNotNull(company59);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(name68);
        org.junit.Assert.assertNull(internet69);
        org.junit.Assert.assertNotNull(address70);
        org.junit.Assert.assertEquals(locale73.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "FR" + "'", str77, "FR");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "French" + "'", str78, "French");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Japanese" + "'", str81, "Japanese");
        org.junit.Assert.assertNotNull(longStream86);
        org.junit.Assert.assertNotNull(business88);
        org.junit.Assert.assertNotNull(fakeValuesService89);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Internet internet5 = faker4.internet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = faker4.resolve("italian");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.988978590014628d + "'", double1 == 0.988978590014628d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(internet5);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        java.util.stream.LongStream longStream4 = random1.longs(1L);
        java.util.stream.IntStream intStream5 = random1.ints();
        long long6 = random1.nextLong();
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-4964420948893066024L) + "'", long6 == (-4964420948893066024L));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder1.build();
        java.util.Locale.Builder builder4 = builder1.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        java.util.Locale locale1 = new java.util.Locale("fr-x-lvariant-eng");
        java.util.Locale locale4 = new java.util.Locale("en-US", "en");
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.lang.String str6 = locale1.getDisplayScript(locale4);
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr-x-lvariant-eng");
        org.junit.Assert.assertEquals(locale4.toString(), "en-us_EN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en-us" + "'", str5, "en-us");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Random random3 = new java.util.Random();
        double double4 = random3.nextDouble();
        int int6 = random3.nextInt(1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random3);
        double double8 = random3.nextDouble();
        double double9 = random3.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale1, random3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi! could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6256258781343159d + "'", double4 == 0.6256258781343159d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9641127299012959d + "'", double8 == 0.9641127299012959d);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9063769636499519d + "'", double9 == 0.9063769636499519d);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        java.util.Locale locale2 = new java.util.Locale("FR", "fr_FR");
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale2);
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Random random5 = new java.util.Random();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale4, random5);
        java.lang.String str7 = locale2.getDisplayName(locale4);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fran\347ais (FR_FR)" + "'", str7, "fran\347ais (FR_FR)");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Code code8 = null;
        faker1.code = code8;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number11 = faker10.number;
        faker1.number = number11;
        com.github.javafaker.PhoneNumber phoneNumber13 = faker1.phoneNumber();
        com.github.javafaker.PhoneNumber phoneNumber14 = faker1.phoneNumber;
        com.github.javafaker.DateAndTime dateAndTime15 = faker1.dateAndTime;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(phoneNumber13);
        org.junit.Assert.assertNotNull(phoneNumber14);
        org.junit.Assert.assertNotNull(dateAndTime15);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.Address address7 = faker5.address;
        com.github.javafaker.DateAndTime dateAndTime8 = faker5.date();
        java.util.Random random9 = new java.util.Random();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Lorem lorem11 = null;
        faker10.lorem = lorem11;
        java.lang.String str14 = faker10.numerify("");
        java.util.Random random15 = new java.util.Random();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.Lorem lorem17 = null;
        faker16.lorem = lorem17;
        com.github.javafaker.Color color19 = faker16.color;
        faker10.color = color19;
        java.lang.String str22 = faker10.bothify("fr_fr_HI!_eng");
        java.lang.String str24 = faker10.numerify("eng");
        java.util.Random random25 = new java.util.Random();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random25);
        com.github.javafaker.Lorem lorem27 = null;
        faker26.lorem = lorem27;
        com.github.javafaker.Internet internet29 = null;
        faker26.internet = internet29;
        java.lang.String str32 = faker26.bothify("");
        com.github.javafaker.Code code33 = null;
        faker26.code = code33;
        com.github.javafaker.DateAndTime dateAndTime35 = faker26.date();
        faker10.dateAndTime = dateAndTime35;
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number38 = faker37.number;
        com.github.javafaker.Number number39 = faker37.number();
        java.lang.String str41 = faker37.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService42 = faker37.fakeValuesService;
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number44 = faker43.number;
        com.github.javafaker.Number number45 = faker43.number();
        java.lang.String str47 = faker43.bothify("en-GB");
        com.github.javafaker.Name name48 = faker43.name();
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code50 = null;
        faker49.code = code50;
        com.github.javafaker.Lorem lorem52 = faker49.lorem();
        faker43.lorem = lorem52;
        java.util.Random random54 = new java.util.Random();
        com.github.javafaker.Faker faker55 = new com.github.javafaker.Faker(random54);
        com.github.javafaker.Lorem lorem56 = null;
        faker55.lorem = lorem56;
        java.lang.String str59 = faker55.numerify("");
        java.util.Random random60 = new java.util.Random();
        com.github.javafaker.Faker faker61 = new com.github.javafaker.Faker(random60);
        com.github.javafaker.Lorem lorem62 = null;
        faker61.lorem = lorem62;
        com.github.javafaker.Color color64 = faker61.color;
        faker55.color = color64;
        com.github.javafaker.PhoneNumber phoneNumber66 = faker55.phoneNumber;
        faker43.phoneNumber = phoneNumber66;
        faker37.phoneNumber = phoneNumber66;
        java.util.Random random69 = new java.util.Random();
        com.github.javafaker.Faker faker70 = new com.github.javafaker.Faker(random69);
        com.github.javafaker.Lorem lorem71 = null;
        faker70.lorem = lorem71;
        java.lang.String str74 = faker70.numerify("hi!");
        com.github.javafaker.Lorem lorem75 = faker70.lorem;
        java.util.Random random76 = new java.util.Random();
        double double77 = random76.nextDouble();
        int int79 = random76.nextInt(1);
        com.github.javafaker.Faker faker80 = new com.github.javafaker.Faker(random76);
        com.github.javafaker.service.RandomService randomService81 = faker80.randomService;
        faker70.randomService = randomService81;
        com.github.javafaker.Finance finance83 = faker70.finance();
        com.github.javafaker.Lorem lorem84 = faker70.lorem();
        com.github.javafaker.PhoneNumber phoneNumber85 = faker70.phoneNumber();
        com.github.javafaker.Name name86 = faker70.name();
        faker37.name = name86;
        faker10.name = name86;
        faker5.name = name86;
        com.github.javafaker.DateAndTime dateAndTime90 = faker5.dateAndTime;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3131376315623644d + "'", double1 == 0.3131376315623644d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "fr_fr_HI!_eng" + "'", str22, "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "eng" + "'", str24, "eng");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(dateAndTime35);
        org.junit.Assert.assertNotNull(number38);
        org.junit.Assert.assertNotNull(number39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "en-GB" + "'", str41, "en-GB");
        org.junit.Assert.assertNotNull(fakeValuesService42);
        org.junit.Assert.assertNotNull(number44);
        org.junit.Assert.assertNotNull(number45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "en-GB" + "'", str47, "en-GB");
        org.junit.Assert.assertNotNull(name48);
        org.junit.Assert.assertNotNull(lorem52);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(phoneNumber66);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNull(lorem75);
// flaky:         org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.14511533240584584d + "'", double77 == 0.14511533240584584d);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(randomService81);
        org.junit.Assert.assertNotNull(finance83);
        org.junit.Assert.assertNull(lorem84);
        org.junit.Assert.assertNotNull(phoneNumber85);
        org.junit.Assert.assertNotNull(name86);
        org.junit.Assert.assertNotNull(dateAndTime90);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker5.phoneNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2787261904731324d + "'", double1 == 0.2787261904731324d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("tw");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "tw");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        com.github.javafaker.Business business11 = faker10.business;
        java.lang.String str13 = faker10.bothify("en-US");
        com.github.javafaker.Number number14 = faker10.number();
        com.github.javafaker.Options options15 = faker10.options();
        com.github.javafaker.Options options16 = faker10.options;
        com.github.javafaker.Internet internet17 = faker10.internet;
        java.util.Random random18 = new java.util.Random();
        double double19 = random18.nextDouble();
        java.util.stream.IntStream intStream22 = random18.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.Lorem lorem24 = faker23.lorem();
        com.github.javafaker.service.FakeValuesService fakeValuesService25 = faker23.fakeValuesService;
        faker10.fakeValuesService = fakeValuesService25;
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.1294145437715598d + "'", double7 == 0.1294145437715598d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-US" + "'", str13, "en-US");
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(internet17);
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.912519748868123d + "'", double19 == 0.912519748868123d);
        org.junit.Assert.assertNotNull(intStream22);
        org.junit.Assert.assertNotNull(lorem24);
        org.junit.Assert.assertNotNull(fakeValuesService25);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        com.github.javafaker.Code code25 = faker0.code();
        com.github.javafaker.Name name26 = faker0.name;
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number28 = faker27.number;
        com.github.javafaker.Number number29 = faker27.number();
        java.lang.String str31 = faker27.bothify("en-GB");
        com.github.javafaker.Book book32 = faker27.book();
        com.github.javafaker.Number number33 = faker27.number;
        faker0.number = number33;
        com.github.javafaker.DateAndTime dateAndTime35 = faker0.date();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(phoneNumber23);
        org.junit.Assert.assertNotNull(code25);
        org.junit.Assert.assertNotNull(name26);
        org.junit.Assert.assertNotNull(number28);
        org.junit.Assert.assertNotNull(number29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "en-GB" + "'", str31, "en-GB");
        org.junit.Assert.assertNotNull(book32);
        org.junit.Assert.assertNotNull(number33);
        org.junit.Assert.assertNotNull(dateAndTime35);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem3 = null;
        faker2.lorem = lorem3;
        com.github.javafaker.PhoneNumber phoneNumber5 = faker2.phoneNumber;
        faker0.phoneNumber = phoneNumber5;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        com.github.javafaker.PhoneNumber phoneNumber12 = faker9.phoneNumber;
        faker7.phoneNumber = phoneNumber12;
        com.github.javafaker.Options options14 = faker7.options;
        faker0.options = options14;
        java.util.Locale locale17 = new java.util.Locale("hi!");
        java.lang.String str18 = locale17.getVariant();
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.lang.String str20 = locale17.getDisplayVariant(locale19);
        java.lang.String str21 = locale19.getCountry();
        java.util.Random random22 = new java.util.Random();
        double double23 = random22.nextDouble();
        int int25 = random22.nextInt(1);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale19, random22);
        com.github.javafaker.Business business27 = faker26.business;
        java.lang.String str29 = faker26.bothify("en-US");
        com.github.javafaker.Number number30 = faker26.number();
        java.lang.String str32 = faker26.numerify("");
        com.github.javafaker.Company company33 = faker26.company;
        faker0.company = company33;
        java.util.Random random35 = new java.util.Random();
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(random35);
        com.github.javafaker.Lorem lorem37 = null;
        faker36.lorem = lorem37;
        java.lang.String str40 = faker36.numerify("hi!");
        com.github.javafaker.Color color41 = faker36.color;
        faker0.color = color41;
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertEquals(locale17.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "FR" + "'", str21, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.27223641220305006d + "'", double23 == 0.27223641220305006d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(business27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en-US" + "'", str29, "en-US");
        org.junit.Assert.assertNotNull(number30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(company33);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(color41);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        java.util.Locale locale3 = new java.util.Locale("fr-x-lvariant-eng", "German", "jpn");
        boolean boolean4 = locale3.hasExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "fr-x-lvariant-eng_GERMAN_jpn");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fra (CHINESE (TAIWAN))", 0.5187327013705284d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fra (chinese (taiwan))");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Address address8 = faker1.address;
        com.github.javafaker.Options options9 = faker1.options;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(address8);
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        double double5 = random0.nextDouble();
        random0.setSeed((long) (-1));
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name9 = faker8.name;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8366702966578152d + "'", double1 == 0.8366702966578152d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7801288138577396d + "'", double5 == 0.7801288138577396d);
        org.junit.Assert.assertNotNull(name9);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        com.github.javafaker.Internet internet23 = faker2.internet;
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en-GB" + "'", str9, "en-GB");
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(number15);
        org.junit.Assert.assertNotNull(number16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en-GB" + "'", str18, "en-GB");
        org.junit.Assert.assertNotNull(book19);
        org.junit.Assert.assertNotNull(dateAndTime20);
        org.junit.Assert.assertNotNull(fakeValuesService21);
        org.junit.Assert.assertNotNull(internet23);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getDisplayCountry();
        java.util.Random random7 = new java.util.Random((long) 'x');
        java.util.stream.LongStream longStream11 = random7.longs(0L, (long) (short) 10, (long) 'u');
        double double12 = random7.nextDouble();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale3, random7);
        com.github.javafaker.Lorem lorem14 = faker13.lorem();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "France" + "'", str5, "France");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.7230846212249419d + "'", double12 == 0.7230846212249419d);
        org.junit.Assert.assertNotNull(lorem14);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder1.setLanguageTag("fr-fr");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("en-GB");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("French", 0.150114539243007d);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem9 = null;
        faker8.lorem = lorem9;
        com.github.javafaker.Internet internet11 = null;
        faker8.internet = internet11;
        java.lang.String str14 = faker8.bothify("");
        com.github.javafaker.Code code15 = null;
        faker8.code = code15;
        com.github.javafaker.DateAndTime dateAndTime17 = faker8.date();
        faker5.dateAndTime = dateAndTime17;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number20 = faker19.number;
        com.github.javafaker.Number number21 = faker19.number();
        java.lang.String str23 = faker19.bothify("en-GB");
        com.github.javafaker.Book book24 = faker19.book();
        com.github.javafaker.DateAndTime dateAndTime25 = faker19.dateAndTime;
        com.github.javafaker.service.FakeValuesService fakeValuesService26 = faker19.fakeValuesService;
        java.util.Random random27 = new java.util.Random();
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(random27);
        com.github.javafaker.Lorem lorem29 = null;
        faker28.lorem = lorem29;
        com.github.javafaker.Internet internet31 = null;
        faker28.internet = internet31;
        java.lang.String str34 = faker28.bothify("");
        com.github.javafaker.Book book35 = faker28.book();
        faker19.book = book35;
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker();
        java.util.Random random38 = new java.util.Random();
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(random38);
        com.github.javafaker.Lorem lorem40 = null;
        faker39.lorem = lorem40;
        com.github.javafaker.PhoneNumber phoneNumber42 = faker39.phoneNumber;
        faker37.phoneNumber = phoneNumber42;
        com.github.javafaker.Options options44 = faker37.options;
        faker19.options = options44;
        faker5.options = options44;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06584755166080503d + "'", double1 == 0.06584755166080503d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(dateAndTime17);
        org.junit.Assert.assertNotNull(number20);
        org.junit.Assert.assertNotNull(number21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "en-GB" + "'", str23, "en-GB");
        org.junit.Assert.assertNotNull(book24);
        org.junit.Assert.assertNotNull(dateAndTime25);
        org.junit.Assert.assertNotNull(fakeValuesService26);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(book35);
        org.junit.Assert.assertNotNull(phoneNumber42);
        org.junit.Assert.assertNotNull(options44);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = new java.util.Locale("en-US", "en");
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale9 = new java.util.Locale("fr", "");
        java.util.Locale.setDefault(category0, locale9);
        java.util.Locale locale12 = new java.util.Locale("en");
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale12);
        java.util.Locale.setDefault(category0, locale12);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr-x-lvariant-eng");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr-x-lvariant-eng");
        org.junit.Assert.assertEquals(locale5.toString(), "en-us_EN");
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals(locale12.toString(), "en");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        java.util.Locale locale3 = new java.util.Locale("en_us", "en-us (english (united kingdom))", "Korean");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for en_us");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "en_us_EN-US (ENGLISH (UNITED KINGDOM))_Korean");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.Random random3 = new java.util.Random();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Finance finance6 = faker5.finance;
        com.github.javafaker.PhoneNumber phoneNumber7 = faker5.phoneNumber;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number9 = faker8.number;
        com.github.javafaker.Number number10 = faker8.number();
        java.lang.String str12 = faker8.bothify("en-GB");
        com.github.javafaker.Book book13 = faker8.book();
        com.github.javafaker.DateAndTime dateAndTime14 = faker8.dateAndTime;
        com.github.javafaker.Finance finance15 = faker8.finance();
        faker5.finance = finance15;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number18 = faker17.number;
        com.github.javafaker.Number number19 = faker17.number();
        java.lang.String str21 = faker17.bothify("en-GB");
        com.github.javafaker.Book book22 = faker17.book();
        com.github.javafaker.DateAndTime dateAndTime23 = faker17.dateAndTime;
        com.github.javafaker.service.FakeValuesService fakeValuesService24 = faker17.fakeValuesService;
        faker5.fakeValuesService = fakeValuesService24;
        faker2.fakeValuesService = fakeValuesService24;
        com.github.javafaker.Company company27 = faker2.company;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en-GB" + "'", str12, "en-GB");
        org.junit.Assert.assertNotNull(book13);
        org.junit.Assert.assertNotNull(dateAndTime14);
        org.junit.Assert.assertNotNull(finance15);
        org.junit.Assert.assertNotNull(number18);
        org.junit.Assert.assertNotNull(number19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en-GB" + "'", str21, "en-GB");
        org.junit.Assert.assertNotNull(book22);
        org.junit.Assert.assertNotNull(dateAndTime23);
        org.junit.Assert.assertNotNull(fakeValuesService24);
        org.junit.Assert.assertNotNull(company27);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getVariant();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale4.getDisplayVariant(locale6);
        java.lang.String str8 = locale6.getCountry();
        java.util.Random random9 = new java.util.Random();
        double double10 = random9.nextDouble();
        int int12 = random9.nextInt(1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale6, random9);
        java.util.Locale.Builder builder14 = builder2.setLocale(locale6);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FR" + "'", str8, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8754566751808472d + "'", double10 == 0.8754566751808472d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Code code8 = null;
        faker1.code = code8;
        com.github.javafaker.DateAndTime dateAndTime10 = faker1.date();
        com.github.javafaker.PhoneNumber phoneNumber11 = faker1.phoneNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(phoneNumber11);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Finance finance6 = faker0.finance();
        com.github.javafaker.Business business7 = faker0.business;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        java.util.Random random1 = new java.util.Random(4406628851294932275L);
        random1.setSeed((long) 'a');
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setExtension(' ', "en,US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Name name8 = faker1.name;
        com.github.javafaker.service.RandomService randomService9 = faker1.randomService;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(randomService9);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        java.util.Locale locale1 = new java.util.Locale("it");
        java.lang.String str2 = locale1.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italian" + "'", str2, "Italian");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number6 = faker5.number;
        com.github.javafaker.Number number7 = faker5.number();
        java.lang.String str9 = faker5.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = faker5.fakeValuesService;
        java.util.Random random11 = new java.util.Random();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Lorem lorem13 = null;
        faker12.lorem = lorem13;
        com.github.javafaker.PhoneNumber phoneNumber15 = faker12.phoneNumber;
        com.github.javafaker.Color color16 = faker12.color();
        faker5.color = color16;
        faker3.color = color16;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en-GB" + "'", str9, "en-GB");
        org.junit.Assert.assertNotNull(fakeValuesService10);
        org.junit.Assert.assertNotNull(phoneNumber15);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.clear();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        java.util.Random random1 = new java.util.Random(8470782857853326036L);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("FRA");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale9 = new java.util.Locale("fr_FR", "hi!", "eng");
        java.lang.String str10 = locale9.toLanguageTag();
        java.lang.String str11 = locale4.getDisplayVariant(locale9);
        java.util.Random random13 = new java.util.Random(4406628851294932275L);
        java.util.stream.IntStream intStream14 = random13.ints();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale4, random13);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals(locale9.toString(), "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "x-lvariant-eng" + "'", str10, "x-lvariant-eng");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(intStream14);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("chinese (taiwan)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinese (taiwan)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Name name5 = faker0.name();
        java.util.Locale locale7 = new java.util.Locale("hi!");
        java.lang.String str8 = locale7.getVariant();
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale7.getDisplayVariant(locale9);
        java.lang.String str11 = locale9.getCountry();
        java.util.Random random12 = new java.util.Random();
        double double13 = random12.nextDouble();
        int int15 = random12.nextInt(1);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale9, random12);
        com.github.javafaker.Business business17 = faker16.business;
        java.lang.String str19 = faker16.bothify("en-US");
        com.github.javafaker.Number number20 = faker16.number();
        java.lang.String str22 = faker16.numerify("");
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
        faker16.color = color33;
        faker0.color = color33;
        java.util.Random random37 = new java.util.Random();
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Lorem lorem39 = null;
        faker38.lorem = lorem39;
        java.lang.String str42 = faker38.numerify("");
        com.github.javafaker.Company company43 = faker38.company;
        com.github.javafaker.Number number44 = faker38.number();
        faker0.number = number44;
        com.github.javafaker.Number number46 = faker0.number;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FR" + "'", str11, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.28171389726092455d + "'", double13 == 0.28171389726092455d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(business17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "en-US" + "'", str19, "en-US");
        org.junit.Assert.assertNotNull(number20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(company43);
        org.junit.Assert.assertNotNull(number44);
        org.junit.Assert.assertNotNull(number46);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder1.setLanguageTag("fr-fr");
        java.util.Locale locale6 = java.util.Locale.PRC;
        java.util.Locale.Builder builder7 = builder5.setLocale(locale6);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem9 = null;
        faker8.lorem = lorem9;
        com.github.javafaker.Internet internet11 = null;
        faker8.internet = internet11;
        java.lang.String str14 = faker8.bothify("");
        com.github.javafaker.Code code15 = null;
        faker8.code = code15;
        com.github.javafaker.DateAndTime dateAndTime17 = faker8.date();
        faker5.dateAndTime = dateAndTime17;
        com.github.javafaker.PhoneNumber phoneNumber19 = null;
        faker5.phoneNumber = phoneNumber19;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48341901828942047d + "'", double1 == 0.48341901828942047d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(dateAndTime17);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ROOT;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.lang.String str4 = locale1.getScript();
        java.lang.String str5 = locale1.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        double double5 = random0.nextDouble();
        random0.setSeed((long) (-1));
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random0);
        java.util.Random random9 = new java.util.Random();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Lorem lorem11 = null;
        faker10.lorem = lorem11;
        java.util.Random random13 = new java.util.Random();
        double double14 = random13.nextDouble();
        java.util.stream.IntStream intStream17 = random13.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Code code19 = faker18.code();
        faker10.code = code19;
        com.github.javafaker.Lorem lorem21 = faker10.lorem();
        java.util.Random random22 = new java.util.Random();
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.Lorem lorem24 = null;
        faker23.lorem = lorem24;
        com.github.javafaker.PhoneNumber phoneNumber26 = faker23.phoneNumber;
        faker10.phoneNumber = phoneNumber26;
        com.github.javafaker.PhoneNumber phoneNumber28 = faker10.phoneNumber();
        com.github.javafaker.Code code29 = faker10.code;
        com.github.javafaker.Name name30 = faker10.name();
        faker8.name = name30;
        com.github.javafaker.Business business32 = faker8.business;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9546475646949604d + "'", double1 == 0.9546475646949604d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9496261683639323d + "'", double5 == 0.9496261683639323d);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.10085834235610669d + "'", double14 == 0.10085834235610669d);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(code19);
        org.junit.Assert.assertNull(lorem21);
        org.junit.Assert.assertNotNull(phoneNumber26);
        org.junit.Assert.assertNotNull(phoneNumber28);
        org.junit.Assert.assertNotNull(code29);
        org.junit.Assert.assertNotNull(name30);
        org.junit.Assert.assertNotNull(business32);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("en_US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en_US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("FRENCH", (-1.9737120884369004d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.9737120884369004");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        java.util.Random random1 = new java.util.Random((long) 'a');
        boolean boolean2 = random1.nextBoolean();
        java.util.stream.LongStream longStream4 = random1.longs((long) (byte) 10);
        double double5 = random1.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random1.doubles(0.23547324630498834d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4796372950430358d + "'", double5 == 0.4796372950430358d);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = faker5.fakeValuesService;
        com.github.javafaker.Finance finance8 = faker5.finance;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9591837240707582d + "'", double1 == 0.9591837240707582d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        java.util.Random random1 = new java.util.Random((long) 19);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Color color10 = faker7.color;
        faker1.color = color10;
        java.util.Random random12 = new java.util.Random();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Lorem lorem14 = null;
        faker13.lorem = lorem14;
        java.lang.String str17 = faker13.numerify("");
        com.github.javafaker.Company company18 = faker13.company;
        com.github.javafaker.Options options19 = faker13.options();
        faker1.options = options19;
        com.github.javafaker.PhoneNumber phoneNumber21 = faker1.phoneNumber();
        com.github.javafaker.Finance finance22 = faker1.finance;
        com.github.javafaker.DateAndTime dateAndTime23 = faker1.dateAndTime;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(company18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(phoneNumber21);
        org.junit.Assert.assertNotNull(finance22);
        org.junit.Assert.assertNotNull(dateAndTime23);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Color color10 = faker7.color;
        faker1.color = color10;
        com.github.javafaker.PhoneNumber phoneNumber12 = faker1.phoneNumber;
        java.util.Random random13 = new java.util.Random();
        double double14 = random13.nextDouble();
        java.util.stream.IntStream intStream17 = random13.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Code code19 = faker18.code();
        com.github.javafaker.Address address20 = faker18.address;
        com.github.javafaker.DateAndTime dateAndTime21 = faker18.date();
        java.lang.String str23 = faker18.bothify("fran\347ais");
        com.github.javafaker.DateAndTime dateAndTime24 = faker18.dateAndTime;
        faker1.dateAndTime = dateAndTime24;
        com.github.javafaker.Internet internet26 = faker1.internet();
        com.github.javafaker.Options options27 = faker1.options;
        com.github.javafaker.Name name28 = faker1.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(phoneNumber12);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.8491124865703487d + "'", double14 == 0.8491124865703487d);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(code19);
        org.junit.Assert.assertNotNull(address20);
        org.junit.Assert.assertNotNull(dateAndTime21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "fran\347ais" + "'", str23, "fran\347ais");
        org.junit.Assert.assertNotNull(dateAndTime24);
        org.junit.Assert.assertNotNull(internet26);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(name28);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        com.github.javafaker.Name name6 = faker1.name;
        com.github.javafaker.Code code7 = faker1.code;
        java.util.Locale locale9 = new java.util.Locale("hi!");
        java.lang.String str10 = locale9.getVariant();
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.lang.String str12 = locale9.getDisplayVariant(locale11);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale11);
        com.github.javafaker.Business business14 = faker13.business();
        faker1.business = business14;
        java.util.Locale locale17 = new java.util.Locale("hi!");
        java.lang.String str18 = locale17.getVariant();
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.lang.String str20 = locale17.getDisplayVariant(locale19);
        java.lang.String str21 = locale19.getCountry();
        java.util.Random random22 = new java.util.Random();
        double double23 = random22.nextDouble();
        int int25 = random22.nextInt(1);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale19, random22);
        com.github.javafaker.Business business27 = faker26.business;
        java.lang.String str29 = faker26.bothify("en-US");
        com.github.javafaker.Number number30 = faker26.number();
        com.github.javafaker.PhoneNumber phoneNumber31 = faker26.phoneNumber;
        java.util.Random random32 = new java.util.Random();
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(random32);
        com.github.javafaker.Lorem lorem34 = null;
        faker33.lorem = lorem34;
        com.github.javafaker.Color color36 = faker33.color;
        com.github.javafaker.Finance finance37 = faker33.finance();
        com.github.javafaker.Address address38 = faker33.address;
        com.github.javafaker.Code code39 = faker33.code;
        java.util.Random random40 = new java.util.Random();
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(random40);
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker(random40);
        com.github.javafaker.Finance finance43 = faker42.finance;
        faker33.finance = finance43;
        faker26.finance = finance43;
        faker1.finance = finance43;
        com.github.javafaker.PhoneNumber phoneNumber47 = faker1.phoneNumber();
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(business14);
        org.junit.Assert.assertEquals(locale17.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "FR" + "'", str21, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.7119393242958861d + "'", double23 == 0.7119393242958861d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(business27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en-US" + "'", str29, "en-US");
        org.junit.Assert.assertNotNull(number30);
        org.junit.Assert.assertNotNull(phoneNumber31);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(finance37);
        org.junit.Assert.assertNotNull(address38);
        org.junit.Assert.assertNotNull(code39);
        org.junit.Assert.assertNotNull(finance43);
        org.junit.Assert.assertNotNull(phoneNumber47);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.lang.String str9 = locale7.getDisplayLanguage();
        java.util.Random random11 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream14 = random11.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale7, random11);
        int int17 = random11.nextInt((int) (short) 100);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fran\347ais" + "'", str6, "fran\347ais");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "japonais" + "'", str9, "japonais");
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 13 + "'", int17 == 13);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Lorem lorem5 = faker0.lorem();
        com.github.javafaker.Name name6 = faker0.name;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(name6);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder1.setScript("en_us");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: en_us [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        java.util.Random random1 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream4 = random1.longs((long) (short) 0, (long) (byte) 1);
        java.util.Random random6 = new java.util.Random((long) (byte) 1);
        byte[] byteArray8 = new byte[] { (byte) -1 };
        random6.nextBytes(byteArray8);
        random1.nextBytes(byteArray8);
        int int11 = random1.nextInt();
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-46]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1913984760 + "'", int11 == 1913984760);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.setLanguageTag("France");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("fr_FR_FR", "italian");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: fr_FR_FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        double double2 = random0.nextGaussian();
        random0.setSeed((long) (short) 10);
        java.util.stream.IntStream intStream8 = random0.ints(0L, 0, (int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream11 = random0.ints(106, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03510389766052259d + "'", double2 == 0.03510389766052259d);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        com.github.javafaker.Company company7 = faker5.company();
        com.github.javafaker.DateAndTime dateAndTime8 = faker5.dateAndTime;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.030114307193900736d + "'", double1 == 0.030114307193900736d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ENGLISH (UNITED KINGDOM)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english (united kingdom)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        java.util.Random random1 = new java.util.Random((long) (short) -1);
        double double2 = random1.nextGaussian();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7853314409882288d + "'", double2 == 1.7853314409882288d);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Random random3 = new java.util.Random(1L);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale1, random3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Company company6 = faker5.company;
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(company6);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Code code8 = null;
        faker1.code = code8;
        com.github.javafaker.Number number10 = faker1.number();
        com.github.javafaker.Finance finance11 = faker1.finance();
        com.github.javafaker.Company company12 = faker1.company();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(company12);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getDisplayCountry();
        java.util.Random random7 = new java.util.Random((long) 'x');
        java.util.stream.LongStream longStream11 = random7.longs(0L, (long) (short) 10, (long) 'u');
        double double12 = random7.nextDouble();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale3, random7);
        int int15 = random7.nextInt((int) ' ');
        double double16 = random7.nextDouble();
        double double17 = random7.nextGaussian();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "France" + "'", str5, "France");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.7230846212249419d + "'", double12 == 0.7230846212249419d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.10266837214813407d + "'", double16 == 0.10266837214813407d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.6306734812897439d) + "'", double17 == (-0.6306734812897439d));
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        java.util.Locale locale3 = new java.util.Locale("French (France)", "English (United Kingdom)", "fra");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for ENGLISH (UNITED KINGDOM)");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "french (france)_ENGLISH (UNITED KINGDOM)_fra");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = null;
        faker0.code = code1;
        com.github.javafaker.Book book3 = faker0.book;
        java.lang.String str5 = faker0.letterify("x-lvariant-eng");
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "x-lvariant-eng" + "'", str5, "x-lvariant-eng");
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        java.util.Random random1 = new java.util.Random(4406628851294932275L);
        boolean boolean2 = random1.nextBoolean();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Italian", (double) (short) 1);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        java.lang.String str5 = languageRange2.getRange();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italian" + "'", str5, "italian");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder12 = builder9.setScript("");
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale14 = builder12.build();
        java.util.Locale locale16 = new java.util.Locale("hi!");
        java.lang.String str17 = locale16.getVariant();
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.lang.String str19 = locale16.getDisplayVariant(locale18);
        java.lang.String str20 = locale18.getCountry();
        java.lang.String str21 = locale18.getDisplayLanguage();
        java.util.Locale locale22 = java.util.Locale.JAPANESE;
        java.lang.String str23 = locale18.getDisplayScript(locale22);
        java.util.Locale locale24 = java.util.Locale.FRENCH;
        java.lang.String str25 = locale18.getDisplayCountry(locale24);
        java.lang.String str26 = locale14.getDisplayLanguage(locale24);
        java.lang.String str27 = locale8.getDisplayLanguage(locale24);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "FR" + "'", str20, "FR");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "fran\347ais" + "'", str21, "fran\347ais");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "France" + "'", str25, "France");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Options options6 = faker1.options;
        com.github.javafaker.Finance finance7 = faker1.finance;
        com.github.javafaker.Number number8 = faker1.number();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.IntStream intStream4 = random1.ints((int) (byte) 1, (int) 'x');
        java.util.stream.IntStream intStream7 = random1.ints((-1646791838), 33);
        boolean boolean8 = random1.nextBoolean();
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        java.util.Random random1 = new java.util.Random(1L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Finance finance3 = null;
        faker2.finance = finance3;
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        java.util.Random random7 = new java.util.Random();
        double double8 = random7.nextDouble();
        int int10 = random7.nextInt(1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService12 = faker11.randomService;
        faker1.randomService = randomService12;
        com.github.javafaker.Finance finance14 = faker1.finance();
        com.github.javafaker.Lorem lorem15 = faker1.lorem();
        com.github.javafaker.PhoneNumber phoneNumber16 = faker1.phoneNumber();
        com.github.javafaker.PhoneNumber phoneNumber17 = faker1.phoneNumber;
        com.github.javafaker.Finance finance18 = faker1.finance;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(lorem6);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5028384904191777d + "'", double8 == 0.5028384904191777d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(randomService12);
        org.junit.Assert.assertNotNull(finance14);
        org.junit.Assert.assertNull(lorem15);
        org.junit.Assert.assertNotNull(phoneNumber16);
        org.junit.Assert.assertNotNull(phoneNumber17);
        org.junit.Assert.assertNotNull(finance18);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Color color10 = faker7.color;
        faker1.color = color10;
        com.github.javafaker.PhoneNumber phoneNumber12 = faker1.phoneNumber;
        java.util.Random random13 = new java.util.Random();
        double double14 = random13.nextDouble();
        java.util.stream.IntStream intStream17 = random13.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Code code19 = faker18.code();
        com.github.javafaker.Address address20 = faker18.address;
        com.github.javafaker.DateAndTime dateAndTime21 = faker18.date();
        java.lang.String str23 = faker18.bothify("fran\347ais");
        com.github.javafaker.DateAndTime dateAndTime24 = faker18.dateAndTime;
        faker1.dateAndTime = dateAndTime24;
        com.github.javafaker.Internet internet26 = faker1.internet();
        com.github.javafaker.Business business27 = faker1.business;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(phoneNumber12);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5816850455120219d + "'", double14 == 0.5816850455120219d);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(code19);
        org.junit.Assert.assertNotNull(address20);
        org.junit.Assert.assertNotNull(dateAndTime21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "fran\347ais" + "'", str23, "fran\347ais");
        org.junit.Assert.assertNotNull(dateAndTime24);
        org.junit.Assert.assertNotNull(internet26);
        org.junit.Assert.assertNotNull(business27);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("anglais (Royaume-Uni)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=anglais(royaume-uni)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        java.util.Random random1 = new java.util.Random((long) 79);
        java.util.stream.LongStream longStream5 = random1.longs((long) 5, (long) (-938122935), (long) 45);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList6);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList14);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList22);
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList22);
        java.util.Locale.FilteringMode filteringMode26 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList25, filteringMode26);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.parse("French", strMap29);
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.List<java.lang.String> strList38 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strList36);
        java.util.Locale locale42 = new java.util.Locale("", "", "");
        java.util.Set<java.lang.String> strSet43 = locale42.getUnicodeLocaleKeys();
        java.lang.String str44 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strSet43);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, strMap45);
        java.util.Locale locale50 = new java.util.Locale("", "", "");
        java.util.Locale locale52 = new java.util.Locale("hi!");
        java.lang.String str53 = locale52.getVariant();
        java.util.Set<java.lang.String> strSet54 = locale52.getUnicodeLocaleKeys();
        java.lang.String str55 = locale50.getDisplayLanguage(locale52);
        java.lang.String str56 = locale50.getLanguage();
        java.util.Set<java.lang.String> strSet57 = locale50.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strSet57);
        java.util.Locale.LanguageRange[] languageRangeArray59 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList60 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList60, languageRangeArray59);
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, (java.util.Collection<java.lang.String>) strList64);
        java.util.Locale.LanguageRange[] languageRangeArray67 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList68 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList68, languageRangeArray67);
        java.lang.String[] strArray71 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, (java.util.Collection<java.lang.String>) strList72);
        java.util.Locale.LanguageRange[] languageRangeArray75 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList76 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList76, languageRangeArray75);
        java.lang.String[] strArray79 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList76, (java.util.Collection<java.lang.String>) strList80);
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, (java.util.Collection<java.lang.String>) strList80);
        java.util.Locale.FilteringMode filteringMode84 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, (java.util.Collection<java.lang.String>) strList83, filteringMode84);
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags(languageRangeList30, (java.util.Collection<java.lang.String>) strSet57, filteringMode84);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strList25, filteringMode84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + filteringMode26 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode26.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals(locale52.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(languageRangeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(languageRangeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(languageRangeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertTrue("'" + filteringMode84 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode84.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(strList86);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        java.util.Locale locale3 = new java.util.Locale("fra", "french", "tw");
        org.junit.Assert.assertEquals(locale3.toString(), "fra_FRENCH_tw");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3, random4);
        java.lang.String str6 = locale3.getISO3Language();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Set<java.lang.String> strSet8 = locale3.getUnicodeLocaleKeys();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale3);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra" + "'", str6, "fra");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        java.util.Locale locale2 = new java.util.Locale("Italian", "FRENCH");
        org.junit.Assert.assertEquals(locale2.toString(), "italian_FRENCH");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        java.util.Random random1 = new java.util.Random((long) 765121682);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("x-lvariant-eng", 0.24451844454187255d);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Random random3 = new java.util.Random(1L);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale1, random3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder1.build();
        java.util.Locale.Builder builder4 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder1.setRegion("GBR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: GBR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.setDefault(locale1);
        java.lang.String str3 = locale1.toLanguageTag();
        boolean boolean4 = locale1.hasExtensions();
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-FR" + "'", str3, "fr-FR");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fr");
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("fra", 0.7081031632538951d);
        java.util.Locale.LanguageRange languageRange6 = new java.util.Locale.LanguageRange("FR");
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] { languageRange4, languageRange6 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList15);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList23);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList31);
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList31);
        java.util.Locale.FilteringMode filteringMode35 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList36 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList34, filteringMode35);
        java.lang.String str37 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap38 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList39 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap38);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap41 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList42 = java.util.Locale.LanguageRange.parse("France", strMap41);
        java.util.Locale locale44 = new java.util.Locale("hi!");
        java.lang.String str45 = locale44.getVariant();
        java.util.Set<java.lang.String> strSet46 = locale44.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags(languageRangeList42, (java.util.Collection<java.lang.String>) strSet46);
        java.util.Locale.FilteringMode filteringMode48 = null;
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList47, filteringMode48);
        java.util.Locale.FilteringMode filteringMode50 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList47, filteringMode50);
        java.util.Locale.LanguageRange languageRange53 = new java.util.Locale.LanguageRange("en-US");
        java.util.Locale.LanguageRange languageRange55 = new java.util.Locale.LanguageRange("en");
        java.util.Locale.LanguageRange[] languageRangeArray56 = new java.util.Locale.LanguageRange[] { languageRange53, languageRange55 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList57 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57, languageRangeArray56);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap59 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList60 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, strMap59);
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.lang.String>) strList66);
        java.util.Locale.LanguageRange[] languageRangeArray69 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList70 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList70, languageRangeArray69);
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList70, (java.util.Collection<java.lang.String>) strList74);
        java.util.Locale.LanguageRange[] languageRangeArray77 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList78 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList78, languageRangeArray77);
        java.lang.String[] strArray81 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList82 = new java.util.ArrayList<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList82, strArray81);
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList78, (java.util.Collection<java.lang.String>) strList82);
        java.util.Locale.LanguageRange[] languageRangeArray85 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList86 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList86, languageRangeArray85);
        java.lang.String[] strArray89 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList90 = new java.util.ArrayList<java.lang.String>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList90, strArray89);
        java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList86, (java.util.Collection<java.lang.String>) strList90);
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList78, (java.util.Collection<java.lang.String>) strList90);
        java.util.Locale.FilteringMode filteringMode94 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList95 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList70, (java.util.Collection<java.lang.String>) strList93, filteringMode94);
        java.util.List<java.lang.String> strList96 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, (java.util.Collection<java.lang.String>) strList66, filteringMode94);
        java.util.List<java.lang.String> strList97 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList96);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + filteringMode35 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode35.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(languageRangeList39);
        org.junit.Assert.assertNotNull(languageRangeList42);
        org.junit.Assert.assertEquals(locale44.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertTrue("'" + filteringMode50 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode50.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(languageRangeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(languageRangeList60);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(languageRangeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(languageRangeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(languageRangeArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertTrue("'" + filteringMode94 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode94.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList95);
        org.junit.Assert.assertNotNull(strList96);
        org.junit.Assert.assertNotNull(strList97);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        double double2 = random1.nextDouble();
        int int4 = random1.nextInt(1);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Book book6 = faker5.book();
        faker0.book = book6;
        com.github.javafaker.Address address8 = faker0.address;
        com.github.javafaker.Number number9 = faker0.number;
        java.util.Random random10 = new java.util.Random();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Lorem lorem12 = null;
        faker11.lorem = lorem12;
        java.lang.String str15 = faker11.numerify("hi!");
        com.github.javafaker.Color color16 = faker11.color;
        com.github.javafaker.Lorem lorem17 = faker11.lorem;
        com.github.javafaker.DateAndTime dateAndTime18 = faker11.dateAndTime;
        faker0.dateAndTime = dateAndTime18;
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9398315166152662d + "'", double2 == 0.9398315166152662d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(address8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(lorem17);
        org.junit.Assert.assertNotNull(dateAndTime18);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        com.github.javafaker.Business business38 = faker0.business;
        com.github.javafaker.Lorem lorem39 = faker0.lorem;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(phoneNumber23);
        org.junit.Assert.assertEquals(locale26.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "FR" + "'", str30, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.11468550027954649d + "'", double32 == 0.11468550027954649d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(internet36);
        org.junit.Assert.assertNotNull(business38);
        org.junit.Assert.assertNotNull(lorem39);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        java.util.Random random1 = new java.util.Random(1L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.service.RandomService randomService3 = faker2.randomService;
        java.lang.String str5 = faker2.numerify("fran\347ais (France)");
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random6);
        double double11 = random6.nextDouble();
        random6.setSeed((long) (-1));
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random6);
        java.util.Random random15 = new java.util.Random();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.Lorem lorem17 = null;
        faker16.lorem = lorem17;
        java.util.Random random19 = new java.util.Random();
        double double20 = random19.nextDouble();
        java.util.stream.IntStream intStream23 = random19.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.Code code25 = faker24.code();
        faker16.code = code25;
        com.github.javafaker.Lorem lorem27 = faker16.lorem();
        java.util.Random random28 = new java.util.Random();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Lorem lorem30 = null;
        faker29.lorem = lorem30;
        com.github.javafaker.PhoneNumber phoneNumber32 = faker29.phoneNumber;
        faker16.phoneNumber = phoneNumber32;
        com.github.javafaker.PhoneNumber phoneNumber34 = faker16.phoneNumber();
        com.github.javafaker.Code code35 = faker16.code;
        com.github.javafaker.Name name36 = faker16.name();
        faker14.name = name36;
        faker2.name = name36;
        com.github.javafaker.Lorem lorem39 = faker2.lorem;
        org.junit.Assert.assertNotNull(randomService3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fran\347ais (France)" + "'", str5, "fran\347ais (France)");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7650761181948156d + "'", double7 == 0.7650761181948156d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.975850289653477d + "'", double11 == 0.975850289653477d);
// flaky:         org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.17490448100613476d + "'", double20 == 0.17490448100613476d);
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertNotNull(code25);
        org.junit.Assert.assertNull(lorem27);
        org.junit.Assert.assertNotNull(phoneNumber32);
        org.junit.Assert.assertNotNull(phoneNumber34);
        org.junit.Assert.assertNotNull(code35);
        org.junit.Assert.assertNotNull(name36);
        org.junit.Assert.assertNotNull(lorem39);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Color color4 = faker1.color;
        com.github.javafaker.Address address5 = faker1.address;
        java.lang.String str7 = faker1.letterify("fran\347ais (France)");
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        java.util.Random random12 = new java.util.Random();
        double double13 = random12.nextDouble();
        java.util.stream.IntStream intStream16 = random12.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Code code18 = faker17.code();
        faker9.code = code18;
        com.github.javafaker.Lorem lorem20 = faker9.lorem();
        com.github.javafaker.Lorem lorem21 = faker9.lorem();
        com.github.javafaker.PhoneNumber phoneNumber22 = faker9.phoneNumber();
        com.github.javafaker.Name name23 = faker9.name();
        faker1.name = name23;
        com.github.javafaker.Company company25 = faker1.company();
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fran\347ais (France)" + "'", str7, "fran\347ais (France)");
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.10352457864241638d + "'", double13 == 0.10352457864241638d);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(code18);
        org.junit.Assert.assertNull(lorem20);
        org.junit.Assert.assertNull(lorem21);
        org.junit.Assert.assertNotNull(phoneNumber22);
        org.junit.Assert.assertNotNull(name23);
        org.junit.Assert.assertNotNull(company25);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        java.util.Random random1 = new java.util.Random(100L);
        random1.setSeed((long) 1260435278);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Address address4 = faker1.address();
        org.junit.Assert.assertNotNull(address4);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = null;
        faker0.code = code1;
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale7);
        com.github.javafaker.Business business10 = faker9.business();
        faker0.business = business10;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number13 = faker12.number;
        com.github.javafaker.Number number14 = faker12.number();
        java.lang.String str16 = faker12.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService17 = faker12.fakeValuesService;
        java.util.Random random18 = new java.util.Random();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.Lorem lorem20 = null;
        faker19.lorem = lorem20;
        com.github.javafaker.PhoneNumber phoneNumber22 = faker19.phoneNumber;
        com.github.javafaker.Color color23 = faker19.color();
        faker12.color = color23;
        com.github.javafaker.Color color25 = faker12.color;
        faker0.color = color25;
        java.util.Random random27 = new java.util.Random();
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(random27);
        com.github.javafaker.Lorem lorem29 = null;
        faker28.lorem = lorem29;
        java.lang.String str32 = faker28.numerify("");
        com.github.javafaker.Company company33 = faker28.company;
        com.github.javafaker.Number number34 = faker28.number();
        com.github.javafaker.Code code35 = faker28.code();
        faker0.code = code35;
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(business10);
        org.junit.Assert.assertNotNull(number13);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "en-GB" + "'", str16, "en-GB");
        org.junit.Assert.assertNotNull(fakeValuesService17);
        org.junit.Assert.assertNotNull(phoneNumber22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(company33);
        org.junit.Assert.assertNotNull(number34);
        org.junit.Assert.assertNotNull(code35);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder1.setVariant("");
        java.util.Locale.Builder builder7 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setExtension('a', "en-us (ENGLISH (UNITED KINGDOM))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: us (ENGLISH (UNITED KINGDOM)) [at index 3]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale8 = new java.util.Locale("france", "eng", "de");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setLocale(locale8);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ENG [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals(locale8.toString(), "france_ENG_de");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder6 = builder3.setVariant("France");
        java.util.Locale.Builder builder9 = builder3.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder3.setRegion("fran\347ais");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: franc?ais [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.Company company6 = faker1.company;
        com.github.javafaker.Number number7 = faker1.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker1.fakeValuesService;
        com.github.javafaker.Book book9 = faker1.book;
        java.util.Random random10 = new java.util.Random();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Lorem lorem12 = null;
        faker11.lorem = lorem12;
        com.github.javafaker.Internet internet14 = null;
        faker11.internet = internet14;
        com.github.javafaker.Business business16 = faker11.business();
        java.util.Random random17 = new java.util.Random();
        double double18 = random17.nextDouble();
        int int20 = random17.nextInt(1);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Book book22 = faker21.book();
        faker11.book = book22;
        faker1.book = book22;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(business16);
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.15206880079331087d + "'", double18 == 0.15206880079331087d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(book22);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem3 = null;
        faker2.lorem = lorem3;
        com.github.javafaker.PhoneNumber phoneNumber5 = faker2.phoneNumber;
        faker0.phoneNumber = phoneNumber5;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        com.github.javafaker.PhoneNumber phoneNumber12 = faker9.phoneNumber;
        faker7.phoneNumber = phoneNumber12;
        com.github.javafaker.Options options14 = faker7.options;
        faker0.options = options14;
        com.github.javafaker.Internet internet16 = faker0.internet();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number18 = faker17.number;
        com.github.javafaker.Number number19 = faker17.number();
        java.lang.String str21 = faker17.bothify("en-GB");
        com.github.javafaker.Book book22 = faker17.book();
        com.github.javafaker.DateAndTime dateAndTime23 = faker17.dateAndTime;
        com.github.javafaker.service.FakeValuesService fakeValuesService24 = faker17.fakeValuesService;
        java.util.Random random25 = new java.util.Random();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random25);
        com.github.javafaker.Lorem lorem27 = null;
        faker26.lorem = lorem27;
        com.github.javafaker.Internet internet29 = null;
        faker26.internet = internet29;
        java.lang.String str32 = faker26.bothify("");
        com.github.javafaker.Book book33 = faker26.book();
        faker17.book = book33;
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker();
        java.util.Random random36 = new java.util.Random();
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker(random36);
        com.github.javafaker.Lorem lorem38 = null;
        faker37.lorem = lorem38;
        com.github.javafaker.PhoneNumber phoneNumber40 = faker37.phoneNumber;
        faker35.phoneNumber = phoneNumber40;
        com.github.javafaker.Options options42 = faker35.options;
        faker17.options = options42;
        faker0.options = options42;
        java.util.Random random45 = new java.util.Random();
        double double46 = random45.nextDouble();
        java.util.stream.IntStream intStream49 = random45.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker50 = new com.github.javafaker.Faker(random45);
        com.github.javafaker.Lorem lorem51 = faker50.lorem();
        com.github.javafaker.Company company52 = faker50.company();
        com.github.javafaker.Code code53 = faker50.code();
        java.util.Random random54 = new java.util.Random();
        com.github.javafaker.Faker faker55 = new com.github.javafaker.Faker(random54);
        com.github.javafaker.Lorem lorem56 = null;
        faker55.lorem = lorem56;
        java.lang.String str59 = faker55.numerify("");
        com.github.javafaker.Company company60 = faker55.company;
        com.github.javafaker.Options options61 = faker55.options();
        java.util.Random random62 = new java.util.Random();
        double double63 = random62.nextDouble();
        java.util.stream.IntStream intStream66 = random62.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker67 = new com.github.javafaker.Faker(random62);
        com.github.javafaker.Code code68 = faker67.code();
        com.github.javafaker.Color color69 = faker67.color;
        faker55.color = color69;
        com.github.javafaker.Lorem lorem71 = faker55.lorem();
        com.github.javafaker.Code code72 = faker55.code;
        faker50.code = code72;
        faker0.code = code72;
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(internet16);
        org.junit.Assert.assertNotNull(number18);
        org.junit.Assert.assertNotNull(number19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en-GB" + "'", str21, "en-GB");
        org.junit.Assert.assertNotNull(book22);
        org.junit.Assert.assertNotNull(dateAndTime23);
        org.junit.Assert.assertNotNull(fakeValuesService24);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(book33);
        org.junit.Assert.assertNotNull(phoneNumber40);
        org.junit.Assert.assertNotNull(options42);
// flaky:         org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.8681247736706168d + "'", double46 == 0.8681247736706168d);
        org.junit.Assert.assertNotNull(intStream49);
        org.junit.Assert.assertNotNull(lorem51);
        org.junit.Assert.assertNotNull(company52);
        org.junit.Assert.assertNotNull(code53);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(company60);
        org.junit.Assert.assertNotNull(options61);
// flaky:         org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.7184498911005645d + "'", double63 == 0.7184498911005645d);
        org.junit.Assert.assertNotNull(intStream66);
        org.junit.Assert.assertNotNull(code68);
        org.junit.Assert.assertNotNull(color69);
        org.junit.Assert.assertNull(lorem71);
        org.junit.Assert.assertNotNull(code72);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem3 = null;
        faker2.lorem = lorem3;
        com.github.javafaker.PhoneNumber phoneNumber5 = faker2.phoneNumber;
        faker0.phoneNumber = phoneNumber5;
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem9 = null;
        faker8.lorem = lorem9;
        java.lang.String str12 = faker8.numerify("");
        com.github.javafaker.Business business13 = faker8.business;
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = faker8.fakeValuesService;
        faker0.fakeValuesService = fakeValuesService14;
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(business13);
        org.junit.Assert.assertNotNull(fakeValuesService14);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        com.github.javafaker.Name name6 = faker1.name;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.dateAndTime;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number9 = faker8.number;
        com.github.javafaker.Number number10 = faker8.number();
        java.lang.String str12 = faker8.bothify("en-GB");
        com.github.javafaker.Name name13 = faker8.name();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code15 = null;
        faker14.code = code15;
        com.github.javafaker.Lorem lorem17 = faker14.lorem();
        faker8.lorem = lorem17;
        java.util.Random random19 = new java.util.Random();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.Lorem lorem21 = null;
        faker20.lorem = lorem21;
        java.lang.String str24 = faker20.numerify("");
        java.util.Random random25 = new java.util.Random();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random25);
        com.github.javafaker.Lorem lorem27 = null;
        faker26.lorem = lorem27;
        com.github.javafaker.Color color29 = faker26.color;
        faker20.color = color29;
        com.github.javafaker.PhoneNumber phoneNumber31 = faker20.phoneNumber;
        faker8.phoneNumber = phoneNumber31;
        java.util.Locale locale34 = new java.util.Locale("hi!");
        java.lang.String str35 = locale34.getVariant();
        java.util.Locale locale36 = java.util.Locale.FRANCE;
        java.lang.String str37 = locale34.getDisplayVariant(locale36);
        java.lang.String str38 = locale36.getCountry();
        java.util.Random random39 = new java.util.Random();
        double double40 = random39.nextDouble();
        int int42 = random39.nextInt(1);
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker(locale36, random39);
        com.github.javafaker.Internet internet44 = faker43.internet();
        faker8.internet = internet44;
        com.github.javafaker.Company company46 = faker8.company;
        java.util.Random random47 = new java.util.Random();
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(random47);
        com.github.javafaker.Lorem lorem49 = null;
        faker48.lorem = lorem49;
        com.github.javafaker.Internet internet51 = null;
        faker48.internet = internet51;
        java.lang.String str54 = faker48.bothify("");
        com.github.javafaker.Name name55 = faker48.name;
        com.github.javafaker.Internet internet56 = faker48.internet();
        com.github.javafaker.Address address57 = faker48.address();
        faker8.address = address57;
        java.util.Locale locale60 = new java.util.Locale("hi!");
        java.lang.String str61 = locale60.getVariant();
        java.util.Locale locale62 = java.util.Locale.FRANCE;
        java.lang.String str63 = locale60.getDisplayVariant(locale62);
        java.lang.String str64 = locale62.getCountry();
        java.lang.String str65 = locale62.getDisplayLanguage();
        java.util.Locale locale66 = java.util.Locale.JAPANESE;
        java.lang.String str67 = locale62.getDisplayScript(locale66);
        java.lang.String str68 = locale66.getDisplayLanguage();
        java.util.Random random70 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream73 = random70.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker74 = new com.github.javafaker.Faker(locale66, random70);
        com.github.javafaker.Business business75 = faker74.business();
        com.github.javafaker.service.FakeValuesService fakeValuesService76 = faker74.fakeValuesService;
        faker8.fakeValuesService = fakeValuesService76;
        faker1.fakeValuesService = fakeValuesService76;
        com.github.javafaker.Faker faker79 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number80 = faker79.number;
        com.github.javafaker.Business business81 = faker79.business();
        java.util.Random random82 = new java.util.Random();
        com.github.javafaker.Faker faker83 = new com.github.javafaker.Faker(random82);
        com.github.javafaker.Lorem lorem84 = null;
        faker83.lorem = lorem84;
        com.github.javafaker.Color color86 = faker83.color;
        com.github.javafaker.Finance finance87 = faker83.finance();
        com.github.javafaker.Address address88 = faker83.address;
        faker79.address = address88;
        com.github.javafaker.Code code90 = faker79.code;
        com.github.javafaker.Number number91 = faker79.number();
        faker1.number = number91;
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en-GB" + "'", str12, "en-GB");
        org.junit.Assert.assertNotNull(name13);
        org.junit.Assert.assertNotNull(lorem17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(phoneNumber31);
        org.junit.Assert.assertEquals(locale34.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "FR" + "'", str38, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.41657298467567916d + "'", double40 == 0.41657298467567916d);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(internet44);
        org.junit.Assert.assertNotNull(company46);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(name55);
        org.junit.Assert.assertNull(internet56);
        org.junit.Assert.assertNotNull(address57);
        org.junit.Assert.assertEquals(locale60.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "FR" + "'", str64, "FR");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "fran\347ais" + "'", str65, "fran\347ais");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "japonais" + "'", str68, "japonais");
        org.junit.Assert.assertNotNull(longStream73);
        org.junit.Assert.assertNotNull(business75);
        org.junit.Assert.assertNotNull(fakeValuesService76);
        org.junit.Assert.assertNotNull(number80);
        org.junit.Assert.assertNotNull(business81);
        org.junit.Assert.assertNotNull(color86);
        org.junit.Assert.assertNotNull(finance87);
        org.junit.Assert.assertNotNull(address88);
        org.junit.Assert.assertNotNull(code90);
        org.junit.Assert.assertNotNull(number91);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Code code8 = null;
        faker1.code = code8;
        com.github.javafaker.Number number10 = faker1.number();
        com.github.javafaker.Finance finance11 = faker1.finance();
        com.github.javafaker.Name name12 = faker1.name;
        com.github.javafaker.Name name13 = faker1.name();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(name13);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.clear();
        java.util.Locale locale9 = builder6.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Company company8 = faker1.company;
        com.github.javafaker.Lorem lorem9 = faker1.lorem;
        com.github.javafaker.Address address10 = faker1.address;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(company8);
        org.junit.Assert.assertNull(lorem9);
        org.junit.Assert.assertNotNull(address10);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        java.util.Random random1 = new java.util.Random(1L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream6 = random1.longs((long) 1, (long) 1, 100L);
        double double7 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.561581040188955d + "'", double7 == 1.561581040188955d);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.lang.String str6 = locale3.getDisplayVariant(locale5);
        java.lang.String str7 = locale5.getCountry();
        java.util.Random random8 = new java.util.Random();
        double double9 = random8.nextDouble();
        int int11 = random8.nextInt(1);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale5, random8);
        com.github.javafaker.Business business13 = faker12.business;
        java.lang.String str15 = faker12.bothify("en-US");
        com.github.javafaker.Number number16 = faker12.number();
        com.github.javafaker.Options options17 = faker12.options();
        com.github.javafaker.Options options18 = faker12.options;
        faker1.options = options18;
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FR" + "'", str7, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6918989022668338d + "'", double9 == 0.6918989022668338d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(business13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en-US" + "'", str15, "en-US");
        org.junit.Assert.assertNotNull(number16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(options18);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.util.Random random4 = new java.util.Random();
        double double5 = random4.nextDouble();
        java.util.stream.IntStream intStream8 = random4.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Code code10 = faker9.code();
        faker1.code = code10;
        com.github.javafaker.Lorem lorem12 = faker1.lorem();
        java.util.Random random13 = new java.util.Random();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Lorem lorem15 = null;
        faker14.lorem = lorem15;
        com.github.javafaker.PhoneNumber phoneNumber17 = faker14.phoneNumber;
        faker1.phoneNumber = phoneNumber17;
        com.github.javafaker.PhoneNumber phoneNumber19 = faker1.phoneNumber();
        com.github.javafaker.Code code20 = faker1.code;
        java.util.Random random21 = new java.util.Random();
        double double22 = random21.nextDouble();
        java.util.stream.IntStream intStream25 = random21.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Lorem lorem27 = faker26.lorem();
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number29 = faker28.number;
        com.github.javafaker.Business business30 = faker28.business();
        java.util.Random random31 = new java.util.Random();
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        com.github.javafaker.Lorem lorem33 = null;
        faker32.lorem = lorem33;
        com.github.javafaker.Color color35 = faker32.color;
        com.github.javafaker.Finance finance36 = faker32.finance();
        com.github.javafaker.Address address37 = faker32.address;
        faker28.address = address37;
        java.util.Random random39 = new java.util.Random();
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(random39);
        com.github.javafaker.Lorem lorem41 = null;
        faker40.lorem = lorem41;
        java.util.Random random43 = new java.util.Random();
        double double44 = random43.nextDouble();
        java.util.stream.IntStream intStream47 = random43.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(random43);
        com.github.javafaker.Code code49 = faker48.code();
        faker40.code = code49;
        com.github.javafaker.Lorem lorem51 = faker40.lorem();
        java.util.Random random52 = new java.util.Random();
        com.github.javafaker.Faker faker53 = new com.github.javafaker.Faker(random52);
        com.github.javafaker.Lorem lorem54 = null;
        faker53.lorem = lorem54;
        com.github.javafaker.PhoneNumber phoneNumber56 = faker53.phoneNumber;
        faker40.phoneNumber = phoneNumber56;
        com.github.javafaker.PhoneNumber phoneNumber58 = faker40.phoneNumber();
        com.github.javafaker.Code code59 = faker40.code;
        faker28.code = code59;
        faker26.code = code59;
        com.github.javafaker.Business business62 = faker26.business();
        java.util.Locale locale64 = new java.util.Locale("hi!");
        java.lang.String str65 = locale64.getVariant();
        java.util.Locale locale66 = java.util.Locale.FRANCE;
        java.lang.String str67 = locale64.getDisplayVariant(locale66);
        java.lang.String str68 = locale66.getCountry();
        java.util.Random random69 = new java.util.Random();
        double double70 = random69.nextDouble();
        int int72 = random69.nextInt(1);
        com.github.javafaker.Faker faker73 = new com.github.javafaker.Faker(locale66, random69);
        float float74 = random69.nextFloat();
        int int75 = random69.nextInt();
        int int77 = random69.nextInt((int) 'u');
        double double78 = random69.nextDouble();
        com.github.javafaker.Faker faker79 = new com.github.javafaker.Faker(random69);
        java.util.Random random80 = new java.util.Random();
        com.github.javafaker.Faker faker81 = new com.github.javafaker.Faker(random80);
        com.github.javafaker.DateAndTime dateAndTime82 = null;
        faker81.dateAndTime = dateAndTime82;
        com.github.javafaker.Business business84 = faker81.business;
        faker79.business = business84;
        faker26.business = business84;
        faker1.business = business84;
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.04657543138880227d + "'", double5 == 0.04657543138880227d);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNull(lorem12);
        org.junit.Assert.assertNotNull(phoneNumber17);
        org.junit.Assert.assertNotNull(phoneNumber19);
        org.junit.Assert.assertNotNull(code20);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.8219935954479285d + "'", double22 == 0.8219935954479285d);
        org.junit.Assert.assertNotNull(intStream25);
        org.junit.Assert.assertNotNull(lorem27);
        org.junit.Assert.assertNotNull(number29);
        org.junit.Assert.assertNotNull(business30);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(finance36);
        org.junit.Assert.assertNotNull(address37);
// flaky:         org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.9637208956943017d + "'", double44 == 0.9637208956943017d);
        org.junit.Assert.assertNotNull(intStream47);
        org.junit.Assert.assertNotNull(code49);
        org.junit.Assert.assertNull(lorem51);
        org.junit.Assert.assertNotNull(phoneNumber56);
        org.junit.Assert.assertNotNull(phoneNumber58);
        org.junit.Assert.assertNotNull(code59);
        org.junit.Assert.assertNotNull(business62);
        org.junit.Assert.assertEquals(locale64.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "FR" + "'", str68, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.007043557141427681d + "'", double70 == 0.007043557141427681d);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + float74 + "' != '" + 0.15918005f + "'", float74 == 0.15918005f);
// flaky:         org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-182796497) + "'", int75 == (-182796497));
// flaky:         org.junit.Assert.assertTrue("'" + int77 + "' != '" + 24 + "'", int77 == 24);
// flaky:         org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.455050643631544d + "'", double78 == 0.455050643631544d);
        org.junit.Assert.assertNotNull(business84);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale.Builder builder4 = builder1.clearExtensions();
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder1.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale10 = new java.util.Locale("fr-x-lvariant-eng", "Franz\366sisch");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder6.setLocale(locale10);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: fr-x-lvariant-eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals(locale10.toString(), "fr-x-lvariant-eng_FRANZ\366SISCH");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale9 = new java.util.Locale("fr_FR", "hi!", "eng");
        java.lang.String str10 = locale9.toLanguageTag();
        java.lang.String str11 = locale4.getDisplayVariant(locale9);
        java.util.Locale locale12 = locale4.stripExtensions();
        java.util.Locale locale15 = new java.util.Locale("fran\347ais (France)", "x-lvariant-eng");
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.lang.String str17 = locale16.getDisplayName();
        java.lang.String str18 = locale15.getDisplayName(locale16);
        java.lang.String str19 = locale4.getDisplayName(locale16);
        java.lang.String str20 = locale4.getISO3Language();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals(locale9.toString(), "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "x-lvariant-eng" + "'", str10, "x-lvariant-eng");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals(locale15.toString(), "fran\347ais (france)_X-LVARIANT-ENG");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "japonais" + "'", str17, "japonais");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fran\347ais (france) (X-LVARIANT-ENG)" + "'", str18, "fran\347ais (france) (X-LVARIANT-ENG)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Name name8 = faker1.name;
        com.github.javafaker.Business business9 = faker1.business;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number11 = faker10.number;
        com.github.javafaker.Number number12 = faker10.number();
        java.lang.String str14 = faker10.bothify("en-GB");
        com.github.javafaker.Book book15 = faker10.book();
        com.github.javafaker.Number number16 = faker10.number;
        com.github.javafaker.Lorem lorem17 = faker10.lorem();
        com.github.javafaker.Color color18 = faker10.color();
        faker1.color = color18;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(number12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-GB" + "'", str14, "en-GB");
        org.junit.Assert.assertNotNull(book15);
        org.junit.Assert.assertNotNull(number16);
        org.junit.Assert.assertNotNull(lorem17);
        org.junit.Assert.assertNotNull(color18);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        java.util.Locale locale1 = new java.util.Locale("fr-fr");
        java.lang.String str2 = locale1.getScript();
        org.junit.Assert.assertEquals(locale1.toString(), "fr-fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = new java.util.Locale("hi!", "French");
        java.lang.String str5 = locale4.getScript();
        java.lang.String str6 = locale1.getDisplayCountry(locale4);
        java.lang.Object obj7 = locale4.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale4.toString(), "hi!_FRENCH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "France" + "'", str6, "France");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "hi!_FRENCH");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "hi!_FRENCH");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "hi!_FRENCH");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random1.doubles((double) (short) 0, 10.0d);
        java.util.stream.LongStream longStream10 = random1.longs();
        double double11 = random1.nextGaussian();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Book book13 = faker12.book;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2795632456437623d + "'", double11 == 0.2795632456437623d);
        org.junit.Assert.assertNotNull(book13);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Random random3 = new java.util.Random(1L);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale1, random3);
        com.github.javafaker.Name name5 = faker4.name;
        com.github.javafaker.Name name6 = faker4.name;
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem9 = null;
        faker8.lorem = lorem9;
        com.github.javafaker.Finance finance11 = faker8.finance;
        faker4.finance = finance11;
        com.github.javafaker.Internet internet13 = faker4.internet;
        java.lang.String str15 = faker4.letterify("chinese (taiwan)");
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(internet13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chinese (taiwan)" + "'", str15, "chinese (taiwan)");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.IntStream intStream4 = random1.ints((int) (byte) 1, (int) 'x');
        long long5 = random1.nextLong();
        java.util.stream.LongStream longStream8 = random1.longs((long) (short) 1, (long) 100);
        random1.setSeed((long) (-1167796541));
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.util.Random random12 = new java.util.Random();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale11, random12);
        java.util.stream.LongStream longStream14 = random12.longs();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random12);
        java.util.Random random17 = new java.util.Random((long) (byte) 1);
        byte[] byteArray19 = new byte[] { (byte) -1 };
        random17.nextBytes(byteArray19);
        random12.nextBytes(byteArray19);
        random1.nextBytes(byteArray19);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-4964420948893066024L) + "'", long5 == (-4964420948893066024L));
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[33]");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ROOT;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale1.getLanguage();
        java.lang.String str4 = locale1.getDisplayVariant();
        java.lang.String str5 = locale1.getDisplayCountry();
        java.lang.String str6 = locale1.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("en-GB");
        java.util.Locale.Builder builder7 = builder0.setLanguageTag("eng");
        java.util.Locale locale8 = builder0.build();
        java.util.Locale.Builder builder9 = builder0.clear();
        java.util.Locale.Builder builder11 = builder0.setLanguageTag("france");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder0.removeUnicodeLocaleAttribute("und_EN_US_eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: und_EN_US_eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Name name4 = faker1.name;
        com.github.javafaker.Finance finance5 = faker1.finance();
        java.lang.String str7 = faker1.numerify("en");
        com.github.javafaker.Options options8 = faker1.options();
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        java.util.Locale locale2 = new java.util.Locale("Canada", "fr_FR");
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getVariant();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale4.getDisplayVariant(locale6);
        java.lang.String str8 = locale6.getCountry();
        java.lang.String str9 = locale6.getDisplayLanguage();
        java.util.Locale locale10 = java.util.Locale.JAPANESE;
        java.lang.String str11 = locale6.getDisplayScript(locale10);
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.lang.String str13 = locale6.getDisplayCountry(locale12);
        java.lang.String str14 = locale12.getDisplayLanguage();
        java.lang.String str15 = locale2.getDisplayVariant(locale12);
        java.util.Locale locale19 = new java.util.Locale("en-us (ENGLISH (UNITED KINGDOM))", "Japanese", "fr-FR");
        java.lang.String str20 = locale12.getDisplayCountry(locale19);
        java.util.Locale locale21 = locale19.stripExtensions();
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.lang.String str23 = locale22.toLanguageTag();
        java.lang.String str24 = locale19.getDisplayLanguage(locale22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = locale22.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "canada_FR_FR");
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FR" + "'", str8, "FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fran\347ais" + "'", str9, "fran\347ais");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "France" + "'", str13, "France");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fran\347ais" + "'", str14, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals(locale19.toString(), "en-us (english (united kingdom))_JAPANESE_fr-FR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en-us (english (united kingdom))_JAPANESE_fr-FR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "it" + "'", str23, "it");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "en-us (english (united kingdom))" + "'", str24, "en-us (english (united kingdom))");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("French (France)");
        com.github.javafaker.Company company8 = faker1.company();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French (France)" + "'", str7, "French (France)");
        org.junit.Assert.assertNotNull(company8);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        java.util.Locale locale3 = new java.util.Locale("Twi", "ja", "hi!");
        org.junit.Assert.assertEquals(locale3.toString(), "twi_JA_hi!");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        java.util.Locale locale3 = new java.util.Locale("en-us (ENGLISH (UNITED KINGDOM))", "Japanese", "fr-FR");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: en-us (english (united kingdom))_JAPANESE_fr-FR could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "en-us (english (united kingdom))_JAPANESE_fr-FR");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Franz\366sisch");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=franzo?sisch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en-GB", 0.016183407545588335d);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        java.util.Locale locale3 = new java.util.Locale("FR", "TW", "German");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale7.toLanguageTag();
        java.lang.String str10 = locale3.getDisplayLanguage(locale7);
        java.lang.String str11 = locale3.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "fr_TW_German");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr-FR" + "'", str9, "fr-FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fran\347ais" + "'", str10, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fran\347ais" + "'", str11, "fran\347ais");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = locale3.getDisplayScript();
        java.lang.String str6 = locale2.getDisplayName(locale3);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fran\347ais (France)" + "'", str6, "fran\347ais (France)");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Name name8 = faker1.name;
        java.util.Random random9 = new java.util.Random();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Lorem lorem11 = null;
        faker10.lorem = lorem11;
        java.lang.String str14 = faker10.numerify("");
        com.github.javafaker.Company company15 = faker10.company;
        com.github.javafaker.Number number16 = faker10.number();
        com.github.javafaker.PhoneNumber phoneNumber17 = faker10.phoneNumber;
        faker1.phoneNumber = phoneNumber17;
        com.github.javafaker.DateAndTime dateAndTime19 = faker1.dateAndTime;
        com.github.javafaker.Code code20 = faker1.code();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(company15);
        org.junit.Assert.assertNotNull(number16);
        org.junit.Assert.assertNotNull(phoneNumber17);
        org.junit.Assert.assertNotNull(dateAndTime19);
        org.junit.Assert.assertNotNull(code20);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker0.fakeValuesService;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number7 = faker6.number;
        com.github.javafaker.Number number8 = faker6.number();
        java.lang.String str10 = faker6.bothify("en-GB");
        com.github.javafaker.Name name11 = faker6.name();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code13 = null;
        faker12.code = code13;
        com.github.javafaker.Lorem lorem15 = faker12.lorem();
        faker6.lorem = lorem15;
        java.util.Random random17 = new java.util.Random();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Lorem lorem19 = null;
        faker18.lorem = lorem19;
        java.lang.String str22 = faker18.numerify("");
        java.util.Random random23 = new java.util.Random();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Lorem lorem25 = null;
        faker24.lorem = lorem25;
        com.github.javafaker.Color color27 = faker24.color;
        faker18.color = color27;
        com.github.javafaker.PhoneNumber phoneNumber29 = faker18.phoneNumber;
        faker6.phoneNumber = phoneNumber29;
        faker0.phoneNumber = phoneNumber29;
        java.util.Random random32 = new java.util.Random();
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(random32);
        com.github.javafaker.Lorem lorem34 = null;
        faker33.lorem = lorem34;
        java.lang.String str37 = faker33.numerify("hi!");
        com.github.javafaker.Lorem lorem38 = faker33.lorem;
        java.util.Random random39 = new java.util.Random();
        double double40 = random39.nextDouble();
        int int42 = random39.nextInt(1);
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker(random39);
        com.github.javafaker.service.RandomService randomService44 = faker43.randomService;
        faker33.randomService = randomService44;
        com.github.javafaker.Finance finance46 = faker33.finance();
        com.github.javafaker.Lorem lorem47 = faker33.lorem();
        com.github.javafaker.PhoneNumber phoneNumber48 = faker33.phoneNumber();
        com.github.javafaker.Name name49 = faker33.name();
        faker0.name = name49;
        com.github.javafaker.Name name51 = faker0.name;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-GB" + "'", str10, "en-GB");
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(lorem15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(phoneNumber29);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNull(lorem38);
// flaky:         org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.30922593999552184d + "'", double40 == 0.30922593999552184d);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(randomService44);
        org.junit.Assert.assertNotNull(finance46);
        org.junit.Assert.assertNull(lorem47);
        org.junit.Assert.assertNotNull(phoneNumber48);
        org.junit.Assert.assertNotNull(name49);
        org.junit.Assert.assertNotNull(name51);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.lang.String str9 = locale7.getDisplayLanguage();
        java.util.Random random11 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream14 = random11.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale7, random11);
        java.util.Random random16 = new java.util.Random();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Lorem lorem18 = null;
        faker17.lorem = lorem18;
        java.lang.String str21 = faker17.numerify("hi!");
        com.github.javafaker.Color color22 = faker17.color;
        java.util.Random random23 = new java.util.Random();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Lorem lorem25 = null;
        faker24.lorem = lorem25;
        java.lang.String str28 = faker24.numerify("");
        com.github.javafaker.Company company29 = faker24.company;
        com.github.javafaker.Options options30 = faker24.options();
        faker17.options = options30;
        faker15.options = options30;
        java.util.Random random33 = new java.util.Random();
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(random33);
        com.github.javafaker.Lorem lorem35 = null;
        faker34.lorem = lorem35;
        java.lang.String str38 = faker34.numerify("");
        com.github.javafaker.Business business39 = faker34.business;
        faker15.business = business39;
        java.lang.String str42 = faker15.bothify("TW");
        java.util.Random random43 = new java.util.Random();
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(random43);
        com.github.javafaker.Lorem lorem45 = null;
        faker44.lorem = lorem45;
        java.util.Random random47 = new java.util.Random();
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(random47);
        com.github.javafaker.Lorem lorem49 = null;
        faker48.lorem = lorem49;
        com.github.javafaker.Internet internet51 = null;
        faker48.internet = internet51;
        java.lang.String str54 = faker48.bothify("");
        com.github.javafaker.Code code55 = null;
        faker48.code = code55;
        com.github.javafaker.Number number57 = faker48.number();
        faker44.number = number57;
        com.github.javafaker.Color color59 = faker44.color();
        faker15.color = color59;
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fran\347ais" + "'", str6, "fran\347ais");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "japonais" + "'", str9, "japonais");
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(company29);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(business39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "TW" + "'", str42, "TW");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(number57);
        org.junit.Assert.assertNotNull(color59);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.Address address7 = faker5.address;
        com.github.javafaker.DateAndTime dateAndTime8 = faker5.date();
        java.lang.String str10 = faker5.bothify("fran\347ais");
        com.github.javafaker.DateAndTime dateAndTime11 = faker5.dateAndTime;
        java.util.Random random12 = new java.util.Random();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Lorem lorem14 = null;
        faker13.lorem = lorem14;
        com.github.javafaker.Internet internet16 = null;
        faker13.internet = internet16;
        java.lang.String str19 = faker13.bothify("");
        com.github.javafaker.Company company20 = faker13.company;
        faker5.company = company20;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number23 = faker22.number;
        com.github.javafaker.Number number24 = faker22.number();
        java.lang.String str26 = faker22.bothify("en-GB");
        com.github.javafaker.Book book27 = faker22.book();
        com.github.javafaker.DateAndTime dateAndTime28 = faker22.dateAndTime;
        com.github.javafaker.Finance finance29 = faker22.finance();
        java.util.Random random30 = new java.util.Random();
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(random30);
        com.github.javafaker.Lorem lorem32 = null;
        faker31.lorem = lorem32;
        java.lang.String str35 = faker31.numerify("hi!");
        com.github.javafaker.Lorem lorem36 = faker31.lorem;
        java.util.Random random37 = new java.util.Random();
        double double38 = random37.nextDouble();
        int int40 = random37.nextInt(1);
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.service.RandomService randomService42 = faker41.randomService;
        faker31.randomService = randomService42;
        com.github.javafaker.Finance finance44 = faker31.finance();
        com.github.javafaker.Options options45 = faker31.options;
        faker22.options = options45;
        java.util.Random random47 = new java.util.Random();
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(random47);
        com.github.javafaker.Lorem lorem49 = null;
        faker48.lorem = lorem49;
        com.github.javafaker.Internet internet51 = null;
        faker48.internet = internet51;
        java.lang.String str54 = faker48.bothify("");
        com.github.javafaker.Code code55 = null;
        faker48.code = code55;
        com.github.javafaker.Number number57 = faker48.number();
        com.github.javafaker.Finance finance58 = faker48.finance();
        com.github.javafaker.Faker faker59 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code60 = null;
        faker59.code = code60;
        com.github.javafaker.Lorem lorem62 = faker59.lorem();
        com.github.javafaker.service.RandomService randomService63 = faker59.randomService;
        com.github.javafaker.Faker faker64 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number65 = faker64.number;
        com.github.javafaker.Number number66 = faker64.number();
        java.lang.String str68 = faker64.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService69 = faker64.fakeValuesService;
        faker59.fakeValuesService = fakeValuesService69;
        faker48.fakeValuesService = fakeValuesService69;
        faker22.fakeValuesService = fakeValuesService69;
        com.github.javafaker.Company company73 = faker22.company;
        faker5.company = company73;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3289984210007766d + "'", double1 == 0.3289984210007766d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fran\347ais" + "'", str10, "fran\347ais");
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(company20);
        org.junit.Assert.assertNotNull(number23);
        org.junit.Assert.assertNotNull(number24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "en-GB" + "'", str26, "en-GB");
        org.junit.Assert.assertNotNull(book27);
        org.junit.Assert.assertNotNull(dateAndTime28);
        org.junit.Assert.assertNotNull(finance29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(lorem36);
// flaky:         org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.30104398908838015d + "'", double38 == 0.30104398908838015d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(randomService42);
        org.junit.Assert.assertNotNull(finance44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(number57);
        org.junit.Assert.assertNotNull(finance58);
        org.junit.Assert.assertNotNull(lorem62);
        org.junit.Assert.assertNotNull(randomService63);
        org.junit.Assert.assertNotNull(number65);
        org.junit.Assert.assertNotNull(number66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "en-GB" + "'", str68, "en-GB");
        org.junit.Assert.assertNotNull(fakeValuesService69);
        org.junit.Assert.assertNotNull(company73);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Internet internet6 = faker5.internet;
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem9 = null;
        faker8.lorem = lorem9;
        com.github.javafaker.Name name11 = faker8.name;
        com.github.javafaker.Address address12 = faker8.address();
        com.github.javafaker.Internet internet13 = faker8.internet;
        faker5.internet = internet13;
        com.github.javafaker.Options options15 = faker5.options();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.846013202405526d + "'", double1 == 0.846013202405526d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(address12);
        org.junit.Assert.assertNotNull(internet13);
        org.junit.Assert.assertNotNull(options15);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("France", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap5);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Company company8 = faker1.company;
        com.github.javafaker.Address address9 = faker1.address();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(company8);
        org.junit.Assert.assertNotNull(address9);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Locale locale2 = new java.util.Locale("en-us");
        java.lang.String str3 = locale0.getDisplayScript(locale2);
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.lang.String str6 = locale5.getLanguage();
        java.util.Locale locale7 = locale5.stripExtensions();
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = locale7.getDisplayName();
        java.lang.String str10 = locale0.getDisplayVariant(locale7);
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale.Builder builder14 = builder11.setScript("");
        java.util.Locale locale15 = builder14.build();
        java.util.Locale.Builder builder17 = builder14.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder18 = builder17.clearExtensions();
        java.util.Locale locale19 = builder18.build();
        java.lang.String str20 = locale0.getDisplayLanguage(locale19);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals(locale2.toString(), "en-us");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr" + "'", str6, "fr");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fran\347ais (France)" + "'", str9, "fran\347ais (France)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "German" + "'", str20, "German");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("en-US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.Lorem lorem4 = faker2.lorem;
        com.github.javafaker.Internet internet5 = faker2.internet();
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(internet5);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("fra");
        java.util.Locale.Builder builder7 = builder5.setLanguage("French");
        java.util.Locale.Builder builder8 = builder5.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        com.github.javafaker.Business business11 = faker0.business();
        com.github.javafaker.Company company12 = faker0.company;
        com.github.javafaker.Business business13 = faker0.business;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertNotNull(company12);
        org.junit.Assert.assertNotNull(business13);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.clear();
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("Italian");
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getVariant();
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = locale12.getDisplayVariant(locale14);
        java.lang.String str16 = locale14.getCountry();
        java.lang.String str17 = locale14.getDisplayLanguage();
        java.util.Locale locale18 = java.util.Locale.JAPANESE;
        java.lang.String str19 = locale14.getDisplayScript(locale18);
        java.util.Random random20 = new java.util.Random();
        double double21 = random20.nextDouble();
        int int23 = random20.nextInt(1);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random20);
        double double25 = random20.nextDouble();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale14, random20);
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale14);
        java.util.Locale.Builder builder28 = builder10.setLocale(locale14);
        java.lang.String str29 = locale14.toString();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FR" + "'", str16, "FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fran\347ais" + "'", str17, "fran\347ais");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
// flaky:         org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.7619261722662029d + "'", double21 == 0.7619261722662029d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.6336751585871296d + "'", double25 == 0.6336751585871296d);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "fr_FR" + "'", str29, "fr_FR");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale.Builder builder4 = builder1.clearExtensions();
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder1.clearExtensions();
        java.util.Locale locale7 = builder1.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-US");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("en");
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange3 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap7);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList14);
        java.util.Locale locale20 = new java.util.Locale("", "", "");
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleKeys();
        java.lang.String str22 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strSet21);
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strSet21);
        java.util.Collection<java.lang.String> strCollection24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strCollection24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        boolean boolean4 = random0.nextBoolean();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        float float6 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream8 = random0.doubles((long) 24);
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7324321915900482d + "'", double1 == 0.7324321915900482d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.33536685f + "'", float6 == 0.33536685f);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        java.util.Locale locale2 = new java.util.Locale("France", "Chinese (Taiwan)");
        java.lang.String str3 = locale2.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "france_CHINESE (TAIWAN)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CHINESE (TAIWAN)" + "'", str3, "CHINESE (TAIWAN)");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random1.doubles((double) (short) 0, 10.0d);
        java.util.stream.LongStream longStream10 = random1.longs();
        java.util.stream.LongStream longStream13 = random1.longs((long) (byte) -1, (long) (byte) 1);
        java.util.Random random15 = new java.util.Random((long) (byte) 1);
        byte[] byteArray17 = new byte[] { (byte) -1 };
        random15.nextBytes(byteArray17);
        random1.nextBytes(byteArray17);
        float float20 = random1.nextFloat();
        random1.setSeed((long) (byte) -1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(byteArray17);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[22]");
// flaky:         org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.19719058f + "'", float20 == 0.19719058f);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        java.util.Locale locale2 = new java.util.Locale("Chinese (Taiwan)", "fra");
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder4.build();
        java.lang.String str7 = locale2.getDisplayName(locale6);
        java.lang.String str8 = locale6.getISO3Language();
        org.junit.Assert.assertEquals(locale2.toString(), "chinese (taiwan)_FRA");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chinese (taiwan) (FRA)" + "'", str7, "chinese (taiwan) (FRA)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Locale locale2 = new java.util.Locale("en-us");
        java.lang.String str3 = locale0.getDisplayScript(locale2);
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.lang.String str6 = locale5.getLanguage();
        java.util.Locale locale7 = locale5.stripExtensions();
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = locale7.getDisplayName();
        java.lang.String str10 = locale0.getDisplayVariant(locale7);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale7);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals(locale2.toString(), "en-us");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr" + "'", str6, "fr");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fran\347ais (France)" + "'", str9, "fran\347ais (France)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Name name8 = faker1.name;
        com.github.javafaker.Color color9 = faker1.color;
        com.github.javafaker.Color color10 = faker1.color;
        com.github.javafaker.Color color11 = faker1.color;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale locale4 = locale1.stripExtensions();
        java.util.Locale locale7 = new java.util.Locale("hi!", "French");
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale4.getDisplayCountry(locale8);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fra" + "'", str2, "fra");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale7.toString(), "hi!_FRENCH");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!_FRENCH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "France" + "'", str9, "France");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        double double2 = random1.nextDouble();
        int int4 = random1.nextInt(1);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Book book6 = faker5.book();
        faker0.book = book6;
        com.github.javafaker.Address address8 = faker0.address;
        com.github.javafaker.Number number9 = faker0.number;
        com.github.javafaker.Business business10 = faker0.business();
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9281247019042721d + "'", double2 == 0.9281247019042721d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(address8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(business10);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Random random3 = new java.util.Random(1L);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale1, random3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Address address6 = faker5.address();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(address6);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        java.util.Random random1 = new java.util.Random((long) (byte) 1);
        byte[] byteArray3 = new byte[] { (byte) -1 };
        random1.nextBytes(byteArray3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        float float6 = random1.nextFloat();
        long long7 = random1.nextLong();
        java.util.stream.IntStream intStream11 = random1.ints((long) 'u', 10, 93);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[115]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.100473166f + "'", float6 == 0.100473166f);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 7564655870752979346L + "'", long7 == 7564655870752979346L);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles();
        java.util.stream.LongStream longStream6 = random0.longs((long) 431529176, (long) (-1780303639), 1853403699951111791L);
        double double7 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Random random11 = new java.util.Random();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale10, random11);
        java.util.stream.DoubleStream doubleStream13 = random11.doubles();
        java.util.stream.IntStream intStream16 = random11.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream19 = random11.doubles((double) (short) 0, 10.0d);
        java.util.stream.LongStream longStream20 = random11.longs();
        java.util.stream.LongStream longStream23 = random11.longs((long) (byte) -1, (long) (byte) 1);
        java.util.Random random25 = new java.util.Random((long) (byte) 1);
        byte[] byteArray27 = new byte[] { (byte) -1 };
        random25.nextBytes(byteArray27);
        random11.nextBytes(byteArray27);
        random0.nextBytes(byteArray27);
        double double31 = random0.nextDouble();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09355575719003795d + "'", double1 == 0.09355575719003795d);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6443847613447118d + "'", double7 == 0.6443847613447118d);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertNotNull(longStream20);
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertNotNull(byteArray27);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-70]");
// flaky:         org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.5512354526019957d + "'", double31 == 0.5512354526019957d);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("en-GB");
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setRegion("fra (FR-FR)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: fra (FR-FR) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        com.github.javafaker.Name name6 = faker1.name;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.dateAndTime;
        com.github.javafaker.Lorem lorem8 = faker1.lorem();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = faker1.fakeValuesService;
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNull(lorem8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random1.doubles((double) (short) 0, 10.0d);
        java.util.stream.LongStream longStream10 = random1.longs();
        java.util.stream.LongStream longStream13 = random1.longs((long) (byte) -1, (long) (byte) 1);
        java.util.stream.LongStream longStream14 = random1.longs();
        int int15 = random1.nextInt();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 806384716 + "'", int15 == 806384716);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = new java.util.Locale("en-US", "en");
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale.Category category10 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale11 = java.util.Locale.getDefault(category10);
        java.lang.String str12 = locale11.getISO3Language();
        java.util.Set<java.lang.String> strSet13 = locale11.getUnicodeLocaleAttributes();
        java.util.Locale locale14 = locale11.stripExtensions();
        java.util.Locale.setDefault(category0, locale14);
        java.util.Locale locale16 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale5.toString(), "en-us_EN");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category10.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        java.util.Random random1 = new java.util.Random((long) 'x');
        java.util.stream.LongStream longStream5 = random1.longs(0L, (long) (short) 10, (long) 'u');
        java.util.stream.IntStream intStream6 = random1.ints();
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = null;
        faker0.code = code1;
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale7);
        com.github.javafaker.Business business10 = faker9.business();
        faker0.business = business10;
        com.github.javafaker.Name name12 = faker0.name();
        java.lang.String str14 = faker0.letterify("fr_fr_hi!_eng");
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(business10);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fr_fr_hi!_eng" + "'", str14, "fr_fr_hi!_eng");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        java.util.Locale locale2 = new java.util.Locale("en-US", "French");
        org.junit.Assert.assertEquals(locale2.toString(), "en-us_FRENCH");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.Color color7 = faker5.color;
        com.github.javafaker.Lorem lorem8 = faker5.lorem;
        com.github.javafaker.Address address9 = faker5.address();
        java.util.Random random10 = new java.util.Random();
        double double11 = random10.nextDouble();
        java.util.stream.IntStream intStream14 = random10.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Code code16 = faker15.code();
        com.github.javafaker.DateAndTime dateAndTime17 = faker15.date();
        com.github.javafaker.Options options18 = faker15.options();
        java.util.Random random19 = new java.util.Random();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.Lorem lorem21 = null;
        faker20.lorem = lorem21;
        com.github.javafaker.Color color23 = faker20.color;
        com.github.javafaker.Finance finance24 = faker20.finance();
        com.github.javafaker.Address address25 = faker20.address;
        java.util.Random random26 = new java.util.Random();
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.Lorem lorem28 = null;
        faker27.lorem = lorem28;
        java.lang.String str31 = faker27.numerify("");
        com.github.javafaker.Company company32 = faker27.company;
        com.github.javafaker.Number number33 = faker27.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService34 = faker27.fakeValuesService;
        faker20.fakeValuesService = fakeValuesService34;
        com.github.javafaker.Color color36 = faker20.color();
        faker15.color = color36;
        faker5.color = color36;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36652844789140704d + "'", double1 == 0.36652844789140704d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(address9);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8615103174546875d + "'", double11 == 0.8615103174546875d);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertNotNull(code16);
        org.junit.Assert.assertNotNull(dateAndTime17);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(finance24);
        org.junit.Assert.assertNotNull(address25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(company32);
        org.junit.Assert.assertNotNull(number33);
        org.junit.Assert.assertNotNull(fakeValuesService34);
        org.junit.Assert.assertNotNull(color36);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Code code8 = null;
        faker1.code = code8;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number11 = faker10.number;
        faker1.number = number11;
        com.github.javafaker.PhoneNumber phoneNumber13 = faker1.phoneNumber();
        java.lang.String str15 = faker1.letterify("fran\347ais (France)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(phoneNumber13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fran\347ais (France)" + "'", str15, "fran\347ais (France)");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("und", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.lang.String str9 = locale7.getDisplayLanguage();
        java.util.Random random11 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream14 = random11.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale7, random11);
        java.util.Random random16 = new java.util.Random();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Lorem lorem18 = null;
        faker17.lorem = lorem18;
        java.lang.String str21 = faker17.numerify("hi!");
        com.github.javafaker.Color color22 = faker17.color;
        java.util.Random random23 = new java.util.Random();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Lorem lorem25 = null;
        faker24.lorem = lorem25;
        java.lang.String str28 = faker24.numerify("");
        com.github.javafaker.Company company29 = faker24.company;
        com.github.javafaker.Options options30 = faker24.options();
        faker17.options = options30;
        faker15.options = options30;
        com.github.javafaker.PhoneNumber phoneNumber33 = faker15.phoneNumber();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Japanese" + "'", str9, "Japanese");
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(company29);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(phoneNumber33);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        java.util.Locale locale3 = new java.util.Locale("ENGLISH (UNITED KINGDOM)", "jpn", "Chinese (Taiwan)");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale8 = new java.util.Locale("hi! (Taiwan)", "italien", "en-US");
        java.lang.String str9 = locale4.getDisplayScript(locale8);
        org.junit.Assert.assertEquals(locale3.toString(), "english (united kingdom)_JPN_Chinese (Taiwan)");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "english (united kingdom)_JPN_Chinese (Taiwan)");
        org.junit.Assert.assertEquals(locale8.toString(), "hi! (taiwan)_ITALIEN_en-US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("eng");
        java.util.Locale.Category category9 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale13 = new java.util.Locale("x-lvariant-eng", "", "");
        java.util.Locale.setDefault(category9, locale13);
        java.lang.String str15 = locale13.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder8.setLocale(locale13);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: x-lvariant-eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category9.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale13.toString(), "x-lvariant-eng");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        java.util.Locale locale2 = new java.util.Locale("x-lvariant-eng", "ENGLISH (UNITED KINGDOM)");
        org.junit.Assert.assertEquals(locale2.toString(), "x-lvariant-eng_ENGLISH (UNITED KINGDOM)");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-us (english (united kingdom))");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=en-us (english (united kingdom))");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        java.util.Random random1 = new java.util.Random(5400292809851748286L);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        java.util.Locale locale3 = new java.util.Locale("FRENCH", "German", "chinese (taiwan)");
        java.util.Random random4 = new java.util.Random();
        double double5 = random4.nextDouble();
        int int7 = random4.nextInt(1);
        boolean boolean8 = random4.nextBoolean();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random4);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french_GERMAN_chinese (taiwan) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "french_GERMAN_chinese (taiwan)");
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.09645354865200317d + "'", double5 == 0.09645354865200317d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi! (Taiwan)", 0.1176622636954946d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi! (taiwan)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.Company company6 = faker1.company;
        com.github.javafaker.Options options7 = faker1.options();
        java.util.Random random8 = new java.util.Random();
        double double9 = random8.nextDouble();
        java.util.stream.IntStream intStream12 = random8.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Code code14 = faker13.code();
        com.github.javafaker.Color color15 = faker13.color;
        faker1.color = color15;
        com.github.javafaker.Lorem lorem17 = faker1.lorem();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = lorem17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(options7);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.26668227900770225d + "'", double9 == 0.26668227900770225d);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(code14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(lorem17);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Canada", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        java.util.Locale locale2 = new java.util.Locale("Chinese (Taiwan)", "fra");
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder4.build();
        java.lang.String str7 = locale2.getDisplayName(locale6);
        java.lang.String str8 = locale6.getISO3Language();
        java.util.Locale locale12 = new java.util.Locale("en_US", "France", "");
        java.util.Locale locale14 = new java.util.Locale("en-us");
        java.lang.String str15 = locale12.getDisplayLanguage(locale14);
        java.lang.String str16 = locale6.getDisplayLanguage(locale12);
        org.junit.Assert.assertEquals(locale2.toString(), "chinese (taiwan)_FRA");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chinese (taiwan) (FRA)" + "'", str7, "chinese (taiwan) (FRA)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale12.toString(), "en_us_FRANCE");
        org.junit.Assert.assertEquals(locale14.toString(), "en-us");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en_us" + "'", str15, "en_us");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        com.github.javafaker.Company company14 = faker1.company();
        com.github.javafaker.Lorem lorem15 = faker1.lorem;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(fakeValuesService12);
        org.junit.Assert.assertNotNull(company14);
        org.junit.Assert.assertNull(lorem15);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("english (united kingdom)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english (united kingdom)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Name name4 = faker1.name;
        com.github.javafaker.Book book5 = faker1.book;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number7 = faker6.number;
        com.github.javafaker.Number number8 = faker6.number();
        java.lang.String str10 = faker6.bothify("en-GB");
        com.github.javafaker.Name name11 = faker6.name();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code13 = null;
        faker12.code = code13;
        com.github.javafaker.Lorem lorem15 = faker12.lorem();
        faker6.lorem = lorem15;
        faker1.lorem = lorem15;
        com.github.javafaker.Name name18 = faker1.name();
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-GB" + "'", str10, "en-GB");
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(lorem15);
        org.junit.Assert.assertNotNull(name18);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en", 0.46560633866972545d);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] { languageRange2 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList11);
        java.lang.String str14 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList13);
        java.util.Locale.LanguageRange languageRange16 = new java.util.Locale.LanguageRange("en-US");
        java.util.Locale.LanguageRange languageRange18 = new java.util.Locale.LanguageRange("en");
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] { languageRange16, languageRange18 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, strMap22);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet26 = locale24.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode27 = null;
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags(languageRangeList23, (java.util.Collection<java.lang.String>) strSet26, filteringMode27);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.parse("fr");
        java.util.Locale.LanguageRange languageRange33 = new java.util.Locale.LanguageRange("fra", 0.7081031632538951d);
        java.util.Locale.LanguageRange languageRange35 = new java.util.Locale.LanguageRange("FR");
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] { languageRange33, languageRange35 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList44);
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.lang.String>) strList52);
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.lang.String>) strList60);
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.lang.String>) strList60);
        java.util.Locale.FilteringMode filteringMode64 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList63, filteringMode64);
        java.lang.String str66 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList63);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap67 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, strMap67);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap70 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList71 = java.util.Locale.LanguageRange.parse("France", strMap70);
        java.util.Locale locale73 = new java.util.Locale("hi!");
        java.lang.String str74 = locale73.getVariant();
        java.util.Set<java.lang.String> strSet75 = locale73.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags(languageRangeList71, (java.util.Collection<java.lang.String>) strSet75);
        java.util.Locale.FilteringMode filteringMode77 = null;
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList76, filteringMode77);
        java.util.Locale.FilteringMode filteringMode79 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList80 = java.util.Locale.filterTags(languageRangeList30, (java.util.Collection<java.lang.String>) strList76, filteringMode79);
        java.util.Locale.FilteringMode filteringMode81 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags(languageRangeList23, (java.util.Collection<java.lang.String>) strList76, filteringMode81);
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList82);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertTrue("'" + filteringMode64 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode64.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertNotNull(languageRangeList71);
        org.junit.Assert.assertEquals(locale73.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(strSet75);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertTrue("'" + filteringMode79 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode79.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertTrue("'" + filteringMode81 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode81.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(strList83);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Lorem lorem6 = null;
        faker5.lorem = lorem6;
        com.github.javafaker.Internet internet8 = null;
        faker5.internet = internet8;
        java.lang.String str11 = faker5.bothify("");
        com.github.javafaker.Code code12 = null;
        faker5.code = code12;
        com.github.javafaker.Number number14 = faker5.number();
        faker1.number = number14;
        com.github.javafaker.Color color16 = faker1.color;
        com.github.javafaker.Finance finance17 = faker1.finance;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(finance17);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        java.util.Random random1 = new java.util.Random((-5840481468076583919L));
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        java.util.Random random1 = new java.util.Random(6785130368950820155L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Code code3 = faker2.code;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker2.phoneNumber();
        com.github.javafaker.Address address5 = faker2.address();
        com.github.javafaker.Name name6 = faker2.name();
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(name6);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("tw");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale11 = new java.util.Locale("", "", "");
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap14);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList21);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList23);
        java.util.Locale locale26 = new java.util.Locale("hi!");
        java.lang.String str27 = locale26.getVariant();
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.lang.String str29 = locale26.getDisplayVariant(locale28);
        java.lang.String str30 = locale28.getCountry();
        java.lang.String str31 = locale28.getDisplayLanguage();
        java.util.Locale locale32 = java.util.Locale.JAPANESE;
        java.lang.String str33 = locale28.getDisplayScript(locale32);
        java.lang.String str34 = locale32.getDisplayLanguage();
        java.util.Random random36 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream39 = random36.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(locale32, random36);
        java.util.Set<java.lang.String> strSet41 = locale32.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet41, filteringMode42);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals(locale26.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "FR" + "'", str30, "FR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "French" + "'", str31, "French");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Japanese" + "'", str34, "Japanese");
        org.junit.Assert.assertNotNull(longStream39);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode42.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList43);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Color color4 = faker1.color;
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Address address6 = faker1.address;
        com.github.javafaker.Options options7 = faker1.options();
        com.github.javafaker.Address address8 = faker1.address;
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = faker1.fakeValuesService;
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(address8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fra", 0.7081031632538951d);
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("FR");
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] { languageRange2, languageRange4 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList21);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList29);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList29);
        java.util.Locale.FilteringMode filteringMode33 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList32, filteringMode33);
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap36);
        java.util.Locale.LanguageRange languageRange39 = new java.util.Locale.LanguageRange("en-US");
        java.util.Locale.LanguageRange languageRange41 = new java.util.Locale.LanguageRange("en");
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] { languageRange39, languageRange41 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, strMap45);
        java.util.Locale locale47 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet48 = locale47.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet49 = locale47.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode50 = null;
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags(languageRangeList46, (java.util.Collection<java.lang.String>) strSet49, filteringMode50);
        java.lang.String str52 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList51);
        java.util.Locale locale54 = new java.util.Locale("hi!");
        java.lang.String str55 = locale54.getVariant();
        java.util.Locale locale56 = java.util.Locale.FRANCE;
        java.lang.String str57 = locale54.getDisplayVariant(locale56);
        java.lang.String str58 = locale56.getCountry();
        java.lang.String str59 = locale56.getDisplayLanguage();
        java.util.Locale locale60 = java.util.Locale.JAPANESE;
        java.lang.String str61 = locale56.getDisplayScript(locale60);
        java.util.Locale locale62 = java.util.Locale.FRENCH;
        java.lang.String str63 = locale56.getDisplayCountry(locale62);
        java.util.Set<java.lang.String> strSet64 = locale56.getUnicodeLocaleAttributes();
        java.lang.String str65 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strSet64);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + filteringMode33 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode33.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(languageRangeList37);
        org.junit.Assert.assertNotNull(languageRangeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "de");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertEquals(locale54.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "FR" + "'", str58, "FR");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "French" + "'", str59, "French");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "France" + "'", str63, "France");
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNull(str65);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.Address address7 = faker5.address;
        com.github.javafaker.DateAndTime dateAndTime8 = faker5.date();
        java.lang.String str10 = faker5.bothify("fran\347ais");
        com.github.javafaker.DateAndTime dateAndTime11 = faker5.dateAndTime;
        com.github.javafaker.Internet internet12 = faker5.internet;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number14 = faker13.number;
        com.github.javafaker.Number number15 = faker13.number();
        java.lang.String str17 = faker13.bothify("en-GB");
        com.github.javafaker.Name name18 = faker13.name();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code20 = null;
        faker19.code = code20;
        com.github.javafaker.Lorem lorem22 = faker19.lorem();
        faker13.lorem = lorem22;
        com.github.javafaker.Business business24 = faker13.business();
        com.github.javafaker.Company company25 = faker13.company;
        com.github.javafaker.Internet internet26 = faker13.internet();
        faker5.internet = internet26;
        com.github.javafaker.DateAndTime dateAndTime28 = faker5.date();
        java.util.Random random29 = new java.util.Random();
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        com.github.javafaker.Lorem lorem31 = null;
        faker30.lorem = lorem31;
        com.github.javafaker.Color color33 = faker30.color;
        com.github.javafaker.Finance finance34 = faker30.finance();
        com.github.javafaker.Address address35 = faker30.address;
        com.github.javafaker.service.RandomService randomService36 = faker30.randomService;
        java.util.Random random37 = new java.util.Random();
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Lorem lorem39 = null;
        faker38.lorem = lorem39;
        java.lang.String str42 = faker38.numerify("hi!");
        java.util.Random random43 = new java.util.Random();
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(random43);
        com.github.javafaker.Lorem lorem45 = null;
        faker44.lorem = lorem45;
        java.lang.String str48 = faker44.numerify("hi!");
        com.github.javafaker.Color color49 = faker44.color;
        com.github.javafaker.Business business50 = faker44.business();
        java.util.Random random51 = new java.util.Random();
        double double52 = random51.nextDouble();
        int int54 = random51.nextInt(1);
        com.github.javafaker.Faker faker55 = new com.github.javafaker.Faker(random51);
        com.github.javafaker.Internet internet56 = faker55.internet();
        com.github.javafaker.Faker faker57 = new com.github.javafaker.Faker();
        java.util.Random random58 = new java.util.Random();
        double double59 = random58.nextDouble();
        int int61 = random58.nextInt(1);
        com.github.javafaker.Faker faker62 = new com.github.javafaker.Faker(random58);
        com.github.javafaker.Book book63 = faker62.book();
        faker57.book = book63;
        com.github.javafaker.Address address65 = faker57.address;
        faker55.address = address65;
        faker44.address = address65;
        faker38.address = address65;
        faker30.address = address65;
        com.github.javafaker.DateAndTime dateAndTime70 = faker30.date();
        faker5.dateAndTime = dateAndTime70;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18625617791460491d + "'", double1 == 0.18625617791460491d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fran\347ais" + "'", str10, "fran\347ais");
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNotNull(internet12);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(number15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en-GB" + "'", str17, "en-GB");
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(lorem22);
        org.junit.Assert.assertNotNull(business24);
        org.junit.Assert.assertNotNull(company25);
        org.junit.Assert.assertNotNull(internet26);
        org.junit.Assert.assertNotNull(dateAndTime28);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(finance34);
        org.junit.Assert.assertNotNull(address35);
        org.junit.Assert.assertNotNull(randomService36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(business50);
// flaky:         org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.5720988202482755d + "'", double52 == 0.5720988202482755d);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(internet56);
// flaky:         org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.49091810188952734d + "'", double59 == 0.49091810188952734d);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(book63);
        org.junit.Assert.assertNotNull(address65);
        org.junit.Assert.assertNotNull(dateAndTime70);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        java.util.Locale locale2 = new java.util.Locale("italian", "GBR");
        org.junit.Assert.assertEquals(locale2.toString(), "italian_GBR");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.setLanguage("TW");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale7 = java.util.Locale.US;
        java.util.Locale.Builder builder8 = builder5.setLocale(locale7);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code5 = faker4.code();
        com.github.javafaker.Color color6 = faker4.color;
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem9 = null;
        faker8.lorem = lorem9;
        java.lang.String str12 = faker8.numerify("hi!");
        com.github.javafaker.Lorem lorem13 = faker8.lorem;
        com.github.javafaker.Color color14 = faker8.color();
        com.github.javafaker.Company company15 = faker8.company();
        faker4.company = company15;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9808174785251977d + "'", double1 == 0.9808174785251977d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(lorem13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(company15);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("fra");
        java.util.Locale locale4 = new java.util.Locale("en-US", "en");
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.lang.String str6 = locale1.getDisplayVariant(locale4);
        java.util.Locale locale7 = java.util.Locale.ROOT;
        java.lang.String str8 = locale7.getScript();
        java.lang.String str9 = locale1.getDisplayLanguage(locale7);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fra");
        org.junit.Assert.assertEquals(locale4.toString(), "en-us_EN");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fra" + "'", str9, "fra");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Color color10 = faker7.color;
        faker1.color = color10;
        com.github.javafaker.Internet internet12 = faker1.internet();
        com.github.javafaker.Internet internet13 = faker1.internet;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(internet12);
        org.junit.Assert.assertNotNull(internet13);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en" + "'", str3, "en");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number4 = faker3.number;
        com.github.javafaker.Number number5 = faker3.number();
        java.lang.String str7 = faker3.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker3.fakeValuesService;
        java.util.Random random9 = new java.util.Random();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Lorem lorem11 = null;
        faker10.lorem = lorem11;
        com.github.javafaker.PhoneNumber phoneNumber13 = faker10.phoneNumber;
        com.github.javafaker.Color color14 = faker10.color();
        faker3.color = color14;
        java.util.Random random16 = new java.util.Random();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Lorem lorem18 = null;
        faker17.lorem = lorem18;
        com.github.javafaker.Color color20 = faker17.color;
        com.github.javafaker.Finance finance21 = faker17.finance();
        com.github.javafaker.Address address22 = faker17.address;
        com.github.javafaker.Options options23 = faker17.options();
        faker3.options = options23;
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number26 = faker25.number;
        com.github.javafaker.Number number27 = faker25.number();
        java.lang.String str29 = faker25.bothify("en-GB");
        com.github.javafaker.Lorem lorem30 = faker25.lorem();
        faker3.lorem = lorem30;
        faker2.lorem = lorem30;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en-GB" + "'", str7, "en-GB");
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(phoneNumber13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(finance21);
        org.junit.Assert.assertNotNull(address22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(number26);
        org.junit.Assert.assertNotNull(number27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en-GB" + "'", str29, "en-GB");
        org.junit.Assert.assertNotNull(lorem30);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = faker4.resolve("tw");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4088787240361056d + "'", double1 == 0.4088787240361056d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        double double2 = random1.nextDouble();
        int int4 = random1.nextInt(1);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Book book6 = faker5.book();
        faker0.book = book6;
        com.github.javafaker.Address address8 = faker0.address;
        com.github.javafaker.Number number9 = faker0.number;
        com.github.javafaker.Book book10 = faker0.book();
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.27530385451029105d + "'", double2 == 0.27530385451029105d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(address8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(book10);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.util.Random random4 = new java.util.Random();
        double double5 = random4.nextDouble();
        java.util.stream.IntStream intStream8 = random4.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Code code10 = faker9.code();
        faker1.code = code10;
        com.github.javafaker.Lorem lorem12 = faker1.lorem();
        java.util.Random random13 = new java.util.Random();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Lorem lorem15 = null;
        faker14.lorem = lorem15;
        com.github.javafaker.PhoneNumber phoneNumber17 = faker14.phoneNumber;
        faker1.phoneNumber = phoneNumber17;
        com.github.javafaker.PhoneNumber phoneNumber19 = faker1.phoneNumber();
        java.util.Random random20 = new java.util.Random();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Lorem lorem22 = null;
        faker21.lorem = lorem22;
        java.lang.String str25 = faker21.numerify("hi!");
        com.github.javafaker.Color color26 = faker21.color;
        java.util.Random random27 = new java.util.Random();
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(random27);
        com.github.javafaker.Lorem lorem29 = null;
        faker28.lorem = lorem29;
        java.lang.String str32 = faker28.numerify("");
        com.github.javafaker.Company company33 = faker28.company;
        com.github.javafaker.Options options34 = faker28.options();
        faker21.options = options34;
        java.util.Random random36 = new java.util.Random();
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker(random36);
        com.github.javafaker.Lorem lorem38 = null;
        faker37.lorem = lorem38;
        java.lang.String str41 = faker37.numerify("hi!");
        com.github.javafaker.Color color42 = faker37.color;
        com.github.javafaker.Business business43 = faker37.business();
        java.util.Random random44 = new java.util.Random();
        double double45 = random44.nextDouble();
        int int47 = random44.nextInt(1);
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(random44);
        com.github.javafaker.Internet internet49 = faker48.internet();
        com.github.javafaker.Faker faker50 = new com.github.javafaker.Faker();
        java.util.Random random51 = new java.util.Random();
        double double52 = random51.nextDouble();
        int int54 = random51.nextInt(1);
        com.github.javafaker.Faker faker55 = new com.github.javafaker.Faker(random51);
        com.github.javafaker.Book book56 = faker55.book();
        faker50.book = book56;
        com.github.javafaker.Address address58 = faker50.address;
        faker48.address = address58;
        faker37.address = address58;
        faker21.address = address58;
        java.util.Random random62 = new java.util.Random();
        com.github.javafaker.Faker faker63 = new com.github.javafaker.Faker(random62);
        com.github.javafaker.Lorem lorem64 = null;
        faker63.lorem = lorem64;
        java.lang.String str67 = faker63.numerify("hi!");
        com.github.javafaker.Lorem lorem68 = faker63.lorem;
        java.util.Random random69 = new java.util.Random();
        double double70 = random69.nextDouble();
        int int72 = random69.nextInt(1);
        com.github.javafaker.Faker faker73 = new com.github.javafaker.Faker(random69);
        com.github.javafaker.service.RandomService randomService74 = faker73.randomService;
        faker63.randomService = randomService74;
        com.github.javafaker.Finance finance76 = faker63.finance();
        com.github.javafaker.Options options77 = faker63.options;
        com.github.javafaker.Book book78 = faker63.book();
        faker21.book = book78;
        faker1.book = book78;
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14309422109682168d + "'", double5 == 0.14309422109682168d);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNull(lorem12);
        org.junit.Assert.assertNotNull(phoneNumber17);
        org.junit.Assert.assertNotNull(phoneNumber19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(company33);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(business43);
// flaky:         org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.35703533170510804d + "'", double45 == 0.35703533170510804d);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(internet49);
// flaky:         org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.7754119714583495d + "'", double52 == 0.7754119714583495d);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(book56);
        org.junit.Assert.assertNotNull(address58);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertNull(lorem68);
// flaky:         org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.5786476064864915d + "'", double70 == 0.5786476064864915d);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(randomService74);
        org.junit.Assert.assertNotNull(finance76);
        org.junit.Assert.assertNotNull(options77);
        org.junit.Assert.assertNotNull(book78);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale4 = java.util.Locale.JAPANESE;
        java.lang.String str5 = locale4.getDisplayName();
        java.lang.String str6 = locale0.getDisplayLanguage(locale4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Japanese" + "'", str5, "Japanese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u30c9\u30a4\u30c4\u8a9e" + "'", str6, "\u30c9\u30a4\u30c4\u8a9e");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale.Builder builder4 = builder1.clearExtensions();
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder1.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder8.setScript("");
        java.util.Locale locale12 = builder11.build();
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.lang.String str16 = locale14.getDisplayLanguage();
        java.lang.String str17 = locale13.getDisplayName(locale14);
        java.util.Locale locale18 = locale14.stripExtensions();
        java.util.Locale.Builder builder19 = builder7.setLocale(locale18);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "German" + "'", str16, "German");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de");
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        java.util.Random random1 = new java.util.Random((long) 10);
        int int3 = random1.nextInt(31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        boolean boolean4 = random0.nextBoolean();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Name name10 = faker7.name;
        com.github.javafaker.Book book11 = faker7.book;
        faker5.book = book11;
        com.github.javafaker.Address address13 = faker5.address();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6363175377169573d + "'", double1 == 0.6363175377169573d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(address13);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        com.github.javafaker.Business business11 = faker10.business;
        com.github.javafaker.Business business12 = faker10.business;
        java.util.Random random13 = new java.util.Random();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Lorem lorem15 = null;
        faker14.lorem = lorem15;
        java.lang.String str18 = faker14.numerify("");
        com.github.javafaker.Company company19 = faker14.company;
        com.github.javafaker.Number number20 = faker14.number();
        com.github.javafaker.Internet internet21 = faker14.internet;
        faker10.internet = internet21;
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3190155270219187d + "'", double7 == 0.3190155270219187d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(company19);
        org.junit.Assert.assertNotNull(number20);
        org.junit.Assert.assertNotNull(internet21);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.IntStream intStream4 = random1.ints((int) (byte) 1, (int) 'x');
        java.util.stream.LongStream longStream5 = random1.longs();
        random1.setSeed((long) (byte) 0);
        long long8 = random1.nextLong();
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-4962768465676381896L) + "'", long8 == (-4962768465676381896L));
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("it");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: it [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en_us");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=en_us");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.lang.String str9 = locale7.getDisplayLanguage();
        java.lang.String str10 = locale7.getDisplayLanguage();
        java.util.Locale.Category category11 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale12 = java.util.Locale.getDefault(category11);
        java.util.Locale locale13 = java.util.Locale.getDefault(category11);
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.util.Random random15 = new java.util.Random();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale14, random15);
        java.lang.String str17 = locale14.getISO3Language();
        java.util.Locale.setDefault(category11, locale14);
        java.lang.String str19 = locale7.getDisplayCountry(locale14);
        java.util.Set<java.lang.Character> charSet20 = locale7.getExtensionKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Japanese" + "'", str9, "Japanese");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Japanese" + "'", str10, "Japanese");
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category11.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "x-lvariant-eng");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "x-lvariant-eng");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fra" + "'", str17, "fra");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charSet20);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fr-x-lvariant-eng");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale3.getDisplayCountry(locale9);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("en-us (ENGLISH (UNITED KINGDOM))");
        java.lang.String str13 = locale3.getDisplayCountry(locale12);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fran\347ais" + "'", str6, "fran\347ais");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "France" + "'", str10, "France");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "France" + "'", str13, "France");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        com.github.javafaker.Code code25 = faker0.code();
        com.github.javafaker.Code code26 = faker0.code();
        com.github.javafaker.Address address27 = faker0.address;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(phoneNumber23);
        org.junit.Assert.assertNotNull(code25);
        org.junit.Assert.assertNotNull(code26);
        org.junit.Assert.assertNotNull(address27);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.setScript("");
        java.util.Locale locale6 = builder5.build();
        java.lang.String str7 = locale1.getDisplayCountry(locale6);
        boolean boolean8 = locale1.hasExtensions();
        java.lang.String str9 = locale1.getVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "France" + "'", str7, "France");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Business business4 = faker1.business;
        java.util.Random random5 = new java.util.Random();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Lorem lorem7 = null;
        faker6.lorem = lorem7;
        java.lang.String str10 = faker6.numerify("hi!");
        com.github.javafaker.Options options11 = faker6.options;
        com.github.javafaker.Finance finance12 = faker6.finance;
        faker1.finance = finance12;
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(finance12);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.PhoneNumber phoneNumber3 = faker2.phoneNumber;
        com.github.javafaker.Color color4 = faker2.color;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code6 = null;
        faker5.code = code6;
        com.github.javafaker.Book book8 = faker5.book;
        faker2.book = book8;
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(book8);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.numerify("fra (CHINESE (TAIWAN))");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fra (CHINESE (TAIWAN))" + "'", str7, "fra (CHINESE (TAIWAN))");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.util.Random random4 = new java.util.Random();
        double double5 = random4.nextDouble();
        java.util.stream.IntStream intStream8 = random4.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Code code10 = faker9.code();
        faker1.code = code10;
        com.github.javafaker.Lorem lorem12 = faker1.lorem();
        java.util.Random random13 = new java.util.Random();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Lorem lorem15 = null;
        faker14.lorem = lorem15;
        com.github.javafaker.PhoneNumber phoneNumber17 = faker14.phoneNumber;
        faker1.phoneNumber = phoneNumber17;
        com.github.javafaker.PhoneNumber phoneNumber19 = faker1.phoneNumber();
        com.github.javafaker.Code code20 = faker1.code;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        java.util.Random random22 = new java.util.Random();
        double double23 = random22.nextDouble();
        int int25 = random22.nextInt(1);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.Book book27 = faker26.book();
        faker21.book = book27;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number30 = faker29.number;
        com.github.javafaker.Number number31 = faker29.number();
        java.lang.String str33 = faker29.bothify("en-GB");
        com.github.javafaker.Book book34 = faker29.book();
        java.util.Random random35 = new java.util.Random();
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(random35);
        com.github.javafaker.Lorem lorem37 = null;
        faker36.lorem = lorem37;
        com.github.javafaker.Internet internet39 = null;
        faker36.internet = internet39;
        java.lang.String str42 = faker36.bothify("");
        com.github.javafaker.Code code43 = null;
        faker36.code = code43;
        com.github.javafaker.DateAndTime dateAndTime45 = faker36.date();
        faker29.dateAndTime = dateAndTime45;
        faker21.dateAndTime = dateAndTime45;
        faker1.dateAndTime = dateAndTime45;
        com.github.javafaker.Company company49 = faker1.company;
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4212602699698551d + "'", double5 == 0.4212602699698551d);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNull(lorem12);
        org.junit.Assert.assertNotNull(phoneNumber17);
        org.junit.Assert.assertNotNull(phoneNumber19);
        org.junit.Assert.assertNotNull(code20);
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.7922052237924666d + "'", double23 == 0.7922052237924666d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(book27);
        org.junit.Assert.assertNotNull(number30);
        org.junit.Assert.assertNotNull(number31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "en-GB" + "'", str33, "en-GB");
        org.junit.Assert.assertNotNull(book34);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(dateAndTime45);
        org.junit.Assert.assertNotNull(company49);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        java.util.Random random1 = new java.util.Random(1L);
        double double2 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream7 = random1.longs(0L, 1160159540625517451L, (long) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.561581040188955d + "'", double2 == 1.561581040188955d);
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        java.util.Locale locale2 = new java.util.Locale("en-us (ENGLISH (UNITED KINGDOM))", "en-us");
        org.junit.Assert.assertEquals(locale2.toString(), "en-us (english (united kingdom))_EN-US");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        java.util.Random random1 = new java.util.Random(1L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        java.util.Locale locale3 = new java.util.Locale("en-us (english (united kingdom))", "und_EN_US_eng", "hi! (EN-US,en-US)");
        org.junit.Assert.assertEquals(locale3.toString(), "en-us (english (united kingdom))_UND_EN_US_ENG_hi! (EN-US,en-US)");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", 0.5384472298962059d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Code code8 = null;
        faker1.code = code8;
        com.github.javafaker.DateAndTime dateAndTime10 = faker1.date();
        java.util.Random random11 = new java.util.Random();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.DateAndTime dateAndTime13 = null;
        faker12.dateAndTime = dateAndTime13;
        com.github.javafaker.Business business15 = faker12.business;
        faker1.business = business15;
        com.github.javafaker.Code code17 = faker1.code();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number19 = faker18.number;
        com.github.javafaker.Number number20 = faker18.number();
        java.lang.String str22 = faker18.bothify("en-GB");
        com.github.javafaker.Lorem lorem23 = faker18.lorem();
        com.github.javafaker.Lorem lorem24 = faker18.lorem;
        com.github.javafaker.Business business25 = faker18.business;
        com.github.javafaker.Name name26 = faker18.name();
        faker1.name = name26;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(business15);
        org.junit.Assert.assertNull(code17);
        org.junit.Assert.assertNotNull(number19);
        org.junit.Assert.assertNotNull(number20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "en-GB" + "'", str22, "en-GB");
        org.junit.Assert.assertNotNull(lorem23);
        org.junit.Assert.assertNotNull(lorem24);
        org.junit.Assert.assertNotNull(business25);
        org.junit.Assert.assertNotNull(name26);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Locale locale6 = locale3.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FRA" + "'", str7, "FRA");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        java.util.Random random1 = new java.util.Random((long) (byte) 0);
        int int2 = random1.nextInt();
        long long3 = random1.nextLong();
        int int4 = random1.nextInt();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155484576) + "'", int2 == (-1155484576));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3109364765729502342L) + "'", long3 == (-3109364765729502342L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1690734402) + "'", int4 == (-1690734402));
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.addUnicodeLocaleAttribute("fr_FR_FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fr_FR_FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random1.doubles((double) (short) 0, 10.0d);
        java.util.stream.LongStream longStream10 = random1.longs();
        java.util.stream.DoubleStream doubleStream12 = random1.doubles((long) 1260435278);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        java.util.Locale locale3 = new java.util.Locale("fr", "fra", "france");
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FRA_france");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setVariant("");
        java.util.Locale locale4 = builder1.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        java.lang.String str11 = faker7.numerify("");
        com.github.javafaker.PhoneNumber phoneNumber12 = faker7.phoneNumber;
        faker1.phoneNumber = phoneNumber12;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number15 = faker14.number;
        com.github.javafaker.Number number16 = faker14.number();
        java.lang.String str18 = faker14.bothify("en-GB");
        com.github.javafaker.Name name19 = faker14.name();
        faker1.name = name19;
        com.github.javafaker.Internet internet21 = faker1.internet();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(number15);
        org.junit.Assert.assertNotNull(number16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en-GB" + "'", str18, "en-GB");
        org.junit.Assert.assertNotNull(name19);
        org.junit.Assert.assertNull(internet21);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        java.util.Random random1 = new java.util.Random((long) 100);
        double double2 = random1.nextGaussian();
        double double3 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream7 = random1.longs((long) (short) 10, (long) (-100852159), (long) (-182796497));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6671595726539502d + "'", double3 == 0.6671595726539502d);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        com.github.javafaker.Company company7 = faker5.company();
        com.github.javafaker.Code code8 = faker5.code();
        com.github.javafaker.DateAndTime dateAndTime9 = faker5.date();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8596093803505385d + "'", double1 == 0.8596093803505385d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(dateAndTime9);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        java.util.Random random1 = new java.util.Random(6785130368950820155L);
        java.util.stream.LongStream longStream4 = random1.longs((long) (-647885168), 1853403699951111791L);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder1.setLanguageTag("fr-fr");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setScript("en-us (english (united kingdom))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: en-us (english (united kingdom)) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        java.util.Random random1 = new java.util.Random(1L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.service.RandomService randomService3 = faker2.randomService;
        com.github.javafaker.Number number4 = faker2.number;
        com.github.javafaker.Finance finance5 = faker2.finance();
        com.github.javafaker.Name name6 = faker2.name();
        com.github.javafaker.Internet internet7 = faker2.internet;
        com.github.javafaker.Options options8 = faker2.options();
        org.junit.Assert.assertNotNull(randomService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        com.github.javafaker.Code code25 = faker0.code();
        com.github.javafaker.Name name26 = faker0.name;
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number28 = faker27.number;
        com.github.javafaker.Number number29 = faker27.number();
        java.lang.String str31 = faker27.bothify("en-GB");
        com.github.javafaker.Book book32 = faker27.book();
        com.github.javafaker.Number number33 = faker27.number;
        faker0.number = number33;
        com.github.javafaker.service.RandomService randomService35 = faker0.randomService;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(phoneNumber23);
        org.junit.Assert.assertNotNull(code25);
        org.junit.Assert.assertNotNull(name26);
        org.junit.Assert.assertNotNull(number28);
        org.junit.Assert.assertNotNull(number29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "en-GB" + "'", str31, "en-GB");
        org.junit.Assert.assertNotNull(book32);
        org.junit.Assert.assertNotNull(number33);
        org.junit.Assert.assertNotNull(randomService35);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        com.github.javafaker.Business business11 = faker10.business;
        java.lang.String str13 = faker10.bothify("en-US");
        com.github.javafaker.Number number14 = faker10.number();
        java.lang.String str16 = faker10.numerify("");
        com.github.javafaker.Business business17 = faker10.business();
        com.github.javafaker.Number number18 = faker10.number();
        com.github.javafaker.Company company19 = faker10.company;
        com.github.javafaker.Company company20 = faker10.company();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2903203049946991d + "'", double7 == 0.2903203049946991d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-US" + "'", str13, "en-US");
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(business17);
        org.junit.Assert.assertNotNull(number18);
        org.junit.Assert.assertNotNull(company19);
        org.junit.Assert.assertNotNull(company20);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        java.util.Locale locale3 = new java.util.Locale("FR", "TW", "German");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale7.toLanguageTag();
        java.lang.String str10 = locale3.getDisplayLanguage(locale7);
        java.util.Set<java.lang.String> strSet11 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale3.getDisplayVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "fr_TW_German");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr-FR" + "'", str9, "fr-FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fran\347ais" + "'", str10, "fran\347ais");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "German" + "'", str12, "German");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        java.util.Locale locale1 = new java.util.Locale("en-GB");
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale1.getDisplayCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "en-gb");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        float float11 = random6.nextFloat();
        int int12 = random6.nextInt();
        int int14 = random6.nextInt((int) 'u');
        java.util.stream.IntStream intStream15 = random6.ints();
        boolean boolean16 = random6.nextBoolean();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3853195639004964d + "'", double7 == 0.3853195639004964d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.26364666f + "'", float11 == 0.26364666f);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1219519771) + "'", int12 == (-1219519771));
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 68 + "'", int14 == 68);
        org.junit.Assert.assertNotNull(intStream15);
// flaky:         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Name name8 = faker1.name;
        com.github.javafaker.Internet internet9 = faker1.internet();
        com.github.javafaker.Internet internet10 = faker1.internet;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNull(internet9);
        org.junit.Assert.assertNull(internet10);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) (byte) 0, 0.3463572515316925d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Locale locale6 = locale3.stripExtensions();
        java.util.Locale locale9 = new java.util.Locale("hi!", "en-US");
        java.lang.String str10 = locale3.getDisplayName(locale9);
        java.lang.String str11 = locale9.getScript();
        java.util.Locale locale14 = new java.util.Locale("hi!", "French");
        java.lang.String str15 = locale9.getDisplayLanguage(locale14);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!_EN-US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "French (France)" + "'", str10, "French (France)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals(locale14.toString(), "hi!_FRENCH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        java.util.Random random5 = new java.util.Random();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Lorem lorem7 = null;
        faker6.lorem = lorem7;
        java.lang.String str10 = faker6.numerify("hi!");
        com.github.javafaker.Lorem lorem11 = faker6.lorem;
        java.util.Random random12 = new java.util.Random();
        double double13 = random12.nextDouble();
        int int15 = random12.nextInt(1);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.service.RandomService randomService17 = faker16.randomService;
        faker6.randomService = randomService17;
        com.github.javafaker.Finance finance19 = faker6.finance();
        com.github.javafaker.Lorem lorem20 = faker6.lorem();
        com.github.javafaker.PhoneNumber phoneNumber21 = faker6.phoneNumber();
        com.github.javafaker.Name name22 = faker6.name();
        faker4.name = name22;
        com.github.javafaker.Options options24 = faker4.options();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(lorem11);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3021640765966318d + "'", double13 == 0.3021640765966318d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(randomService17);
        org.junit.Assert.assertNotNull(finance19);
        org.junit.Assert.assertNull(lorem20);
        org.junit.Assert.assertNotNull(phoneNumber21);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(options24);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setVariant("fra (CHINESE (TAIWAN))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: fra (CHINESE (TAIWAN)) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        java.util.Random random1 = new java.util.Random((long) (byte) 1);
        byte[] byteArray3 = new byte[] { (byte) -1 };
        random1.nextBytes(byteArray3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        float float6 = random1.nextFloat();
        java.util.stream.LongStream longStream7 = random1.longs();
        double double8 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream12 = random1.doubles((long) 1429008869, (double) 0.14833277f, 0.12527919597123338d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[115]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.100473166f + "'", float6 == 0.100473166f);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.41008081149220166d + "'", double8 == 0.41008081149220166d);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Random random3 = new java.util.Random(1L);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale1, random3);
        java.lang.String str5 = locale1.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale1.getUnicodeLocaleType("x-lvariant-eng");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: x-lvariant-eng");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs();
        java.util.Random random6 = new java.util.Random(1L);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        java.util.stream.LongStream longStream11 = random6.longs((long) 1, (long) 1, 100L);
        java.util.Random random12 = new java.util.Random();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        double double14 = random12.nextGaussian();
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        random12.nextBytes(byteArray20);
        random6.nextBytes(byteArray20);
        byte[] byteArray24 = new byte[] { (byte) -1 };
        random6.nextBytes(byteArray24);
        random1.nextBytes(byteArray24);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream11);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.5663030024422312d) + "'", double14 == (-0.5663030024422312d));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[115, -43, 26, -69, -40]");
        org.junit.Assert.assertNotNull(byteArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[54]");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("fr_FR");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
    }
}
