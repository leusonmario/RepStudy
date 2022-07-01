import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale locale7 = builder4.build();
        java.util.Locale.Builder builder9 = builder4.removeUnicodeLocaleAttribute("CHN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "kor");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.util.Locale locale3 = new java.util.Locale("de_DE", "fra", "de_DE");
        java.util.Locale locale4 = locale3.stripExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "de_de_FRA_de_DE");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_de_FRA_de_DE");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.getDisplayName();
        java.lang.String str4 = locale1.getDisplayScript();
        java.lang.String str5 = locale0.getDisplayScript(locale1);
        java.util.Random random7 = new java.util.Random(10L);
        float float8 = random7.nextFloat();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale0, random7);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u97d3\u6587\u5357\u97d3)" + "'", str3, "\u97d3\u6587\u5357\u97d3)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.73043025f + "'", float8 == 0.73043025f);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale locale7 = java.util.Locale.GERMANY;
        java.util.Random random9 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        float float11 = random9.nextFloat();
        java.util.stream.IntStream intStream15 = random9.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream17 = random9.ints((long) 'x');
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale7, random9);
        java.util.Locale.Builder builder19 = builder4.setLocale(locale7);
        java.util.Locale.Builder builder21 = builder19.addUnicodeLocaleAttribute("francese");
        java.util.Locale.Builder builder24 = builder21.setExtension('a', "KR");
        java.util.Locale locale25 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale26 = locale25.stripExtensions();
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale26);
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.lang.String str29 = locale28.getVariant();
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        java.util.Locale locale32 = new java.util.Locale("");
        java.lang.String str33 = locale32.getISO3Language();
        java.util.Locale.Builder builder34 = builder30.setLocale(locale32);
        java.lang.String str35 = locale32.getScript();
        java.util.Locale.Builder builder36 = new java.util.Locale.Builder();
        java.util.Locale locale38 = new java.util.Locale("");
        java.lang.String str39 = locale38.getISO3Language();
        java.util.Locale.Builder builder40 = builder36.setLocale(locale38);
        java.lang.String str41 = locale38.getISO3Country();
        java.lang.String str42 = locale32.getDisplayLanguage(locale38);
        java.lang.String str43 = locale32.getCountry();
        java.lang.String str44 = locale28.getDisplayCountry(locale32);
        java.util.Locale locale45 = java.util.Locale.US;
        java.lang.String str46 = locale45.getISO3Language();
        java.lang.String str47 = locale28.getDisplayCountry(locale45);
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(locale28);
        java.lang.String str49 = locale26.getDisplayVariant(locale28);
        java.util.Locale.Builder builder50 = builder24.setLocale(locale26);
        java.util.Locale.Builder builder53 = builder24.setExtension('x', "CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.72810113f + "'", float11 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "South Korea" + "'", str44, "South Korea");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "eng" + "'", str46, "eng");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "South Korea" + "'", str47, "South Korea");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.util.Locale locale2 = new java.util.Locale("kor", "french (FRENCH)");
        java.lang.String str3 = locale2.getDisplayName();
        java.lang.String str4 = locale2.getVariant();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale5);
        java.lang.String str7 = locale5.getDisplayCountry();
        java.lang.String str8 = locale5.getDisplayVariant();
        java.lang.String str9 = locale5.getISO3Country();
        java.util.Locale.Category category10 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale13 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale13);
        java.util.Locale.setDefault(category10, locale13);
        java.lang.String str16 = locale13.getDisplayVariant();
        java.lang.String str17 = locale5.getDisplayName(locale13);
        java.lang.String str18 = locale2.getDisplayScript(locale5);
        java.util.Locale locale19 = locale2.stripExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "kor_FRENCH (FRENCH)");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u97d3\u6587 (FRENCH (FRENCH))" + "'", str3, "\u97d3\u6587 (FRENCH (FRENCH))");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u570b" + "'", str7, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CHN" + "'", str9, "CHN");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category10.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale13.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Chinese (China)" + "'", str17, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "kor_FRENCH (FRENCH)");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Color color3 = faker2.color();
        com.github.javafaker.DateAndTime dateAndTime4 = faker2.date();
        java.lang.String str6 = faker2.bothify("\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str6, "\ud504\ub791\uc2a4\uc5b4");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr-CA" + "'", str2, "fr-CA");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Color color4 = faker2.color();
        com.github.javafaker.Company company5 = faker2.company();
        com.github.javafaker.Lorem lorem6 = faker2.lorem();
        com.github.javafaker.Business business7 = faker2.business();
        java.lang.Class<?> wildcardClass8 = faker2.getClass();
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Chinese (China)", (-1.3068466606213818d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.3068466606213818");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.util.Locale locale3 = new java.util.Locale("", "fra-France", "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u56fd");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Chinook jargon (Germany,KR)", 0.8869349148715235d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinook jargon (germany,kr)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.util.Locale locale1 = new java.util.Locale("und-France");
        org.junit.Assert.assertEquals(locale1.toString(), "und-france");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("FRENCH");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getScript();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.lang.String str11 = locale10.getDisplayName();
        java.lang.String str12 = locale10.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale locale14 = java.util.Locale.getDefault(category0);
        java.lang.String str15 = locale14.getDisplayVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese" + "'", str11, "Chinese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("french");
        java.util.Locale locale6 = new java.util.Locale("CHN");
        java.util.Locale.Builder builder7 = builder0.setLocale(locale6);
        java.lang.String str9 = locale6.getExtension('x');
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale6.toString(), "chn");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.util.Locale locale2 = new java.util.Locale("Italia", "KOR");
        java.lang.String str3 = locale2.getCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "italia_KOR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "KOR" + "'", str3, "KOR");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder8 = builder4.setLanguage("");
        java.util.Locale.Builder builder9 = builder4.clearExtensions();
        java.util.Locale.Builder builder10 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setExtension('4', "de-DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.util.Locale locale0 = null;
        java.util.Random random2 = new java.util.Random((long) (byte) 100);
        java.util.stream.IntStream intStream3 = random2.ints();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        double double9 = random1.nextDouble();
        java.util.stream.IntStream intStream11 = random1.ints((long) (byte) 100);
        java.util.stream.IntStream intStream15 = random1.ints((long) '4', (int) '#', (int) 'x');
        boolean boolean16 = random1.nextBoolean();
        java.util.stream.IntStream intStream18 = random1.ints((long) (short) 1);
        float float19 = random1.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream22 = random1.doubles((double) 31, 0.22278216143339702d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44047195711667986d + "'", double9 == 0.44047195711667986d);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8869349f + "'", float19 == 0.8869349f);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.util.Locale locale3 = new java.util.Locale("zh_TW", "Chinese", "Chinese");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale3.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale3.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "zh_tw_CHINESE_Chinese");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_tw_CHINESE_Chinese");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.toLanguageTag();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0);
        java.util.Random random7 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        int int10 = random7.nextInt(10);
        java.util.stream.DoubleStream doubleStream11 = random7.doubles();
        double double12 = random7.nextGaussian();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale0, random7);
        java.lang.String str14 = locale0.getVariant();
        java.util.Locale locale17 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleKeys();
        java.lang.String str19 = locale17.getDisplayVariant();
        java.lang.String str20 = locale0.getDisplayScript(locale17);
        java.lang.String str22 = locale17.getExtension('a');
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.lang.String str24 = locale23.getISO3Language();
        java.util.Locale locale25 = locale23.stripExtensions();
        java.util.Locale locale28 = new java.util.Locale("fra-x-lvariant-kor", "hi!");
        java.lang.String str29 = locale23.getDisplayScript(locale28);
        java.lang.String str30 = locale17.getDisplayCountry(locale23);
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale locale34 = new java.util.Locale("");
        java.lang.String str35 = locale34.getISO3Language();
        java.util.Locale.Builder builder36 = builder32.setLocale(locale34);
        java.lang.String str37 = locale34.getISO3Country();
        java.lang.String str38 = locale31.getDisplayLanguage(locale34);
        java.lang.String str39 = locale17.getDisplayLanguage(locale34);
        java.util.Locale locale41 = new java.util.Locale("HI!");
        java.lang.String str42 = locale17.getDisplayVariant(locale41);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.35703205834598994d) + "'", double12 == (-0.35703205834598994d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale17.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "kor" + "'", str24, "kor");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko_KR");
        org.junit.Assert.assertEquals(locale28.toString(), "fra-x-lvariant-kor_HI!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "FRA" + "'", str30, "FRA");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "French" + "'", str38, "French");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "french" + "'", str39, "french");
        org.junit.Assert.assertEquals(locale41.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Random random3 = new java.util.Random(10L);
        float float4 = random3.nextFloat();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random3);
        long long6 = random3.nextLong();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0, random3);
        java.lang.String str8 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr" + "'", str1, "fr");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.73043025f + "'", float4 == 0.73043025f);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8220501950349663546L + "'", long6 == 8220501950349663546L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Book book10 = faker9.book();
        com.github.javafaker.Finance finance11 = faker9.finance();
        com.github.javafaker.Code code12 = faker9.code();
        com.github.javafaker.Options options13 = faker9.options();
        java.lang.String str15 = faker9.numerify("GB");
        java.lang.String str17 = faker9.bothify("\u4e2d\u56fd\u8a9e");
        java.lang.String str19 = faker9.letterify("cinese (Cina)");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GB" + "'", str15, "GB");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str17, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "cinese (Cina)" + "'", str19, "cinese (Cina)");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Chinese");
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale2.getVariant();
        java.lang.String str4 = locale2.getCountry();
        boolean boolean5 = languageRange1.equals((java.lang.Object) str4);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KR" + "'", str4, "KR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder3.setVariant("French");
        java.util.Locale.Builder builder8 = builder3.setExtension('x', "");
        java.util.Locale locale9 = builder8.build();
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        java.lang.String str11 = locale9.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Random random3 = new java.util.Random(10L);
        float float4 = random3.nextFloat();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random3);
        long long6 = random3.nextLong();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.Color color8 = faker7.color();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr" + "'", str1, "fr");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.73043025f + "'", float4 == 0.73043025f);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8220501950349663546L + "'", long6 == 8220501950349663546L);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u97d3\u6587 (FRENCH (FRENCH))");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?? (french (french))");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        java.util.Locale locale2 = new java.util.Locale("fra", "China");
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale locale4 = java.util.Locale.ROOT;
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.lang.String str6 = locale5.getISO3Language();
        java.lang.String str7 = locale5.getDisplayName();
        java.lang.String str8 = locale4.getDisplayScript(locale5);
        java.lang.String str9 = locale4.getLanguage();
        java.util.Locale locale10 = locale4.stripExtensions();
        java.util.Set<java.lang.String> strSet11 = locale4.getUnicodeLocaleKeys();
        java.lang.String str12 = locale2.getDisplayVariant(locale4);
        org.junit.Assert.assertEquals(locale2.toString(), "fra_CHINA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fra" + "'", str3, "fra");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "kor" + "'", str6, "kor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Korean (South Korea)" + "'", str7, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.IntStream intStream3 = random1.ints((long) '#');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Color color5 = faker4.color();
        com.github.javafaker.Company company6 = faker4.company();
        com.github.javafaker.Internet internet7 = faker4.internet();
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(internet7);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = new java.util.Locale("France");
        java.lang.String str3 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale6 = new java.util.Locale("FRA-X-LVARIANT-KOR", "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale0.getDisplayLanguage(locale6);
        java.lang.String str9 = locale0.getDisplayLanguage();
        java.lang.String str11 = locale0.getExtension('x');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Canada" + "'", str3, "Canada");
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))" + "'", str7, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "English" + "'", str8, "English");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "English" + "'", str9, "English");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder2.setLocale(locale4);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getISO3Language();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale9);
        java.lang.String str12 = locale4.getDisplayCountry(locale9);
        java.lang.String str13 = locale4.getLanguage();
        java.lang.String str14 = locale0.getDisplayVariant(locale4);
        java.lang.String str15 = locale0.getDisplayName();
        java.lang.String str16 = locale0.getISO3Language();
        java.lang.String str17 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chinese (China)" + "'", str15, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zho" + "'", str16, "zho");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Book book10 = faker9.book();
        com.github.javafaker.Finance finance11 = faker9.finance();
        com.github.javafaker.Book book12 = faker9.book();
        com.github.javafaker.DateAndTime dateAndTime13 = faker9.date();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(book12);
        org.junit.Assert.assertNotNull(dateAndTime13);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.util.Locale locale1 = new java.util.Locale("French (France)");
        java.lang.String str3 = locale1.getExtension('a');
        org.junit.Assert.assertEquals(locale1.toString(), "french (france)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.util.Locale locale3 = new java.util.Locale("fra", "hi!", "kor");
        java.lang.String str4 = locale3.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fra_HI!_kor could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "fra_HI!_kor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.PhoneNumber phoneNumber7 = faker2.phoneNumber();
        com.github.javafaker.Internet internet8 = faker2.internet();
        com.github.javafaker.PhoneNumber phoneNumber9 = faker2.phoneNumber();
        com.github.javafaker.Internet internet10 = faker2.internet();
        com.github.javafaker.Lorem lorem11 = faker2.lorem();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(lorem11);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        com.github.javafaker.Options options3 = faker1.options();
        com.github.javafaker.Lorem lorem4 = faker1.lorem();
        com.github.javafaker.Lorem lorem5 = faker1.lorem();
        com.github.javafaker.Number number6 = faker1.number();
        com.github.javafaker.Options options7 = faker1.options();
        com.github.javafaker.Address address8 = faker1.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(address8);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("coreano");
        java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("TW", "french");
        java.util.Locale.Builder builder12 = builder7.removeUnicodeLocaleAttribute("TWN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder7.setLanguage("\u65e5\u672c");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Random random2 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        int int5 = random2.nextInt(10);
        java.util.stream.DoubleStream doubleStream6 = random2.doubles();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random2);
        float float9 = random2.nextFloat();
        random2.setSeed(0L);
        double double12 = random2.nextDouble();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.44047195f + "'", float9 == 0.44047195f);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.730967787376657d + "'", double12 == 0.730967787376657d);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getScript();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale12 = new java.util.Locale("fra", "hi!", "kor");
        java.util.Locale.Category category13 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale16 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale16);
        java.util.Locale.setDefault(category13, locale16);
        java.util.Locale locale19 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category13, locale19);
        java.lang.String str21 = locale12.getDisplayCountry(locale19);
        java.util.Locale locale24 = new java.util.Locale("french", "fra");
        java.lang.String str25 = locale12.getDisplayCountry(locale24);
        java.util.Locale.setDefault(category0, locale12);
        java.lang.String str27 = locale12.getCountry();
        java.lang.String str28 = locale12.getDisplayLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals(locale12.toString(), "fra_HI!_kor");
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category13.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale16.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HI!" + "'", str21, "HI!");
        org.junit.Assert.assertEquals(locale24.toString(), "french_FRA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HI!" + "'", str25, "HI!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HI!" + "'", str27, "HI!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "fra" + "'", str28, "fra");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Book book10 = faker9.book();
        com.github.javafaker.Finance finance11 = faker9.finance();
        java.lang.String str13 = faker9.letterify("italia");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "italia" + "'", str13, "italia");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getDisplayScript();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        java.util.Random random4 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream5 = random4.ints();
        java.util.stream.LongStream longStream6 = random4.longs();
        java.util.Random random8 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        int int11 = random8.nextInt(10);
        java.util.Random random13 = new java.util.Random(10L);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random13.nextBytes(byteArray19);
        random8.nextBytes(byteArray19);
        random4.nextBytes(byteArray19);
        java.util.stream.IntStream intStream23 = random4.ints();
        int int24 = random4.nextInt();
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale0, random4);
        java.util.Random random27 = new java.util.Random((long) '#');
        java.util.stream.DoubleStream doubleStream29 = random27.doubles((long) (short) 100);
        java.util.Random random31 = new java.util.Random(10L);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random31.nextBytes(byteArray37);
        random27.nextBytes(byteArray37);
        random4.nextBytes(byteArray37);
        boolean boolean41 = random4.nextBoolean();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[95, 64, 8, 57, 59]");
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1708368258 + "'", int24 == 1708368258);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[107, 13, 8, -107, -72]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.util.Locale locale3 = new java.util.Locale("FRENCH (FRANCE) (France)", "CN", "");
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale7);
        java.util.Locale.setDefault(category4, locale7);
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category4, locale10);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        boolean boolean13 = locale12.hasExtensions();
        java.lang.String str14 = locale12.getDisplayLanguage();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale12);
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("coreano (Corea del Sud)");
        java.lang.String str18 = locale17.toLanguageTag();
        java.lang.String str19 = locale12.getDisplayCountry(locale17);
        java.util.Locale locale23 = new java.util.Locale("fra-x-lvariant-kor", "fra", "kor");
        java.lang.String str24 = locale12.getDisplayName(locale23);
        java.util.Locale locale25 = locale23.stripExtensions();
        java.util.Locale.setDefault(category4, locale23);
        java.util.Locale locale27 = java.util.Locale.getDefault(category4);
        java.lang.String str28 = locale3.getDisplayScript(locale27);
        java.lang.String str29 = locale27.getDisplayCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "french (france) (france)_CN");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale7.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "francese" + "'", str14, "francese");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "und" + "'", str18, "und");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "France" + "'", str19, "France");
        org.junit.Assert.assertEquals(locale23.toString(), "fra-x-lvariant-kor_FRA_kor");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "French (France)" + "'", str24, "French (France)");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fra-x-lvariant-kor_FRA_kor");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fra-x-lvariant-kor_FRA_kor");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "FRA" + "'", str29, "FRA");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zh");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("fra-x-lvariant-kor", strMap3);
        java.util.Locale locale7 = new java.util.Locale("french", "fra-x-lvariant-kor");
        java.lang.String str9 = locale7.getExtension('u');
        java.util.Set<java.lang.String> strSet10 = locale7.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strSet10);
        java.util.Locale locale12 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale12);
        java.lang.String str14 = locale12.getDisplayCountry();
        java.lang.String str15 = locale12.getDisplayVariant();
        java.lang.String str16 = locale12.toLanguageTag();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale12);
        java.util.Random random19 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        int int22 = random19.nextInt(10);
        java.util.stream.DoubleStream doubleStream23 = random19.doubles();
        double double24 = random19.nextGaussian();
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale12, random19);
        java.lang.String str26 = locale12.getVariant();
        java.util.Locale locale29 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleKeys();
        java.lang.String str31 = locale29.getDisplayVariant();
        java.lang.String str32 = locale12.getDisplayScript(locale29);
        java.util.Set<java.lang.String> strSet33 = locale29.getUnicodeLocaleAttributes();
        java.lang.String str34 = java.util.Locale.lookupTag(languageRangeList4, (java.util.Collection<java.lang.String>) strSet33);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap35 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap35);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap40 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList41 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, strMap40);
        java.util.Locale.Builder builder42 = new java.util.Locale.Builder();
        java.util.Locale locale44 = new java.util.Locale("");
        java.lang.String str45 = locale44.getISO3Language();
        java.util.Locale.Builder builder46 = builder42.setLocale(locale44);
        java.util.Locale locale48 = new java.util.Locale("");
        java.lang.String str49 = locale48.getISO3Language();
        java.util.Locale locale51 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder52 = new java.util.Locale.Builder();
        java.util.Locale locale54 = new java.util.Locale("");
        java.lang.String str55 = locale54.getISO3Language();
        java.util.Locale.Builder builder56 = builder52.setLocale(locale54);
        java.util.Locale locale58 = new java.util.Locale("");
        java.lang.String str59 = locale58.getISO3Language();
        java.util.Locale[] localeArray60 = new java.util.Locale[] { locale44, locale48, locale51, locale54, locale58 };
        java.util.ArrayList<java.util.Locale> localeList61 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList61, localeArray60);
        java.util.Locale locale63 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.util.Locale>) localeList61);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap64 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList65 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, strMap64);
        java.util.Locale.LanguageRange[] languageRangeArray66 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList67 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList67, languageRangeArray66);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap69 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList70 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList67, strMap69);
        java.util.Locale.Builder builder71 = new java.util.Locale.Builder();
        java.util.Locale locale73 = new java.util.Locale("");
        java.lang.String str74 = locale73.getISO3Language();
        java.util.Locale.Builder builder75 = builder71.setLocale(locale73);
        java.util.Locale locale77 = new java.util.Locale("");
        java.lang.String str78 = locale77.getISO3Language();
        java.util.Locale locale80 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder81 = new java.util.Locale.Builder();
        java.util.Locale locale83 = new java.util.Locale("");
        java.lang.String str84 = locale83.getISO3Language();
        java.util.Locale.Builder builder85 = builder81.setLocale(locale83);
        java.util.Locale locale87 = new java.util.Locale("");
        java.lang.String str88 = locale87.getISO3Language();
        java.util.Locale[] localeArray89 = new java.util.Locale[] { locale73, locale77, locale80, locale83, locale87 };
        java.util.ArrayList<java.util.Locale> localeList90 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList90, localeArray89);
        java.util.Locale locale92 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList67, (java.util.Collection<java.util.Locale>) localeList90);
        java.util.List<java.util.Locale> localeList93 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.util.Locale>) localeList90);
        java.util.Locale locale94 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet95 = locale94.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList96 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.lang.String>) strSet95);
        java.util.List<java.lang.String> strList97 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strList96);
        java.lang.String str98 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strList97);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertEquals(locale7.toString(), "french_FRA-X-LVARIANT-KOR");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "China" + "'", str14, "China");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-CN" + "'", str16, "zh-CN");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.35703205834598994d) + "'", double24 == (-0.35703205834598994d));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals(locale29.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(languageRangeList36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(languageRangeList41);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals(locale51.toString(), "hi!");
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(localeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(locale63);
        org.junit.Assert.assertNotNull(languageRangeList65);
        org.junit.Assert.assertNotNull(languageRangeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(languageRangeList70);
        org.junit.Assert.assertEquals(locale73.toString(), "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertEquals(locale77.toString(), "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals(locale80.toString(), "hi!");
        org.junit.Assert.assertEquals(locale83.toString(), "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertEquals(locale87.toString(), "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(localeArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNull(locale92);
        org.junit.Assert.assertNotNull(localeList93);
        org.junit.Assert.assertNotNull(locale94);
        org.junit.Assert.assertEquals(locale94.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertNotNull(strList96);
        org.junit.Assert.assertNotNull(strList97);
        org.junit.Assert.assertNull(str98);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.util.Locale locale1 = new java.util.Locale("FRENCH (FRENCH)");
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "french (french)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "french (french)" + "'", str3, "french (french)");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "de-DE" + "'", str1, "de-DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str2 = locale0.getExtension('x');
        java.util.Locale locale5 = new java.util.Locale("chinese_KOR", "Canada");
        java.util.Locale locale8 = new java.util.Locale("hi!", "zh-CN");
        java.lang.String str9 = locale5.getDisplayName(locale8);
        java.util.Locale locale10 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale10);
        java.lang.String str12 = locale10.getDisplayCountry();
        java.lang.String str13 = locale10.getDisplayVariant();
        java.lang.String str14 = locale10.toLanguageTag();
        java.lang.String str15 = locale10.getISO3Country();
        java.lang.String str16 = locale8.getDisplayVariant(locale10);
        java.lang.String str17 = locale0.getDisplayCountry(locale10);
        java.lang.String str18 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals(locale5.toString(), "chinese_kor_CANADA");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!_ZH-CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chinese_kor (CANADA)" + "'", str9, "chinese_kor (CANADA)");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "China" + "'", str12, "China");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CHN" + "'", str15, "CHN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str17, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguage("GB");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.util.Locale locale2 = new java.util.Locale("coreano (Corea del Sud)", "kor");
        java.lang.String str3 = locale2.getScript();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: coreano (corea del sud)_KOR could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "coreano (corea del sud)_KOR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("French");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale2.getScript();
        java.util.Locale.setDefault(locale2);
        java.lang.String str5 = locale2.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "french");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "french");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.util.Random random1 = new java.util.Random((long) 'a');
        java.util.stream.IntStream intStream4 = random1.ints(13, 85);
        java.util.stream.LongStream longStream5 = random1.longs();
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("tedesco", 0.6991794951529816d);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.util.Locale locale3 = new java.util.Locale("FRENCH (FRANCE) (France)", "FR", "fra-x-lvariant-kor_HI!");
        org.junit.Assert.assertEquals(locale3.toString(), "french (france) (france)_FR_fra-x-lvariant-kor_HI!");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.util.Locale locale3 = new java.util.Locale("fra", "hi!", "kor");
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale7);
        java.util.Locale.setDefault(category4, locale7);
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category4, locale10);
        java.lang.String str12 = locale3.getDisplayCountry(locale10);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fra_HI!_kor could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "fra_HI!_kor");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale7.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.util.Locale locale2 = new java.util.Locale("Korean (South Korea)", "FRA-X-LVARIANT-KOR_HI!");
        org.junit.Assert.assertEquals(locale2.toString(), "korean (south korea)_FRA-X-LVARIANT-KOR_HI!");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale3 = locale0.stripExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale locale9 = java.util.Locale.UK;
        java.lang.String str10 = locale7.getDisplayLanguage(locale9);
        java.lang.String str11 = locale4.getDisplayName(locale9);
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = locale12.getISO3Language();
        java.lang.String str14 = locale4.getDisplayCountry(locale12);
        java.lang.String str15 = locale0.getDisplayName(locale12);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ja" + "'", str1, "ja");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u30d5\u30e9\u30f3\u30b9" + "'", str5, "\u30d5\u30e9\u30f3\u30b9");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "French (France)" + "'", str11, "French (France)");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "eng" + "'", str13, "eng");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "France" + "'", str14, "France");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Japanese" + "'", str15, "Japanese");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.util.Random random1 = new java.util.Random((long) (-1789290896));
        random1.setSeed((long) 9);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) 32);
        java.util.stream.IntStream intStream13 = random1.ints((int) '4', 100);
        java.util.stream.LongStream longStream15 = random1.longs((long) 28);
        java.util.stream.IntStream intStream19 = random1.ints((long) (short) 1, (-1167796541), 13);
        double double20 = random1.nextGaussian();
        java.util.stream.IntStream intStream23 = random1.ints((-1192805220), (-1));
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.561581040188955d + "'", double20 == 1.561581040188955d);
        org.junit.Assert.assertNotNull(intStream23);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Color color3 = faker2.color();
        com.github.javafaker.DateAndTime dateAndTime4 = faker2.date();
        com.github.javafaker.Book book5 = faker2.book();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(book5);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.util.Locale locale1 = new java.util.Locale("\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale2.getDisplayVariant();
        java.lang.String str4 = locale2.getScript();
        java.lang.String str5 = locale2.getVariant();
        java.lang.String str6 = locale1.getDisplayVariant(locale2);
        org.junit.Assert.assertEquals(locale1.toString(), "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale locale7 = builder4.build();
        java.util.Locale.Builder builder9 = builder4.setVariant("");
        java.util.Locale.Builder builder12 = builder9.setExtension('a', "CA");
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.util.Locale locale15 = new java.util.Locale("France");
        java.lang.String str16 = locale13.getDisplayCountry(locale15);
        java.util.Locale locale19 = new java.util.Locale("FRA-X-LVARIANT-KOR", "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        java.lang.String str20 = locale19.getDisplayName();
        java.lang.String str21 = locale13.getDisplayLanguage(locale19);
        java.lang.String str22 = locale13.getDisplayLanguage();
        java.util.Locale.Builder builder23 = builder12.setLocale(locale13);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "kor");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale15.toString(), "france");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Canada" + "'", str16, "Canada");
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))" + "'", str20, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "English" + "'", str21, "English");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u82f1\u8a9e" + "'", str22, "\u82f1\u8a9e");
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale7 = builder5.build();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = locale8.getDisplayCountry();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getISO3Language();
        java.util.Locale locale13 = java.util.Locale.UK;
        java.lang.String str14 = locale11.getDisplayLanguage(locale13);
        java.lang.String str15 = locale8.getDisplayName(locale13);
        java.util.Locale locale16 = java.util.Locale.US;
        java.lang.String str17 = locale16.getISO3Language();
        java.lang.String str18 = locale8.getDisplayCountry(locale16);
        java.util.Locale.Builder builder19 = builder5.setLocale(locale16);
        java.util.Set<java.lang.String> strSet20 = locale16.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u30d5\u30e9\u30f3\u30b9" + "'", str9, "\u30d5\u30e9\u30f3\u30b9");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "French (France)" + "'", str15, "French (France)");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "eng" + "'", str17, "eng");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "France" + "'", str18, "France");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Address address5 = faker0.address();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Number number7 = faker0.number();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(book4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.util.Random random1 = new java.util.Random((long) 7);
        double double2 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles((double) 1, (double) (short) 10);
        float float6 = random1.nextFloat();
        random1.setSeed((long) (byte) 100);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random1);
        java.util.stream.IntStream intStream13 = random1.ints(8125273516308965922L, (int) (byte) 0, 1891812663);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8452060657049847d + "'", double2 == 0.8452060657049847d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.3483097f + "'", float6 == 0.3483097f);
        org.junit.Assert.assertNotNull(intStream13);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        java.util.Locale locale3 = new java.util.Locale("South Korea", "\u30d5\u30e9\u30f3\u30b9", "CA");
        java.lang.Object obj4 = locale3.clone();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u30d5\u30e9\u30f3\u30b9_CA");
        org.junit.Assert.assertNotNull(obj4);
// flaky:         org.junit.Assert.assertEquals(obj4.toString(), "\u30d5\u30e9\u30f3\u30b9_CA");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "\u30d5\u30e9\u30f3\u30b9_CA");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "\u30d5\u30e9\u30f3\u30b9_CA");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker2.resolve("french (france) (CANADA)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Chinese");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("fra");
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale12.getISO3Language();
        java.util.Locale.Builder builder14 = builder10.setLocale(locale12);
        java.util.Locale locale16 = new java.util.Locale("");
        java.lang.String str17 = locale16.getISO3Language();
        java.util.Locale locale19 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale22 = new java.util.Locale("");
        java.lang.String str23 = locale22.getISO3Language();
        java.util.Locale.Builder builder24 = builder20.setLocale(locale22);
        java.util.Locale locale26 = new java.util.Locale("");
        java.lang.String str27 = locale26.getISO3Language();
        java.util.Locale[] localeArray28 = new java.util.Locale[] { locale12, locale16, locale19, locale22, locale26 };
        java.util.ArrayList<java.util.Locale> localeList29 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList29, localeArray28);
        java.util.Locale locale31 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList29);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap35 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.parse("fra", strMap35);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap40 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList41 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, strMap40);
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, strMap45);
        java.util.Locale.Builder builder47 = new java.util.Locale.Builder();
        java.util.Locale locale49 = new java.util.Locale("");
        java.lang.String str50 = locale49.getISO3Language();
        java.util.Locale.Builder builder51 = builder47.setLocale(locale49);
        java.util.Locale locale53 = new java.util.Locale("");
        java.lang.String str54 = locale53.getISO3Language();
        java.util.Locale locale56 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder57 = new java.util.Locale.Builder();
        java.util.Locale locale59 = new java.util.Locale("");
        java.lang.String str60 = locale59.getISO3Language();
        java.util.Locale.Builder builder61 = builder57.setLocale(locale59);
        java.util.Locale locale63 = new java.util.Locale("");
        java.lang.String str64 = locale63.getISO3Language();
        java.util.Locale[] localeArray65 = new java.util.Locale[] { locale49, locale53, locale56, locale59, locale63 };
        java.util.ArrayList<java.util.Locale> localeList66 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList66, localeArray65);
        java.util.Locale locale68 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.Locale.FilteringMode filteringMode69 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.util.Locale>) localeList66, filteringMode69);
        java.util.Locale locale71 = java.util.Locale.lookup(languageRangeList36, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.List<java.util.Locale> localeList72 = java.util.Locale.filter(languageRangeList33, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.List<java.util.Locale> localeList73 = java.util.Locale.filter(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.List<java.util.Locale> localeList74 = java.util.Locale.filter(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList66);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList75 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals(locale19.toString(), "hi!");
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(localeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(locale31);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertNotNull(languageRangeList36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(languageRangeList41);
        org.junit.Assert.assertNotNull(languageRangeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals(locale56.toString(), "hi!");
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(localeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(locale68);
        org.junit.Assert.assertTrue("'" + filteringMode69 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode69.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList70);
        org.junit.Assert.assertNull(locale71);
        org.junit.Assert.assertNotNull(localeList72);
        org.junit.Assert.assertNotNull(localeList73);
        org.junit.Assert.assertNotNull(localeList74);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u30d5\u30e9\u30f3\u30b9");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.IntStream intStream3 = random1.ints((long) '#');
        java.util.stream.LongStream longStream6 = random1.longs((long) (byte) 10, (long) (short) 100);
        double double7 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8746788966462123d + "'", double7 == 0.8746788966462123d);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale7);
        java.lang.String str10 = locale2.getDisplayCountry(locale7);
        java.lang.String str11 = locale2.getLanguage();
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = locale12.getISO3Language();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getISO3Language();
        java.lang.String str17 = locale12.getDisplayVariant(locale15);
        java.lang.String str18 = locale2.getDisplayName(locale15);
        java.lang.String str20 = locale15.getExtension('u');
        java.lang.String str21 = locale15.getISO3Country();
        java.util.Locale locale22 = locale15.stripExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "eng" + "'", str13, "eng");
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setExtension('u', "");
        java.util.Locale locale10 = builder9.build();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale locale7 = builder4.build();
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder11 = builder4.setLocale(locale8);
        java.util.Locale locale13 = new java.util.Locale("");
        java.lang.String str14 = locale13.getISO3Language();
        java.util.Locale locale15 = java.util.Locale.UK;
        java.lang.String str16 = locale13.getDisplayLanguage(locale15);
        boolean boolean17 = locale15.hasExtensions();
        java.lang.String str18 = locale8.getDisplayCountry(locale15);
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale19.getVariant();
        java.lang.String str21 = locale19.getScript();
        java.lang.String str22 = locale8.getDisplayCountry(locale19);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "kor");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.util.Random random6 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        int int9 = random6.nextInt(10);
        java.util.stream.DoubleStream doubleStream10 = random6.doubles();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale4, random6);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale0, random6);
        float float14 = random6.nextFloat();
        java.util.stream.IntStream intStream15 = random6.ints();
        java.util.stream.DoubleStream doubleStream17 = random6.doubles(1L);
        java.util.stream.DoubleStream doubleStream20 = random6.doubles((-2.8925344103631203d), (double) 0.73096776f);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str2, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.44047195f + "'", float14 == 0.44047195f);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertNotNull(doubleStream20);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.util.Random random0 = new java.util.Random();
        random0.setSeed((long) 10);
        double double3 = random0.nextGaussian();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        double double5 = random0.nextGaussian();
        int int6 = random0.nextInt();
        java.util.stream.IntStream intStream9 = random0.ints((-1155869325), (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8746788966462123d + "'", double3 == 0.8746788966462123d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.9193443348656242d) + "'", double5 == (-0.9193443348656242d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 254270492 + "'", int6 == 254270492);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fra", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, strMap11);
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getISO3Language();
        java.util.Locale.Builder builder17 = builder13.setLocale(locale15);
        java.util.Locale locale19 = new java.util.Locale("");
        java.lang.String str20 = locale19.getISO3Language();
        java.util.Locale locale22 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale locale25 = new java.util.Locale("");
        java.lang.String str26 = locale25.getISO3Language();
        java.util.Locale.Builder builder27 = builder23.setLocale(locale25);
        java.util.Locale locale29 = new java.util.Locale("");
        java.lang.String str30 = locale29.getISO3Language();
        java.util.Locale[] localeArray31 = new java.util.Locale[] { locale15, locale19, locale22, locale25, locale29 };
        java.util.ArrayList<java.util.Locale> localeList32 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList32, localeArray31);
        java.util.Locale locale34 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.util.Locale>) localeList32);
        java.util.Locale.FilteringMode filteringMode35 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList36 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList32, filteringMode35);
        java.util.Locale locale37 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList32);
        java.util.Locale locale39 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale39);
        java.util.Locale locale41 = locale39.stripExtensions();
        java.util.Locale locale43 = new java.util.Locale("");
        java.lang.String str44 = locale41.getDisplayCountry(locale43);
        java.util.Locale locale45 = java.util.Locale.KOREA;
        java.lang.String str46 = locale45.getVariant();
        java.util.Locale locale47 = java.util.Locale.KOREA;
        java.lang.String str48 = locale47.getISO3Language();
        java.util.Locale locale49 = locale47.stripExtensions();
        java.util.Locale[] localeArray50 = new java.util.Locale[] { locale41, locale45, locale49 };
        java.util.ArrayList<java.util.Locale> localeList51 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList51, localeArray50);
        java.util.Locale locale53 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList51);
        java.util.Locale.LanguageRange languageRange55 = new java.util.Locale.LanguageRange("fra");
        java.util.Locale.LanguageRange[] languageRangeArray56 = new java.util.Locale.LanguageRange[] { languageRange55 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList57 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57, languageRangeArray56);
        java.lang.String[] strArray64 = new java.lang.String[] { "kor", "fra", "kor", "French", "hi!" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        java.util.Locale.FilteringMode filteringMode67 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, (java.util.Collection<java.lang.String>) strList65, filteringMode67);
        java.util.List<java.lang.String> strList69 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList68);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale22.toString(), "hi!");
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(localeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(locale34);
        org.junit.Assert.assertTrue("'" + filteringMode35 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode35.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList36);
        org.junit.Assert.assertNull(locale37);
        org.junit.Assert.assertEquals(locale39.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "hi!");
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "kor" + "'", str48, "kor");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(localeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(locale53);
        org.junit.Assert.assertNotNull(languageRangeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + filteringMode67 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode67.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(strList69);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getDisplayScript();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = locale0.getISO3Country();
        java.lang.String str5 = locale0.getExtension('x');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "KOR" + "'", str3, "KOR");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        double double9 = random1.nextDouble();
        float float10 = random1.nextFloat();
        java.util.stream.IntStream intStream11 = random1.ints();
        random1.setSeed((long) 553627293);
        java.util.stream.DoubleStream doubleStream14 = random1.doubles();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44047195711667986d + "'", double9 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.24137181f + "'", float10 == 0.24137181f);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(doubleStream14);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getScript();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.lang.String str11 = locale10.getDisplayName();
        java.lang.String str12 = locale10.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale10);
        java.lang.String str14 = locale10.getVariant();
        java.util.Set<java.lang.Character> charSet15 = locale10.getExtensionKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese" + "'", str11, "Chinese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charSet15);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale5 = new java.util.Locale("zh_TW", "Chinese", "Chinese");
        java.lang.String str6 = locale0.getDisplayLanguage(locale5);
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.lang.String str8 = locale7.getDisplayName();
        java.lang.String str9 = locale5.getDisplayScript(locale7);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale5.toString(), "zh_tw_CHINESE_Chinese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinese" + "'", str6, "Chinese");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale locale8 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder5.setRegion("\u4e2d\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.util.Locale locale1 = new java.util.Locale("inglese");
        java.util.Locale locale2 = java.util.Locale.JAPAN;
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.lang.String str4 = locale3.getISO3Language();
        java.lang.String str5 = locale3.getDisplayName();
        java.lang.String str6 = locale3.getDisplayScript();
        java.lang.String str7 = locale2.getDisplayScript(locale3);
        java.util.Locale locale8 = locale3.stripExtensions();
        java.lang.String str9 = locale1.getDisplayName(locale3);
        org.junit.Assert.assertEquals(locale1.toString(), "inglese");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "kor" + "'", str4, "kor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Korean (South Korea)" + "'", str5, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "inglese" + "'", str9, "inglese");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) 100);
        boolean boolean7 = random1.nextBoolean();
        boolean boolean8 = random1.nextBoolean();
        long long9 = random1.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream11 = random1.longs((long) (-1156638823));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-6162003863595742414L) + "'", long9 == (-6162003863595742414L));
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream7 = random1.longs();
        float float8 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.44047195f + "'", float8 == 0.44047195f);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str2 = locale0.getExtension('x');
        java.util.Random random4 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        float float6 = random4.nextFloat();
        java.util.stream.IntStream intStream10 = random4.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream11 = random4.ints();
        double double12 = random4.nextDouble();
        float float13 = random4.nextFloat();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale0, random4);
        java.util.stream.LongStream longStream16 = random4.longs((long) (short) 10);
        long long17 = random4.nextLong();
        float float18 = random4.nextFloat();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.72810113f + "'", float6 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.44047195711667986d + "'", double12 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.24137181f + "'", float13 == 0.24137181f);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-2085682583702141179L) + "'", long17 == (-2085682583702141179L));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5833982f + "'", float18 == 0.5833982f);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zh-CN");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap4);
        java.util.Locale locale9 = new java.util.Locale("coreano (Corea del Sud)", "Cina", "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags(languageRangeList5, (java.util.Collection<java.lang.String>) strSet10);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        java.util.Locale locale3 = new java.util.Locale("de_DE", "French", "it_IT");
        java.lang.String str4 = locale3.getScript();
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale8.getISO3Language();
        java.util.Locale.Builder builder10 = builder6.setLocale(locale8);
        java.lang.String str11 = locale8.getScript();
        java.lang.String str12 = locale8.getVariant();
        java.util.Set<java.lang.String> strSet13 = locale8.getUnicodeLocaleKeys();
        java.lang.String str14 = locale5.getDisplayVariant(locale8);
        java.lang.String str15 = locale3.getDisplayScript(locale5);
        org.junit.Assert.assertEquals(locale3.toString(), "de_de_FRENCH_it_IT");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale locale7 = builder4.build();
        java.util.Locale.Builder builder10 = builder4.setExtension('u', "Chinese");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "kor");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.util.Random random1 = new java.util.Random(8220501950349663546L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem3 = faker2.lorem();
        org.junit.Assert.assertNotNull(lorem3);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("french");
        java.lang.String str2 = languageRange1.getRange();
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("Canada", 0.0d);
        java.util.Locale.LanguageRange languageRange8 = new java.util.Locale.LanguageRange("und", (double) 0L);
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("French", (double) (short) 1);
        java.util.Locale.LanguageRange languageRange13 = new java.util.Locale.LanguageRange("fra-x-lvariant-kor");
        java.lang.String str14 = languageRange13.getRange();
        java.util.Locale.LanguageRange languageRange17 = new java.util.Locale.LanguageRange("French", (double) (short) 1);
        java.util.Locale.LanguageRange languageRange19 = new java.util.Locale.LanguageRange("french");
        java.lang.String str20 = languageRange19.getRange();
        java.util.Locale.LanguageRange languageRange22 = new java.util.Locale.LanguageRange("FRENCH");
        java.util.Locale.LanguageRange languageRange25 = new java.util.Locale.LanguageRange("German", (double) (byte) 1);
        java.util.Locale.LanguageRange languageRange27 = new java.util.Locale.LanguageRange("french");
        java.lang.String str28 = languageRange27.getRange();
        java.util.Locale.LanguageRange languageRange30 = new java.util.Locale.LanguageRange("french");
        java.lang.String str31 = languageRange30.getRange();
        java.util.Locale.LanguageRange languageRange33 = new java.util.Locale.LanguageRange("Chinese");
        java.util.Locale.LanguageRange languageRange36 = new java.util.Locale.LanguageRange("fra-x-lvariant-kor", 0.8452060657049847d);
        java.util.Locale.LanguageRange languageRange38 = new java.util.Locale.LanguageRange("Cina");
        java.util.Locale.LanguageRange languageRange40 = new java.util.Locale.LanguageRange("it");
        java.util.Locale.LanguageRange languageRange42 = new java.util.Locale.LanguageRange("fra");
        java.util.Locale.LanguageRange languageRange44 = new java.util.Locale.LanguageRange("it");
        java.util.Locale.LanguageRange languageRange47 = new java.util.Locale.LanguageRange("fra-x-lvariant-kor", 0.8452060657049847d);
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange5, languageRange8, languageRange11, languageRange13, languageRange17, languageRange19, languageRange22, languageRange25, languageRange27, languageRange30, languageRange33, languageRange36, languageRange38, languageRange40, languageRange42, languageRange44, languageRange47 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap51 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList52 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, strMap51);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap53 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList54 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList52, strMap53);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "french" + "'", str2, "french");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fra-x-lvariant-kor" + "'", str14, "fra-x-lvariant-kor");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "french" + "'", str20, "french");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "french" + "'", str28, "french");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "french" + "'", str31, "french");
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(languageRangeList52);
        org.junit.Assert.assertNotNull(languageRangeList54);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.util.Random random1 = new java.util.Random((long) (-1167796541));
        java.util.stream.IntStream intStream2 = random1.ints();
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale2 = new java.util.Locale("fra");
        java.util.Locale locale5 = new java.util.Locale("und", "zh");
        java.lang.String str6 = locale5.getScript();
        java.lang.String str7 = locale2.getDisplayName(locale5);
        java.lang.String str8 = locale0.getDisplayCountry(locale2);
        java.lang.String str9 = locale2.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale2.toString(), "fra");
        org.junit.Assert.assertEquals(locale5.toString(), "und_ZH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fra" + "'", str7, "fra");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Taiwan" + "'", str8, "Taiwan");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.util.Locale locale3 = new java.util.Locale("German", "fra-x-lvariant-kor_HI!", "de_DE");
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "german_FRA-X-LVARIANT-KOR_HI!_de_DE");
        org.junit.Assert.assertNotNull(charSet4);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.util.Random random1 = new java.util.Random((long) '#');
        java.util.stream.IntStream intStream3 = random1.ints((long) 100);
        double double4 = random1.nextGaussian();
        java.util.stream.LongStream longStream5 = random1.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = random1.doubles((long) (short) -1, (double) 1890976351, (double) 5840930912313687631L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7709984181344616d + "'", double4 == 1.7709984181344616d);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh_TW" + "'", str1, "zh_TW");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) 32);
        java.util.stream.IntStream intStream13 = random1.ints((int) '4', 100);
        java.util.stream.LongStream longStream15 = random1.longs((long) 28);
        java.util.stream.IntStream intStream19 = random1.ints((long) (short) 1, (-1167796541), 13);
        random1.setSeed(100L);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(intStream19);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("de,DE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=de,de");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.util.Locale locale1 = new java.util.Locale("chinese_kor_CANADA");
        org.junit.Assert.assertEquals(locale1.toString(), "chinese_kor_canada");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        java.util.Random random1 = new java.util.Random((long) (-1434703326));
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("FRA-X-LVARIANT-KOR_HI!", 0.49641270101483514d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fra-x-lvariant-kor_hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.util.Locale locale3 = new java.util.Locale("french (france)_CANADA", "chn", "french_FRENCH");
        org.junit.Assert.assertEquals(locale3.toString(), "french (france)_canada_CHN_french_FRENCH");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("und-France", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.util.Locale locale1 = new java.util.Locale("cinese (Taiwan)");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder2.setLocale(locale4);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getISO3Language();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale9);
        java.lang.String str12 = locale4.getDisplayCountry(locale9);
        java.lang.String str13 = locale4.getLanguage();
        java.util.Locale locale14 = java.util.Locale.US;
        java.lang.String str15 = locale14.getISO3Language();
        java.util.Locale locale17 = new java.util.Locale("");
        java.lang.String str18 = locale17.getISO3Language();
        java.lang.String str19 = locale14.getDisplayVariant(locale17);
        java.lang.String str20 = locale4.getDisplayName(locale17);
        java.lang.String str22 = locale17.getExtension('u');
        java.lang.String str23 = locale17.getISO3Country();
        java.lang.String str24 = locale17.getCountry();
        java.lang.String str25 = locale1.getDisplayName(locale17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = locale17.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "cinese (taiwan)");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "eng" + "'", str15, "eng");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "cinese (taiwan)" + "'", str25, "cinese (taiwan)");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.toLanguageTag();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0);
        java.util.Random random7 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        int int10 = random7.nextInt(10);
        java.util.stream.DoubleStream doubleStream11 = random7.doubles();
        double double12 = random7.nextGaussian();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale0, random7);
        java.lang.String str14 = locale0.getVariant();
        java.lang.String str15 = locale0.getScript();
        java.lang.String str16 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.35703205834598994d) + "'", double12 == (-0.35703205834598994d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh_CN" + "'", str16, "zh_CN");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.util.Locale locale1 = new java.util.Locale("it");
        org.junit.Assert.assertEquals(locale1.toString(), "it");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        double double9 = random1.nextDouble();
        java.util.stream.IntStream intStream11 = random1.ints((long) (byte) 100);
        java.util.stream.IntStream intStream15 = random1.ints((long) '4', (int) '#', (int) 'x');
        boolean boolean16 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream20 = random1.doubles((long) 15, (-1.2072549328028286d), 0.7220096548596434d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44047195711667986d + "'", double9 == 0.44047195711667986d);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleStream20);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.util.Random random1 = new java.util.Random((long) 0);
        boolean boolean2 = random1.nextBoolean();
        double double3 = random1.nextDouble();
        java.util.stream.LongStream longStream5 = random1.longs((long) (short) 100);
        int int7 = random1.nextInt((int) (byte) 1);
        java.util.Random random9 = new java.util.Random(10L);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random9.nextBytes(byteArray15);
        random9.setSeed((long) 31);
        java.util.Random random20 = new java.util.Random(8125273516308965922L);
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale22 = locale21.stripExtensions();
        java.util.Random random24 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random24);
        java.util.stream.DoubleStream doubleStream27 = random24.doubles((long) (byte) 1);
        long long28 = random24.nextLong();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(locale22, random24);
        java.util.stream.LongStream longStream30 = random24.longs();
        java.util.Random random32 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(random32);
        int int35 = random32.nextInt(10);
        java.util.Random random37 = new java.util.Random(10L);
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random37.nextBytes(byteArray43);
        random32.nextBytes(byteArray43);
        random24.nextBytes(byteArray43);
        random20.nextBytes(byteArray43);
        random9.nextBytes(byteArray43);
        random1.nextBytes(byteArray43);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8314409887870612d + "'", double3 == 0.8314409887870612d);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-46, 122, -3, -70, -8]");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-5015647950085110473L) + "'", long28 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 7 + "'", int35 == 7);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[-10, -55, 45, -93, 58]");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguage("it");
        java.util.Locale.Builder builder4 = builder2.setLanguage("jpn");
        java.util.Locale.Builder builder5 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setRegion("zh_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: zh_CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Locale locale2 = new java.util.Locale("");
        java.util.Locale locale3 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Set<java.lang.Character> charSet5 = locale3.getExtensionKeys();
        java.lang.String str6 = locale0.getDisplayVariant(locale3);
        boolean boolean7 = locale3.hasExtensions();
        java.util.Locale locale9 = new java.util.Locale("\uc911\uad6d");
        java.lang.String str10 = locale3.getDisplayScript(locale9);
        java.util.Locale locale12 = new java.util.Locale("cinese (Taiwan)");
        java.lang.String str13 = locale3.getDisplayScript(locale12);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals(locale9.toString(), "\uc911\uad6d");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale12.toString(), "cinese (taiwan)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale2.getISO3Language();
        java.lang.String str4 = locale2.getDisplayName();
        java.lang.String str5 = locale2.getDisplayScript();
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Random random8 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        int int11 = random8.nextInt(10);
        java.util.stream.DoubleStream doubleStream12 = random8.doubles();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale6, random8);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale2, random8);
        java.lang.String str16 = locale0.getDisplayLanguage(locale2);
        java.lang.String str17 = locale2.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese" + "'", str1, "Chinese");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kor" + "'", str3, "kor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Korean (South Korea)" + "'", str4, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str16, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Finance finance8 = faker2.finance();
        com.github.javafaker.Options options9 = faker2.options();
        com.github.javafaker.Address address10 = faker2.address();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(address10);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.util.Locale locale2 = new java.util.Locale("french (french) (CHINA,South Korea)", "\uc911\uad6d");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\uc911\uad6d");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("kor");
        com.github.javafaker.Book book5 = faker2.book();
        java.lang.String str7 = faker2.numerify("fra");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "kor" + "'", str4, "kor");
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fra" + "'", str7, "fra");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Locale locale7 = new java.util.Locale("fra", "kor", "France");
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale0.getDisplayScript(locale7);
        java.lang.String str10 = locale7.toLanguageTag();
        java.lang.String str11 = locale7.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals(locale7.toString(), "fra_KOR_France");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fra-France" + "'", str10, "fra-France");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fra" + "'", str11, "fra");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.util.Locale locale3 = new java.util.Locale("TWN", "French (France)", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getUnicodeLocaleType("\u671d\u9c9c\u6587\u97e9\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ??? (??)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "twn_FRENCH (FRANCE)");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.util.Random random1 = new java.util.Random((long) (byte) 100);
        java.util.stream.LongStream longStream5 = random1.longs((long) '#', 0L, (long) (byte) 10);
        int int7 = random1.nextInt(1036684082);
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((double) 100.0f, (double) 1066038166);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 513819833 + "'", int7 == 513819833);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("FRA");
        java.util.Locale.Builder builder10 = builder6.setRegion("");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.setLanguageTag("chinese (china) (FRENCH,french (FRENCH))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: chinese (china) (FRENCH,french (FRENCH)) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayLanguage();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        boolean boolean4 = locale0.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Random random9 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        java.util.stream.DoubleStream doubleStream12 = random9.doubles((long) (byte) 1);
        long long13 = random9.nextLong();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale7, random9);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale5, random9);
        java.lang.String str17 = locale5.getISO3Country();
        java.util.Set<java.lang.Character> charSet18 = locale5.getExtensionKeys();
        java.lang.String str19 = locale0.getDisplayName(locale5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-5015647950085110473L) + "'", long13 == (-5015647950085110473L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "TWN" + "'", str17, "TWN");
        org.junit.Assert.assertNotNull(charSet18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str19, "\u6cd5\u6587\u52a0\u62ff\u5927)");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.util.Random random1 = new java.util.Random((long) 10);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream7 = random1.longs((long) (-1789290896), (-6162003863595742414L), (long) 1891812663);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        java.util.stream.IntStream intStream8 = random1.ints((-1789290896), (int) (byte) 10);
        double double9 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.2235660632835625d + "'", double9 == 1.2235660632835625d);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.util.Locale locale1 = new java.util.Locale("CHINESE");
        java.lang.String str2 = locale1.getVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "chinese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("FRA");
        java.util.Locale.Builder builder10 = builder6.setRegion("");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setScript("china");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: china [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str2 = locale0.getExtension('x');
        java.util.Locale locale5 = new java.util.Locale("chinese_KOR", "Canada");
        java.util.Locale locale8 = new java.util.Locale("hi!", "zh-CN");
        java.lang.String str9 = locale5.getDisplayName(locale8);
        java.util.Locale locale10 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale10);
        java.lang.String str12 = locale10.getDisplayCountry();
        java.lang.String str13 = locale10.getDisplayVariant();
        java.lang.String str14 = locale10.toLanguageTag();
        java.lang.String str15 = locale10.getISO3Country();
        java.lang.String str16 = locale8.getDisplayVariant(locale10);
        java.lang.String str17 = locale0.getDisplayCountry(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = locale0.getUnicodeLocaleType("zh-TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: zh-TW");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals(locale5.toString(), "chinese_kor_CANADA");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!_ZH-CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chinese_kor (CANADA)" + "'", str9, "chinese_kor (CANADA)");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "China" + "'", str12, "China");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CHN" + "'", str15, "CHN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str17, "\u53f0\u6e7e\u5730\u533a");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayLanguage();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("coreano (Corea del Sud)");
        java.lang.String str6 = locale5.toLanguageTag();
        java.lang.String str7 = locale0.getDisplayCountry(locale5);
        java.util.Locale locale11 = new java.util.Locale("fra-x-lvariant-kor", "fra", "kor");
        java.lang.String str12 = locale0.getDisplayName(locale11);
        java.lang.Object obj13 = null;
        boolean boolean14 = locale11.equals(obj13);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "und" + "'", str6, "und");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "France" + "'", str7, "France");
        org.junit.Assert.assertEquals(locale11.toString(), "fra-x-lvariant-kor_FRA_kor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "French (France)" + "'", str12, "French (France)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("chinese", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("French (Canada)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.LongStream longStream5 = random1.longs();
        boolean boolean6 = random1.nextBoolean();
        int int8 = random1.nextInt(1036684082);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream11 = random1.doubles(0.9562673247751239d, 0.26894263088050496d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 393447903 + "'", int8 == 393447903);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.Random random6 = new java.util.Random(10L);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random6.nextBytes(byteArray12);
        random1.nextBytes(byteArray12);
        java.util.stream.LongStream longStream17 = random1.longs(0L, (long) 13);
        java.util.stream.DoubleStream doubleStream19 = random1.doubles(0L);
        java.util.stream.LongStream longStream21 = random1.longs(0L);
        double double22 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream24 = random1.doubles((long) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[55, -59, -62, 112, 34]");
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertNotNull(longStream21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.4996531610587702d) + "'", double22 == (-1.4996531610587702d));
        org.junit.Assert.assertNotNull(doubleStream24);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Finance finance8 = faker2.finance();
        java.lang.String str10 = faker2.bothify("Korean (South Korea)");
        com.github.javafaker.Options options11 = faker2.options();
        java.lang.String str13 = faker2.letterify("Chinook jargon");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Korean (South Korea)" + "'", str10, "Korean (South Korea)");
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinook jargon" + "'", str13, "Chinook jargon");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        double double5 = random1.nextGaussian();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Random random9 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        java.util.stream.DoubleStream doubleStream12 = random9.doubles((long) (byte) 1);
        long long13 = random9.nextLong();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale7, random9);
        java.util.stream.LongStream longStream15 = random9.longs();
        java.util.Random random17 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        int int20 = random17.nextInt(10);
        java.util.Random random22 = new java.util.Random(10L);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random22.nextBytes(byteArray28);
        random17.nextBytes(byteArray28);
        random9.nextBytes(byteArray28);
        random1.nextBytes(byteArray28);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.35703205834598994d) + "'", double5 == (-0.35703205834598994d));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-5015647950085110473L) + "'", long13 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[5, 7, 55, -108, 112]");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        java.lang.String str9 = faker2.letterify("KOR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "KOR" + "'", str9, "KOR");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.util.Random random1 = new java.util.Random((long) '#');
        java.util.stream.IntStream intStream3 = random1.ints((long) 100);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(0.0d, 0.5789646593242622d);
        java.util.stream.LongStream longStream9 = random1.longs((long) 553627293, (long) 1708368258);
        random1.setSeed((long) 1066038166);
        long long12 = random1.nextLong();
        java.util.stream.DoubleStream doubleStream14 = random1.doubles((long) 28);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-464978171729231043L) + "'", long12 == (-464978171729231043L));
        org.junit.Assert.assertNotNull(doubleStream14);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        java.lang.String str7 = faker1.numerify("French");
        com.github.javafaker.Company company8 = faker1.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French" + "'", str7, "French");
        org.junit.Assert.assertNotNull(company8);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Random random3 = new java.util.Random();
        random3.setSeed((long) 10);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random3);
        random3.setSeed((long) 'x');
        java.util.stream.LongStream longStream12 = random3.longs((long) 15, (long) 6, (long) 1430131985);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream15 = random3.ints((int) (byte) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French (France)" + "'", str2, "French (France)");
        org.junit.Assert.assertNotNull(longStream12);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Locale locale3 = java.util.Locale.ITALY;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
        java.lang.String str5 = locale2.getDisplayName(locale3);
        java.lang.String str6 = locale2.getDisplayScript();
        java.lang.String str7 = locale2.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coreano (Corea del Sud)" + "'", str5, "coreano (Corea del Sud)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u53f0\u6e7e\u5730\u533a", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Chinese", (double) 38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=38.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.util.Locale locale2 = new java.util.Locale("\u53f0\u7063", "FRENCH");
        org.junit.Assert.assertEquals(locale2.toString(), "\u53f0\u7063_FRENCH");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        java.util.Locale locale5 = new java.util.Locale("");
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.util.Set<java.lang.Character> charSet8 = locale6.getExtensionKeys();
        java.lang.String str9 = locale0.getDisplayLanguage(locale6);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale12.getISO3Language();
        java.util.Locale.Builder builder14 = builder10.setLocale(locale12);
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale locale17 = new java.util.Locale("");
        java.lang.String str18 = locale17.getISO3Language();
        java.util.Locale.Builder builder19 = builder15.setLocale(locale17);
        java.lang.String str20 = locale12.getDisplayCountry(locale17);
        java.util.Locale locale21 = locale12.stripExtensions();
        java.lang.String str22 = locale0.getDisplayScript(locale12);
        java.util.Random random24 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random24);
        java.util.stream.DoubleStream doubleStream27 = random24.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream29 = random24.doubles(1L);
        java.util.stream.DoubleStream doubleStream31 = random24.doubles((long) (short) 1);
        random24.setSeed((-6162003863595742414L));
        double double34 = random24.nextGaussian();
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(locale0, random24);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587" + "'", str9, "\u4e2d\u6587");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.7117016467772022d + "'", double34 == 0.7117016467772022d);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u4e2d\u6587", 0.8869349148715235d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.util.Locale locale3 = new java.util.Locale("kor", "CA", "CN");
        org.junit.Assert.assertEquals(locale3.toString(), "kor_CA_CN");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) (short) 0);
        java.util.stream.DoubleStream doubleStream11 = random1.doubles(100.0d, (double) 1708368258);
        java.util.stream.LongStream longStream13 = random1.longs((long) 1066038166);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        float float5 = random1.nextFloat();
        java.util.stream.LongStream longStream8 = random1.longs((-5123059410709186348L), (long) 32);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream11 = random1.ints(1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.44047195f + "'", float5 == 0.44047195f);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Address address4 = faker1.address();
        com.github.javafaker.Name name5 = faker1.name();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        com.github.javafaker.Lorem lorem7 = faker1.lorem();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Francia");
        java.util.Locale locale4 = new java.util.Locale("coreano (Corea del Sud)", "kor");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        boolean boolean6 = languageRange1.equals((java.lang.Object) strSet5);
        org.junit.Assert.assertEquals(locale4.toString(), "coreano (corea del sud)_KOR");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.util.Random random1 = new java.util.Random(10L);
        int int3 = random1.nextInt((int) (byte) 100);
        java.util.stream.LongStream longStream5 = random1.longs(0L);
        java.util.stream.LongStream longStream6 = random1.longs();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("Korean");
        java.util.Locale.Builder builder8 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.setLanguage("Korean (South Korea)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: Korean (South Korea) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setVariant("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Locale locale2 = new java.util.Locale("");
        java.util.Locale locale3 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Set<java.lang.Character> charSet5 = locale3.getExtensionKeys();
        java.lang.String str6 = locale0.getDisplayVariant(locale3);
        boolean boolean7 = locale3.hasExtensions();
        java.lang.String str8 = locale3.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-TW" + "'", str8, "zh-TW");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        java.util.Locale locale1 = new java.util.Locale("french (FRENCH)");
        java.lang.String str2 = locale1.getDisplayScript();
        java.lang.String str3 = locale1.getISO3Country();
        java.lang.String str4 = locale1.getVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "french (french)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayLanguage();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Internet internet4 = faker3.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertNotNull(internet4);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        java.lang.String str7 = faker5.numerify("FRA");
        com.github.javafaker.Color color8 = faker5.color();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FRA" + "'", str7, "FRA");
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        java.util.Random random0 = new java.util.Random();
        int int1 = random0.nextInt();
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1314218525 + "'", int1 == 1314218525);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Random random3 = new java.util.Random();
        random3.setSeed((long) 10);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random3);
        random3.setSeed((long) 'x');
        java.util.stream.IntStream intStream9 = random3.ints();
        float float10 = random3.nextFloat();
        java.util.Random random12 = new java.util.Random((long) 'u');
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        int int15 = random12.nextInt((int) '4');
        java.util.stream.IntStream intStream16 = random12.ints();
        java.util.Random random18 = new java.util.Random((long) (byte) 100);
        java.util.Random random20 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream21 = random20.ints();
        java.util.stream.LongStream longStream22 = random20.longs();
        java.util.Random random24 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random24);
        int int27 = random24.nextInt(10);
        java.util.Random random29 = new java.util.Random(10L);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random29.nextBytes(byteArray35);
        random24.nextBytes(byteArray35);
        random20.nextBytes(byteArray35);
        random18.nextBytes(byteArray35);
        random12.nextBytes(byteArray35);
        java.util.Locale locale41 = java.util.Locale.GERMANY;
        java.util.Random random43 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(random43);
        float float45 = random43.nextFloat();
        java.util.stream.IntStream intStream49 = random43.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream51 = random43.ints((long) 'x');
        com.github.javafaker.Faker faker52 = new com.github.javafaker.Faker(locale41, random43);
        boolean boolean53 = random43.nextBoolean();
        java.util.Locale locale54 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale55 = locale54.stripExtensions();
        java.util.Random random57 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker58 = new com.github.javafaker.Faker(random57);
        java.util.stream.DoubleStream doubleStream60 = random57.doubles((long) (byte) 1);
        long long61 = random57.nextLong();
        com.github.javafaker.Faker faker62 = new com.github.javafaker.Faker(locale55, random57);
        com.github.javafaker.Faker faker63 = new com.github.javafaker.Faker(random57);
        java.util.stream.LongStream longStream65 = random57.longs(0L);
        java.util.Random random67 = new java.util.Random(10L);
        java.util.stream.DoubleStream doubleStream70 = random67.doubles((double) 0.24137181f, (double) (short) 1);
        long long71 = random67.nextLong();
        java.util.Random random73 = new java.util.Random(10L);
        java.util.stream.LongStream longStream75 = random73.longs((long) 0);
        java.util.Random random77 = new java.util.Random(10L);
        byte[] byteArray83 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random77.nextBytes(byteArray83);
        random73.nextBytes(byteArray83);
        random67.nextBytes(byteArray83);
        random57.nextBytes(byteArray83);
        random43.nextBytes(byteArray83);
        random12.nextBytes(byteArray83);
        random3.nextBytes(byteArray83);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream93 = random3.longs(8220501950349663546L, (long) 1890976351);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French (France)" + "'", str2, "French (France)");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.72308457f + "'", float10 == 0.72308457f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31 + "'", int15 == 31);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNotNull(longStream22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[85, 109, -3, -78, -25]");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.72810113f + "'", float45 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream49);
        org.junit.Assert.assertNotNull(intStream51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-5015647950085110473L) + "'", long61 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream65);
        org.junit.Assert.assertNotNull(doubleStream70);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-4972683369271453960L) + "'", long71 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(longStream75);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[53, 80, -101, -127, -57]");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.util.Locale locale3 = new java.util.Locale("FRENCH (FRENCH)", "China", "South Korea");
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        java.lang.String str6 = locale4.getDisplayCountry();
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.lang.String str9 = locale4.getDisplayCountry(locale8);
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.lang.String str11 = locale10.getISO3Language();
        java.lang.String str12 = locale10.getDisplayName();
        java.lang.String str13 = locale10.getDisplayScript();
        java.util.Random random15 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream17 = random15.ints(1L);
        long long18 = random15.nextLong();
        int int20 = random15.nextInt((int) (byte) 1);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale10, random15);
        java.lang.String str22 = locale10.getLanguage();
        java.util.Set<java.lang.String> strSet23 = locale10.getUnicodeLocaleKeys();
        java.lang.String str24 = locale10.toLanguageTag();
        java.lang.String str25 = locale8.getDisplayLanguage(locale10);
        java.lang.String str26 = locale3.getDisplayName(locale10);
        java.util.Set<java.lang.Character> charSet27 = locale10.getExtensionKeys();
        java.lang.String str28 = locale10.getDisplayCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "french (french)_CHINA_South Korea");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "kor" + "'", str11, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "coreano (Corea del Sud)" + "'", str12, "coreano (Corea del Sud)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-5015647950085110473L) + "'", long18 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ko" + "'", str22, "ko");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ko-KR" + "'", str24, "ko-KR");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "french (french) (CHINA,South Korea)" + "'", str26, "french (french) (CHINA,South Korea)");
        org.junit.Assert.assertNotNull(charSet27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Corea del Sud" + "'", str28, "Corea del Sud");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category0, locale6);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale6);
        com.github.javafaker.DateAndTime dateAndTime9 = faker8.date();
        com.github.javafaker.Name name10 = faker8.name();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale3.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(name10);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Finance finance5 = faker0.finance();
        com.github.javafaker.Lorem lorem6 = faker0.lorem();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = new java.util.Locale("");
        java.lang.String str11 = locale10.getISO3Language();
        java.util.Locale locale12 = java.util.Locale.UK;
        java.lang.String str13 = locale10.getDisplayLanguage(locale12);
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.lang.String str16 = locale15.getDisplayScript();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale15);
        java.util.Locale.setDefault(category0, locale15);
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale19.getISO3Language();
        java.util.Locale locale24 = new java.util.Locale("kor", "", "");
        java.lang.String str25 = locale19.getDisplayName(locale24);
        java.util.Locale.setDefault(category0, locale19);
        java.util.Locale locale27 = java.util.Locale.KOREA;
        java.lang.String str28 = locale27.getDisplayScript();
        java.lang.String str29 = locale27.getDisplayLanguage();
        java.util.Locale locale30 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleKeys();
        java.lang.String str32 = locale30.getDisplayCountry();
        java.util.Locale locale34 = new java.util.Locale("hi!");
        java.lang.String str35 = locale30.getDisplayCountry(locale34);
        java.lang.String str36 = locale27.getDisplayScript(locale34);
        boolean boolean37 = locale34.hasExtensions();
        java.util.Locale.setDefault(category0, locale34);
        java.util.Locale locale39 = java.util.Locale.getDefault(category0);
        java.lang.String str40 = locale39.getDisplayScript();
        java.util.Set<java.lang.String> strSet41 = locale39.getUnicodeLocaleKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale3.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "kor" + "'", str20, "kor");
        org.junit.Assert.assertEquals(locale24.toString(), "kor");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Korean (South Korea)" + "'", str25, "Korean (South Korea)");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str29, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals(locale34.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(strSet41);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale locale7 = java.util.Locale.GERMANY;
        java.util.Random random9 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        float float11 = random9.nextFloat();
        java.util.stream.IntStream intStream15 = random9.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream17 = random9.ints((long) 'x');
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale7, random9);
        java.util.Locale.Builder builder19 = builder4.setLocale(locale7);
        java.util.Locale.Builder builder21 = builder19.addUnicodeLocaleAttribute("francese");
        java.util.Locale.Builder builder24 = builder21.setExtension('a', "KR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder26 = builder24.setVariant("\u4e2d\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.72810113f + "'", float11 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.util.Random random1 = new java.util.Random((-5013995466868426345L));
        double double2 = random1.nextDouble();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4361824860708281d + "'", double2 == 0.4361824860708281d);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles(100L);
        boolean boolean5 = random1.nextBoolean();
        float float6 = random1.nextFloat();
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.44563425f + "'", float6 == 0.44563425f);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\uc911\uad6d", 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        java.util.Locale locale3 = new java.util.Locale("french", "ita", "");
        java.util.Locale locale6 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale6);
        java.lang.String str8 = locale6.getCountry();
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.getDefault(category9);
        java.lang.String str11 = locale6.getDisplayLanguage(locale10);
        java.util.Locale.Category category12 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getISO3Language();
        java.util.Locale.Builder builder17 = builder13.setLocale(locale15);
        java.lang.String str18 = locale15.getScript();
        java.util.Locale.setDefault(category12, locale15);
        java.util.Locale locale20 = java.util.Locale.getDefault(category12);
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.lang.String str22 = locale10.getDisplayLanguage(locale20);
        java.lang.String str23 = locale3.getDisplayLanguage(locale10);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet25 = faker24.internet();
        com.github.javafaker.Code code26 = faker24.code();
        com.github.javafaker.Address address27 = faker24.address();
        com.github.javafaker.Options options28 = faker24.options();
        boolean boolean29 = locale10.equals((java.lang.Object) options28);
        org.junit.Assert.assertEquals(locale3.toString(), "french_ITA");
        org.junit.Assert.assertEquals(locale6.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FRENCH" + "'", str8, "FRENCH");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.FORMAT + "'", category9.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "french" + "'", str11, "french");
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.FORMAT + "'", category12.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "french" + "'", str22, "french");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "french" + "'", str23, "french");
        org.junit.Assert.assertNotNull(internet25);
        org.junit.Assert.assertNotNull(code26);
        org.junit.Assert.assertNotNull(address27);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = new java.util.Locale("France");
        java.lang.String str3 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale6 = new java.util.Locale("FRA-X-LVARIANT-KOR", "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale0.getDisplayLanguage(locale6);
        java.lang.String str9 = locale0.getDisplayLanguage();
        java.lang.String str10 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Canada" + "'", str3, "Canada");
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))" + "'", str7, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "English" + "'", str8, "English");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "English" + "'", str9, "English");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 0.24137181f, (double) (short) 1);
        long long5 = random1.nextLong();
        java.util.Random random7 = new java.util.Random(10L);
        java.util.stream.LongStream longStream9 = random7.longs((long) 0);
        java.util.Random random11 = new java.util.Random(10L);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random11.nextBytes(byteArray17);
        random7.nextBytes(byteArray17);
        random1.nextBytes(byteArray17);
        long long21 = random1.nextLong();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-4972683369271453960L) + "'", long5 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[58, 93, -1, 65, -76]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1092083446069765248L + "'", long21 == 1092083446069765248L);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Random random4 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        java.util.stream.DoubleStream doubleStream7 = random4.doubles((long) (byte) 1);
        long long8 = random4.nextLong();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale2, random4);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random4);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0);
        java.lang.String str14 = faker12.letterify("french (france) (CANADA)");
        com.github.javafaker.Book book15 = faker12.book();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "french (france) (CANADA)" + "'", str14, "french (france) (CANADA)");
        org.junit.Assert.assertNotNull(book15);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Company company7 = faker6.company();
        com.github.javafaker.DateAndTime dateAndTime8 = faker6.date();
        java.lang.String str10 = faker6.numerify("ZH-CN");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ZH-CN" + "'", str10, "ZH-CN");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("Korean");
        java.util.Locale.Builder builder11 = builder5.setExtension('u', "chn");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setScript("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.getDisplayName();
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.lang.String str5 = locale1.getCountry();
        java.lang.String str6 = locale1.getCountry();
        java.lang.String str7 = locale1.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Korean (South Korea)" + "'", str3, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "KR" + "'", str5, "KR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KR" + "'", str6, "KR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "South Korea" + "'", str7, "South Korea");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        java.util.Set<java.lang.Character> charSet4 = locale2.getExtensionKeys();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Locale.setDefault(locale2);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Finance finance2 = faker1.finance();
        java.lang.String str4 = faker1.numerify("Italia");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italia" + "'", str4, "Italia");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguage("GB");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setRegion("CANADA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: CANADA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.lang.String[] strArray6 = new java.lang.String[] { "und" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = java.util.Locale.lookupTag(languageRangeList4, (java.util.Collection<java.lang.String>) strList7);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.parse("fra");
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, strMap15);
        java.util.Locale locale17 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, strMap22);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, strMap27);
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale locale31 = new java.util.Locale("");
        java.lang.String str32 = locale31.getISO3Language();
        java.util.Locale.Builder builder33 = builder29.setLocale(locale31);
        java.util.Locale locale35 = new java.util.Locale("");
        java.lang.String str36 = locale35.getISO3Language();
        java.util.Locale locale38 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder39 = new java.util.Locale.Builder();
        java.util.Locale locale41 = new java.util.Locale("");
        java.lang.String str42 = locale41.getISO3Language();
        java.util.Locale.Builder builder43 = builder39.setLocale(locale41);
        java.util.Locale locale45 = new java.util.Locale("");
        java.lang.String str46 = locale45.getISO3Language();
        java.util.Locale[] localeArray47 = new java.util.Locale[] { locale31, locale35, locale38, locale41, locale45 };
        java.util.ArrayList<java.util.Locale> localeList48 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList48, localeArray47);
        java.util.Locale locale50 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.util.Locale>) localeList48);
        java.util.Locale.FilteringMode filteringMode51 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList52 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList48, filteringMode51);
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strSet18, filteringMode51);
        java.lang.String str54 = java.util.Locale.lookupTag(languageRangeList11, (java.util.Collection<java.lang.String>) strList53);
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap58 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, strMap58);
        java.util.Locale.Builder builder60 = new java.util.Locale.Builder();
        java.util.Locale locale62 = new java.util.Locale("");
        java.lang.String str63 = locale62.getISO3Language();
        java.util.Locale.Builder builder64 = builder60.setLocale(locale62);
        java.util.Locale locale66 = new java.util.Locale("");
        java.lang.String str67 = locale66.getISO3Language();
        java.util.Locale locale69 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder70 = new java.util.Locale.Builder();
        java.util.Locale locale72 = new java.util.Locale("");
        java.lang.String str73 = locale72.getISO3Language();
        java.util.Locale.Builder builder74 = builder70.setLocale(locale72);
        java.util.Locale locale76 = new java.util.Locale("");
        java.lang.String str77 = locale76.getISO3Language();
        java.util.Locale[] localeArray78 = new java.util.Locale[] { locale62, locale66, locale69, locale72, locale76 };
        java.util.ArrayList<java.util.Locale> localeList79 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList79, localeArray78);
        java.util.Locale locale81 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.util.Locale>) localeList79);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList83 = java.util.Locale.LanguageRange.parse("Chinese");
        java.util.Locale locale86 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet87 = locale86.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet88 = locale86.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode89 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList90 = java.util.Locale.filterTags(languageRangeList83, (java.util.Collection<java.lang.String>) strSet88, filteringMode89);
        java.util.List<java.util.Locale> localeList91 = java.util.Locale.filter(languageRangeList11, (java.util.Collection<java.util.Locale>) localeList79, filteringMode89);
        java.util.Locale.FilteringMode filteringMode92 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList93 = java.util.Locale.filter(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList79, filteringMode92);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals(locale38.toString(), "hi!");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(localeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(locale50);
        org.junit.Assert.assertTrue("'" + filteringMode51 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode51.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList52);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(languageRangeList59);
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertEquals(locale66.toString(), "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals(locale69.toString(), "hi!");
        org.junit.Assert.assertEquals(locale72.toString(), "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertEquals(locale76.toString(), "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(localeArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(locale81);
        org.junit.Assert.assertNotNull(languageRangeList83);
        org.junit.Assert.assertEquals(locale86.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet87);
        org.junit.Assert.assertNotNull(strSet88);
        org.junit.Assert.assertTrue("'" + filteringMode89 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode89.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList90);
        org.junit.Assert.assertNotNull(localeList91);
        org.junit.Assert.assertTrue("'" + filteringMode92 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode92.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList93);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = new java.util.Locale("France");
        java.lang.String str3 = locale0.getDisplayCountry(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number5 = faker4.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Canada" + "'", str3, "Canada");
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Finance finance8 = faker2.finance();
        com.github.javafaker.Options options9 = faker2.options();
        java.lang.String str11 = faker2.letterify("\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
        com.github.javafaker.Name name12 = faker2.name();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)" + "'", str11, "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
        org.junit.Assert.assertNotNull(name12);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        java.util.Random random1 = new java.util.Random((long) 38);
        int int3 = random1.nextInt(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Random random4 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        java.util.stream.DoubleStream doubleStream7 = random4.doubles((long) (byte) 1);
        long long8 = random4.nextLong();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale2, random4);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random4);
        java.util.stream.LongStream longStream12 = random4.longs();
        java.util.stream.LongStream longStream15 = random4.longs((long) 38, (long) 553627293);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream15);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        java.util.Random random1 = new java.util.Random((long) '#');
        long long2 = random1.nextLong();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        int int5 = random1.nextInt(1708368258);
        java.util.stream.LongStream longStream6 = random1.longs();
        boolean boolean7 = random1.nextBoolean();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5013995466868426345L) + "'", long2 == (-5013995466868426345L));
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1066038166 + "'", int5 == 1066038166);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("fra");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("zho", "german (KO-KR,ko)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: zho [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.Random random6 = new java.util.Random(10L);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random6.nextBytes(byteArray12);
        random1.nextBytes(byteArray12);
        java.util.stream.LongStream longStream17 = random1.longs(0L, (long) 13);
        java.util.stream.DoubleStream doubleStream19 = random1.doubles(0L);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[55, -59, -62, 112, 34]");
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertNotNull(doubleStream19);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Business business8 = faker2.business();
        com.github.javafaker.Color color9 = faker2.color();
        java.lang.String str11 = faker2.bothify("Canada");
        java.lang.String str13 = faker2.bothify("French (France)");
        com.github.javafaker.Address address14 = faker2.address();
        com.github.javafaker.Company company15 = faker2.company();
        com.github.javafaker.Number number16 = faker2.number();
        com.github.javafaker.PhoneNumber phoneNumber17 = faker2.phoneNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Canada" + "'", str11, "Canada");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "French (France)" + "'", str13, "French (France)");
        org.junit.Assert.assertNotNull(address14);
        org.junit.Assert.assertNotNull(company15);
        org.junit.Assert.assertNotNull(number16);
        org.junit.Assert.assertNotNull(phoneNumber17);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("United Kingdom", (double) 1708368258);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.708368258E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        java.util.Locale locale1 = new java.util.Locale("zh_TW");
        org.junit.Assert.assertEquals(locale1.toString(), "zh_tw");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u6cd5\u6587\u52a0\u62ff\u5927)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?? (???)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        java.util.Locale locale2 = new java.util.Locale("coreano", "\u53f0\u7063");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u53f0\u7063");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.lang.String str5 = locale0.getDisplayVariant(locale3);
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale3.getDisplayName(locale6);
        boolean boolean8 = locale6.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eng" + "'", str1, "eng");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Color color6 = faker1.color();
        com.github.javafaker.Address address7 = faker1.address();
        com.github.javafaker.Company company8 = faker1.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(company8);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        java.util.Random random1 = new java.util.Random((long) 85);
        double double2 = random1.nextGaussian();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7457626867506316d + "'", double2 == 0.7457626867506316d);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getDisplayScript();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = locale0.getISO3Country();
        java.util.Locale locale5 = new java.util.Locale("FRENCH (FRENCH)");
        java.lang.String str6 = locale5.getVariant();
        java.lang.String str7 = locale0.getDisplayName(locale5);
        java.lang.String str8 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "KOR" + "'", str3, "KOR");
        org.junit.Assert.assertEquals(locale5.toString(), "french (french)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Korean (South Korea)" + "'", str7, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        java.util.Locale locale3 = new java.util.Locale("\u97d3\u6587 (FRENCH (FRENCH))", "GB", "cinese (Taiwan)");
        org.junit.Assert.assertEquals(locale3.toString(), "\u97d3\u6587 (french (french))_GB_cinese (Taiwan)");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale7 = new java.util.Locale("fr");
        java.util.Locale.Builder builder8 = builder5.setLocale(locale7);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        java.util.Locale locale2 = new java.util.Locale("cina", "francese");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "cina_FRANCESE");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder0.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale locale8 = builder0.build();
        java.util.Locale.Builder builder10 = builder0.setLanguage("eng");
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.lang.String str12 = locale11.getDisplayName();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.lang.String str14 = locale13.getISO3Language();
        java.lang.String str15 = locale13.getDisplayName();
        java.lang.String str16 = locale13.getDisplayScript();
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.util.Random random19 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        int int22 = random19.nextInt(10);
        java.util.stream.DoubleStream doubleStream23 = random19.doubles();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale17, random19);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale13, random19);
        java.lang.String str27 = locale11.getDisplayLanguage(locale13);
        java.lang.String str28 = locale11.getDisplayCountry();
        java.lang.String str29 = locale11.getISO3Language();
        java.lang.String str30 = locale11.getDisplayScript();
        java.lang.String str31 = locale11.toLanguageTag();
        java.util.Locale.Builder builder32 = builder0.setLocale(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder34 = builder0.setVariant("chn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: chn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "kor" + "'", str14, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u97d3\u6587\u5357\u97d3)" + "'", str15, "\u97d3\u6587\u5357\u97d3)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str27, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zho" + "'", str29, "zho");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh" + "'", str31, "zh");
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.util.Random random1 = new java.util.Random(10L);
        int int3 = random1.nextInt((int) (byte) 100);
        random1.setSeed((long) (-1789290896));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setLanguage("Canada");
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.lang.String str10 = locale9.getISO3Language();
        java.util.Locale locale11 = locale9.stripExtensions();
        java.lang.String str12 = locale9.getDisplayScript();
        java.util.Locale.Builder builder13 = builder8.setLocale(locale9);
        java.util.Locale locale14 = locale9.stripExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "kor" + "'", str10, "kor");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        random1.setSeed((long) (short) 10);
        int int11 = random1.nextInt(9);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.getDisplayName();
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.lang.String str5 = locale1.getCountry();
        java.lang.String str6 = locale1.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale1.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u97d3\u6587\u5357\u97d3)" + "'", str3, "\u97d3\u6587\u5357\u97d3)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "KR" + "'", str5, "KR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KR" + "'", str6, "KR");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        boolean boolean1 = locale0.hasExtensions();
        java.util.Random random3 = new java.util.Random((-5013995466868426345L));
        java.util.stream.DoubleStream doubleStream7 = random3.doubles((long) 1708368258, 1.1329921492850181d, (double) 'x');
        java.util.stream.LongStream longStream10 = random3.longs((long) (byte) 100, (long) 553627293);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random3);
        int int13 = random3.nextInt(3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream17 = random3.doubles((long) (byte) -1, (double) 1890976351, (double) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        java.util.Random random1 = new java.util.Random(10L);
        float float2 = random1.nextFloat();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Company company4 = faker3.company();
        com.github.javafaker.Finance finance5 = faker3.finance();
        com.github.javafaker.Color color6 = faker3.color();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.73043025f + "'", float2 == 0.73043025f);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setScript("");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getISO3Language();
        java.util.Locale.Builder builder13 = builder9.setLocale(locale11);
        java.util.Locale.Builder builder14 = builder6.setLocale(locale11);
        java.util.Locale.Builder builder16 = builder14.setLanguage("");
        java.util.Locale locale17 = builder14.build();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        float float5 = random1.nextFloat();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem7 = faker6.lorem();
        com.github.javafaker.Options options8 = faker6.options();
        com.github.javafaker.Book book9 = faker6.book();
        com.github.javafaker.Finance finance10 = faker6.finance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.44047195f + "'", float5 == 0.44047195f);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Locale locale7 = new java.util.Locale("fra", "kor", "France");
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale0.getDisplayScript(locale7);
        java.lang.String str10 = locale7.toLanguageTag();
        java.lang.String str11 = locale7.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals(locale7.toString(), "fra_KOR_France");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fra-France" + "'", str10, "fra-France");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fra (KOR,France)" + "'", str11, "fra (KOR,France)");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        java.lang.String str6 = faker0.numerify("chinese_kor (CANADA)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chinese_kor (CANADA)" + "'", str6, "chinese_kor (CANADA)");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.util.Locale locale2 = new java.util.Locale("\u4e2d\u6587", "canada");
        java.lang.String str3 = locale2.toLanguageTag();
        org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u6587_CANADA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("French", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale locale10 = new java.util.Locale("");
        java.lang.String str11 = locale10.getISO3Language();
        java.util.Locale.Builder builder12 = builder8.setLocale(locale10);
        java.util.Locale locale14 = new java.util.Locale("");
        java.lang.String str15 = locale14.getISO3Language();
        java.util.Locale locale17 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale locale20 = new java.util.Locale("");
        java.lang.String str21 = locale20.getISO3Language();
        java.util.Locale.Builder builder22 = builder18.setLocale(locale20);
        java.util.Locale locale24 = new java.util.Locale("");
        java.lang.String str25 = locale24.getISO3Language();
        java.util.Locale[] localeArray26 = new java.util.Locale[] { locale10, locale14, locale17, locale20, locale24 };
        java.util.ArrayList<java.util.Locale> localeList27 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList27, localeArray26);
        java.util.Locale locale29 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList27);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList32);
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap36);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap38 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList39 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap38);
        java.util.Locale locale40 = java.util.Locale.JAPAN;
        java.util.Locale locale41 = locale40.stripExtensions();
        java.util.Set<java.lang.String> strSet42 = locale40.getUnicodeLocaleKeys();
        java.lang.String str43 = java.util.Locale.lookupTag(languageRangeList39, (java.util.Collection<java.lang.String>) strSet42);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals(locale17.toString(), "hi!");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(localeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(locale29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(languageRangeList37);
        org.junit.Assert.assertNotNull(languageRangeList39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        java.util.Locale locale3 = new java.util.Locale("zh_TW", "Chinese", "Chinese");
        java.util.Locale locale5 = new java.util.Locale("");
        java.util.Locale.setDefault(locale5);
        java.lang.String str7 = locale3.getDisplayScript(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale5.getUnicodeLocaleType("fran\347ais");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: franc?ais");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "zh_tw_CHINESE_Chinese");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        java.util.Random random1 = new java.util.Random((long) 7);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        java.util.stream.IntStream intStream7 = random1.ints((long) '#', (int) (short) 1, (int) (byte) 10);
        java.util.stream.DoubleStream doubleStream8 = random1.doubles();
        java.util.Random random10 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream12 = random10.ints(1L);
        long long13 = random10.nextLong();
        java.util.Random random15 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        int int18 = random15.nextInt(10);
        java.util.Random random20 = new java.util.Random(10L);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random20.nextBytes(byteArray26);
        random15.nextBytes(byteArray26);
        random10.nextBytes(byteArray26);
        random1.nextBytes(byteArray26);
        double double31 = random1.nextDouble();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-5015647950085110473L) + "'", long13 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-103, 23, 15, -69, 24]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.7491696031336331d + "'", double31 == 0.7491696031336331d);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Random random2 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        int int5 = random2.nextInt(10);
        java.util.stream.DoubleStream doubleStream6 = random2.doubles();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random2);
        com.github.javafaker.Finance finance9 = faker8.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.util.Random random1 = new java.util.Random((long) '#');
        long long2 = random1.nextLong();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        int int5 = random1.nextInt(1708368258);
        int int6 = random1.nextInt();
        java.util.stream.LongStream longStream7 = random1.longs();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5013995466868426345L) + "'", long2 == (-5013995466868426345L));
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1066038166 + "'", int5 == 1066038166);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1890976351 + "'", int6 == 1890976351);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        float float5 = random1.nextFloat();
        java.util.stream.LongStream longStream8 = random1.longs((-5123059410709186348L), (long) 32);
        double double9 = random1.nextGaussian();
        byte[] byteArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            random1.nextBytes(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.44047195f + "'", float5 == 0.44047195f);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.3268766592932178d + "'", double9 == 0.3268766592932178d);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        double double9 = random1.nextDouble();
        java.util.stream.IntStream intStream11 = random1.ints((long) (byte) 100);
        java.util.stream.IntStream intStream15 = random1.ints((long) '4', (int) '#', (int) 'x');
        java.util.stream.IntStream intStream19 = random1.ints(0L, 28, 38);
        long long20 = random1.nextLong();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44047195711667986d + "'", double9 == 0.44047195711667986d);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 4452524227988171454L + "'", long20 == 4452524227988171454L);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        java.util.Random random1 = new java.util.Random((long) 1761283695);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder2.setLocale(locale4);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getISO3Language();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale9);
        java.lang.String str12 = locale4.getDisplayCountry(locale9);
        java.lang.String str13 = locale4.getLanguage();
        java.lang.String str14 = locale0.getDisplayVariant(locale4);
        java.lang.String str15 = locale0.getDisplayName();
        java.lang.String str16 = locale0.getISO3Language();
        java.util.Locale locale18 = new java.util.Locale("Coreano (FRENCH (FRENCH))");
        java.lang.String str19 = locale0.getDisplayVariant(locale18);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chinese (China)" + "'", str15, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zho" + "'", str16, "zho");
        org.junit.Assert.assertEquals(locale18.toString(), "coreano (french (french))");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder2.setUnicodeLocaleKeyword("jpn", "French (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: jpn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.getISO3Country();
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale8 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale8);
        java.util.Locale.setDefault(category5, locale8);
        java.lang.String str11 = locale8.getDisplayVariant();
        java.lang.String str12 = locale0.getDisplayName(locale8);
        java.util.Random random14 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        float float16 = random14.nextFloat();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale0, random14);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random14);
        java.util.stream.IntStream intStream20 = random14.ints(1L);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CHN" + "'", str4, "CHN");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale8.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chinese (China)" + "'", str12, "Chinese (China)");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.72810113f + "'", float16 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream20);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = java.util.Locale.lookupTag(languageRangeList0, (java.util.Collection<java.lang.String>) strSet2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        java.util.Locale locale2 = new java.util.Locale("fr-FR", "JP");
        java.lang.String str3 = locale2.getCountry();
        java.lang.String str4 = locale2.getScript();
        org.junit.Assert.assertEquals(locale2.toString(), "fr-fr_JP");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JP" + "'", str3, "JP");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.lang.String str3 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale8.getISO3Language();
        java.util.Locale.Builder builder10 = builder6.setLocale(locale8);
        java.lang.String str11 = locale3.getDisplayCountry(locale8);
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale locale14 = builder13.build();
        java.util.Locale.Builder builder15 = builder13.clearExtensions();
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder18 = builder13.setLocale(locale16);
        java.lang.String str19 = locale16.getCountry();
        java.lang.String str20 = locale16.getLanguage();
        java.util.Locale.setDefault(category0, locale16);
        java.util.Random random23 = new java.util.Random((long) '#');
        java.util.stream.IntStream intStream25 = random23.ints((long) 100);
        double double26 = random23.nextGaussian();
        java.util.stream.LongStream longStream27 = random23.longs();
        boolean boolean28 = random23.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(locale16, random23);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zh could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zh" + "'", str20, "zh");
        org.junit.Assert.assertNotNull(intStream25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.7709984181344616d + "'", double26 == 1.7709984181344616d);
        org.junit.Assert.assertNotNull(longStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Book book10 = faker9.book();
        com.github.javafaker.Finance finance11 = faker9.finance();
        com.github.javafaker.Code code12 = faker9.code();
        com.github.javafaker.Lorem lorem13 = faker9.lorem();
        com.github.javafaker.PhoneNumber phoneNumber14 = faker9.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(lorem13);
        org.junit.Assert.assertNotNull(phoneNumber14);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        java.util.Locale locale2 = new java.util.Locale("\u65e5\u672c\u8a9e", "south korea (SOUTH KOREA)");
        java.lang.String str3 = locale2.getDisplayCountry();
        java.util.Locale.setDefault(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "\u65e5\u672c\u8a9e_SOUTH KOREA (SOUTH KOREA)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SOUTH KOREA (SOUTH KOREA)" + "'", str3, "SOUTH KOREA (SOUTH KOREA)");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        java.util.Random random1 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.LongStream longStream3 = random1.longs();
        java.util.Random random5 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        int int8 = random5.nextInt(10);
        java.util.Random random10 = new java.util.Random(10L);
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random10.nextBytes(byteArray16);
        random5.nextBytes(byteArray16);
        random1.nextBytes(byteArray16);
        java.util.stream.IntStream intStream21 = random1.ints((long) 'u');
        java.util.stream.IntStream intStream24 = random1.ints(13, 513819833);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[95, 64, 8, 57, 59]");
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNotNull(intStream24);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        java.util.stream.LongStream longStream9 = random3.longs();
        java.util.Random random11 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        int int14 = random11.nextInt(10);
        java.util.Random random16 = new java.util.Random(10L);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random16.nextBytes(byteArray22);
        random11.nextBytes(byteArray22);
        random3.nextBytes(byteArray22);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random3);
        int int28 = random3.nextInt(14);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[34, 42, 124, -86, 50]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setVariant("Gergo chinook");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: Gergo chinook [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("French (Canada)", (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        java.util.Locale locale2 = new java.util.Locale("chn", "fr_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "chn_FR_CA");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles(100L);
        random1.setSeed((long) 32);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("chinese", (-2.797069603195829d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-2.797069603195829");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        java.util.Locale locale1 = new java.util.Locale("kor");
        java.lang.String str2 = locale1.getScript();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: kor could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "kor");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.String str5 = locale2.getScript();
        java.lang.String str6 = locale2.getVariant();
        java.util.Set<java.lang.String> strSet7 = locale2.getUnicodeLocaleKeys();
        boolean boolean8 = locale2.hasExtensions();
        java.util.Set<java.lang.String> strSet9 = locale2.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("_FRANCIA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder2.setLocale(locale4);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getISO3Language();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale9);
        java.lang.String str12 = locale4.getDisplayCountry(locale9);
        java.lang.String str13 = locale4.getLanguage();
        java.lang.String str14 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.util.Locale locale19 = new java.util.Locale("fra", "hi!", "kor");
        java.util.Locale.Category category20 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale23 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale23);
        java.util.Locale.setDefault(category20, locale23);
        java.util.Locale locale26 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category20, locale26);
        java.lang.String str28 = locale19.getDisplayCountry(locale26);
        java.lang.String str29 = locale15.getDisplayLanguage(locale19);
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        java.util.Locale locale32 = new java.util.Locale("");
        java.lang.String str33 = locale32.getISO3Language();
        java.util.Locale.Builder builder34 = builder30.setLocale(locale32);
        java.util.Locale.Builder builder35 = new java.util.Locale.Builder();
        java.util.Locale locale37 = new java.util.Locale("");
        java.lang.String str38 = locale37.getISO3Language();
        java.util.Locale.Builder builder39 = builder35.setLocale(locale37);
        java.lang.String str40 = locale32.getDisplayCountry(locale37);
        java.util.Locale locale41 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleKeys();
        java.lang.String str43 = locale41.getDisplayCountry();
        java.lang.String str44 = locale32.getDisplayName(locale41);
        java.util.Set<java.lang.Character> charSet45 = locale41.getExtensionKeys();
        java.lang.String str46 = locale15.getDisplayCountry(locale41);
        java.lang.String str47 = locale41.getDisplayLanguage();
        java.lang.String str48 = locale0.getDisplayLanguage(locale41);
        java.util.Locale locale50 = new java.util.Locale("");
        java.lang.String str51 = locale50.getISO3Language();
        java.util.Locale locale53 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale53);
        java.lang.String str55 = locale50.getDisplayVariant(locale53);
        java.util.Locale locale56 = locale50.stripExtensions();
        java.lang.String str57 = locale0.getDisplayScript(locale56);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertEquals(locale19.toString(), "fra_HI!_kor");
        org.junit.Assert.assertTrue("'" + category20 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category20.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale23.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HI!" + "'", str28, "HI!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "German" + "'", str29, "German");
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(charSet45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "cinese" + "'", str47, "cinese");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\u4e2d\u6587" + "'", str48, "\u4e2d\u6587");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals(locale53.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        java.util.stream.LongStream longStream9 = random3.longs();
        java.util.stream.LongStream longStream11 = random3.longs(4755622236989466036L);
        java.util.stream.DoubleStream doubleStream13 = random3.doubles((long) (byte) 0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Color color4 = faker2.color();
        com.github.javafaker.Company company5 = faker2.company();
        com.github.javafaker.Lorem lorem6 = faker2.lorem();
        com.github.javafaker.Internet internet7 = faker2.internet();
        java.lang.String str9 = faker2.numerify("KR");
        com.github.javafaker.Internet internet10 = faker2.internet();
        com.github.javafaker.Code code11 = faker2.code();
        com.github.javafaker.Book book12 = faker2.book();
        com.github.javafaker.Lorem lorem13 = faker2.lorem();
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "KR" + "'", str9, "KR");
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(book12);
        org.junit.Assert.assertNotNull(lorem13);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.getISO3Country();
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale8 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale8);
        java.util.Locale.setDefault(category5, locale8);
        java.lang.String str11 = locale8.getDisplayVariant();
        java.lang.String str12 = locale0.getDisplayName(locale8);
        java.util.Random random14 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        float float16 = random14.nextFloat();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale0, random14);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random14);
        java.util.stream.IntStream intStream22 = random14.ints(1L, 1036684082, 1359947704);
        boolean boolean23 = random14.nextBoolean();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CHN" + "'", str4, "CHN");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale8.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chinese (China)" + "'", str12, "Chinese (China)");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.72810113f + "'", float16 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Code code6 = faker1.code();
        java.lang.String str8 = faker1.letterify("fra_KOR_France");
        com.github.javafaker.Address address9 = faker1.address();
        com.github.javafaker.Number number10 = faker1.number();
        java.lang.String str12 = faker1.numerify("Canada");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fra_KOR_France" + "'", str8, "fra_KOR_France");
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Canada" + "'", str12, "Canada");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.toLanguageTag();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale6);
        java.lang.String str8 = locale6.getDisplayCountry();
        java.lang.String str9 = locale0.getDisplayCountry(locale6);
        java.lang.String str10 = locale6.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "China" + "'", str8, "China");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u56fd" + "'", str9, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        com.github.javafaker.Finance finance7 = faker1.finance();
        com.github.javafaker.Address address8 = faker1.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(address8);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.LongStream longStream3 = random1.longs((long) 0);
        java.util.Random random5 = new java.util.Random(10L);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random5.nextBytes(byteArray11);
        random1.nextBytes(byteArray11);
        java.util.stream.IntStream intStream17 = random1.ints((long) (short) 0, (-1), (int) (short) 0);
        double double18 = random1.nextDouble();
        double double19 = random1.nextGaussian();
        random1.setSeed((-4972683369271453960L));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream24 = random1.doubles(1.2981846735357514d, 0.23019102468168146d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-46, 122, -3, -70, -8]");
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2578027905957804d + "'", double18 == 0.2578027905957804d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.1329921492850181d + "'", double19 == 1.1329921492850181d);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale8.getISO3Language();
        java.util.Locale.Builder builder10 = builder6.setLocale(locale8);
        java.lang.String str11 = locale3.getDisplayCountry(locale8);
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.lang.String str14 = locale13.getISO3Language();
        java.util.Locale locale15 = locale13.stripExtensions();
        java.util.Locale locale16 = java.util.Locale.TAIWAN;
        java.util.Locale locale17 = java.util.Locale.JAPANESE;
        java.lang.String str18 = locale16.getDisplayName(locale17);
        java.lang.String str19 = locale13.getDisplayName(locale17);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale21 = java.util.Locale.getDefault(category0);
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.lang.String str23 = locale22.getDisplayScript();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale22);
        java.lang.String str25 = locale22.getISO3Country();
        java.util.Locale locale27 = new java.util.Locale("FRENCH (FRENCH)");
        java.lang.String str28 = locale27.getVariant();
        java.lang.String str29 = locale22.getDisplayName(locale27);
        java.util.Locale.setDefault(category0, locale22);
        java.util.Locale locale34 = new java.util.Locale("fra", "kor", "France");
        java.util.Set<java.lang.String> strSet35 = locale34.getUnicodeLocaleAttributes();
        java.util.Locale locale38 = new java.util.Locale("fra", "fra");
        java.lang.String str39 = locale34.getDisplayLanguage(locale38);
        java.util.Locale locale40 = locale34.stripExtensions();
        java.util.Locale.setDefault(category0, locale34);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "kor" + "'", str14, "kor");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)" + "'", str18, "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str19, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ja");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "KOR" + "'", str25, "KOR");
        org.junit.Assert.assertEquals(locale27.toString(), "french (french)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Korean (South Korea)" + "'", str29, "Korean (South Korea)");
        org.junit.Assert.assertEquals(locale34.toString(), "fra_KOR_France");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertEquals(locale38.toString(), "fra_FRA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "fra" + "'", str39, "fra");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fra_KOR_France");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguage("it");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setLanguage("und-France");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: und-France [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        java.util.Random random1 = new java.util.Random((long) (-1155869325));
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setRegion("FRENCH (FRANCE) (France)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: FRENCH (FRANCE) (France) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.setExtension('u', "Cina");
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Locale locale10 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str11 = locale9.getDisplayVariant(locale10);
        java.util.Set<java.lang.Character> charSet12 = locale10.getExtensionKeys();
        java.lang.String str13 = locale10.getDisplayLanguage();
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = locale14.getDisplayCountry();
        java.util.Locale locale17 = new java.util.Locale("");
        java.lang.String str18 = locale17.getISO3Language();
        java.util.Locale locale19 = java.util.Locale.UK;
        java.lang.String str20 = locale17.getDisplayLanguage(locale19);
        java.lang.String str21 = locale14.getDisplayName(locale19);
        java.util.Locale locale22 = java.util.Locale.US;
        java.lang.String str23 = locale22.getISO3Language();
        java.lang.String str24 = locale14.getDisplayCountry(locale22);
        java.lang.String str25 = locale10.getDisplayName(locale14);
        java.util.Locale.Builder builder26 = builder3.setLocale(locale14);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese" + "'", str13, "Chinese");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "France" + "'", str15, "France");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "French (France)" + "'", str21, "French (France)");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "eng" + "'", str23, "eng");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "France" + "'", str24, "France");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "chinois (Taiwan)" + "'", str25, "chinois (Taiwan)");
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale7);
        java.lang.String str10 = locale2.getDisplayCountry(locale7);
        java.lang.String str11 = locale2.getLanguage();
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = locale12.getISO3Language();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getISO3Language();
        java.lang.String str17 = locale12.getDisplayVariant(locale15);
        java.lang.String str18 = locale2.getDisplayName(locale15);
        java.lang.String str19 = locale2.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "eng" + "'", str13, "eng");
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) 32);
        java.util.stream.IntStream intStream13 = random1.ints((int) '4', 100);
        java.util.stream.LongStream longStream15 = random1.longs((long) 28);
        java.util.stream.IntStream intStream19 = random1.ints((long) (short) 1, (-1167796541), 13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream23 = random1.ints((long) 23, 31, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(intStream19);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        java.util.Locale locale1 = new java.util.Locale("ko");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.removeUnicodeLocaleAttribute("South Korea");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: South Korea [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Canada" + "'", str1, "Canada");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CA" + "'", str2, "CA");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.lang.String str4 = locale0.getISO3Country();
        java.lang.String str5 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "France" + "'", str3, "France");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FRA" + "'", str4, "FRA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        java.util.Locale locale3 = new java.util.Locale("fra", "kor", "France");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale locale7 = new java.util.Locale("fra", "fra");
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.util.Locale locale9 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str11 = locale9.getExtension('x');
        java.util.Random random13 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        float float15 = random13.nextFloat();
        java.util.stream.IntStream intStream19 = random13.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream20 = random13.ints();
        double double21 = random13.nextDouble();
        float float22 = random13.nextFloat();
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(locale9, random13);
        java.lang.String str24 = locale9.getCountry();
        boolean boolean25 = locale7.equals((java.lang.Object) str24);
        org.junit.Assert.assertEquals(locale3.toString(), "fra_KOR_France");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals(locale7.toString(), "fra_FRA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fra" + "'", str8, "fra");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.72810113f + "'", float15 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.44047195711667986d + "'", double21 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.24137181f + "'", float22 == 0.24137181f);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "TW" + "'", str24, "TW");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        java.util.stream.LongStream longStream9 = random3.longs();
        java.util.Random random11 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        int int14 = random11.nextInt(10);
        java.util.Random random16 = new java.util.Random(10L);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random16.nextBytes(byteArray22);
        random11.nextBytes(byteArray22);
        random3.nextBytes(byteArray22);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Company company27 = faker26.company();
        java.lang.String str29 = faker26.numerify("ja");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[34, 42, 124, -86, 50]");
        org.junit.Assert.assertNotNull(company27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ja" + "'", str29, "ja");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        java.util.Locale locale2 = new java.util.Locale("fr-CA", "jpn");
        org.junit.Assert.assertEquals(locale2.toString(), "fr-ca_JPN");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getDisplayLanguage();
        boolean boolean4 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Korean" + "'", str3, "Korean");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) (short) 0);
        java.util.stream.DoubleStream doubleStream12 = random1.doubles((long) (short) 1, 0.23019102468168146d, (double) 1913984760);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(doubleStream12);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Code code7 = faker6.code();
        com.github.javafaker.Company company8 = faker6.company();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(company8);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        java.util.Locale locale5 = new java.util.Locale("");
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.util.Set<java.lang.Character> charSet8 = locale6.getExtensionKeys();
        java.lang.String str9 = locale0.getDisplayLanguage(locale6);
        java.lang.String str10 = locale6.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale6.getUnicodeLocaleType("chinese_KOR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: chinese_KOR");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587" + "'", str9, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh" + "'", str10, "zh");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.DoubleStream doubleStream9 = random1.doubles();
        int int11 = random1.nextInt((int) (short) 100);
        java.util.stream.LongStream longStream12 = random1.longs();
        int int13 = random1.nextInt();
        java.util.stream.IntStream intStream17 = random1.ints((long) 3, (-1156638823), (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream21 = random1.doubles((-5123059410709186348L), (double) (-1155484576), (double) (-5015647950085110473L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 85 + "'", int11 == 85);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 431529176 + "'", int13 == 431529176);
        org.junit.Assert.assertNotNull(intStream17);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Random random3 = new java.util.Random(10L);
        float float4 = random3.nextFloat();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random3);
        long long6 = random3.nextLong();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0, random3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = random3.doubles(1.7709984181344616d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr" + "'", str1, "fr");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.73043025f + "'", float4 == 0.73043025f);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8220501950349663546L + "'", long6 == 8220501950349663546L);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getScript();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale10);
        java.lang.String str12 = locale10.getDisplayCountry();
        java.lang.String str13 = locale10.getDisplayVariant();
        java.lang.String str14 = locale10.toLanguageTag();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale10);
        java.util.Random random17 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        int int20 = random17.nextInt(10);
        java.util.stream.DoubleStream doubleStream21 = random17.doubles();
        double double22 = random17.nextGaussian();
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(locale10, random17);
        java.lang.String str24 = locale10.getVariant();
        java.util.Locale locale27 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleKeys();
        java.lang.String str29 = locale27.getDisplayVariant();
        java.lang.String str30 = locale10.getDisplayScript(locale27);
        java.util.Set<java.lang.String> strSet31 = locale27.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category0, locale27);
        java.util.Locale locale34 = new java.util.Locale("Canada");
        java.util.Locale.setDefault(category0, locale34);
        java.lang.String str36 = locale34.getCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "China" + "'", str12, "China");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.35703205834598994d) + "'", double22 == (-0.35703205834598994d));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals(locale27.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals(locale34.toString(), "canada");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        java.util.Locale locale1 = new java.util.Locale("fr");
        java.lang.String str2 = locale1.getLanguage();
        java.util.Random random4 = new java.util.Random(10L);
        java.util.stream.DoubleStream doubleStream7 = random4.doubles((double) 0.24137181f, (double) (short) 1);
        long long8 = random4.nextLong();
        java.util.Random random10 = new java.util.Random(10L);
        java.util.stream.LongStream longStream12 = random10.longs((long) 0);
        java.util.Random random14 = new java.util.Random(10L);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random14.nextBytes(byteArray20);
        random10.nextBytes(byteArray20);
        random4.nextBytes(byteArray20);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale1, random4);
        java.lang.String str26 = faker24.numerify("German");
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-4972683369271453960L) + "'", long8 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[58, 93, -1, 65, -76]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "German" + "'", str26, "German");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Random random5 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream7 = random5.ints(1L);
        long long8 = random5.nextLong();
        int int10 = random5.nextInt((int) (byte) 1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.Color color12 = faker11.color();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean (South Korea)" + "'", str2, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.DateAndTime dateAndTime2 = faker1.date();
        com.github.javafaker.Finance finance3 = faker1.finance();
        java.lang.String str5 = faker1.letterify("ko");
        java.lang.String str7 = faker1.numerify("Chinook jargon (Germany,KR)");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ko" + "'", str5, "ko");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinook jargon (Germany,KR)" + "'", str7, "Chinook jargon (Germany,KR)");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        java.util.Random random1 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.LongStream longStream3 = random1.longs();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles();
        java.util.stream.IntStream intStream7 = random1.ints(0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream11 = random1.longs((long) (short) 1, (long) (-1193959466), (long) (-1193959466));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Italy", (double) (-1167796541));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.167796541E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        java.util.Locale locale2 = new java.util.Locale("coreano (Corea del Sud)", "\u671d\u9c9c\u6587");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u671d\u9c9c\u6587");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder2.setLocale(locale4);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getISO3Language();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale9);
        java.lang.String str12 = locale4.getDisplayCountry(locale9);
        java.lang.String str13 = locale4.getLanguage();
        java.lang.String str14 = locale0.getDisplayVariant(locale4);
        java.lang.String str15 = locale0.getDisplayName();
        java.util.Random random17 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        java.util.stream.LongStream longStream19 = random17.longs();
        java.util.stream.IntStream intStream23 = random17.ints((long) (short) 100, (int) (short) 0, (int) (short) 10);
        java.util.stream.IntStream intStream24 = random17.ints();
        java.util.stream.IntStream intStream28 = random17.ints(0L, (-1155869325), 85);
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(locale0, random17);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chinese (China)" + "'", str15, "Chinese (China)");
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertNotNull(intStream24);
        org.junit.Assert.assertNotNull(intStream28);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("cinese (Cina)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=cinese (cina)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        java.util.Locale locale3 = new java.util.Locale("french (FRENCH)", "", "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.util.Random random1 = new java.util.Random((long) 7);
        double double2 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles((double) 1, (double) (short) 10);
        float float6 = random1.nextFloat();
        random1.setSeed((long) (byte) 100);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8452060657049847d + "'", double2 == 0.8452060657049847d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.3483097f + "'", float6 == 0.3483097f);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("French");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setExtension('#', "fr-FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        java.util.Locale locale2 = new java.util.Locale("China", "fra-x-lvariant-kor");
        java.lang.String str3 = locale2.toLanguageTag();
        org.junit.Assert.assertEquals(locale2.toString(), "china_FRA-X-LVARIANT-KOR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "china" + "'", str3, "china");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        java.util.Locale locale2 = new java.util.Locale("\u53f0\u6e7e\u5730\u533a", "");
        org.junit.Assert.assertEquals(locale2.toString(), "\u53f0\u6e7e\u5730\u533a");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale7);
        java.lang.String str10 = locale2.getDisplayCountry(locale7);
        java.lang.String str11 = locale2.getLanguage();
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = locale12.getISO3Language();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getISO3Language();
        java.lang.String str17 = locale12.getDisplayVariant(locale15);
        java.lang.String str18 = locale2.getDisplayName(locale15);
        java.util.Locale locale19 = java.util.Locale.ROOT;
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.lang.String str21 = locale20.getISO3Language();
        java.lang.String str22 = locale20.getDisplayName();
        java.lang.String str23 = locale19.getDisplayScript(locale20);
        java.lang.String str24 = locale2.getDisplayVariant(locale19);
        java.util.Locale locale25 = locale19.stripExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "eng" + "'", str13, "eng");
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "kor" + "'", str21, "kor");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Korean (South Korea)" + "'", str22, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Book book10 = faker9.book();
        com.github.javafaker.Color color11 = faker9.color();
        com.github.javafaker.DateAndTime dateAndTime12 = faker9.date();
        com.github.javafaker.Color color13 = faker9.color();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(dateAndTime12);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Random random3 = new java.util.Random();
        random3.setSeed((long) 10);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random3);
        random3.setSeed((long) 'a');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French (France)" + "'", str2, "French (France)");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        java.util.Random random1 = new java.util.Random((long) (short) 100);
        java.util.stream.IntStream intStream4 = random1.ints((-1193959466), 513819833);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder7 = builder4.clear();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder13 = builder8.setLocale(locale11);
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        java.util.Locale.Builder builder16 = builder14.setScript("");
        java.util.Locale.Builder builder17 = new java.util.Locale.Builder();
        java.util.Locale locale19 = new java.util.Locale("");
        java.lang.String str20 = locale19.getISO3Language();
        java.util.Locale.Builder builder21 = builder17.setLocale(locale19);
        java.util.Locale.Builder builder22 = builder14.setLocale(locale19);
        java.util.Locale.Category category23 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale26 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale26);
        java.util.Locale.setDefault(category23, locale26);
        java.util.Locale locale29 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category23, locale29);
        java.lang.String str31 = locale29.getDisplayVariant();
        java.lang.String str32 = locale19.getDisplayName(locale29);
        java.util.Locale.Builder builder33 = builder4.setLocale(locale29);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + category23 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category23.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale26.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        int int5 = random1.nextInt((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream9 = random1.longs(4452524227988171454L, (long) 513819833, (long) 216154118);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Color color6 = faker1.color();
        com.github.javafaker.Book book7 = faker1.book();
        com.github.javafaker.Color color8 = faker1.color();
        com.github.javafaker.Name name9 = faker1.name();
        com.github.javafaker.Finance finance10 = faker1.finance();
        com.github.javafaker.Finance finance11 = faker1.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(finance11);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("fra");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder5.setLanguageTag("french");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        int int5 = random1.nextInt((int) '#');
        random1.setSeed(5840930912313687631L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("French");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setVariant("Chinook jargon (Germany,KR)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: Chinook jargon (Germany,KR) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "ko-KR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setLanguage("\u97d3\u6587 (FRENCH (FRENCH))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? (FRENCH (FRENCH)) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Chinook jargon (Germany,KR)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinookjargon(germany");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("chinese_kor (CANADA)", (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=35.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Name name3 = faker2.name();
        com.github.javafaker.Name name4 = faker2.name();
        com.github.javafaker.Code code5 = faker2.code();
        java.lang.String str7 = faker2.bothify("\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        com.github.javafaker.Options options8 = faker2.options();
        com.github.javafaker.Number number9 = faker2.number();
        com.github.javafaker.Code code10 = faker2.code();
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str7, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(code10);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale7);
        java.lang.String str10 = locale2.getDisplayCountry(locale7);
        java.lang.String str11 = locale2.getLanguage();
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = locale12.getISO3Language();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getISO3Language();
        java.lang.String str17 = locale12.getDisplayVariant(locale15);
        java.lang.String str18 = locale2.getDisplayName(locale15);
        java.util.Locale locale19 = java.util.Locale.ROOT;
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.lang.String str21 = locale20.getISO3Language();
        java.lang.String str22 = locale20.getDisplayName();
        java.lang.String str23 = locale19.getDisplayScript(locale20);
        java.lang.String str24 = locale2.getDisplayVariant(locale19);
        java.lang.String str25 = locale19.getDisplayVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "eng" + "'", str13, "eng");
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "kor" + "'", str21, "kor");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "coreano (Corea del Sud)" + "'", str22, "coreano (Corea del Sud)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.util.Locale locale2 = new java.util.Locale("Canada", "french (french)");
        java.util.Locale locale6 = new java.util.Locale("Chinese (China)", "French", "french (FRENCH)");
        java.lang.String str7 = locale2.getDisplayName(locale6);
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale locale10 = new java.util.Locale("");
        java.lang.String str11 = locale10.getISO3Language();
        java.util.Locale.Builder builder12 = builder8.setLocale(locale10);
        java.util.Locale.Builder builder14 = builder12.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder15 = builder12.clear();
        java.util.Locale.Builder builder17 = builder12.setLanguageTag("Korean");
        java.util.Locale locale18 = java.util.Locale.PRC;
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.util.Locale.Builder builder20 = builder17.setLocale(locale18);
        boolean boolean21 = locale2.equals((java.lang.Object) builder20);
        org.junit.Assert.assertEquals(locale2.toString(), "canada_FRENCH (FRENCH)");
        org.junit.Assert.assertEquals(locale6.toString(), "chinese (china)_FRENCH_french (FRENCH)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "canada (FRENCH (FRENCH))" + "'", str7, "canada (FRENCH (FRENCH))");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "cinese" + "'", str19, "cinese");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) 100);
        boolean boolean7 = random1.nextBoolean();
        boolean boolean8 = random1.nextBoolean();
        long long9 = random1.nextLong();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-6162003863595742414L) + "'", long9 == (-6162003863595742414L));
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u4e2d\u56fd\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Random random5 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream7 = random5.ints(1L);
        long long8 = random5.nextLong();
        int int10 = random5.nextInt((int) (byte) 1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random5);
        float float12 = random5.nextFloat();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "coreano (Corea del Sud)" + "'", str2, "coreano (Corea del Sud)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.24137181f + "'", float12 == 0.24137181f);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        java.util.Random random1 = new java.util.Random((long) 38);
        boolean boolean2 = random1.nextBoolean();
        double double3 = random1.nextGaussian();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5091297619133967d) + "'", double3 == (-0.5091297619133967d));
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.LongStream longStream10 = random1.longs((long) (byte) 1);
        boolean boolean11 = random1.nextBoolean();
        double double12 = random1.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = random1.nextInt((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.8673886034754649d) + "'", double12 == (-0.8673886034754649d));
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        java.util.Random random1 = new java.util.Random(100L);
        float float2 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.7220096f + "'", float2 == 0.7220096f);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("gb");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("China");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 0.24137181f, (double) (short) 1);
        double double5 = random1.nextDouble();
        java.util.stream.DoubleStream doubleStream7 = random1.doubles((long) 37);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7304302967434272d + "'", double5 == 0.7304302967434272d);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        java.util.Locale locale2 = new java.util.Locale("\u4e2d\u56fd", "English");
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = locale3.getDisplayScript();
        org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u56fd_ENGLISH");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u56fd_ENGLISH");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fra-x-lvariant-kor", 0.8452060657049847d);
        double double3 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8452060657049847d + "'", double3 == 0.8452060657049847d);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        java.util.Locale locale1 = new java.util.Locale("FRENCH (FRENCH)");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale3.getDisplayCountry();
        java.util.Locale locale6 = new java.util.Locale("");
        java.lang.String str7 = locale6.getISO3Language();
        java.util.Locale locale8 = java.util.Locale.UK;
        java.lang.String str9 = locale6.getDisplayLanguage(locale8);
        java.lang.String str10 = locale3.getDisplayName(locale8);
        java.lang.String str11 = locale1.getDisplayName(locale3);
        java.lang.String str12 = locale1.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet13 = locale1.getExtensionKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "french (french)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Francia" + "'", str4, "Francia");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "French (France)" + "'", str10, "French (France)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "french (french)" + "'", str11, "french (french)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "french (french)" + "'", str12, "french (french)");
        org.junit.Assert.assertNotNull(charSet13);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale5 = new java.util.Locale("");
        java.lang.String str6 = locale5.getISO3Language();
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.lang.String str8 = locale5.getScript();
        java.util.Locale.setDefault(category2, locale5);
        java.util.Locale locale10 = java.util.Locale.getDefault(category2);
        java.util.Locale locale11 = java.util.Locale.getDefault(category2);
        java.util.Locale.setDefault(locale11);
        java.lang.String str13 = locale0.getDisplayLanguage(locale11);
        java.util.Locale locale16 = new java.util.Locale("\uc911\uad6d\uc5b4\ub300\ub9cc)", "");
        java.lang.String str17 = locale11.getDisplayLanguage(locale16);
        java.util.Set<java.lang.String> strSet18 = locale16.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese" + "'", str13, "Chinese");
        org.junit.Assert.assertEquals(locale16.toString(), "\uc911\uad6d\uc5b4\ub300\ub9cc)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale2);
        java.lang.String str4 = locale2.getLanguage();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale5.getISO3Language();
        java.lang.String str7 = locale5.getDisplayLanguage();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale5);
        java.lang.String str9 = locale2.getDisplayCountry(locale5);
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale12);
        java.lang.String str14 = locale12.getLanguage();
        java.util.Set<java.lang.String> strSet15 = locale12.getUnicodeLocaleAttributes();
        boolean boolean16 = locale12.hasExtensions();
        java.util.Set<java.lang.String> strSet17 = locale12.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category0, locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = locale12.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra" + "'", str6, "fra");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French" + "'", str7, "French");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale3 = new java.util.Locale("ko");
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder10 = builder5.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.clearExtensions();
        java.util.Locale locale13 = builder10.build();
        java.lang.String str14 = locale3.getDisplayName(locale13);
        java.lang.String str15 = locale1.getDisplayScript(locale13);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u671d\u9c9c\u6587" + "'", str14, "\u671d\u9c9c\u6587");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("FRA");
        java.util.Locale.Builder builder10 = builder6.setRegion("");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("CHINESE");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder7 = builder2.setLocale(locale5);
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setLanguage("Canada");
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = locale11.getISO3Language();
        java.util.Locale locale13 = locale11.stripExtensions();
        java.lang.String str14 = locale11.getDisplayScript();
        java.util.Locale.Builder builder15 = builder10.setLocale(locale11);
        java.lang.String str16 = locale1.getDisplayVariant(locale11);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "chinese");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "kor" + "'", str12, "kor");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr_CA", (double) (-5013995466868426345L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-5.0139954668684268E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        java.util.Locale locale2 = new java.util.Locale("FRA-X-LVARIANT-KOR", "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        java.util.Random random4 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        int int7 = random4.nextInt(10);
        java.util.stream.LongStream longStream8 = random4.longs();
        boolean boolean9 = random4.nextBoolean();
        int int11 = random4.nextInt(1036684082);
        boolean boolean12 = random4.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale2, random4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fra-x-lvariant-kor_??? (????) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 393447903 + "'", int11 == 393447903);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("TWN", (double) 1708368258);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.708368258E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        java.util.Locale locale2 = new java.util.Locale("french (FRENCH)", "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        java.util.Locale locale2 = new java.util.Locale("fra", "fra");
        java.util.Locale locale5 = new java.util.Locale("French (France)", "Canada");
        java.lang.String str6 = locale2.getDisplayScript(locale5);
        boolean boolean7 = locale5.hasExtensions();
        java.util.Random random9 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        int int12 = random9.nextInt(10);
        java.util.Random random14 = new java.util.Random(10L);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random14.nextBytes(byteArray20);
        random9.nextBytes(byteArray20);
        java.util.stream.DoubleStream doubleStream26 = random9.doubles(100L, 0.0d, 10.0d);
        random9.setSeed(0L);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(locale5, random9);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french (france)_CANADA could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "fra_FRA");
        org.junit.Assert.assertEquals(locale5.toString(), "french (france)_CANADA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[55, -59, -62, 112, 34]");
        org.junit.Assert.assertNotNull(doubleStream26);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getLanguage();
        java.util.Locale locale5 = new java.util.Locale("CA", "ko_KR", "chinois (Taiwan)");
        java.lang.String str6 = locale5.getDisplayVariant();
        java.lang.String str7 = locale0.getDisplayName(locale5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en" + "'", str1, "en");
        org.junit.Assert.assertEquals(locale5.toString(), "ca_KO_KR_chinois (Taiwan)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chinois (Taiwan)" + "'", str6, "chinois (Taiwan)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "angl\350s (Estats Units)" + "'", str7, "angl\350s (Estats Units)");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("francese", (double) 0.22278214f);
        java.lang.String str3 = languageRange2.getRange();
        java.lang.String str4 = languageRange2.getRange();
        double double5 = languageRange2.getWeight();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francese" + "'", str3, "francese");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "francese" + "'", str4, "francese");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.22278213500976562d + "'", double5 == 0.22278213500976562d);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder0.addUnicodeLocaleAttribute("french");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setUnicodeLocaleKeyword("KR", "\u30d5\u30e9\u30f3\u30b9");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getDisplayScript();
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale5 = new java.util.Locale("");
        java.lang.String str6 = locale5.getISO3Language();
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.lang.String str8 = locale5.getScript();
        java.util.Locale.setDefault(category2, locale5);
        java.util.Locale locale10 = java.util.Locale.getDefault(category2);
        java.util.Locale locale11 = java.util.Locale.getDefault(category2);
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.lang.String str13 = locale12.getDisplayName();
        java.lang.String str14 = locale12.getDisplayCountry();
        java.util.Locale.setDefault(category2, locale12);
        java.util.Locale locale16 = java.util.Locale.getDefault(category2);
        java.lang.String str17 = locale0.getDisplayLanguage(locale16);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese" + "'", str13, "Chinese");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        java.util.Locale locale2 = new java.util.Locale("\u97e9\u56fd", "Canada");
        boolean boolean3 = locale2.hasExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "\u97e9\u56fd_CANADA");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = java.util.Locale.ROOT;
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale4.getISO3Language();
        java.lang.String str6 = locale4.getDisplayName();
        java.lang.String str7 = locale3.getDisplayScript(locale4);
        java.util.Locale.Builder builder8 = builder2.setLocale(locale3);
        java.util.Locale.Builder builder10 = builder8.setLanguageTag("kor");
        java.util.Locale.Builder builder12 = builder8.setLanguageTag("Germany");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.setLanguageTag("\u97d3\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "kor" + "'", str5, "kor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Korean (South Korea)" + "'", str6, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CHN", (double) 0.57896465f);
        double double3 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5789646506309509d + "'", double3 == 0.5789646506309509d);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Code code2 = faker0.code();
        com.github.javafaker.Code code3 = faker0.code();
        com.github.javafaker.Code code4 = faker0.code();
        com.github.javafaker.Company company5 = faker0.company();
        java.lang.String str7 = faker0.numerify("\ud504\ub791\uc2a4\uc5b4\ud504\ub791\uc2a4)");
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud504\ub791\uc2a4\uc5b4\ud504\ub791\uc2a4)" + "'", str7, "\ud504\ub791\uc2a4\uc5b4\ud504\ub791\uc2a4)");
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("CA");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ca");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        java.util.Locale locale2 = new java.util.Locale("cinese (taiwan)", "Francia");
        java.lang.String str3 = locale2.getDisplayVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "cinese (taiwan)_FRANCIA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Color color4 = faker2.color();
        com.github.javafaker.Book book5 = faker2.book();
        com.github.javafaker.Internet internet6 = faker2.internet();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker2.phoneNumber();
        com.github.javafaker.Options options8 = faker2.options();
        com.github.javafaker.PhoneNumber phoneNumber9 = faker2.phoneNumber();
        com.github.javafaker.Lorem lorem10 = faker2.lorem();
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Chinese (Taiwan)", (double) (-1156638823));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.156638823E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        java.util.Random random1 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream3 = random1.ints(1L);
        int int5 = random1.nextInt((int) '#');
        double double6 = random1.nextDouble();
        int int7 = random1.nextInt();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.44047195711667986d + "'", double6 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1036684082 + "'", int7 == 1036684082);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        java.util.stream.LongStream longStream9 = random3.longs();
        java.util.stream.LongStream longStream11 = random3.longs(4755622236989466036L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream14 = random3.ints(254270492, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Finance finance5 = faker0.finance();
        java.lang.String str7 = faker0.numerify("Korean (South Korea)");
        java.lang.String str9 = faker0.numerify("China");
        java.lang.String str11 = faker0.bothify("Chinese (Taiwan)");
        java.lang.String str13 = faker0.letterify("\uc911\uad6d");
        java.lang.String str15 = faker0.bothify("cinese (Cina)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Korean (South Korea)" + "'", str7, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "China" + "'", str9, "China");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese (Taiwan)" + "'", str11, "Chinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\uc911\uad6d" + "'", str13, "\uc911\uad6d");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "cinese (Cina)" + "'", str15, "cinese (Cina)");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("Korean");
        java.util.Locale.Builder builder11 = builder5.setExtension('u', "chn");
        java.util.Locale.Builder builder13 = builder11.setLanguage("Chinese");
        java.util.Locale.Builder builder15 = builder13.addUnicodeLocaleAttribute("Germany");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fra");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, strMap5);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getISO3Language();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale9);
        java.util.Locale locale13 = new java.util.Locale("");
        java.lang.String str14 = locale13.getISO3Language();
        java.util.Locale locale16 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder17 = new java.util.Locale.Builder();
        java.util.Locale locale19 = new java.util.Locale("");
        java.lang.String str20 = locale19.getISO3Language();
        java.util.Locale.Builder builder21 = builder17.setLocale(locale19);
        java.util.Locale locale23 = new java.util.Locale("");
        java.lang.String str24 = locale23.getISO3Language();
        java.util.Locale[] localeArray25 = new java.util.Locale[] { locale9, locale13, locale16, locale19, locale23 };
        java.util.ArrayList<java.util.Locale> localeList26 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList26, localeArray25);
        java.util.Locale locale28 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList26);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList31);
        java.lang.String str34 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strList33);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap35 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap35);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList36, strMap37);
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale39.getDisplayName();
        java.util.Set<java.lang.String> strSet41 = locale39.getUnicodeLocaleAttributes();
        java.lang.String str42 = java.util.Locale.lookupTag(languageRangeList36, (java.util.Collection<java.lang.String>) strSet41);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(localeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(languageRangeList36);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        java.util.Locale locale1 = new java.util.Locale("en-CA");
        org.junit.Assert.assertEquals(locale1.toString(), "en-ca");
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        java.util.Locale locale2 = new java.util.Locale("french", "fra-x-lvariant-kor");
        java.lang.String str4 = locale2.getExtension('u');
        java.util.Set<java.lang.Character> charSet5 = locale2.getExtensionKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRA-X-LVARIANT-KOR");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(charSet5);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        boolean boolean7 = random1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = random1.doubles((-0.5091297619133967d), (-1.4996531610587702d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("English");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setScript("canada (FRENCH (FRENCH))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: canada (FRENCH (FRENCH)) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale1);
        java.lang.String str3 = locale1.getLanguage();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("South Korea");
        java.lang.String str6 = locale1.getDisplayVariant(locale5);
        java.lang.String str7 = locale1.getDisplayName();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str3 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale8.getISO3Language();
        java.util.Locale.Builder builder10 = builder6.setLocale(locale8);
        java.lang.String str11 = locale3.getDisplayCountry(locale8);
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale13 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.getDisplayName();
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.lang.String str5 = locale0.getDisplayLanguage();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale8.getISO3Language();
        java.util.Locale.Builder builder10 = builder6.setLocale(locale8);
        java.util.Locale.Builder builder12 = builder6.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder13 = builder6.clearExtensions();
        java.util.Locale locale14 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale14);
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale locale18 = new java.util.Locale("");
        java.lang.String str19 = locale18.getISO3Language();
        java.util.Locale.Builder builder20 = builder16.setLocale(locale18);
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale locale23 = new java.util.Locale("");
        java.lang.String str24 = locale23.getISO3Language();
        java.util.Locale.Builder builder25 = builder21.setLocale(locale23);
        java.lang.String str26 = locale18.getDisplayCountry(locale23);
        java.lang.String str27 = locale18.getLanguage();
        java.lang.String str28 = locale14.getDisplayVariant(locale18);
        java.util.Locale.Builder builder29 = builder6.setLocale(locale18);
        java.util.Locale locale30 = java.util.Locale.FRANCE;
        boolean boolean31 = locale30.hasExtensions();
        java.lang.String str32 = locale30.getDisplayLanguage();
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale30);
        java.util.Locale locale35 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale35);
        java.util.Locale locale37 = locale35.stripExtensions();
        java.util.Locale locale39 = new java.util.Locale("");
        java.lang.String str40 = locale37.getDisplayCountry(locale39);
        java.lang.String str41 = locale30.getDisplayLanguage(locale37);
        java.lang.String str42 = locale18.getDisplayLanguage(locale30);
        boolean boolean43 = locale30.hasExtensions();
        java.lang.String str44 = locale0.getDisplayCountry(locale30);
        java.util.Random random46 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker47 = new com.github.javafaker.Faker(random46);
        java.util.stream.DoubleStream doubleStream49 = random46.doubles((long) (byte) 1);
        com.github.javafaker.Faker faker50 = new com.github.javafaker.Faker(random46);
        com.github.javafaker.Faker faker51 = new com.github.javafaker.Faker(random46);
        com.github.javafaker.Faker faker52 = new com.github.javafaker.Faker(random46);
        boolean boolean53 = locale30.equals((java.lang.Object) random46);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Korean (South Korea)" + "'", str3, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "French" + "'", str32, "French");
        org.junit.Assert.assertEquals(locale35.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "hi!");
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "French" + "'", str41, "French");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(doubleStream49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Coreano (FRENCH (FRENCH))");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        java.util.Locale locale1 = new java.util.Locale("francese");
        java.lang.String str2 = locale1.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "francese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random0.longs((-6162003863595742414L), (-5013995466868426345L), (long) (-1157793070));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2828601808563254d) + "'", double1 == (-1.2828601808563254d));
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.String str5 = locale2.getScript();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale8.getISO3Language();
        java.util.Locale.Builder builder10 = builder6.setLocale(locale8);
        java.lang.String str11 = locale8.getISO3Country();
        java.lang.String str12 = locale2.getDisplayLanguage(locale8);
        java.util.Locale locale15 = new java.util.Locale("fra", "fra");
        java.util.Locale locale18 = new java.util.Locale("French (France)", "Canada");
        java.lang.String str19 = locale15.getDisplayScript(locale18);
        java.lang.String str20 = locale8.getDisplayCountry(locale15);
        java.lang.String str22 = locale15.getExtension('a');
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals(locale15.toString(), "fra_FRA");
        org.junit.Assert.assertEquals(locale18.toString(), "french (france)_CANADA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.setExtension('x', "fr");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        java.util.Locale locale2 = new java.util.Locale("kor", "french (FRENCH)");
        java.lang.String str3 = locale2.getCountry();
        java.util.Locale locale6 = new java.util.Locale("France", "fra");
        java.lang.String str7 = locale2.getDisplayLanguage(locale6);
        java.lang.Class<?> wildcardClass8 = locale2.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "kor_FRENCH (FRENCH)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRENCH (FRENCH)" + "'", str3, "FRENCH (FRENCH)");
        org.junit.Assert.assertEquals(locale6.toString(), "france_FRA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Korean" + "'", str7, "Korean");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale0.getDisplayCountry(locale4);
        java.util.Locale locale8 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale8);
        java.lang.String str10 = locale8.getCountry();
        java.util.Locale.Category category11 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale12 = java.util.Locale.getDefault(category11);
        java.lang.String str13 = locale8.getDisplayLanguage(locale12);
        java.lang.String str14 = locale12.getDisplayVariant();
        java.lang.String str15 = locale0.getDisplayCountry(locale12);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale8.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FRENCH" + "'", str10, "FRENCH");
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.FORMAT + "'", category11.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "french" + "'", str13, "french");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        double double9 = random1.nextDouble();
        boolean boolean10 = random1.nextBoolean();
        long long11 = random1.nextLong();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44047195711667986d + "'", double9 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-2085682583702141179L) + "'", long11 == (-2085682583702141179L));
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.toLanguageTag();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0);
        java.lang.String str7 = faker5.letterify("french (french)");
        com.github.javafaker.Lorem lorem8 = faker5.lorem();
        com.github.javafaker.Company company9 = faker5.company();
        com.github.javafaker.Color color10 = faker5.color();
        com.github.javafaker.PhoneNumber phoneNumber11 = faker5.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "french (french)" + "'", str7, "french (french)");
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(company9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(phoneNumber11);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale locale7 = builder4.build();
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder11 = builder4.setLocale(locale8);
        java.util.Locale locale13 = new java.util.Locale("");
        java.lang.String str14 = locale13.getISO3Language();
        java.util.Locale locale15 = java.util.Locale.UK;
        java.lang.String str16 = locale13.getDisplayLanguage(locale15);
        boolean boolean17 = locale15.hasExtensions();
        java.lang.String str18 = locale8.getDisplayCountry(locale15);
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale19.getISO3Language();
        java.lang.String str21 = locale19.getDisplayName();
        java.lang.String str22 = locale19.getDisplayScript();
        java.util.Random random24 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream26 = random24.ints(1L);
        long long27 = random24.nextLong();
        int int29 = random24.nextInt((int) (byte) 1);
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale19, random24);
        java.lang.String str32 = faker30.letterify("zh-CN");
        com.github.javafaker.Internet internet33 = faker30.internet();
        boolean boolean34 = locale8.equals((java.lang.Object) faker30);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "kor");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "kor" + "'", str20, "kor");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Korean (South Korea)" + "'", str21, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(intStream26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-5015647950085110473L) + "'", long27 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "zh-CN" + "'", str32, "zh-CN");
        org.junit.Assert.assertNotNull(internet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale8.getISO3Language();
        java.util.Locale.Builder builder10 = builder6.setLocale(locale8);
        java.lang.String str11 = locale3.getDisplayCountry(locale8);
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale14 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale14);
        java.util.Locale locale16 = locale14.stripExtensions();
        java.util.Locale locale18 = new java.util.Locale("");
        java.lang.String str19 = locale16.getDisplayCountry(locale18);
        java.lang.String str20 = locale16.getDisplayVariant();
        java.util.Locale.setDefault(category0, locale16);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals(locale14.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fra-x-lvariant-kor", 0.8452060657049847d);
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder8.setLanguage("fr");
        java.util.Locale.Builder builder12 = builder10.setLanguageTag("fra-France");
        boolean boolean13 = languageRange2.equals((java.lang.Object) "fra-France");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        java.util.Random random1 = new java.util.Random((long) 'u');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = random1.doubles((double) 1891812663, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        java.util.Locale locale2 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.lang.String str4 = locale2.getCountry();
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.lang.String str6 = locale5.getISO3Language();
        java.util.Locale locale7 = locale5.stripExtensions();
        java.lang.String str8 = locale5.getDisplayScript();
        java.lang.String str9 = locale2.getDisplayLanguage(locale5);
        java.util.Set<java.lang.String> strSet10 = locale5.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FRA" + "'", str4, "FRA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "kor" + "'", str6, "kor");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "french" + "'", str9, "french");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        java.util.Locale locale2 = new java.util.Locale("\u4e2d\u56fd", "English");
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = locale3.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u56fd_ENGLISH");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u56fd_ENGLISH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd" + "'", str4, "\u4e2d\u56fd");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        java.util.Locale locale1 = new java.util.Locale("\u671d\u9c9c\u6587\u97e9\u56fd)");
        org.junit.Assert.assertEquals(locale1.toString(), "\u671d\u9c9c\u6587\u97e9\u56fd)");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getScript();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale12 = new java.util.Locale("fra", "hi!", "kor");
        java.util.Locale.Category category13 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale16 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale16);
        java.util.Locale.setDefault(category13, locale16);
        java.util.Locale locale19 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category13, locale19);
        java.lang.String str21 = locale12.getDisplayCountry(locale19);
        java.util.Locale locale24 = new java.util.Locale("french", "fra");
        java.lang.String str25 = locale12.getDisplayCountry(locale24);
        java.util.Locale.setDefault(category0, locale12);
        java.util.Locale locale27 = locale12.stripExtensions();
        java.util.Locale locale28 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet29 = locale28.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet30 = locale28.getUnicodeLocaleAttributes();
        java.lang.String str31 = locale12.getDisplayVariant(locale28);
        java.lang.String str32 = locale12.getLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals(locale12.toString(), "fra_HI!_kor");
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category13.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale16.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HI!" + "'", str21, "HI!");
        org.junit.Assert.assertEquals(locale24.toString(), "french_FRA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HI!" + "'", str25, "HI!");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fra_HI!_kor");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "kor" + "'", str31, "kor");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "fra" + "'", str32, "fra");
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int3 = random1.nextInt();
        double double4 = random1.nextGaussian();
        java.util.stream.IntStream intStream5 = random1.ints();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1167796541) + "'", int3 == (-1167796541));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.35703205834598994d) + "'", double4 == (-0.35703205834598994d));
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Canada");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream9 = random1.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream13 = random1.ints((long) (-485610818), 38, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u82f1\u8a9e", (double) 0.100473166f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        java.util.Locale locale3 = new java.util.Locale("ja", "zh-CN", "fra-France");
        org.junit.Assert.assertEquals(locale3.toString(), "ja_ZH-CN_fra-France");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getScript();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale10);
        java.lang.String str12 = locale10.getDisplayCountry();
        java.lang.String str13 = locale10.getDisplayVariant();
        java.lang.String str14 = locale10.toLanguageTag();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale10);
        java.util.Random random17 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        int int20 = random17.nextInt(10);
        java.util.stream.DoubleStream doubleStream21 = random17.doubles();
        double double22 = random17.nextGaussian();
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(locale10, random17);
        java.lang.String str24 = locale10.getVariant();
        java.util.Locale locale27 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleKeys();
        java.lang.String str29 = locale27.getDisplayVariant();
        java.lang.String str30 = locale10.getDisplayScript(locale27);
        java.util.Set<java.lang.String> strSet31 = locale27.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category0, locale27);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale27);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french_FRA could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cina" + "'", str12, "Cina");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.35703205834598994d) + "'", double22 == (-0.35703205834598994d));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals(locale27.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Italia", (double) (-1434703326));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.434703326E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        java.util.Locale locale1 = new java.util.Locale("fr_CA");
        org.junit.Assert.assertEquals(locale1.toString(), "fr_ca");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        java.util.Locale locale1 = new java.util.Locale("coreano (Corea del Sud)");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale3 = locale1.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: coreano (corea del sud) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "coreano (corea del sud)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "coreano (corea del sud)");
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = new java.util.Locale("France");
        java.lang.String str3 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale6 = new java.util.Locale("FRA-X-LVARIANT-KOR", "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale0.getDisplayLanguage(locale6);
        java.lang.String str9 = locale6.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Canada" + "'", str3, "Canada");
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))" + "'", str7, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "English" + "'", str8, "English");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str9, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("canada (FRENCH (FRENCH))", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=canada(french(french))");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale5 = new java.util.Locale("");
        java.lang.String str6 = locale5.getISO3Language();
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.lang.String str8 = locale5.getScript();
        java.util.Locale.setDefault(category2, locale5);
        java.util.Locale locale10 = java.util.Locale.getDefault(category2);
        java.util.Locale locale11 = java.util.Locale.getDefault(category2);
        java.util.Locale.setDefault(locale11);
        java.lang.String str13 = locale0.getDisplayLanguage(locale11);
        java.lang.String str14 = locale0.getDisplayLanguage();
        java.lang.String str15 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese" + "'", str13, "Chinese");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinese" + "'", str14, "Chinese");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh_TW" + "'", str15, "zh_TW");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setScript("");
        java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("Canada");
        java.util.Locale locale11 = builder10.build();
        java.util.Locale.Builder builder13 = builder10.setRegion("fr");
        java.util.Locale.Builder builder15 = builder13.setLanguage("gb");
        java.util.Locale locale16 = builder13.build();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "gb_FR");
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.IntStream intStream9 = random1.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream13 = random1.ints((long) 1891812663, 13, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        java.util.Locale locale2 = new java.util.Locale("french", "fra-x-lvariant-kor");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRA-X-LVARIANT-KOR");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        java.util.Set<java.lang.String> strSet9 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale locale13 = new java.util.Locale("chinese_KOR", "ko-KR", "canada");
        java.lang.String str14 = locale1.getDisplayCountry(locale13);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals(locale13.toString(), "chinese_kor_KO-KR_canada");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Taiwan" + "'", str14, "Taiwan");
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder0.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setRegion("South Korea");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: South Korea [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        java.util.stream.LongStream longStream9 = random3.longs();
        java.util.stream.LongStream longStream11 = random3.longs(4755622236989466036L);
        int int13 = random3.nextInt(14);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Random random3 = new java.util.Random();
        random3.setSeed((long) 10);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random3);
        random3.setSeed((long) 'x');
        java.util.stream.LongStream longStream12 = random3.longs((long) 15, (long) 6, (long) 1430131985);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = random3.nextInt((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French (France)" + "'", str2, "French (France)");
        org.junit.Assert.assertNotNull(longStream12);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setScript("TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale locale7 = builder4.build();
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder11 = builder4.setLocale(locale8);
        boolean boolean12 = locale8.hasExtensions();
        java.util.Locale locale14 = new java.util.Locale("");
        java.lang.String str15 = locale14.getISO3Language();
        java.util.Locale locale16 = java.util.Locale.UK;
        java.lang.String str17 = locale14.getDisplayLanguage(locale16);
        java.util.Locale locale19 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale19);
        java.lang.String str21 = locale19.getLanguage();
        java.util.Locale locale22 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str23 = locale22.getISO3Language();
        java.lang.String str24 = locale22.getDisplayLanguage();
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale22);
        java.lang.String str26 = locale19.getDisplayCountry(locale22);
        java.lang.String str27 = locale16.getDisplayName(locale19);
        java.lang.String str28 = locale8.getDisplayVariant(locale16);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "kor");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals(locale19.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "fra" + "'", str23, "fra");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "French" + "'", str24, "French");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "English (United Kingdom)" + "'", str27, "English (United Kingdom)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale locale7 = java.util.Locale.GERMANY;
        java.util.Random random9 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        float float11 = random9.nextFloat();
        java.util.stream.IntStream intStream15 = random9.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream17 = random9.ints((long) 'x');
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale7, random9);
        java.util.Locale.Builder builder19 = builder4.setLocale(locale7);
        java.util.Locale.Builder builder21 = builder19.addUnicodeLocaleAttribute("Italia");
        java.util.Locale.Builder builder22 = builder19.clearExtensions();
        java.util.Locale.Builder builder24 = builder22.addUnicodeLocaleAttribute("KOR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.72810113f + "'", float11 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.IntStream intStream8 = random1.ints(100L);
        float float9 = random1.nextFloat();
        java.util.stream.LongStream longStream12 = random1.longs((-4972683369271453960L), (long) 0);
        double double13 = random1.nextDouble();
        random1.setSeed(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream18 = random1.ints(513819833, (-1156638823));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.72810113f + "'", float9 == 0.72810113f);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.44047195711667986d + "'", double13 == 0.44047195711667986d);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("de,DE");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayLanguage();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book4 = faker3.book();
        com.github.javafaker.Business business5 = faker3.business();
        com.github.javafaker.Address address6 = faker3.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertNotNull(book4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(address6);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Code code7 = faker6.code();
        com.github.javafaker.Color color8 = faker6.color();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        java.util.Locale locale1 = new java.util.Locale("fra");
        java.util.Locale locale2 = locale1.stripExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "fra");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fra");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("Korean");
        java.util.Locale.Builder builder11 = builder5.setExtension('u', "chn");
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        java.util.Locale locale2 = new java.util.Locale("coreano", "\u97e9\u56fd");
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale locale5 = locale3.stripExtensions();
        java.lang.String str6 = locale3.getDisplayScript();
        java.util.Locale locale10 = new java.util.Locale("fra", "kor", "France");
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale3.getDisplayScript(locale10);
        java.util.Locale locale15 = new java.util.Locale("Chinese (Taiwan)", "France");
        java.util.Locale locale16 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str17 = locale16.toLanguageTag();
        boolean boolean18 = locale16.hasExtensions();
        java.lang.String str19 = locale15.getDisplayVariant(locale16);
        java.lang.String str20 = locale10.getDisplayScript(locale15);
        java.lang.String str21 = locale2.getDisplayVariant(locale15);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u97e9\u56fd");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "kor" + "'", str4, "kor");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale10.toString(), "fra_KOR_France");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals(locale15.toString(), "chinese (taiwan)_FRANCE");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh-TW" + "'", str17, "zh-TW");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setScript("English (United States)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: English (United States) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.LongStream longStream9 = random1.longs((long) '#', 100L);
        int int11 = random1.nextInt((int) 'x');
        java.util.stream.LongStream longStream13 = random1.longs((long) 0);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17 + "'", int11 == 17);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Random random4 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        java.util.stream.DoubleStream doubleStream7 = random4.doubles((long) (byte) 1);
        long long8 = random4.nextLong();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale2, random4);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random4);
        java.lang.String str12 = locale0.getISO3Country();
        java.util.Locale locale13 = null;
        java.lang.String str14 = locale0.getDisplayVariant(locale13);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "TWN" + "'", str12, "TWN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Color color6 = faker1.color();
        com.github.javafaker.Color color7 = faker1.color();
        com.github.javafaker.Code code8 = faker1.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        java.util.Random random1 = new java.util.Random((long) 7);
        double double2 = random1.nextGaussian();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        java.util.stream.IntStream intStream5 = random1.ints((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8452060657049847d + "'", double2 == 0.8452060657049847d);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = locale3.getDisplayCountry();
        java.util.Locale locale7 = new java.util.Locale("hi!");
        java.lang.String str8 = locale3.getDisplayCountry(locale7);
        java.lang.String str9 = locale0.getDisplayScript(locale7);
        boolean boolean10 = locale7.hasExtensions();
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale locale14 = new java.util.Locale("");
        java.lang.String str15 = locale14.getISO3Language();
        java.util.Locale.Builder builder16 = builder12.setLocale(locale14);
        java.lang.String str17 = locale14.getISO3Country();
        java.lang.String str18 = locale11.getDisplayLanguage(locale14);
        boolean boolean19 = locale7.equals((java.lang.Object) str18);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean" + "'", str2, "Korean");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "French" + "'", str18, "French");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.LongStream longStream5 = random1.longs();
        boolean boolean6 = random1.nextBoolean();
        int int8 = random1.nextInt(1036684082);
        boolean boolean9 = random1.nextBoolean();
        java.util.stream.IntStream intStream11 = random1.ints((long) 'x');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 393447903 + "'", int8 == 393447903);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        java.util.Random random1 = new java.util.Random((long) 9);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random4);
        java.lang.String str7 = faker5.numerify("\uc911\uad6d\uc5b4");
        com.github.javafaker.Options options8 = faker5.options();
        com.github.javafaker.Business business9 = faker5.business();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str7, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.DoubleStream doubleStream9 = random1.doubles();
        int int11 = random1.nextInt((int) (short) 100);
        java.util.stream.LongStream longStream12 = random1.longs();
        long long13 = random1.nextLong();
        java.util.stream.IntStream intStream14 = random1.ints();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 85 + "'", int11 == 85);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1853403699951111791L + "'", long13 == 1853403699951111791L);
        org.junit.Assert.assertNotNull(intStream14);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        java.util.Locale locale3 = new java.util.Locale("und-France", "cinese (Taiwan)", "chinese_KOR");
        org.junit.Assert.assertEquals(locale3.toString(), "und-france_CINESE (TAIWAN)_chinese_KOR");
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random4);
        java.lang.String str7 = faker5.numerify("\uc911\uad6d\uc5b4");
        java.lang.String str9 = faker5.letterify("ko_KR");
        com.github.javafaker.Book book10 = faker5.book();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str7, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ko_KR" + "'", str9, "ko_KR");
        org.junit.Assert.assertNotNull(book10);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        java.util.stream.LongStream longStream9 = random3.longs();
        java.util.Random random11 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        int int14 = random11.nextInt(10);
        java.util.Random random16 = new java.util.Random(10L);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random16.nextBytes(byteArray22);
        random11.nextBytes(byteArray22);
        random3.nextBytes(byteArray22);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random3);
        int int28 = random3.nextInt((int) (short) 1);
        java.util.stream.DoubleStream doubleStream30 = random3.doubles(1092083446069765248L);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[34, 42, 124, -86, 50]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(doubleStream30);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.IntStream intStream8 = random1.ints(100L);
        float float9 = random1.nextFloat();
        java.util.stream.LongStream longStream12 = random1.longs((-4972683369271453960L), (long) 0);
        float float13 = random1.nextFloat();
        java.util.stream.DoubleStream doubleStream17 = random1.doubles((long) 32, (double) 38, 100.0d);
        java.util.stream.LongStream longStream18 = random1.longs();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.72810113f + "'", float9 == 0.72810113f);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.44047195f + "'", float13 == 0.44047195f);
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertNotNull(longStream18);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        java.util.Locale locale1 = new java.util.Locale("it_it");
        org.junit.Assert.assertEquals(locale1.toString(), "it_it");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("FRA");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        java.util.Random random1 = new java.util.Random((long) 7);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        java.util.stream.IntStream intStream7 = random1.ints((long) '#', (int) (short) 1, (int) (byte) 10);
        java.util.stream.LongStream longStream10 = random1.longs((long) (short) 10, (long) '#');
        double double11 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8452060657049847d + "'", double11 == 0.8452060657049847d);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) 'u');
        java.util.stream.DoubleStream doubleStream9 = random1.doubles((double) 0.57896465f, 0.6659570968355509d);
        java.util.stream.DoubleStream doubleStream10 = random1.doubles();
        java.util.stream.LongStream longStream11 = random1.longs();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Company company5 = faker1.company();
        com.github.javafaker.Business business6 = faker1.business();
        java.lang.String str8 = faker1.bothify("\u671d\u9c9c\u6587\u97e9\u56fd)");
        com.github.javafaker.Internet internet9 = faker1.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u671d\u9c9c\u6587\u97e9\u56fd)" + "'", str8, "\u671d\u9c9c\u6587\u97e9\u56fd)");
        org.junit.Assert.assertNotNull(internet9);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        java.util.stream.IntStream intStream7 = random1.ints((long) (short) 100, (int) (short) 0, (int) (short) 10);
        double double8 = random1.nextDouble();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7281011855672591d + "'", double8 == 0.7281011855672591d);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("KR", (double) 1359947704);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.359947704E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        java.util.Locale locale3 = new java.util.Locale("\u82f1\u8a9e\u30ab\u30ca\u30c0)", "french (french)", "zho");
        org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u8a9e\u30ab\u30ca\u30c0)_FRENCH (FRENCH)_zho");
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        java.util.Random random1 = new java.util.Random((long) 'u');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh-CN", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        java.util.Locale locale3 = new java.util.Locale("\u6cd5\u6587\u6cd5\u570b)", "zh-cn", "china");
        org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u6587\u6cd5\u570b)_ZH-CN_china");
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        java.util.Random random1 = new java.util.Random(1853403699951111791L);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        java.util.Locale locale3 = new java.util.Locale("Cina", "South Korea", "french");
        java.lang.String str4 = locale3.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: cina_SOUTH KOREA_french could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "cina_SOUTH KOREA_french");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cina" + "'", str4, "cina");
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getDisplayScript();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Lorem lorem3 = faker2.lorem();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(lorem3);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("French", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, strMap18);
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale22 = new java.util.Locale("");
        java.lang.String str23 = locale22.getISO3Language();
        java.util.Locale.Builder builder24 = builder20.setLocale(locale22);
        java.util.Locale locale26 = new java.util.Locale("");
        java.lang.String str27 = locale26.getISO3Language();
        java.util.Locale locale29 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        java.util.Locale locale32 = new java.util.Locale("");
        java.lang.String str33 = locale32.getISO3Language();
        java.util.Locale.Builder builder34 = builder30.setLocale(locale32);
        java.util.Locale locale36 = new java.util.Locale("");
        java.lang.String str37 = locale36.getISO3Language();
        java.util.Locale[] localeArray38 = new java.util.Locale[] { locale22, locale26, locale29, locale32, locale36 };
        java.util.ArrayList<java.util.Locale> localeList39 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList39, localeArray38);
        java.util.Locale locale41 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.util.Locale>) localeList39);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList43 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList39, filteringMode42);
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet9, filteringMode42);
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap46 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList47 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap46);
        java.util.Locale locale51 = new java.util.Locale("coreano (Corea del Sud)", "Cina", "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
        java.util.Set<java.lang.String> strSet52 = locale51.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode53 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet52, filteringMode53);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals(locale29.toString(), "hi!");
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(localeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(locale41);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode42.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(languageRangeList47);
// flaky:         org.junit.Assert.assertEquals(locale51.toString(), "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertTrue("'" + filteringMode53 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode53.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList54);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        java.util.Locale locale2 = new java.util.Locale("\u65e5\u672c", "\uc911\uad6d\uc5b4\ub300\ub9cc)");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u65e5\u672c\uc911\uad6d\uc5b4\ub300\ub9cc)");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        java.util.Locale locale3 = new java.util.Locale("TWN", "French (France)", "");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale5);
        java.lang.String str7 = locale5.getLanguage();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("South Korea");
        java.lang.String str10 = locale5.getDisplayVariant(locale9);
        java.util.Set<java.lang.String> strSet11 = locale9.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale3.getDisplayScript(locale9);
        org.junit.Assert.assertEquals(locale3.toString(), "twn_FRENCH (FRANCE)");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        java.util.Locale locale3 = new java.util.Locale("South Korea", "chinese_KOR", "South Korea");
        java.lang.String str4 = locale3.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "south korea_CHINESE_KOR_South Korea");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "south korea" + "'", str4, "south korea");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        java.util.Locale locale3 = new java.util.Locale("fra", "kor", "France");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale locale7 = new java.util.Locale("fra", "fra");
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.lang.String str10 = locale9.getVariant();
        java.lang.String str11 = locale9.getScript();
        java.lang.String str12 = locale3.getDisplayScript(locale9);
        java.util.Locale locale13 = locale9.stripExtensions();
        java.lang.String str14 = locale13.getISO3Country();
        org.junit.Assert.assertEquals(locale3.toString(), "fra_KOR_France");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals(locale7.toString(), "fra_FRA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fra" + "'", str8, "fra");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "KOR" + "'", str14, "KOR");
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguage("fr");
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("fra-France");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder7.setExtension('u', "coreano (Corea del Sud)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: coreano (Corea del Sud) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Random random2 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        float float4 = random2.nextFloat();
        java.util.stream.IntStream intStream8 = random2.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream10 = random2.ints((long) 'x');
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random2);
        boolean boolean12 = random2.nextBoolean();
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Random random16 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        java.util.stream.DoubleStream doubleStream19 = random16.doubles((long) (byte) 1);
        long long20 = random16.nextLong();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale14, random16);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random16);
        java.util.stream.LongStream longStream24 = random16.longs(0L);
        java.util.Random random26 = new java.util.Random(10L);
        java.util.stream.DoubleStream doubleStream29 = random26.doubles((double) 0.24137181f, (double) (short) 1);
        long long30 = random26.nextLong();
        java.util.Random random32 = new java.util.Random(10L);
        java.util.stream.LongStream longStream34 = random32.longs((long) 0);
        java.util.Random random36 = new java.util.Random(10L);
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random36.nextBytes(byteArray42);
        random32.nextBytes(byteArray42);
        random26.nextBytes(byteArray42);
        random16.nextBytes(byteArray42);
        random2.nextBytes(byteArray42);
        int int48 = random2.nextInt();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.72810113f + "'", float4 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-5015647950085110473L) + "'", long20 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream24);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-4972683369271453960L) + "'", long30 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(longStream34);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[34, 42, 124, -86, 50]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-485610818) + "'", int48 == (-485610818));
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        java.util.Locale locale2 = new java.util.Locale("\u671d\u9c9c\u6587\u97e9\u56fd)", "cinese");
        boolean boolean3 = locale2.hasExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "\u671d\u9c9c\u6587\u97e9\u56fd)_CINESE");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        java.util.Random random1 = new java.util.Random((long) 100);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        double double3 = random1.nextGaussian();
        java.util.stream.LongStream longStream7 = random1.longs(0L, (-464978171729231043L), (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6246292191371761d + "'", double3 == 0.6246292191371761d);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Color color4 = faker2.color();
        com.github.javafaker.Book book5 = faker2.book();
        com.github.javafaker.Internet internet6 = faker2.internet();
        com.github.javafaker.Name name7 = faker2.name();
        com.github.javafaker.Finance finance8 = faker2.finance();
        com.github.javafaker.Options options9 = faker2.options();
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) (short) 0);
        java.util.stream.DoubleStream doubleStream9 = random1.doubles();
        int int10 = random1.nextInt();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1167796541) + "'", int10 == (-1167796541));
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        java.util.Locale locale3 = new java.util.Locale("french", "ita", "");
        boolean boolean4 = locale3.hasExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "french_ITA");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        java.util.Random random1 = new java.util.Random(10L);
        float float2 = random1.nextFloat();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        random1.setSeed((long) (byte) -1);
        int int7 = random1.nextInt(254270492);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream11 = random1.ints((-6162003863595742414L), (-1193959466), 1708368258);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.73043025f + "'", float2 == 0.73043025f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 69008929 + "'", int7 == 69008929);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("german (KO-KR,ko)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=german(ko-kr");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("Korean");
        java.util.Locale.Builder builder11 = builder5.setExtension('u', "chn");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder5.setScript("\u53f0\u7063");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        java.util.Locale locale2 = new java.util.Locale("\ud55c\uad6d\uc5b4", "french");
        java.util.Locale locale6 = new java.util.Locale("", "French (France)", "France");
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        java.util.Set<java.lang.String> strSet8 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale2.toString(), "\ud55c\uad6d\uc5b4_FRENCH");
        org.junit.Assert.assertEquals(locale6.toString(), "_FRENCH (FRANCE)_France");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.DoubleStream doubleStream9 = random1.doubles();
        int int11 = random1.nextInt((int) (short) 100);
        java.util.stream.LongStream longStream12 = random1.longs();
        boolean boolean13 = random1.nextBoolean();
        double double14 = random1.nextDouble();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 85 + "'", int11 == 85);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.41008081149220166d + "'", double14 == 0.41008081149220166d);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        java.util.Locale locale3 = new java.util.Locale("french (FRENCH)", "English", "zh_TW");
        java.lang.String str4 = locale3.getCountry();
        java.lang.String str5 = locale3.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale3.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for french (french)");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "french (french)_ENGLISH_zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ENGLISH" + "'", str4, "ENGLISH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh_TW" + "'", str5, "zh_TW");
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        java.util.Locale locale2 = new java.util.Locale("\ud55c\uad6d\uc5b4", "french");
        java.util.Locale locale6 = new java.util.Locale("", "French (France)", "France");
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "\ud55c\uad6d\uc5b4_FRENCH");
        org.junit.Assert.assertEquals(locale6.toString(), "_FRENCH (FRANCE)_France");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ud55c\uad6d\uc5b4_FRENCH" + "'", str8, "\ud55c\uad6d\uc5b4_FRENCH");
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Business business8 = faker2.business();
        com.github.javafaker.Color color9 = faker2.color();
        java.lang.String str11 = faker2.bothify("Canada");
        com.github.javafaker.Address address12 = faker2.address();
        com.github.javafaker.Address address13 = faker2.address();
        com.github.javafaker.Company company14 = faker2.company();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Canada" + "'", str11, "Canada");
        org.junit.Assert.assertNotNull(address12);
        org.junit.Assert.assertNotNull(address13);
        org.junit.Assert.assertNotNull(company14);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getScript();
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale locale4 = locale2.stripExtensions();
        java.util.Locale locale7 = new java.util.Locale("fra-x-lvariant-kor", "hi!");
        java.lang.String str8 = locale2.getDisplayScript(locale7);
        java.lang.String str9 = locale0.getDisplayName(locale2);
        java.lang.String str10 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kor" + "'", str3, "kor");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertEquals(locale7.toString(), "fra-x-lvariant-kor_HI!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str9, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Korean" + "'", str10, "Korean");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("FRA");
        java.util.Locale.Builder builder10 = builder6.setRegion("");
        java.util.Locale.Builder builder11 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder6.removeUnicodeLocaleAttribute("FRA-X-LVARIANT-KOR_HI!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: FRA-X-LVARIANT-KOR_HI! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale7);
        java.lang.String str10 = locale2.getDisplayCountry(locale7);
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = locale11.getDisplayCountry();
        java.lang.String str14 = locale2.getDisplayName(locale11);
        java.util.Set<java.lang.Character> charSet15 = locale11.getExtensionKeys();
        java.lang.String str16 = locale11.getISO3Language();
        java.util.Set<java.lang.String> strSet17 = locale11.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zho" + "'", str16, "zho");
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        java.util.Random random1 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.LongStream longStream3 = random1.longs();
        java.util.Random random5 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        int int8 = random5.nextInt(10);
        java.util.Random random10 = new java.util.Random(10L);
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random10.nextBytes(byteArray16);
        random5.nextBytes(byteArray16);
        random1.nextBytes(byteArray16);
        java.util.stream.IntStream intStream20 = random1.ints();
        int int21 = random1.nextInt();
        boolean boolean22 = random1.nextBoolean();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[95, 64, 8, 57, 59]");
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1708368258 + "'", int21 == 1708368258);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        double double4 = random1.nextGaussian();
        int int5 = random1.nextInt();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2235660632835625d + "'", double4 == 1.2235660632835625d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-485610818) + "'", int5 == (-485610818));
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        float float5 = random1.nextFloat();
        java.util.stream.LongStream longStream8 = random1.longs((-5123059410709186348L), (long) 32);
        java.util.stream.IntStream intStream10 = random1.ints(1L);
        random1.setSeed((long) (short) 1);
        java.util.stream.LongStream longStream16 = random1.longs(0L, (long) (-485610818), (long) 13);
        java.util.stream.IntStream intStream19 = random1.ints((-485610818), 85);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.44047195f + "'", float5 == 0.44047195f);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertNotNull(intStream19);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        long long5 = random1.nextLong();
        random1.setSeed((long) 'a');
        double double8 = random1.nextDouble();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-5015647950085110473L) + "'", long5 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7222784001762583d + "'", double8 == 0.7222784001762583d);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        java.util.stream.IntStream intStream6 = random1.ints(6, (int) 'u');
        java.util.stream.IntStream intStream7 = random1.ints();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Lorem lorem2 = faker0.lorem();
        com.github.javafaker.DateAndTime dateAndTime3 = faker0.date();
        java.lang.String str5 = faker0.numerify("zh_CN");
        com.github.javafaker.Address address6 = faker0.address();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker0.resolve("CAN");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh_CN" + "'", str5, "zh_CN");
        org.junit.Assert.assertNotNull(address6);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Random random5 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream7 = random5.ints(1L);
        long long8 = random5.nextLong();
        int int10 = random5.nextInt((int) (byte) 1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random5);
        java.lang.String str14 = faker12.numerify("China");
        com.github.javafaker.Options options15 = faker12.options();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean (South Korea)" + "'", str2, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "China" + "'", str14, "China");
        org.junit.Assert.assertNotNull(options15);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        java.util.Random random1 = new java.util.Random((long) (short) 10);
        int int2 = random1.nextInt();
        int int3 = random1.nextInt();
        java.util.stream.IntStream intStream4 = random1.ints();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1157793070) + "'", int2 == (-1157793070));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1913984760 + "'", int3 == 1913984760);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("cina");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("canada");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        java.util.Locale locale2 = new java.util.Locale("\ud55c\uad6d\uc5b4", "french");
        java.util.Locale locale6 = new java.util.Locale("", "French (France)", "France");
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale2.toString(), "\ud55c\uad6d\uc5b4_FRENCH");
        org.junit.Assert.assertEquals(locale6.toString(), "_FRENCH (FRANCE)_France");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        com.github.javafaker.Number number3 = faker1.number();
        com.github.javafaker.Company company4 = faker1.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(company4);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.util.Locale locale3 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Random random6 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        java.util.stream.DoubleStream doubleStream9 = random6.doubles((long) (byte) 1);
        long long10 = random6.nextLong();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale4, random6);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale0, random6);
        java.util.Set<java.lang.String> strSet16 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Canada" + "'", str1, "Canada");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-5015647950085110473L) + "'", long10 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        java.util.Locale locale1 = new java.util.Locale("Korean (South Korea)");
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = locale1.getDisplayName();
        org.junit.Assert.assertEquals(locale1.toString(), "korean (south korea)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "korean (south korea)" + "'", str3, "korean (south korea)");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Random random4 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        java.util.stream.DoubleStream doubleStream7 = random4.doubles((long) (byte) 1);
        long long8 = random4.nextLong();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale2, random4);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random4);
        java.lang.String str12 = locale0.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "TWN" + "'", str12, "TWN");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = java.util.Locale.ROOT;
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale4.getISO3Language();
        java.lang.String str6 = locale4.getDisplayName();
        java.lang.String str7 = locale3.getDisplayScript(locale4);
        java.util.Locale.Builder builder8 = builder2.setLocale(locale3);
        java.util.Locale.Builder builder10 = builder8.setLanguageTag("kor");
        java.util.Locale.Builder builder12 = builder10.removeUnicodeLocaleAttribute("English");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "kor" + "'", str5, "kor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Korean (South Korea)" + "'", str6, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        java.util.Locale locale2 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale7);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale12.getISO3Language();
        java.util.Locale.Builder builder14 = builder10.setLocale(locale12);
        java.lang.String str15 = locale7.getDisplayCountry(locale12);
        java.lang.String str16 = locale7.getLanguage();
        java.lang.String str17 = locale2.getDisplayVariant(locale7);
        java.lang.String str18 = locale2.getCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "FRA" + "'", str18, "FRA");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CA", (double) (-1188188233));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.188188233E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        java.util.Locale locale2 = new java.util.Locale("french (FRENCH)", "de_DE");
        org.junit.Assert.assertEquals(locale2.toString(), "french (french)_DE_DE");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        java.util.Locale locale0 = null;
        java.util.Random random2 = new java.util.Random(10L);
        float float3 = random2.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.73043025f + "'", float3 == 0.73043025f);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("SOUTH KOREA (SOUTH KOREA)", (-0.8673886034754649d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-0.8673886034754649");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        java.util.Locale locale2 = new java.util.Locale("fr", "chinois (Taiwan)");
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CHINOIS (TAIWAN)");
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        java.util.Locale locale2 = new java.util.Locale("coreano (Corea del Sud)", "kor");
        java.lang.String str3 = locale2.toLanguageTag();
        org.junit.Assert.assertEquals(locale2.toString(), "coreano (corea del sud)_KOR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        java.util.Random random1 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream3 = random1.ints(1L);
        int int5 = random1.nextInt((int) '#');
        double double6 = random1.nextDouble();
        int int7 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream8 = random1.doubles();
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.44047195711667986d + "'", double6 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1036684082 + "'", int7 == 1036684082);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        java.util.Random random1 = new java.util.Random((long) '#');
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) 1891812663, (-0.8673886034754649d), (double) 1.0f);
        java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) (byte) 1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Finance finance2 = faker1.finance();
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Book book4 = faker1.book();
        com.github.javafaker.Color color5 = faker1.color();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(book4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        java.util.Locale locale3 = new java.util.Locale("", "French (France)", "France");
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = locale3.getVariant();
        java.lang.String str6 = locale3.getCountry();
        java.lang.String str7 = locale3.getDisplayCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "_FRENCH (FRANCE)_France");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FRENCH (FRANCE) (France)" + "'", str4, "FRENCH (FRANCE) (France)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "France" + "'", str5, "France");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FRENCH (FRANCE)" + "'", str6, "FRENCH (FRANCE)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FRENCH (FRANCE)" + "'", str7, "FRENCH (FRANCE)");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale1);
        java.lang.String str3 = locale1.getLanguage();
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale4.getISO3Language();
        java.lang.String str6 = locale4.getDisplayLanguage();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale4);
        java.lang.String str8 = locale1.getDisplayCountry(locale4);
        java.util.Locale locale9 = locale4.stripExtensions();
        java.util.Locale.setDefault(locale9);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fra" + "'", str5, "fra");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        java.lang.String str4 = locale0.getLanguage();
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chine" + "'", str2, "Chine");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("it", (double) (byte) 0);
        java.lang.String str3 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.lang.String str7 = locale6.getISO3Language();
        java.lang.String str8 = locale6.getDisplayName();
        java.lang.String str9 = locale6.getDisplayScript();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.util.Random random12 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        int int15 = random12.nextInt(10);
        java.util.stream.DoubleStream doubleStream16 = random12.doubles();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale10, random12);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale6, random12);
        java.lang.String str20 = locale4.getDisplayLanguage(locale6);
        java.lang.String str21 = locale4.getDisplayCountry();
        java.lang.String str22 = locale0.getDisplayLanguage(locale4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "kor" + "'", str7, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Korean (South Korea)" + "'", str8, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str20, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u671d\u9c9c\u6587" + "'", str22, "\u671d\u9c9c\u6587");
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayLanguage();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Lorem lorem4 = faker3.lorem();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertNotNull(lorem4);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        java.util.Random random1 = new java.util.Random((long) '#');
        long long2 = random1.nextLong();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (-1188188233));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5013995466868426345L) + "'", long2 == (-5013995466868426345L));
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale7);
        java.lang.String str10 = locale2.getDisplayCountry(locale7);
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = locale11.getDisplayCountry();
        java.lang.String str14 = locale2.getDisplayName(locale11);
        java.lang.String str15 = locale11.getDisplayLanguage();
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale locale17 = builder16.build();
        java.util.Locale.Builder builder18 = builder16.clearExtensions();
        java.util.Locale.Builder builder19 = builder18.clearExtensions();
        java.util.Locale locale20 = builder19.build();
        java.util.Locale.Builder builder21 = builder19.clearExtensions();
        java.util.Locale.Builder builder22 = builder21.clearExtensions();
        boolean boolean23 = locale11.equals((java.lang.Object) builder21);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chinese" + "'", str15, "Chinese");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("English");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.setUnicodeLocaleKeyword("fra (HI!,kor)", "\u53f0\u6e7e\u5730\u533a");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: fra (HI!,kor) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("France");
        java.util.Locale.Builder builder6 = builder2.setLanguage("Korean");
        java.util.Locale.Builder builder8 = builder6.setLanguage("it");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder13 = builder10.setExtension('u', "Korean");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale8.getISO3Language();
        java.util.Locale.Builder builder10 = builder6.setLocale(locale8);
        java.lang.String str11 = locale3.getDisplayCountry(locale8);
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.lang.String str14 = locale13.getISO3Language();
        java.util.Locale locale15 = locale13.stripExtensions();
        java.util.Locale locale16 = java.util.Locale.TAIWAN;
        java.util.Locale locale17 = java.util.Locale.JAPANESE;
        java.lang.String str18 = locale16.getDisplayName(locale17);
        java.lang.String str19 = locale13.getDisplayName(locale17);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale21 = java.util.Locale.getDefault(category0);
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.lang.String str23 = locale22.getDisplayScript();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale22);
        java.lang.String str25 = locale22.getISO3Country();
        java.util.Locale locale27 = new java.util.Locale("FRENCH (FRENCH)");
        java.lang.String str28 = locale27.getVariant();
        java.lang.String str29 = locale22.getDisplayName(locale27);
        java.util.Locale.setDefault(category0, locale22);
        java.util.Locale locale31 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "kor" + "'", str14, "kor");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)" + "'", str18, "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str19, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ja");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "KOR" + "'", str25, "KOR");
        org.junit.Assert.assertEquals(locale27.toString(), "french (french)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Korean (South Korea)" + "'", str29, "Korean (South Korea)");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko_KR");
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        java.util.Random random1 = new java.util.Random((long) 1708368258);
        double double2 = random1.nextDouble();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0588096904743618d + "'", double2 == 0.0588096904743618d);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        java.util.Locale locale2 = new java.util.Locale("French", "french");
        java.lang.String str3 = locale2.getDisplayScript();
        boolean boolean4 = locale2.hasExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        java.util.Locale locale2 = new java.util.Locale("fr", "chinese_kor (CANADA)");
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CHINESE_KOR (CANADA)");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.toLanguageTag();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0);
        java.util.Random random7 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        int int10 = random7.nextInt(10);
        java.util.stream.DoubleStream doubleStream11 = random7.doubles();
        double double12 = random7.nextGaussian();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale0, random7);
        com.github.javafaker.Book book14 = faker13.book();
        com.github.javafaker.Code code15 = faker13.code();
        com.github.javafaker.Color color16 = faker13.color();
        com.github.javafaker.Company company17 = faker13.company();
        com.github.javafaker.Book book18 = faker13.book();
        com.github.javafaker.Address address19 = faker13.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.35703205834598994d) + "'", double12 == (-0.35703205834598994d));
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(company17);
        org.junit.Assert.assertNotNull(book18);
        org.junit.Assert.assertNotNull(address19);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder3.setVariant("French");
        java.util.Locale.Builder builder8 = builder3.setExtension('x', "");
        java.util.Locale locale9 = builder8.build();
        java.util.Locale.Builder builder11 = builder8.setVariant("chinese");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = new java.util.Locale("fra", "hi!", "kor");
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale8 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale8);
        java.util.Locale.setDefault(category5, locale8);
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category5, locale11);
        java.lang.String str13 = locale4.getDisplayCountry(locale11);
        java.lang.String str14 = locale0.getDisplayLanguage(locale4);
        java.lang.String str15 = locale0.getScript();
        java.lang.String str16 = locale0.toLanguageTag();
        java.lang.String str17 = locale0.getDisplayName();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals(locale4.toString(), "fra_HI!_kor");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale8.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "German" + "'", str14, "German");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "de" + "'", str16, "de");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "tedesco" + "'", str17, "tedesco");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("TW");
        java.util.Random random3 = new java.util.Random((long) '#');
        java.util.stream.IntStream intStream5 = random3.ints((long) 100);
        double double6 = random3.nextGaussian();
        long long7 = random3.nextLong();
        boolean boolean8 = languageRange1.equals((java.lang.Object) random3);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7709984181344616d + "'", double6 == 1.7709984181344616d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5840930912313687631L + "'", long7 == 5840930912313687631L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        java.util.Locale locale3 = new java.util.Locale("FRENCH (FRANCE) (France)", "CN", "");
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale7);
        java.util.Locale.setDefault(category4, locale7);
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category4, locale10);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        boolean boolean13 = locale12.hasExtensions();
        java.lang.String str14 = locale12.getDisplayLanguage();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale12);
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("coreano (Corea del Sud)");
        java.lang.String str18 = locale17.toLanguageTag();
        java.lang.String str19 = locale12.getDisplayCountry(locale17);
        java.util.Locale locale23 = new java.util.Locale("fra-x-lvariant-kor", "fra", "kor");
        java.lang.String str24 = locale12.getDisplayName(locale23);
        java.util.Locale locale25 = locale23.stripExtensions();
        java.util.Locale.setDefault(category4, locale23);
        java.util.Locale locale27 = java.util.Locale.getDefault(category4);
        java.lang.String str28 = locale3.getDisplayScript(locale27);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french (france) (france)_CN could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "french (france) (france)_CN");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale7.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "francese" + "'", str14, "francese");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "und" + "'", str18, "und");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "France" + "'", str19, "France");
        org.junit.Assert.assertEquals(locale23.toString(), "fra-x-lvariant-kor_FRA_kor");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "French (France)" + "'", str24, "French (France)");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fra-x-lvariant-kor_FRA_kor");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fra-x-lvariant-kor_FRA_kor");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        java.lang.String str8 = faker1.letterify("\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
        com.github.javafaker.Finance finance9 = faker1.finance();
        com.github.javafaker.Address address10 = faker1.address();
        com.github.javafaker.Code code11 = faker1.code();
        java.lang.String str13 = faker1.bothify("de-DE");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)" + "'", str8, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "de-DE" + "'", str13, "de-DE");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.toLanguageTag();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0);
        java.util.Random random7 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        int int10 = random7.nextInt(10);
        java.util.stream.DoubleStream doubleStream11 = random7.doubles();
        double double12 = random7.nextGaussian();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale0, random7);
        com.github.javafaker.Company company14 = faker13.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.35703205834598994d) + "'", double12 == (-0.35703205834598994d));
        org.junit.Assert.assertNotNull(company14);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale5 = new java.util.Locale("fra", "hi!", "kor");
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getISO3Language();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale9);
        java.lang.String str12 = locale9.getScript();
        java.util.Locale.setDefault(category6, locale9);
        java.util.Locale locale14 = java.util.Locale.getDefault(category6);
        java.lang.String str15 = locale5.getDisplayScript(locale14);
        java.lang.String str16 = locale0.getDisplayCountry(locale5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale5.toString(), "fra_HI!_kor");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "China" + "'", str16, "China");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("French", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 0.24137181f, (double) (short) 1);
        long long5 = random1.nextLong();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        random1.setSeed((long) 1359947704);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-4972683369271453960L) + "'", long5 == (-4972683369271453960L));
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Color color4 = faker2.color();
        com.github.javafaker.Book book5 = faker2.book();
        com.github.javafaker.Internet internet6 = faker2.internet();
        com.github.javafaker.Name name7 = faker2.name();
        com.github.javafaker.Finance finance8 = faker2.finance();
        com.github.javafaker.PhoneNumber phoneNumber9 = faker2.phoneNumber();
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        java.util.Locale locale2 = new java.util.Locale("canada", "Korean");
        boolean boolean3 = locale2.hasExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "canada_KOREAN");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        java.util.Random random1 = new java.util.Random((long) (short) 100);
        java.util.stream.IntStream intStream4 = random1.ints((-1193959466), 513819833);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) (-1156638823));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale8.getISO3Language();
        java.util.Locale.Builder builder10 = builder6.setLocale(locale8);
        java.lang.String str11 = locale3.getDisplayCountry(locale8);
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.lang.String str14 = locale13.getISO3Language();
        java.util.Locale locale15 = locale13.stripExtensions();
        java.util.Locale locale16 = java.util.Locale.TAIWAN;
        java.util.Locale locale17 = java.util.Locale.JAPANESE;
        java.lang.String str18 = locale16.getDisplayName(locale17);
        java.lang.String str19 = locale13.getDisplayName(locale17);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale21 = java.util.Locale.getDefault(category0);
        java.lang.String str22 = locale21.getISO3Language();
        boolean boolean24 = locale21.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "kor" + "'", str14, "kor");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)" + "'", str18, "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str19, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "jpn" + "'", str22, "jpn");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        java.util.Locale locale1 = new java.util.Locale("Cina");
        org.junit.Assert.assertEquals(locale1.toString(), "cina");
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("CHN");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.util.Random random5 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((long) (byte) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        boolean boolean10 = languageRange1.equals((java.lang.Object) faker9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chn" + "'", str2, "chn");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        java.util.Locale locale3 = new java.util.Locale("", "French (France)", "France");
        java.lang.String str4 = locale3.getDisplayName();
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale3.getDisplayName(locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "_FRENCH (FRANCE)_France");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FRENCH (FRANCE) (France)" + "'", str4, "FRENCH (FRANCE) (France)");
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        java.util.stream.LongStream longStream9 = random3.longs();
        java.util.Random random11 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        int int14 = random11.nextInt(10);
        java.util.Random random16 = new java.util.Random(10L);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random16.nextBytes(byteArray22);
        random11.nextBytes(byteArray22);
        random3.nextBytes(byteArray22);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Company company27 = faker26.company();
        com.github.javafaker.Color color28 = faker26.color();
        com.github.javafaker.Address address29 = faker26.address();
        java.lang.String str31 = faker26.letterify("");
        java.lang.String str33 = faker26.bothify("GB");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[34, 42, 124, -86, 50]");
        org.junit.Assert.assertNotNull(company27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(address29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "GB" + "'", str33, "GB");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        java.util.Locale locale3 = new java.util.Locale("fra", "hi!", "kor");
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale7);
        java.util.Locale.setDefault(category4, locale7);
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category4, locale10);
        java.lang.String str12 = locale3.getDisplayCountry(locale10);
        java.util.Locale locale15 = new java.util.Locale("french", "fra");
        java.lang.String str16 = locale3.getDisplayCountry(locale15);
        java.lang.String str17 = locale15.getCountry();
        java.util.Locale locale18 = locale15.stripExtensions();
        java.util.Locale.setDefault(locale18);
        java.lang.String str20 = locale18.getDisplayVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "fra_HI!_kor");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale7.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals(locale15.toString(), "french_FRA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "FRA" + "'", str17, "FRA");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "french_FRA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CAN", 0.730967787376657d);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("cina");
        java.lang.String str2 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cina" + "'", str2, "cina");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Number number7 = faker0.number();
        com.github.javafaker.Business business8 = faker0.business();
        com.github.javafaker.Finance finance9 = faker0.finance();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(book4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(finance9);
    }
}
